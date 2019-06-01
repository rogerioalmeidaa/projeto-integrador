package entidade;

public class MaquinaDeLavar extends ItemConsumo{

	private double capacidade;

	public double getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}
	
	@Override
	public double calcular() {
		return 0;
	}
}
