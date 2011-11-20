package ar.com.bondito.vista;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import ar.com.bondito.logica.LineaBo;
import ar.com.bondito.logica.ParadaBo;
import ar.com.bondito.modelo.Linea;
import ar.com.bondito.modelo.Parada;
import ar.com.colectivo.R;

public class FrmVerHorario extends Activity {
	
	ListView lstParadas;
	ParadaAdapter horarioAdapter;
	Linea linea;
	TextView lblEmpresa;
	TextView lblLinea;
	TextView lblRamal;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lyt_parada);
		
		Bundle bundle = getIntent().getExtras();
		linea = (Linea) bundle.getSerializable("linea");
		
		
		initComponents();
		cargarValores();
		cargarParadas();
		
		
		
	}
	
	public void initComponents(){
		lblEmpresa = (TextView) findViewById(R.id.lblempresa);
		lblLinea = (TextView) findViewById(R.id.lblLinea);
		lblRamal = (TextView) findViewById(R.id.lblRamal);		
	}
	
	public void cargarValores(){
		String stgEmpresa = linea.getEmpresa().getNombreEmpresa();
		lblEmpresa.setText(stgEmpresa);
		
		lblLinea.setText(String.valueOf(linea.getNroLinea()));
		
		
	}
	
	public void cargarParadas (){
		ParadaBo paradaBo = new ParadaBo();
		List<Parada> paradas = paradaBo.recuperarParada();
		lstParadas = (ListView) findViewById(R.id.lstParadas);
		horarioAdapter = new ParadaAdapter(paradas, this);
		lstParadas.setAdapter(horarioAdapter);
		registerForContextMenu(lstParadas);
	}
}
