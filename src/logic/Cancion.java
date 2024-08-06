package logic;

public class Cancion extends ProductoMusical  {
	private String album;

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}



	public Cancion( String titulo, String genero,String interprete, String tamaFichero, String album, float duracion,float precio) {
		
		super(precio, titulo, genero, duracion, interprete, tamaFichero);
		setAlbum(album);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
