/**
 * 
 */
package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Usuario;

/**
 * @author sebas
 *
 */
public interface IUsuarioService {
	
	public void Guardar();
	public Usuario mostrar();
	public void elminiar();
	public Usuario modificar();

}
