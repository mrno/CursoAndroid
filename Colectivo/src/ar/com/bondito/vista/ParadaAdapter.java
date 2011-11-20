package ar.com.bondito.vista;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import ar.com.bondito.modelo.Linea;
import ar.com.bondito.modelo.Parada;
import ar.com.colectivo.R;

public class ParadaAdapter extends BaseAdapter{
	
	private List<Parada> paradas; 
	Context contexto;
	
	public ParadaAdapter(List <Parada>paradas, Context contexto ){
		this.paradas = paradas;
		this.contexto = contexto;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return paradas.size();
	}

	@Override
	public Parada getItem(int index) {
		// TODO Auto-generated method stub
		return paradas.get(index);
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
		vista = li.inflate(R.layout.lyt_parada_item, null);
		
		TextView lblNroparada = (TextView) vista.findViewById(R.id.lblNroParada);
		TextView lblParadaDesc = (TextView) vista.findViewById(R.id.lblParadaDesc);
	
		
		Parada parada = getItem(position);
		lblNroparada.setText(String.valueOf(parada.getNroParada()));
		lblParadaDesc.setText(parada.getDescripcion());
		
		return vista;
	}

}
