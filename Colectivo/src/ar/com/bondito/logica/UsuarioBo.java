package ar.com.bondito.logica;

public class UsuarioBo {
	
	public boolean login(String nombreUsuario, String contrase�a){
		if (nombreUsuario.equals("usuario") && contrase�a.equals("pass")){
			return true;
		}else{
			return false;
		}
	}
}
