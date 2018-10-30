
public abstract class Investimento {
	private String nome;
	private static final double rentabilidadeAA = 0;
	private static final double taxaAdm = 0;
	private double valorInvestimento;
	
	public double getRentabilidadeAA() {
		return rentabilidadeAA;
	}

	public double getTaxaAdm() {
		return taxaAdm;
	}
	
	public double getValorInvestimento() {
		return valorInvestimento;
	}
	public void setValorInvestimento(double valorInvestimento) {
		this.valorInvestimento = valorInvestimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
