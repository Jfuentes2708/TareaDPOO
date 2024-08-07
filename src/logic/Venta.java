package logic;

import java.util.ArrayList;
import java.util.Date;

public class Venta {
	private String idTrabajador;
	private Date fecha;
	private ArrayList<Disco> discos;

	public Venta(String noTrabajador, Date fecha) {
		this.idTrabajador = noTrabajador;
		this.fecha = fecha; 
		this.discos= new ArrayList<Disco>();
	}

	public String getIdTrabajador() {
		return idTrabajador;
	}

	public void setIdTrabajador(String noTrabajador) {
		this.idTrabajador = noTrabajador;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public ArrayList<Disco> getDiscos() {
		return discos;
	}

	public void setDiscos(ArrayList<Disco> discos) {
		this.discos = discos;
	}



}
