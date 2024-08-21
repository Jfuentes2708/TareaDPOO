package init;



import javax.swing.JDialog;
import Inicializar.Datos;
import logic.Tienda;
import ui.IniciarSesion;


/**
 * 
 */
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

/*1. HACER EL BOTON AGREGAR DE LA INTERFAZ AGREGAR PRODUCTO MUSICAL 
  2. PASAR LAS VALIDACIONES QUE HICISTE EN CADA BOTON DE AGREGAR QUE HAY(INTERFAZ AGREGAR TRABAJADOR
  ,AGREGAR PRODUCTO MUSICAR,AGREGAR DISCO) ES DECIR QUE EN CADA BOTON DE AGREGAR TIENES QUE COMPROBAR DENTRO QUE TODOS LOS DATOS QUE
  Q PASES SEAN CORRECTOS. EL BOTON AGREGAR DE LA CLASE AGREGAR TRABJADOR ESTA CREADO SIN LAS VALIDACIONES TIENES QUE PASARLAS Y COMPROBAR CON ELLAS.

////ESTOS CODIGOS SE PONEN EN LOS TXT DE CADA COSA RESPECTIVA(FIJATE EN LA INTERFAZ AGREGAR TRABAJADOR COMO ES Q ESTA 
salarioBas.addKeyListener(new KeyAdapter() { PARA PONER EN LOS TEXTFILE Q  SEAN NUMEROS
	public void keyTyped(KeyEvent e) {
			char a= e.getKeyChar();
		if(a<'0'|| a>'9')e.consume();

	}
});

	nombreTXT.addKeyListener(new KeyAdapter() {//CODIGO SOLO NOMBRES
	@Override
	public void keyTyped(KeyEvent e) {
		char c=e.getKeyChar();
		if((c<'a'||c>'z' )&& (c<'A'|| c>'Z'))e.consume();;

	}
});*/
 		