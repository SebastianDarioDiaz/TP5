/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Equipo;
import ar.edu.unju.fi.repository.IEquipo;

/**
 * @author Diaz, Sebastián Darío - L.U.:3283
 * Clase EquipoServiceImp, implementa el servicio ICuotaEquipo.
 */
@Repository
//Clase que se conecta con la BD.
public class EquipoServiceImp implements IEquipoService {

	@Autowired
	private IEquipo iequipo;
	
	@Override
	public void Guardar() {
		// TODO Auto-generated method stub
		iequipo.Guardar();

	}

	@Override
	public Equipo mostrar() {
		// TODO Auto-generated method stub
		Equipo equipo = iequipo.mostrar();
		return equipo;
	}

	@Override
	public void elminiar() {
		// TODO Auto-generated method stub
		iequipo.elminiar();

	}

	@Override
	public Equipo modificar() {
		// TODO Auto-generated method stub
		Equipo equipo = iequipo.modificar();
		return equipo;
	}

}
