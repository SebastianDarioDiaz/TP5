/**
 * 
 */
package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Diaz, Sebastián Darío - L.U.:3283
 * Clase Cuota, representa a una cuota que un usuario debe pagar.
 *
 */
@Component
public class Cuota {
	//Atributo tipo long que representa al identificador de la clase.
	private long idCuota;
	//Atributo tipo fecha que contendrá el valor de la fecha del pago de la cuota.
	private LocalDate fechaPagoCuota;
	//Atributo tipo cadena que almacenará el período de una cuota.
	private String periodoCuota;
	//Atributo tipo doble que almacena el monto a pagar por cuota.
	private double montoCuota;
	// Atributo de tipo cadena que contendrá el estado de la cuota.
	private String estadoCuota;
	@Autowired
	//Atributo de tipo Usuario que contiene la información del usuario que debe pagar la cuota.
	private Usuario usuarioCuota;
	
	/**
	 * Constructor por defecto.
	 */
	public Cuota() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor parametrizado.
	 * @param idCuota
	 * @param fechaPagoCuota
	 * @param periodoCuota
	 * @param montoCuota
	 * @param estadoCuota
	 * @param usuarioCuota
	 */
	public Cuota(long idCuota, LocalDate fechaPagoCuota, String periodoCuota, double montoCuota, String estadoCuota,
			Usuario usuarioCuota) {
		this.idCuota = idCuota;
		this.fechaPagoCuota = fechaPagoCuota;
		this.periodoCuota = periodoCuota;
		this.montoCuota = montoCuota;
		this.estadoCuota = estadoCuota;
		this.usuarioCuota = usuarioCuota;
	}

	/**
	 * @return the idCuota
	 */
	public long getIdCuota() {
		return idCuota;
	}

	/**
	 * @param idCuota the idCuota to set
	 */
	public void setIdCuota(long idCuota) {
		this.idCuota = idCuota;
	}

	/**
	 * @return the fechaPagoCuota
	 */
	public LocalDate getFechaPagoCuota() {
		return fechaPagoCuota;
	}

	/**
	 * @param fechaPagoCuota the fechaPagoCuota to set
	 */
	public void setFechaPagoCuota(LocalDate fechaPagoCuota) {
		this.fechaPagoCuota = fechaPagoCuota;
	}

	/**
	 * @return the periodoCuota
	 */
	public String getPeriodoCuota() {
		return periodoCuota;
	}

	/**
	 * @param periodoCuota the periodoCuota to set
	 */
	public void setPeriodoCuota(String periodoCuota) {
		this.periodoCuota = periodoCuota;
	}

	/**
	 * @return the montoCuota
	 */
	public double getMontoCuota() {
		return montoCuota;
	}

	/**
	 * @param montoCuota the montoCuota to set
	 */
	public void setMontoCuota(double montoCuota) {
		this.montoCuota = montoCuota;
	}

	/**
	 * @return the estadoCuota
	 */
	public String getEstadoCuota() {
		return estadoCuota;
	}

	/**
	 * @param estadoCuota the estadoCuota to set
	 */
	public void setEstadoCuota(String estadoCuota) {
		this.estadoCuota = estadoCuota;
	}

	/**
	 * @return the usuarioCuota
	 */
	public Usuario getUsuarioCuota() {
		return usuarioCuota;
	}

	/**
	 * @param usuarioCuota the usuarioCuota to set
	 */
	public void setUsuarioCuota(Usuario usuarioCuota) {
		this.usuarioCuota = usuarioCuota;
	}

	@Override
	/**
	 * Método toString, se encarga de mostrar los atributos en forma de cadena, cuando es invocado.
	 */
	public String toString() {
		return "Cuota [idCuota=" + idCuota + ", fechaPagoCuota=" + fechaPagoCuota + ", periodoCuota=" + periodoCuota
				+ ", montoCuota=" + montoCuota + ", estadoCuota=" + estadoCuota + ", usuarioCuota=" + usuarioCuota
				+ "]";
	}
	
	
}
