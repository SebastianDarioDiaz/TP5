/**
 * 
 */
package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Resultado;

/**
 * @author Diaz, Sebastián Darío - L.U.:3283
 * Interfaz IResultadoService, contiene los métodos que se pueden aplicar a la clase Resultado.
 */
public interface IResultadoService {

	public void Guardar();
	public Resultado mostrar();
	public void eliminar();
	public Resultado modificar();
	
}
