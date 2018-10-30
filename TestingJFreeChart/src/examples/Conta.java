package examples;

public class Conta {

	private double taxaPrefix;
	private double valorInvest;
	private int anos;
	
	public Conta() {
		
	}
	
	public Conta(int anos, double taxa, double valorInvest) {
		
		this.anos = anos;
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

	public int getAnos() {
		return anos;
	}

	public void setAnos(int anos) {
		this.anos = anos;
	};
	
	
}
