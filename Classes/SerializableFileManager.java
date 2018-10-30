import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializableFileManager {
	private ObjectInputStream input;
	private ObjectOutputStream output;

	public SerializableFileManager() {
	}

	public void openInputFile() {
		File file = new File("contas.ser");
		if (!file.exists()) {
			openOutputFile();
			closeOutputFile();
		} else {
			try {
				input = new ObjectInputStream(new FileInputStream("contas.ser"));
			} catch (IOException e) {
				System.err.println("Error opening accounts file");
			}
		}
	}

	public ArrayList<Conta> readInput() {
		ArrayList<Conta> contas = new ArrayList<Conta>();
		try {
			while (true) {
				contas.add((Conta) input.readObject());
			}
		} catch (EOFException endOfFileException) {
			return contas;
		} catch (ClassNotFoundException classNotFoundException) {
			System.err.println("Unable to create object.");
		} catch (IOException ioException) {
			System.err.println("Error during reading from file.");
		}

		return contas;
	}

	public void closeInputFile() {
		try {
			if (input != null) {
				input.close();
			}
		} catch (IOException e) {
			System.err.println("Error closing accounts file");
			System.exit(1);
		}
	}

	public void openOutputFile() {
		try {
			output = new ObjectOutputStream(new FileOutputStream("contas.ser"));
		} catch (IOException ioException) {
			System.err.println("Error opening accounts file.");
		}
	}

	public void writeToFile(Conta conta) {
		openInputFile();
		ArrayList<Conta> contas = readInput();
		closeInputFile();
		contas.add(conta);
		try {
			output.writeObject(contas);
		} catch (IOException e) {
			System.err.println("Error writing to accounts file");
		}
	}

	public void closeOutputFile() {
		try {
			if (output != null) {
				output.close();
			}
		} catch (IOException e) {
			System.err.println("Error closing accounts file");
			System.exit(1);
		}
	}

}
