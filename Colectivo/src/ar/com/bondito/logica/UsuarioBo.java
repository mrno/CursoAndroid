package ar.com.bondito.logica;

public class UsuarioBo {
	
	public boolean login(String nombreUsuario, String contraseņa){
		if (nombreUsuario.equals("usuario") && contraseņa.equals("pass")){
			return true;
		}else{
			return false;
		}
	}
}
