package sysventas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
@RequestMapping("/Hola")
public String mensaje() {
	return"Bienvenidos a Microservicios Sincronos";
}

}
