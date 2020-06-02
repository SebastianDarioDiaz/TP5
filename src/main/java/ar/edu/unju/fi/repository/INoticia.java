/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Noticia;

/**
 * @author Diaz, Sebastián Darío - L.U.:3283
 * Interfaz INoticia, contiene los métodos que se pueden aplicar a la clase Noticia.
 */
public interface INoticia {

	public void Guardar();
	public Noticia mostrar();
	public void eliminar();
	public Noticia modificar();
	
}
