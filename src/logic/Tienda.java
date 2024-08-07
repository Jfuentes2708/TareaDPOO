package logic;

import java.util.ArrayList;

import logic.Cancion;
import logic.VideoClip;

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

	// FUNCIONES BUSCAR
	public Trabajador buscarTrabajador(String nombre) {//Funcion para la barra de busqueda
		Trabajador tra=null;
		boolean encontrado=false;
		for (int i = 0; i < trabajadores.size()&& !encontrado; i++) {
			if(trabajadores.get(i).getNombre().equalsIgnoreCase(nombre)) {
				tra=trabajadores.get(i);
				encontrado=true;
			}
		}
		return tra;
	}
	//Pendiente de Crear una funcion para el apellido
	//Pendiente funcion para buscar por CI

	public Trabajador verificarTrabajador(String numeroTrabajo) {//Funcion para verificar la existencia de un trabajador 
		boolean verificado=false;
		Trabajador traba=null;
		for (int i = 0; i < trabajadores.size() && !verificado; i++) {
			if(trabajadores.get(i).getNumeroTrabajador().equalsIgnoreCase(numeroTrabajo));
			traba=trabajadores.get(i);
			verificado=true;
		}
		return traba;
	}


	public ProductoMusical buscarProducto(String Title) {//Funcion para la Barra de busqueda
		ProductoMusical pro=null;
		boolean encontrar=false;
		for (int i = 0; i < productos.size()&& !encontrar; i++) {
			if(productos.get(i).getTitulo().equalsIgnoreCase(Title));
			pro=productos.get(i);
			encontrar=true;
		}
		return pro;
	}

	public Cancion buscarCancion(String Title) {//BUSCAR CANCION
		Cancion cancion=null;
		boolean encontrar=false;
		for (int i = 0; i < productos.size()&& !encontrar; i++) {
			if(productos.get(i) instanceof Cancion) {
				if(productos.get(i).getTitulo().equalsIgnoreCase(Title)) {
					cancion=((Cancion) productos.get(i));
					encontrar=true;
				}
			}
		}
		return cancion;
	}

	public VideoClip buscarVideoClip(String Title) {//BUSCAR VIDEO CLIP
		VideoClip video=null;
		boolean encontrar=false;
		for (int i = 0; i < productos.size()&& !encontrar; i++) {
			if(productos.get(i) instanceof VideoClip) {
				if(productos.get(i).getTitulo().equalsIgnoreCase(Title)) {
					video=((VideoClip) productos.get(i));
					encontrar=true;
				}
			}
		}
		return video;
	}

	public Disco buscarDisco(String nombreDisco) {//Funcion para la Barra de busqueda
		Disco dic=null;
		boolean encontrar=false;
		for (int i = 0; i < discos.size()&& !encontrar; i++) {
			if(discos.get(i).getNombreDisco().equalsIgnoreCase(nombreDisco));
			dic=discos.get(i);
			encontrar=true;
		}
		return dic;
	}
	public Disco buscarDiscoInterprete(String Interprete) {//Funcion para la Barra de busqueda
		Disco dic=null;
		boolean encontrar=false;
		for (int i = 0; i < discos.size()&& !encontrar; i++) {
			if(discos.get(i).getInterprete().equalsIgnoreCase(Interprete));
			dic=discos.get(i);
			encontrar=true;
		}
		return dic;
	}


	//Agregar 
	public boolean agregarTrabajador(Trabajador a) {//TRABAJADOR
		boolean agregado=false;
		if(verificarTrabajador(a.getNumeroTrabajador())==null) {
			trabajadores.add(a);
			agregado=true;
		}		
		return agregado;
	}

	public boolean agregarDisco(Disco d) {//DISCO
		boolean agregado=false;
		if(buscarDisco(d.getNombreDisco())==null) {
			discos.add(d);
			agregado=true;
		}		
		return agregado;
	}

	public boolean agregarCancion(Cancion can) {//CANCION
		boolean agregado=false;
		if(buscarCancion(can.getTitulo())==null) {
			productos.add(can);
			agregado=true;
		}		
		return agregado;
	}

	public boolean agregarVideoClip(VideoClip vid) {//VIDEO CLIP
		boolean agregado=false;
		if(buscarVideoClip(vid.getTitulo())==null) {
			productos.add(vid);
			agregado=true;
		}		
		return agregado;
	}

	// Eliminar
	public boolean eliminarTrabajador(Trabajador a) {//TRABAJADOR
		boolean eliminado=false;
		if(verificarTrabajador(a.getNumeroTrabajador())!=null) {
			for(int i=0; i < trabajadores.size(); i++){
				if((trabajadores.get(i)) == a){
					trabajadores.remove(i);
					eliminado=true;
				}
			}
		}		
		return eliminado;
	}

	public boolean eliminarDisco(Disco d) {//Disco
		boolean eliminado=false;
		if(buscarDisco(d.getNombreDisco())!=null){
			for(int i=0; i < discos.size(); i++){
				if((discos.get(i)) == d){
					discos.remove(i);
					eliminado=true;
				}
			}
		}		
		return eliminado;
	}

	public boolean eliminarCancion(Cancion can) {//Cancion
		boolean eliminado=false;
		if(buscarCancion(can.getTitulo())!=null){
			for(int i=0; i < productos.size(); i++){
				if((productos.get(i)) == can){
					productos.remove(i);
					eliminado=true;
				}
			}
		}		
		return eliminado;
	}

	public boolean eliminarVideoClip(VideoClip vid) {//Video Clip
		boolean eliminado=false;
		if(buscarVideoClip(vid.getTitulo())!=null){
			for(int i=0; i < productos.size(); i++){
				if((productos.get(i)) == vid){
					productos.remove(i);
					eliminado=true;
				}
			}
		}		
		return eliminado;
	}

	//Facilitar trabajo con canciones y videos por separado

	public ArrayList <Cancion> ListaCanciones(){
		ArrayList <Cancion> canciones = new ArrayList<Cancion>();
		for(int i=0; i < productos.size(); i++){
			if(productos.get(i) instanceof Cancion){
				canciones.add((Cancion)productos.get(i));
			}
		}
		return canciones;
	}

	public ArrayList<VideoClip> ListaVideos (){
		ArrayList <VideoClip> videos = new ArrayList<VideoClip>();
		for(int i=0; i < productos.size(); i++){
			if(productos.get(i) instanceof VideoClip){
				videos.add((VideoClip)productos.get(i));
			}
		}
		return videos;
	}














}
