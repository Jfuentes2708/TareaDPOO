package Inicializar;

import logic.Trabajador;
import logic.VideoClip;
import logic.Cancion;
import logic.Tienda;

public class Datos {

	public static Tienda inicializa() {
		Tienda tienda =new Tienda("Jorge","calle 85 entre 200 y 202","79624813");
		Trabajador t1 = new Trabajador("Alejandro Garcia Elizarde","75030525543","956231",new Float( 3000.0),"Medio","Dependiente");
		Trabajador t2 = new Trabajador("Darsy Borrero Anton","85022165465","974125", new Float(3000.0),"Medio","Dependiente");
		Trabajador t3 = new Trabajador("Sergio Alejandro Gomez Martinez","65041225452","241578",new Float(3000.0),"Medio","Dependiente");
		Trabajador t4 = new Trabajador("Ricardo Alonso Venereo","85111025635","321048", new Float(2500.0),"Superior","Administrador");
		Trabajador t5 = new Trabajador("Susana Castillo Rondon","88062325236","654712", new Float(8000.0),"Medio","Administrador");
		//Falta Entrarlos por la funcion de agregar trabjador
		
		
		Cancion hotelCalifornia = new Cancion("Hotel California", "Rock", "Eagles", "6.2 MB", "Hotel California", 6.5f, 2.49f);
		Cancion imagine = new Cancion("Imagine", "Pop", "John Lennon", "4.2 MB", "Imagine", 3.8f, 1.49f);
		Cancion despacito = new Cancion("Despacito", "Reggaeton", "Luis Fonsi ft. Daddy Yankee", "4.8 MB", "Vida", 4.2f, 0.99f);
		Cancion shapeOfYou = new Cancion("Shape of You", "Pop", "Ed Sheeran", "4.5 MB", "÷ (Divide)", 3.5f, 1.29f);
		Cancion bohemianRhapsody = new Cancion("Bohemian Rhapsody", "Rock", "Queen", "5 MB", "A Night at the Opera", 6.0f, 1.99f);
		//Falta Entrarlos por la funcion de agregar Cancion
		
		VideoClip bailandoEnLaCalle = new VideoClip(1.99f, "Bailando en la Calle", "Reggaeton", 4.2f, "Urban Flow", "50 MB", "1080p");
		VideoClip nochesDeNeon = new VideoClip(2.49f, "Noches de Neón", "Trap", 3.8f, "MC Street", "40 MB", "720p");
		VideoClip graffitiCity = new VideoClip(1.79f, "Graffiti City", "Hip-Hop", 4.5f, "Rap Crew", "35 MB", "1080p");
		VideoClip barrioVibes = new VideoClip(2.29f, "Barrio Vibes", "Latin Urban", 3.5f, "La Callejera", "30 MB", "720p");
		VideoClip suburbioNights = new VideoClip(1.99f, "Suburbio Nights", "R&B", 4.0f, "Soul Singer", "45 MB", "1080p");
		//Falta Entrarlos por la funcion de agregar Video Clip
		
		//Disco Personalizado Pendiente
		
		
		
		return tienda;

		
		
	}
	
	
	}
