/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Diaz3283Tp5Application;
import ar.edu.unju.fi.model.Estadio;

/**
 * @author Diaz, Sebastián Darío - L.U.:3283
 *
 */
@Repository("estadioImp")
public class EstadioImp implements IEstadio {

	private Estadio estadio;

	public static Logger LOG = LoggerFactory.getLogger(Diaz3283Tp5Application.class);
	
	@Override
	public void Guardar() {
		// TODO Auto-generated method stub
		LOG.info("El estadio fue guardado: " + estadio.getNombre() + ", " + estadio.getDireccion());

	}

	@Override
	public Estadio mostrar() {
		// TODO Auto-generated method stub
		LOG.info("Mostrar los datos del estadio.");
		return estadio;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		LOG.info("Se eliminó el estadio de la BD.");
	}

	@Override
	public Estadio modificar() {
		// TODO Auto-generated method stub
		return null;
	}

}
