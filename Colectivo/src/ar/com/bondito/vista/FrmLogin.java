package ar.com.bondito.vista;


import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import ar.com.bondito.logica.UsuarioBo;
import ar.com.colectivo.R;


public class FrmLogin extends Activity{
	private EditText txtUsuario;
	private EditText txtClave;
	private static final int DIALOG_ERROR_LOGIN = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lyt_login);
		
		txtUsuario = (EditText)findViewById(R.id.textUsuario);
		txtClave = (EditText)findViewById(R.id.textClave);
		
		Button btnAceptar = (Button)findViewById(R.id.btnAceptar);
		
		btnAceptar.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btnAceptarOnClick();
			}
		});
		
		Button btnCancelar = (Button)findViewById(R.id.btnCancelar);
		
		btnCancelar.setOnClickListener(new OnClickListener(){
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
	}
	private void btnAceptarOnClick(){
		UsuarioBo usuarioBo = new UsuarioBo();
		String nombreUsuario = txtUsuario.getText().toString();
		String contraseña = txtClave.getText().toString();
		boolean loginCorrecto = usuarioBo.login(nombreUsuario, contraseña);
		if (loginCorrecto){
			
			
			Intent intentoOk = new Intent(this, FrmLineasColectivo.class);
			Toast.makeText(this, "Login correcto", Toast.LENGTH_LONG).show();
			startActivity(intentoOk);
			
			
		} else {
			showDialog(DIALOG_ERROR_LOGIN);
		}
	}
	
	@Override
	protected Dialog onCreateDialog(int id) {
		Dialog dialog=null;
		switch (id) {
		case DIALOG_ERROR_LOGIN:
			Builder builder = new Builder(this);
			builder.setTitle("Error");
			builder.setMessage("Contraseña no valida");
			builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int whith) {
					dialog.dismiss();
				}
			});
			dialog =builder.create();
			break;
		}
		return dialog;
	}
	
	
	/**
	LinearLayout lytPadre = new LinearLayout(this);
	LayoutParams lp = new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT);
	lytPadre.setLayoutParams(lp);
	lytPadre.setOrientation(LinearLayout.VERTICAL);
	
	TextView lblUsuario = new TextView(this);
	lblUsuario.setText("Usuario");
	
	LayoutParams lpTextView = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
	lytPadre.addView(lblUsuario,lpTextView );
	setContentView(lytPadre);
	**/
}
