
public class TDPR extends Investimento {
	private String nome = "Tesouro direto pré-fixado";
	private static final double rentabilidadeAA = 10.1;
	private static final double taxaAdm = 1.5;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
