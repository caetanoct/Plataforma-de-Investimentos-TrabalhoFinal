
public class TDPR extends Investimento {
	
	private int anoVencimento;
	
	public TDPR() {
		this.setRentabilidadeAA(10.1);
		this.setTaxaAdm(1.5);
		
	}
	
	public void setAnoVencimento(int anoVencimento) {
		this.anoVencimento = anoVencimento;
	}
	public int getAnoVencimento() {
		return anoVencimento;
	}
}
