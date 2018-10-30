import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.util.ArrayList;

public class SerializableFileManager {
	private ObjectInputStream input;
	private ObjectOutputStream output;
	private ArrayList<Conta> contas;

	public SerializableFileManager() {
		File file = new File("contas.ser");
		contas = new ArrayList<Conta>();
		if (!file.exists()) {
			openOutputFile();
			closeOutputFile();
		} else {
			openInputFile();
			contas = readInput();
			closeInputFile();
		}
	}

	public void openInputFile() {
		try {
			input = new ObjectInputStream(new FileInputStream("contas.ser"));
		} catch (IOException e) {
			System.err.println("Error opening accounts file");
		}
	}

	public ArrayList<Conta> readInput() {
		try {
			return (ArrayList<Conta>) input.readObject();
		} catch (EOFException e) {
			return contas;
		} catch (ClassNotFoundException classNotFoundException) {
			System.err.println("Unable to create object.");
		} catch (IOException ioException) {
			System.err.println("Error reading from accounts file.");
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
