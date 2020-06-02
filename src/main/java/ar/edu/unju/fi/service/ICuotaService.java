/**
 * 
 */
package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Cuota;

/**
 * @author Diaz, Sebastián Darío - L.U.:3283
 * Interfaz ICuotaService, servicio que contiene los métodos de la clase Cuota.
 */
public interface ICuotaService {

	public void Guardar();
	public Cuota mostrar();
	public void elminiar();
	public Cuota modificar();
}
