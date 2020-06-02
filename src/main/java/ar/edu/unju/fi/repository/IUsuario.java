/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Usuario;

/**
 * 
 * @author Diaz, Sebastián Darío - L.U.:3283
 * Interfaz IUsuario, contiene los métodos que se pueden aplicar a la clase Usuario.
 */
public interface IUsuario {

	public void Guardar();
	public Usuario mostrar();
	public void elminiar();
	public Usuario modificar();
	
}
