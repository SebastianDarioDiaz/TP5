/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Diaz3283Tp5Application;
import ar.edu.unju.fi.model.Usuario;

/**
 * @author sebas
 *
 */
@Repository("usuarioImp")
public class UsuarioImp implements IUsuario {

	@Autowired
	private Usuario usuario;

	public static Logger LOG = LoggerFactory.getLogger(Diaz3283Tp5Application.class);

	@Override
	public void Guardar() {
		// TODO Auto-generated method stub
		LOG.info("El usuario fue guardado: " + usuario.getApellidoUsuario() + ", " + usuario.getNombreUsuario());

	}

	@Override
	public Usuario mostrar() {
		// TODO Auto-generated method stub
		LOG.info("Mostrar los datos del usuario.");
		return usuario;
	}

	@Override
	public void elminiar() {
		// TODO Auto-generated method stub
		LOG.info("Se eliminó el usuario de la BD.");

	}

	@Override
	public Usuario modificar() {
		// TODO Auto-generated method stub
		return null;
	}

}
