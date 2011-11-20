package ar.com.bondito.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Linea implements Serializable{
	private int nroLinea;
	private String ramal;
	private String resumen;
	private Empresa empresa;
	private List <Parada>paradas = new ArrayList<Parada>();
	
	
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public int getNroLinea() {
		return nroLinea;
	}
	public void setNroLinea(int nroLinea) {
		this.nroLinea = nroLinea;
	}
	public String getRamal() {
		return ramal;
	}
	public void setRamal(String ramal) {
		this.ramal = ramal;
	}
	public List<Parada> getParadas() {
		return paradas;
	}
	public void setParadas(List<Parada> paradas) {
		this.paradas = paradas;
	}
	public String getResumen() {
		return resumen;
	}
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
}
