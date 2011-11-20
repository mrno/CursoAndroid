package ar.com.bondito.modelo;

import java.util.ArrayList;
import java.util.List;

public class Parada {
	private String descripcion;
	private int nroParada;
	private double latitud;
	private double longitud;
	private List <Horario>horarios = new ArrayList<Horario>();
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getNroParada() {
		return nroParada;
	}
	public void setNroParada(int nroParada) {
		this.nroParada = nroParada;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public List<Horario> getHorarios() {
		return horarios;
	}
	public void setHorarios(List<Horario> horarios) {
		this.horarios = horarios;
	}
}
