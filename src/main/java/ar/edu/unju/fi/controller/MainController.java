/**
 * 
 */
package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.service.IUsuarioService;


/**
 * @author Diaz, Sebastián Darío - L.U.:3283
 *
 */
@Controller
public class MainController {

	@Autowired
	private IUsuarioService usuarioService;
	
	@RequestMapping("http://localhost:8080/home")
	public String main(Model model) {
		// TODO Auto-generated method stub
		model.addAttribute("usuario", usuarioService.mostrar().getDniUsuario());
		return "index";

	}

}
