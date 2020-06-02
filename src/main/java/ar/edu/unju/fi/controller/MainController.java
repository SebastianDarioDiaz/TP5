/**
 * 
 */
package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.service.IUsuarioService;


/**
 * @author Diaz, Sebastián Darío - L.U.:3283
 * 
 */
@Controller
@RequestMapping("/")

public class MainController {

	@Autowired
	//Inyección de dependencia hacia el servicio IUsuarioService.
	private IUsuarioService usuarioService;
	
	@GetMapping("index")
	public String main(Model model) {
		// TODO Auto-generated method stub
		model.addAttribute("usuarioNombre", usuarioService.mostrar().getNombreUsuario());
		model.addAttribute("usuarioApellido", usuarioService.mostrar().getApellidoUsuario());
		return "index";

	}

}
