/**
 * 
 */
package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Estadio;

/**
 * @author Diaz, Sebastián Darío - L.U.:3283
 * Interfaz IEstadioService, contiene los métodos que se pueden aplicar a la clase Estadio.
 */
public interface IEstadioService {

	public void Guardar();
	public Estadio mostrar();
	public void elminiar();
	public Estadio modificar();
}
