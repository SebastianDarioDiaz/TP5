/**
 * 
 */
package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Estadio;

/**
 * @author Diaz, Sebastián Darío - L.U.:3283
 * Interfaz IEstadioService, servicio que contiene los métodos de la clase IEstadio.
 */
public interface IEstadioService {

	public void Guardar();
	public Estadio mostrar();
	public void elminiar();
	public Estadio modificar();
}
