package logic;

import java.util.ArrayList;


public class Trabajador {
	protected String nombre;
	protected ArrayList<String> apellidos;
	protected int numeroId;
	protected int numeroTrabajador;
	protected float salarioBasico;
	protected String nivelEscolar;
	protected String cargo;
	
	public String getNombre() {
		return nombre;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public ArrayList<String> getApellidos() {
		return apellidos;
	}

	
	public int getNumeroId() {
		return numeroId;
	}
	
	
	public void setNumeroId(int numeroId) {
		this.numeroId = numeroId;
	}
	
	
	public int getNumeroTrabajador() {
		return numeroTrabajador;
	}
	
	
	public void setNumeroTrabajador(int numeroTrabajador) {
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


	
	
	public Trabajador(String nombre, int numeroId,int numeroTrabajador,
			float salarioBasico, String nivelEscolar,
			String cargo) {
		
		setNombre(nombre);
		setNumeroId(numeroId);
		setNumeroTrabajador(numeroTrabajador);
		setSalarioBasico(salarioBasico);
		setNivelEscolar(nivelEscolar);
		setCargo(cargo);
		apellidos = new ArrayList<String>();

	}


	



	
	
	
	
	
	
	
	
}
