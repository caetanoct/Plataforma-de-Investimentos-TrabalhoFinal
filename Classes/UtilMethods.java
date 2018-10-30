import java.util.ArrayList;

public class UtilMethods {
	public static boolean autentica(String usuario, String senha, ArrayList<Conta> contasSistema) {
		for (Conta c : contasSistema) {
			if (c.getUsuario().equals(usuario) && c.getSenha().equals(senha)) {
				return true;
			}
		}
		return false;
	}
}
