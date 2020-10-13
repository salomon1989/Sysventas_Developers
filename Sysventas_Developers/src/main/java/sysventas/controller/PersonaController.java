package sysventas.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sysventas.entity.Persona;
import sysventas.service.PersonaService;


@RestController
@RequestMapping("/personas")
public class PersonaController {
	@Autowired
	private PersonaService personaservice;
	@GetMapping("/personas")
	public List<Map<String, Object>> listar(){
		return personaservice.readAll();
	}
	@GetMapping("/{id}")
	public Persona read(@PathVariable int id) {
		return personaservice.read(id);
	}
	@DeleteMapping("/delete{id}")
	public int delete(@PathVariable int id) {
		return personaservice.delete(id);
	}
	@PostMapping("/rol")
	public int create(@RequestBody Persona persona) {
		return personaservice.create(persona);
	}
	@PutMapping("edit/{id}")
	public int update(@RequestBody Persona persona, @PathVariable int id) {
		Persona p = personaservice.read(id);
	    p.setNombres(persona.getNombres());
		return personaservice.update(persona);
	}
}
