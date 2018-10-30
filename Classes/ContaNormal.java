import java.util.ArrayList;

public class ContaNormal extends Conta implements Carteira {
	private double saldo;
	private String usuario;
	private String senha;
	private ArrayList<Investimento> investimentos;
	public static final boolean pagaTaxa = true;
	public ContaNormal(double saldo, String usuario, String senha) {
		this.saldo = saldo;
		this.usuario = usuario;
		this.senha = senha;
	}
	@Override
	public double getValorCarteira() {
		double valor = saldo;
		for(Investimento i: investimentos) {
			valor = valor + i.getValorInvestimento();
		}
		return valor;
	}
}
