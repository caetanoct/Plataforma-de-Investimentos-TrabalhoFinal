package examples;

public class Conta {

	private double taxaPrefix;
	private double valorInvest;
	private int meses;
	
	public Conta() {
		
	}
	
	public Conta(int meses, double taxa, double valorInvest) {
		
		this.meses = meses;
		this.taxaPrefix = taxa;
		this.valorInvest = valorInvest;
	}

	
	public double getTaxaPrefix() {
		return taxaPrefix;
	}

	public void setTaxaPrefix(double taxaPrefix) {
		this.taxaPrefix = taxaPrefix;
	}

	public double getValorInvest() {
		return valorInvest;
	}

	public void setValorInvest(double valorInvest) {
		this.valorInvest = valorInvest;
	}

	public int getMeses() {
		return meses;
	}

	public void setMeses(int meses) {
		this.meses = meses;
	};
	
	
}
