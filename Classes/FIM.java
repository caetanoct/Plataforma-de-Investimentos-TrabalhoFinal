
public class FIM extends Investimento {
	private String nome = "Fundo de investimento multi-mercado";
	private static final double rentabilidadeAA = 9.03;
	private static final double taxaAdm = 1.5;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
