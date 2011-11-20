package ar.com.bondito.logica;
import java.util.ArrayList;
import java.util.List;

import ar.com.bondito.modelo.Empresa;
import ar.com.bondito.modelo.Linea;

public class LineaBo {
	
	public List <Linea> recuperarLinea(){
		Empresa empERSA = new Empresa();
		empERSA.setNombreEmpresa("ERSA");
		
		Linea linea102 = new Linea();
		linea102.setNroLinea(102);
		linea102.setRamal("B");
		linea102.setResumen("Barrio Laguna Seca");
		linea102.setEmpresa(empERSA);
		
		Linea linea108 = new Linea();
		linea108.setNroLinea(108);
		linea108.setRamal("A");
		linea108.setResumen("Barrio Fray Jose de la Quintana");
		linea108.setEmpresa(empERSA);
		
		Linea linea106 = new Linea();
		linea106.setNroLinea(106);
		linea106.setRamal("B");
		linea106.setResumen("Barrio Nuevo");
		linea106.setEmpresa(empERSA);
		
		List<Linea> lineas = new ArrayList<Linea>();
		lineas.add(linea102);
		lineas.add(linea108);
		lineas.add(linea106);
		
		return lineas;
	}
}
