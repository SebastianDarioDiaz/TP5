/**
 * 
 */
package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Usuario;

/**
 * @author sebas
 * Interfaz IUsuarioService, contiene los métodos que se pueden aplicar a la clase Usuario.
 */
public interface IUsuarioService {
	
	public void Guardar();
	public Usuario mostrar();
	public void elminiar();
	public Usuario modificar();

}
