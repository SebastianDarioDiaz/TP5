/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Noticia;
import ar.edu.unju.fi.repository.INoticia;

/**
 * @author Diaz, Sebastián Darío - L.U.:3283
 *
 */
@Repository
public class NoticiaServiceImp implements INoticiaService {

	@Autowired
	private INoticia inoticia;
	
	@Override
	public void Guardar() {
		// TODO Auto-generated method stub
		inoticia.Guardar();

	}

	@Override
	public Noticia mostrar() {
		// TODO Auto-generated method stub
		Noticia noticia = inoticia.mostrar();
		return noticia;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		inoticia.eliminar();

	}

	@Override
	public Noticia modificar() {
		// TODO Auto-generated method stub
		Noticia noticia = inoticia.modificar();
		return noticia;
	}

}
