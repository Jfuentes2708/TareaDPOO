package logic;

import java.sql.Date;

public class Gerente extends Trabajador {
	private Date fechaOcupaCargo;

	public Date getFechaOcupaCargo() {
		return fechaOcupaCargo;
	}

	public void setFechaOcupaCargo(Date fechaOcupaCargo) {
		this.fechaOcupaCargo = fechaOcupaCargo;
	}

	
	
	public Gerente(String nombre, String numeroId, String numeroTrabajador,
			float salarioBasico, String nivelEscolar, String cargo,
			Date fechaOcupaCargo) {
		
		super(nombre, numeroId, numeroTrabajador, salarioBasico, nivelEscolar,cargo);
		this.fechaOcupaCargo = fechaOcupaCargo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
