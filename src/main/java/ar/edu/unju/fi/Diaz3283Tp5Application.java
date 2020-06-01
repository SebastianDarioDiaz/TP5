package ar.edu.unju.fi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.IUsuarioService;

@SpringBootApplication
public class Diaz3283Tp5Application implements CommandLineRunner {
	
	@Autowired
	IUsuarioService usuarioService;
	@Autowired
	Usuario usuario;

	public static void main(String[] args) {
		SpringApplication.run(Diaz3283Tp5Application.class, args);
	}
	
	@Override
	public void run(String...args) throws Exception {
		
		usuario.setApellidoUsuario("Diaz");
		usuario.setDireccionUsuario("Siempre Viva 1234");
		usuario.setDniUsuario(36851012);
		usuario.setFechaAltaUsuario(LocalDate.now());
		usuario.setFechaNacimientoUsuario(LocalDate.of(1992, 04, 26));
		usuario.setIdUsuario(1);
		usuario.setNombreUsuario("Sebastian Dario");
		usuario.setPassword("Password");
		usuario.setTipoUsuario("SOCIO");
		
		usuarioService.Guardar();
		usuarioService.mostrar();
	}

}
