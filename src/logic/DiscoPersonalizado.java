package logic;

public class DiscoPersonalizado extends Disco {

	private float precioBase;
	private float tamaño;
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
	public float getTamaño() {
		return tamaño;
	}
	public void setTamaño(float tamaño) {
		this.tamaño = tamaño;
	}
	public DiscoPersonalizado(float precioBase, float tamaño, int cantidadDatosGrabados,String nombreDisco,String interprete,String tipoSoporte,float precio ) {
		super(tipoSoporte,nombreDisco,interprete,precio);
		this.precioBase = precioBase;
		this.tamaño = tamaño;
		this.cantidadDatosGrabados = cantidadDatosGrabados;
	}


 







}
