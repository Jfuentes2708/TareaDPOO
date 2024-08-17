package Inicializar;

public class autenticacion {
	private String gerente="Gerente",contraseña="1";
	private String Administrador="Admi",contraseñaAdmi="2";
	private String cliente="Cliente",contraseñaCliente="3";

	public final Usuarios verificausuario (String nombre,String contraseña) {
		Usuarios usuario=null;
		if(this.gerente.equals(nombre)&& this.contraseña.equals(contraseña)) {
			usuario= new Usuarios(gerente);
		}else if(this.Administrador.equals(nombre)&& this.contraseñaAdmi.equals(contraseña)){
			usuario= new Usuarios(Administrador);	
		}else {

		} if(this.cliente.equals(nombre)&& this.contraseñaCliente.equals(contraseña)){
			usuario= new Usuarios(cliente);

		}
			return usuario;
		}
	}
