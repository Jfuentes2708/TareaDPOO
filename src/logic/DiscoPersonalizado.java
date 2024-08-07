package logic;

public class DiscoPersonalizado extends Disco {

	private float precioBase;
	private float tamano;
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
	public void setTamano(float tamano) {
		this.tamano = tamano;
	}
	public DiscoPersonalizado(float precioBase, float tamano, int cantidadDatosGrabados,String nombreDisco,String interprete,String tipoSoporte,float precio ) {
		super(tipoSoporte,nombreDisco,interprete,precio);
		this.precioBase = precioBase;
		this.tamano = tamano;
		this.cantidadDatosGrabados = cantidadDatosGrabados;
	}


 







}
