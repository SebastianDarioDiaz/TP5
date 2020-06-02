/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Cuota;
import ar.edu.unju.fi.repository.ICuota;

/**
 * @author Diaz, Sebastián Darío - L.U.:3283
 *
 */
@Repository
//Clase que se conecta con la BD.
public class CuotaServiceImp implements ICuotaService {

	@Autowired
	private ICuota icuota;
	
	@Override
	public void Guardar() {
		// TODO Auto-generated method stub
		icuota.Guardar();

	}

	@Override
	public Cuota mostrar() {
		// TODO Auto-generated method stub
		Cuota cuota = icuota.mostrar();
		return cuota;
	}

	@Override
	public void elminiar() {
		// TODO Auto-generated method stub
		icuota.elminiar();

	}

	@Override
	public Cuota modificar() {
		// TODO Auto-generated method stub
		Cuota cuota = icuota.modificar();
		return cuota;
	}

}
