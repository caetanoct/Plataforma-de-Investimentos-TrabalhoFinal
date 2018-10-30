import java.util.ArrayList;

public abstract class Conta {
	private double saldo;
	private String usuario;
	private String senha;
	private ArrayList<Investimento> investimentos;

	void creditar(double valor) {
		this.saldo += valor;
	}

	void debitar(double valor) {
		this.saldo -= valor;
	}

	void efetuarInvest(double valor, Investimento tipoInvest) {
		if(saldo > valor) {
			tipoInvest.setValorInvestimento(valor);
			investimentos.add(tipoInvest);
			debitar(valor);
		}
		
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public ArrayList<Investimento> getInvestimentos() {
		return investimentos;
	}

	public void setInvestimentos(ArrayList<Investimento> investimentos) {
		this.investimentos = investimentos;
	}
}
