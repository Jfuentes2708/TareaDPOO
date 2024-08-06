package logic;

import java.util.ArrayList;

public class ProductoMusical {
	
	protected float precio;
	protected String titulo;
	protected String genero;
	protected float duracion;
	protected String interprete;
	protected String tamaFichero;
	protected ArrayList<String> colaboradores;
	
	
	
	public float getPrecio() {
		return precio;
	}
	
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	public String getGenero() {
		return genero;
	}
	
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	public float getDuracion() {
		return duracion;
	}
	
	
	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}
	
	
	public String getInterprete() {
		return interprete;
	}
	
	
	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}
	
	
	public String getTamaFichero() {
		return tamaFichero;
	}
	
	
	public void setTamaFichero(String tamaFichero) {
		this.tamaFichero = tamaFichero;
	}
	
	
	public ArrayList<String> getColaboradores() {
		return colaboradores;
	}


	public ProductoMusical(float precio, String titulo, String genero,
			float duracion, String interprete, String tamaFichero) {
		setPrecio(precio);
		setTitulo(titulo);
		setGenero(genero);
		setDuracion(duracion);
		setInterprete(interprete);
		setTamaFichero(tamaFichero);
		colaboradores = new ArrayList<String>();
		
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
}
