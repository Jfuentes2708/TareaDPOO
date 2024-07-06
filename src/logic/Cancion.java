package logic;

public class Cancion extends ProductoMusical  {
	private String album;

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}



	public Cancion(float precio, String titulo, String genero, String duracion,
			String interprete, String tamaFichero, String album) {
		
		super(precio, titulo, genero, duracion, interprete, tamaFichero);
		setAlbum(album);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
