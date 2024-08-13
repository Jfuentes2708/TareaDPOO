package init;

import java.awt.EventQueue;

import Inicializar.Datos;
import logic.Tienda;
import ui.Principal;


/**
 * 
 */
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Tienda tienda= Datos.inicializa();//PENDIENTE
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

