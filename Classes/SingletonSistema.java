import java.util.ArrayList;

public final class SingletonSistema {
	private static final SingletonSistema sistema = new SingletonSistema();

	private SingletonSistema() {
		System.err.println("Singleton object created");
	}

	public static SingletonSistema getInstance() {
		return sistema;
	}

	private ArrayList<Conta> contasSistema;
	
	public void addConta(Conta c) {
		contasSistema.add(c);
	}

	public void removeConta(Conta c) {
		contasSistema.remove(c);
	}

	public ArrayList<Conta> getContasSistema() {
		return contasSistema;
	}

	public void setContasSistema(ArrayList<Conta> contasSistema) {
		this.contasSistema = contasSistema;
	}

	
}
