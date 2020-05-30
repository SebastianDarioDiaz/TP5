/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Noticia;

/**
 * @author Diaz, Sebastián Darío - L.U.:3283
 *
 */
public interface INoticia {

	public void Guardar();
	public Noticia mostrar();
	public void eliminar();
	public Noticia modificar();
	
}
