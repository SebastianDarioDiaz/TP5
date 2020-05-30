/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Diaz3283Tp5Application;
import ar.edu.unju.fi.model.Cuota;

/**
 * @author Diaz, Sebastián Darío - L.U.:3283
 *
 */
@Repository("cuotaImp")
public class CuotaImp implements ICuota {

	@Autowired
	private Cuota cuota;
	
	public static Logger LOG = LoggerFactory.getLogger(Diaz3283Tp5Application.class);
	
	@Override
	public void Guardar() {
		// TODO Auto-generated method stub
		LOG.info("Cuota guardada: " + cuota.getIdCuota() + ", " + cuota.getMontoCuota());

	}

	@Override
	public Cuota mostrar() {
		// TODO Auto-generated method stub
		LOG.info("Mostrar los datos de la cuota.");
		return cuota;
	}

	@Override
	public void elminiar() {
		// TODO Auto-generated method stub
		LOG.info("Se eliminó la cuota de la BD.");

	}

	@Override
	public Cuota modificar() {
		// TODO Auto-generated method stub
		return null;
	}

}
