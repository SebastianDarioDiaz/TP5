/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Diaz3283Tp5Application;
import ar.edu.unju.fi.model.Equipo;

/**
 * @author Diaz, Sebastián Darío - L.U.:3283
 *
 */
@Repository("equipoImp")
public class EquipoImp implements IEquipo {

	@Autowired
	private Equipo equipo;
	
	public static Logger LOG = LoggerFactory.getLogger(Diaz3283Tp5Application.class);
	
	@Override
	public void Guardar() {
		// TODO Auto-generated method stub
		LOG.info("El usuario fue guardado: " + equipo.getNombre() + ", " + equipo.getEstadio());

	}

	@Override
	public Equipo mostrar() {
		// TODO Auto-generated method stub
		LOG.info("Mostrar los datos del usuario.");
		return equipo;
	}

	@Override
	public void elminiar() {
		// TODO Auto-generated method stub
		LOG.info("Se eliminó el equipo de la BD.");

	}

	@Override
	public Equipo modificar() {
		// TODO Auto-generated method stub
		return null;
	}

}
