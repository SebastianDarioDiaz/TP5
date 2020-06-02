/**
 * 
 */
package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Diaz, Sebastián Darío - L.U.:3283
 * Clase Estadio, representa a un estadio de futbol en el mundo real.
 */
@Component
//Clase Bean administrado Estadio.
public class Estadio {

	//Atributo que guarda el nombre del estadio.
	private String nombreEstadio;
	//Atributo que contiene la fecha de fundacion del estadio.
	private LocalDate fechaFundacionEstadio;
	//Atributo que guarda el nombre de la ciudad en la que se encuentra el estadio.
	private String ciudadEstadio;
	//Atributo que contiene la cantidad de espectadores que puede contener un estadio.
	private int capacidadEstadio;
	//Atributo que guarda la dirección del estadio.
	private String direccionEstadio;
	
	/**
	 * Constructor por defecto.
	 */
	public Estadio() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor parametrizado.
	 * @param nombre
	 * @param fechaFundacion
	 * @param ciudad
	 * @param capacidad
	 * @param direccion
	 */
	public Estadio(String nombre, LocalDate fechaFundacion, String ciudad, int capacidad, String direccion) {
		this.nombreEstadio = nombre;
		this.fechaFundacionEstadio = fechaFundacion;
		this.ciudadEstadio = ciudad;
		this.capacidadEstadio = capacidad;
		this.direccionEstadio = direccion;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombreEstadio;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombreEstadio = nombre;
	}

	/**
	 * @return the fechaFundacion
	 */
	public LocalDate getFechaFundacion() {
		return fechaFundacionEstadio;
	}

	/**
	 * @param fechaFundacion the fechaFundacion to set
	 */
	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacionEstadio = fechaFundacion;
	}

	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudadEstadio;
	}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudadEstadio = ciudad;
	}

	/**
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidadEstadio;
	}

	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidadEstadio = capacidad;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccionEstadio;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccionEstadio = direccion;
	}

	@Override
	/*
	 * Método toString, se encarga de mostrar los atributos en forma de cadena, cuando es invocado.
	 */
	public String toString() {
		return "Estadio [nombreEstadio=" + nombreEstadio + ", fechaFundacionEstadio=" + fechaFundacionEstadio
				+ ", ciudadEstadio=" + ciudadEstadio + ", capacidadEstadio=" + capacidadEstadio + ", direccionEstadio="
				+ direccionEstadio + "]";
	}

}
