package entidade;

public class ChuveiroEletrico extends ItemConsumo {

	private String modelo;
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double calcular(double vazao) {
		return 0;
	}
}
