package ar.edu.unju.fi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.model.Cuota;
import ar.edu.unju.fi.model.Equipo;
import ar.edu.unju.fi.model.Estadio;
import ar.edu.unju.fi.model.Noticia;
import ar.edu.unju.fi.model.Resultado;
import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.ICuotaService;
import ar.edu.unju.fi.service.IEquipoService;
import ar.edu.unju.fi.service.IEstadioService;
import ar.edu.unju.fi.service.INoticiaService;
import ar.edu.unju.fi.service.IResultadoService;
import ar.edu.unju.fi.service.IUsuarioService;

@SpringBootApplication
public class Diaz3283Tp5Application implements CommandLineRunner {

	@Autowired
	//Inyección de dependencia hacia el servicio IUsuarioService.
	IUsuarioService usuarioService;
	@Autowired
	//Inyección de dependencia hacia la clase Usuario.
	Usuario usuario;

	@Autowired
	ICuotaService cuotaService;
	@Autowired
	Cuota cuota;

	@Autowired
	IEquipoService equipoService;
	@Autowired
	Equipo equipo;

	@Autowired
	IEstadioService estadioService;
	@Autowired
	Estadio estadio;

	@Autowired
	INoticiaService noticiaService;
	@Autowired
	Noticia noticia;

	@Autowired
	IResultadoService resultadoService;
	@Autowired
	Resultado resultado;

	public static void main(String[] args) {
		SpringApplication.run(Diaz3283Tp5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Inicio de la sección en donde se asigan valores a las variables de la Clase
		// Usuario por medio del método Setter de cada atributo.
		usuario.setApellidoUsuario("Diaz");
		usuario.setDireccionUsuario("Siempre Viva 1234");
		usuario.setDniUsuario(36851012);
		usuario.setFechaAltaUsuario(LocalDate.now());
		usuario.setFechaNacimientoUsuario(LocalDate.of(1992, 04, 26));
		usuario.setIdUsuario(1);
		usuario.setNombreUsuario("Sebastian Dario");
		usuario.setPassword("Password");
		usuario.setTipoUsuario("SOCIO");
		// Fin de la sección en donde se asigan valores a las variables de la Clase
		// Usuario por medio del método Setter de cada atributo.

		// Invocación del método Guardar, el cuál se encarga de registar los valores
		// asignados al objeto.
		usuarioService.Guardar();

		
		/*
		// Inicio de la sección en donde se asigan valores a las variables de la Clase
		// Cuota por medio del método Setter de cada atributo.
		cuota.setEstadoCuota("PAGADO");
		cuota.setFechaPagoCuota(LocalDate.now());
		cuota.setIdCuota(001);
		cuota.setMontoCuota(24.50);
		cuota.setPeriodoCuota("PERIODO1");
		cuota.setUsuarioCuota(usuario);
		// Fin de la sección en donde se asigan valores a las variables de la Clase
		// Cuota por medio del método Setter de cada atributo.

		// Invocación del método Guardar, el cuál se encarga de registar los valores
		// asignados al objeto.
		cuotaService.Guardar();

		// Inicio de la sección en donde se asigan valores a las variables de la Clase
		// Cuota por medio del método Setter de cada atributo.
		cuota.setEstadoCuota("PAGADO");
		cuota.setFechaPagoCuota(LocalDate.now());
		cuota.setIdCuota(001);
		cuota.setMontoCuota(24.50);
		cuota.setPeriodoCuota("PERIODO1");
		cuota.setUsuarioCuota(usuario);
		// Fin de la sección en donde se asigan valores a las variables de la Clase
		// Cuota por medio del método Setter de cada atributo.

		// Invocación del método Guardar, el cuál se encarga de registar los valores
		// asignados al objeto.
		cuotaService.Guardar();

		// Inicio de la sección en donde se asigan valores a las variables de la Clase
		// Equipo por medio del método Setter de cada atributo.
		equipo.setEstadio(estadio);
		equipo.setNombre("ESTADIO1");
		// Fin de la sección en donde se asigan valores a las variables de la Clase
		// Equipo por medio del método Setter de cada atributo.

		// Invocación del método Guardar, el cuál se encarga de registar los valores
		// asignados al objeto.
		equipoService.Guardar();

		// Inicio de la sección en donde se asigan valores a las variables de la Clase
		// Estadio por medio del método Setter de cada atributo.
		estadio.setCapacidad(15000);
		estadio.setCiudad("S. S. De Jujuy");
		estadio.setDireccion("DIRECION1");
		estadio.setFechaFundacion(LocalDate.now());
		estadio.setNombre("ESTADIO1");
		// Fin de la sección en donde se asigan valores a las variables de la Clase
		// Estadio por medio del método Setter de cada atributo.

		// Invocación del método Guardar, el cuál se encarga de registar los valores
		// asignados al objeto.
		estadioService.Guardar();

		// Inicio de la sección en donde se asigan valores a las variables de la Clase
		// Noticia por medio del método Setter de cada atributo.
		noticia.setFechaNoticia(LocalDate.now());
		noticia.setResumenNoticia("RESUMEN1");
		noticia.setTituloNoticia("TITULO1");
		// Fin de la sección en donde se asigan valores a las variables de la Clase
		// Noticia por medio del método Setter de cada atributo.

		// Invocación del método Guardar, el cuál se encarga de registar los valores
		// asignados al objeto.
		noticiaService.Guardar();

		// Inicio de la sección en donde se asigan valores a las variables de la Clase
		// Resultado por medio del método Setter de cada atributo.
		resultado.setEquipo1(equipo);
		resultado.setEquipo2(equipo);
		resultado.setFechaResultado(LocalDate.now());
		resultado.setGolesEquipo1(1);
		resultado.setGolesEquipo2(2);
		// Fin de la sección en donde se asigan valores a las variables de la Clase
		// Resultado por medio del método Setter de cada atributo.

		// Invocación del método Guardar, el cuál se encarga de registar los valores
		// asignados al objeto.
		resultadoService.Guardar();
		*/
	}

}
