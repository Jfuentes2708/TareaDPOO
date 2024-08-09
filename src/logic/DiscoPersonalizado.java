package logic;

public class DiscoPersonalizado extends Disco {

	private float precioBase;
	private float tamano;
	private float precio;
	private int cantidadDatosGrabados;


	public int getCantidadDatosGrabados() {
		return cantidadDatosGrabados;
	}
	public void setCantidadDatosGrabados(int cantidadDatosGrabados) {
		this.cantidadDatosGrabados = cantidadDatosGrabados;
	}
	public float getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}
	public float getTamano() {
		return tamano;
	}
	public float getPrecio() {
		return precio;
	}
	public void setTamano(float tamano) {
		this.tamano = tamano;
	}
	public DiscoPersonalizado(float precioBase, float tamano, int cantidadDatosGrabados,String nombreDisco,String interprete,String tipoSoporte,float precio ) {
		super(tipoSoporte,nombreDisco,interprete,precio);
		this.precioBase = precioBase;
		this.tamano = tamano;
		this.cantidadDatosGrabados = cantidadDatosGrabados;
	}

	public float calacularPrecio(){
		precio = 0;
		if(this.getTipoSoporte().equals("CD")){
			precioBase = 10;
		}
		if(this.getTipoSoporte().equals("DVD")){
			precioBase=20;
		}
		if(0<cantidadDatosGrabados && cantidadDatosGrabados<=10){
			precio = precioBase + 10;
		}
		else if(10<cantidadDatosGrabados && cantidadDatosGrabados<=15){
			precio = precioBase + 20;

		}else if(15<cantidadDatosGrabados && cantidadDatosGrabados<=20){
			precio = precioBase + 30;
		}else{
			precio = precioBase + 50;
		}
		return this.getPrecio();
	}










}
