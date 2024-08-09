package validaciones;

import java.awt.TextField;

import javax.swing.JTextField;

public class Validaciones {
	
public static boolean validarNombre(String nombre){
		
		boolean validado = false;
		char [] stringAux = nombre.toCharArray();
		for (int i = 0; i < stringAux.length; i++) {
			if(Character.isLetter(stringAux[i])  || stringAux[i] == ' '){
				validado = true;
			}
			else{
				validado = false;
			}
		}
		return validado;
	}
	
	public static boolean validarNumero (String num){

		boolean validado = true;
		char[] stringAux = num.toCharArray();
		for(int i = 0; i < stringAux.length; i++){
			if(!Character.isDigit(stringAux[i])){
				validado = false;
			}
		}
		return validado;	
	}

	
	public static boolean validarCarnet (String carnet){
		
		boolean validado = true;
		char[] stringAux = carnet.toCharArray();
		if(stringAux.length == 11){
			for(int i =0; i<stringAux.length ; i++){
				if(!Character.isDigit(stringAux[i])){
					validado = false;
				}
			}
		}
		else{
			validado = false;
		}
		return validado;
	}

	public static boolean validarTxtLetras(JTextField palabra) {
	boolean permitido=false;
	if
	
	return permitido;
		
	}	
	
	
	
	

}
