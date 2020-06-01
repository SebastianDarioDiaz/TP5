/**
 * 
 */
package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Diaz, Sebastián Darío - L.U.:3283
 *Clase Equipo, representa a un equipo de futbol en la vida real.
 */
@Component
public class Equipo {

	//Atributo de tipo cadena que almacena el nombre del Equipo.
	private String nombreEquipo;
	@Autowired
	//Atributo de tipo Estadio que representa el estadio donde jugó el equipo.
	private Estadio estadioEquipo;
	
	/**
	 * Constructor por defecto.
	 */
	public Equipo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor Parametrizado.
	 * @param nombre
	 * @param estadio
	 */
	public Equipo(String nombre, Estadio estadio) {
		this.nombreEquipo = nombre;
		this.estadioEquipo = estadio;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombreEquipo;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombreEquipo = nombre;
	}

	/**
	 * @return the estadio
	 */
	public Estadio getEstadio() {
		return estadioEquipo;
	}

	/**
	 * @param estadio the estadio to set
	 */
	public void setEstadio(Estadio estadio) {
		this.estadioEquipo = estadio;
	}

	@Override
	/**
	 * Metodo toString, se encarga de mostrar los atributos en forma de cadena, cuando es invocado.
	 */
	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", estadioEquipo=" + estadioEquipo + "]";
	}

}
