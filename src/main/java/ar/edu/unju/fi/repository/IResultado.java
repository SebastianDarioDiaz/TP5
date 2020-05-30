/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Resultado;

/**
 * @author Diaz, Sebastián Darío - L.U.:3283
 *
 */
public interface IResultado {

	public void Guardar();
	public Resultado mostrar();
	public void eliminar();
	public Resultado modificar();
	
	
}
