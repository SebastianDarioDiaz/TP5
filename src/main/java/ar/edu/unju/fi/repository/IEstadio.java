/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Estadio;

/**
 * @author Diaz, Sebastián Darío - L.U.:3283
 * Interfaz IEstadio, contiene los métodos que se pueden aplicar a la clase Estadio.
 */
public interface IEstadio {

	public void Guardar();
	public Estadio mostrar();
	public void eliminar();
	public Estadio modificar();
}
