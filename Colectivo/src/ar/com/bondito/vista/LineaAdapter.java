package ar.com.bondito.vista;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import ar.com.bondito.modelo.Linea;
import ar.com.colectivo.R;

public class LineaAdapter extends BaseAdapter{
	
	List<Linea> lineas; 
	Context contexto;
	
	public LineaAdapter(List <Linea>lineas, Context contexto ){
		this.lineas = lineas;
		this.contexto = contexto;
	}

	@Override
	public int getCount() {
		return lineas.size();
	}

	@Override
	public Linea getItem(int index) {
		return lineas.get(index);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View vista;
		LayoutInflater li = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		vista = li.inflate(R.layout.lyt_lineas_colectivo_item, null);
		
		TextView lblempresa = (TextView) vista.findViewById(R.id.lblempresa);
		TextView lblLinea = (TextView) vista.findViewById(R.id.lblLinea);
		TextView lblRecorrido = (TextView) vista.findViewById(R.id.lblRecorrido);
		
		Linea l = getItem(position);
		lblempresa.setText(l.getEmpresa().getNombreEmpresa());
		lblLinea.setText(String.valueOf(l.getNroLinea()));
		lblRecorrido.setText(l.getResumen());
		
		
		return vista;
		
	}
	

}
