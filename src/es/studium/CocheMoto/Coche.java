package es.studium.CocheMoto;

public class Coche extends Vehiculo {

	private Conductor conductor = new Conductor();

	public Coche() {
		this.setMatricula("");
		this.setNumeroRuedas(4);
		conductor.nombreConductor = "";
		conductor.carnetConductor = "";
	}

	public Coche(String matricula, String nombreConductor, String carnetConductor, int numeroRuedas) {
		this.setMatricula(matricula);
		this.conductor.nombreConductor = nombreConductor;
		this.conductor.carnetConductor = carnetConductor;
		this.setNumeroRuedas(numeroRuedas);
	}

	public String getNombreConductor() {
		return conductor.nombreConductor;
	}

	public void setNombreConductor(String nombreConductor) {
		this.conductor.nombreConductor = nombreConductor;
	}

	public String getCarnetConductor() {
		return conductor.carnetConductor;
	}

	public void setCarnetConductor(String carnetConductor) {
		this.conductor.carnetConductor = carnetConductor;
	}

	public String getDetalles() {
		return "Coche [matricula=" + this.getMatricula() + ", nombreConductor=" + conductor.nombreConductor + ", carnetConductor="
				+ conductor.carnetConductor + "]";
	}



}

