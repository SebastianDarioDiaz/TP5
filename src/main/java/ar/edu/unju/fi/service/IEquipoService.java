/**
 * 
 */
package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Equipo;

/**
 * @author Diaz, Sebastián Darío - L.U.:3283
 * Interfaz IEquipoService, servicio que contiene los métodos de la clase Equipo.
 */
public interface IEquipoService {

	public void Guardar();
	public Equipo mostrar();
	public void elminiar();
	public Equipo modificar();
}
