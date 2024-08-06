package logic;

import java.util.ArrayList;

public class Tienda {
	private String nombre;
	private String direccion;
	private String telefono;
	private ArrayList<Trabajador>trabajadores;
	private ArrayList<Disco>discos;
	private ArrayList<ProductoMusical>productos;
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public Tienda(String nombre, String direccion, String telefono) {
		setNombre(nombre);
		setDireccion(direccion);
		setTelefono(telefono);
	}
	
		public ArrayList<Trabajador> getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
		this.trabajadores = trabajadores;
	}

	public ArrayList<Disco> getDiscos() {
		return discos;
	}

	public void setDiscos(ArrayList<Disco> discos) {
		this.discos = discos;
	}

	public ArrayList<ProductoMusical> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<ProductoMusical> productos) {
		this.productos = productos;
	}
	
	public boolean agregarTrabajador(Trabajador a) {
		boolean agregado=false;
		
	for(Trabajador tra:trabajadores) {
		
	}
		return agregado;
	}
	

}
