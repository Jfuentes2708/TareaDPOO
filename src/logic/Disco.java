package logic;

public class Disco {
	protected String tipoSoporte;
	protected String nombreDisco;
	protected String interprete;
	protected float precio;
	public Disco(String tipoSoporte, String nombreDisco, String interprete, float precio) {
		this.tipoSoporte = tipoSoporte;
		this.nombreDisco = nombreDisco;
		this.interprete = interprete;
		this.precio = precio;
	}
	public String getTipoSoporte() {
		return tipoSoporte;
	}
	public void setTipoSoporte(String tipoSoporte) {
		this.tipoSoporte = tipoSoporte;
	}
	public String getNombreDisco() {
		return nombreDisco;
	}
	public void setNombreDisco(String nombreDisco) {
		this.nombreDisco = nombreDisco;
	}
	public String getInterprete() {
		return interprete;
	}
	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
}
