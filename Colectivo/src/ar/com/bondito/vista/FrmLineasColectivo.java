package ar.com.bondito.vista;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import ar.com.bondito.logica.LineaBo;
import ar.com.bondito.modelo.Linea;
import ar.com.colectivo.R;

public class FrmLineasColectivo extends Activity {
	ListView lstLineas;
	LineaAdapter lineaAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lyt_lineas_colectivo);
		cargarLineas();

	}

	private void cargarLineas() {
		LineaBo lineaBo = new LineaBo();
		List<Linea> lineas = lineaBo.recuperarLinea();
		lstLineas = (ListView) findViewById(R.id.lstLineas);
		lineaAdapter = new LineaAdapter(lineas, this);
		lstLineas.setAdapter(lineaAdapter);
		registerForContextMenu(lstLineas);
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {

		super.onCreateContextMenu(menu, v, menuInfo);
		MenuInflater inflater = getMenuInflater();

		inflater.inflate(R.menu.mn_opciones_linea, menu);
		menu.setHeaderTitle(R.string.lblOpciones);

	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		super.onContextItemSelected(item);
		AdapterContextMenuInfo info = (AdapterContextMenuInfo) item
				.getMenuInfo();
		int posicion = info.position;
		Linea linea = lineaAdapter.getItem(posicion);

		int id = item.getItemId();
		switch (id) {
		case R.id.itemRecorrido:
			

			break;
		case R.id.itemHorario:
			Intent intent = new Intent(this, FrmVerHorario.class);
			intent.putExtra("linea",linea);
			startActivity(intent);

			break;

		default:
			break;
		}
		return true;

	}
}
