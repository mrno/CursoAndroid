package ar.com.bondito.logica;

import java.util.ArrayList;
import java.util.List;

import ar.com.bondito.modelo.Empresa;
import ar.com.bondito.modelo.Linea;
import ar.com.bondito.modelo.Parada;

public class ParadaBo {
	public List <Parada> recuperarParada(){

		Parada parada1 = new Parada();
		parada1.setNroParada(1);
		parada1.setDescripcion("Santa fe y San Lorenzo");
		
		Parada parada2 = new Parada();
		parada2.setNroParada(2);
		parada2.setDescripcion("3 de Abril y España");
		
		Parada parada3 = new Parada();
		parada3.setNroParada(3);
		parada3.setDescripcion("9 de Julio y San Lorenzo");
		
		
		List<Parada> paradas = new ArrayList<Parada>();
		paradas.add(parada1);
		paradas.add(parada2);
		paradas.add(parada3);
		
		return paradas;
	}

}
