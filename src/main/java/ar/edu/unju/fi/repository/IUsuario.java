/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Usuario;

/**
 * @author sebas
 *
 */
public interface IUsuario {

	public void Guardar();
	public Usuario mostrar();
	public void elminiar();
	public Usuario modificar();
	
}
