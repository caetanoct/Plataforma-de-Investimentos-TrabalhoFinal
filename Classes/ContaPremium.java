import java.util.ArrayList;

public class ContaPremium implements Conta {
	
	private double saldo;
	private String usuario;
	private String senha;
	private ArrayList<Investimento> investimentos;
	public static final boolean pagaTaxa = false;
	//Métodos da interface:
	@Override
	public void creditar(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debitar(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void efetuarInvest(double valor, Investimento tipoInvest) {
		// TODO Auto-generated method stub
		
	}

}
