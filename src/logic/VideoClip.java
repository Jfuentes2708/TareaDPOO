package logic;

public class VideoClip extends ProductoMusical {
	private String resolucion;

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	
	
	public VideoClip(float precio, String titulo, String genero,
			String duracion, String interprete, String tamaFichero,String resolucion) {
		
		super(precio, titulo, genero, duracion, interprete, tamaFichero);
		this.resolucion = resolucion;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
