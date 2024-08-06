package logic;

import java.util.ArrayList;


public class Trabajador {
	protected String nombre;
	protected String apellidos;
	protected String numeroId;
	protected String numeroTrabajador;
	protected float salarioBasico;
	protected String nivelEscolar;
	protected String cargo;
	
	public String getNombre() {
		return nombre;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getApellidos() {
		return apellidos;
	}
	public void setApellido(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getNumeroId() {
		return numeroId;
	}
	
	
	public void setNumeroId(String numeroId) {
		this.numeroId = numeroId;
	}
	
	
	public String getNumeroTrabajador() {
		return numeroTrabajador;
	}
	
	
	public void setNumeroTrabajador(String numeroTrabajador) {
		this.numeroTrabajador = numeroTrabajador;
	}
	
	
	public float getSalarioBasico() {
		return salarioBasico;
	}
	
	
	public void setSalarioBasico(float salarioBasico) {
		this.salarioBasico = salarioBasico;
	}
	
	
	public String getNivelEscolar() {
		return nivelEscolar;
	}
	
	
	public void setNivelEscolar(String nivelEscolar) {
		this.nivelEscolar = nivelEscolar;
	}
	
	
	public String getCargo() {
		return cargo;
	}
	
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	
	
	public Trabajador(String nombre,String apellidos, String numeroId, String numeroTrabajador,
			float salarioBasico, String nivelEscolar,
			String cargo) {
		
		setNombre(nombre);
		setNumeroId(numeroId);
		setNumeroTrabajador(numeroTrabajador);
		setSalarioBasico(salarioBasico);
		setNivelEscolar(nivelEscolar);
		setCargo(cargo);
		setApellido(apellidos);

	}


	



	
	
	
	
	
	
	
	
}
