package projeto_integrador;

import entidade.Historico;
import entidade.MaquinaDeLavar;

public class Main {

	public static void main(String[] args) {
		MaquinaDeLavar maquina = new MaquinaDeLavar();
		
		Historico historico = new Historico();
		historico.calcularConsumoSemanal(maquina);
	}

}
