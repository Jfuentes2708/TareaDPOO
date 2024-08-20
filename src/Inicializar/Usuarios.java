package Inicializar;

public class Usuarios {
	private String clase;
	private boolean mostrarDisco;
	private boolean agregar;
	private boolean registrarse;
	private boolean personalizarDisco;
	private boolean cesta;
	private boolean registroTrabajadores;
	private boolean registro;
	private boolean agregarTrabajador;
	
	
	public Usuarios(String clase,boolean mostrarDisco,boolean agregar,boolean registrarse,boolean personalizarDisco,boolean cesta,
			boolean registroTrabajadores,boolean registro,boolean agregarTrabajador) {
		this.clase=clase;
		this.mostrarDisco=mostrarDisco;
		this.agregar=agregar;
		this.registrarse=registrarse;
		this.personalizarDisco=personalizarDisco;
		this.cesta=cesta;
		this.registroTrabajadores=registroTrabajadores;
		this.registro=registro;
		this.agregarTrabajador=agregarTrabajador;
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


	public boolean isRegistrarse() {
		return  registrarse;
	}


	public void setRegistrarse(boolean registrarse) {
		this.registrarse = registrarse;
	}


	public boolean isPersonalizarDisco() {
		return personalizarDisco;
	}


	public void setPersonalizarDisco(boolean personalizarDisco) {
		this.personalizarDisco = personalizarDisco;
	}


	public boolean isCesta() {
		return cesta;
	}


	public void setCesta(boolean cesta) {
		this.cesta = cesta;
	}


	public boolean isRegistroTrabajadores() {
		return registroTrabajadores;
	}


	public void setRegistroTrabajadores(boolean registroTrabajadores) {
		this.registroTrabajadores = registroTrabajadores;
	}


	public boolean isRegistro() {
		return registro;
	}


	public void setRegistro(boolean registro) {
		this.registro = registro;
	}


	public boolean isAgregarTrabajador() {
		return agregarTrabajador;
	}


	public void setAgregarTrabajador(boolean agregarTrabajador) {
		this.agregarTrabajador = agregarTrabajador;
	}
	
	
}
