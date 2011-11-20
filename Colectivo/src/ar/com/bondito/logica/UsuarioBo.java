package ar.com.bondito.logica;

public class UsuarioBo {
	
	public boolean login(String nombreUsuario, String contraseña){
		if (nombreUsuario.equals("usuario") && contraseña.equals("pass")){
			return true;
		}else{
			return false;
		}
	}
}
