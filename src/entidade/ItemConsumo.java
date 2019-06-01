package entidade;

public abstract class ItemConsumo {

	private String descricao;
	private double tempo;	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getTempo() {
		return tempo;
	}
	public void setTempo(double tempo) {
		this.tempo = tempo;
	}
	
	public double calcular() {
		return 0;
	}
}
