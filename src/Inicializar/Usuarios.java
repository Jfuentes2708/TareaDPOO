package Inicializar;

public class Usuarios {
	private String clase;
	private boolean mostrarDisco;
	private boolean agregar;
	
	public Usuarios(String clase,boolean mostrarDisco,boolean agregar) {
		this.clase=clase;
		this.mostrarDisco=mostrarDisco;
		this.agregar=agregar;
	}


	public String getClase() {
		return clase;
	}


	public void setClase(String clase) {
		this.clase = clase;
	}


	public boolean isMostrarDisco() {
		return mostrarDisco;
	}


	public void setMostrarDisco(boolean mostrarDisco) {
		this.mostrarDisco = mostrarDisco;
	}


	public boolean isAgregar() {
		return agregar;
	}


	public void setAgregar(boolean agregar) {
		this.agregar = agregar;
	}
	
	
}
