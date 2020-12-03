package es.studium.CocheMoto;

public class Moto extends Vehiculo {
	private String cilindrada;

	public Moto() {
		this.setMatricula("");
		this.setNumeroRuedas(4);
		this.cilindrada = "";
	}

	public Moto(String matricula, int numeroRuedas, String cilindrada) {
		this.setMatricula(matricula);
		this.setNumeroRuedas(numeroRuedas);
		this.cilindrada = cilindrada;
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
}
