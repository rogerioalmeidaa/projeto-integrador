package entidade;

public class Torneira extends ItemConsumo{

	private boolean restritorDeVazao;

	public boolean isRestritorDeVazao() {
		return restritorDeVazao;
	}

	public void setRestritorDeVazao(boolean restritorDeVazao) {
		this.restritorDeVazao = restritorDeVazao;
	}
	
	public double calcular(double vazao, double pressao) {
		return 0;
	}
}
