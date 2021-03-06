/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.repository.IUsuario;

/**
 * @author sebas
 * Clase UsuarioServiceImp, implementa el servicio IUsuarioService.
 */
@Repository
//Clase que se conecta con la BD.
public class UsuarioServiceImp implements IUsuarioService {

	@Autowired
	private IUsuario iusuario;
	
	
	@Override
	public void Guardar() {
		// TODO Auto-generated method stub
		iusuario.Guardar();

	}

	@Override
	public Usuario mostrar() {
		// TODO Auto-generated method stub
		Usuario usuario = iusuario.mostrar();
		return usuario;
	}

	@Override
	public void elminiar() {
		// TODO Auto-generated method stub
		iusuario.elminiar();

	}

	@Override
	public Usuario modificar() {
		// TODO Auto-generated method stub
		Usuario usuario = iusuario.modificar();
		return usuario;
	}

}
