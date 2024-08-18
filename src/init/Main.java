package init;



import javax.swing.JDialog;
import Inicializar.Datos;
import logic.Tienda;
import ui.IniciarSesion;


public class Main {
	
	public static void main(String[] args) {
		try {
			Tienda tienda=Datos.inicializa();
			IniciarSesion dialog = new IniciarSesion(tienda);
			
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}



