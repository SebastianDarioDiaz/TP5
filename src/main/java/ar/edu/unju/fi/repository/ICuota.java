/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Cuota;

/**
 * 
 * @author Diaz, Sebastián Darío - L.U.:3283
 * Interfaz ICuota, contiene los métodos que se pueden aplicar a la clase Cuota.
 *
 */
public interface ICuota {

	public void Guardar();
	public Cuota mostrar();
	public void elminiar();
	public Cuota modificar();
}
