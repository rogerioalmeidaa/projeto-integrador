package entidade;

import java.util.Date;

public class Historico {

	private Date date;
	private double consumoSemanal;
	private double consumoMensal;
	private double consumoAnual;
	private double consumoDiario;
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getConsumoSemanal() {
		return consumoSemanal;
	}
	public void setConsumoSemanal(double consumoSemanal) {
		this.consumoSemanal = consumoSemanal;
	}
	public double getConsumoMensal() {
		return consumoMensal;
	}
	public void setConsumoMensal(double consumoMensal) {
		this.consumoMensal = consumoMensal;
	}
	public double getConsumoAnual() {
		return consumoAnual;
	}
	public void setConsumoAnual(double consumoAnual) {
		this.consumoAnual = consumoAnual;
	}
	public double getConsumoDiario() {
		return consumoDiario;
	}
	public void setConsumoDiario(double consumoDiario) {
		this.consumoDiario = consumoDiario;
	}
	
	
	public double calcularConsumoSemanal(ItemConsumo item) {
		return 0;
	}
	
	public double calcularConsumoMensal(ItemConsumo item) {
		return 0;
	}
	
	public double calcularConsumoAnual(ItemConsumo item) {
		return 0;
	}
	
	public double calcularConsumoDiario(ItemConsumo item) {
		return 0;
	}
	
	public double calcularConsumoMensalTotal() {
		return 0;
	}
	
	public double calcularConsumoAnualTotal() {
		return 0;
	}
}
