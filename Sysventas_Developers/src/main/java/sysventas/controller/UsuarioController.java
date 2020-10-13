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
import sysventas.entity.Usuario;
import sysventas.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioservice;
	@GetMapping("/roles")
	public List<Map<String, Object>> listar(){
		return usuarioservice.readAll();
	}
	@GetMapping("/{id}")
	public Usuario read(@PathVariable int id) {
		return usuarioservice.read(id);
	}
	@DeleteMapping("/delete{id}")
	public int delete(@PathVariable int id) {
		return usuarioservice.delete(id);
	}
	@PostMapping("/rol")
	public int create(@RequestBody Usuario usuario) {
		return usuarioservice.create(usuario);
	}
	@PutMapping("edit/{id}")
	public int update(@RequestBody Usuario usuario, @PathVariable int id) {
		Usuario u = usuarioservice.read(id);
		u.setNom_user(usuario.getNom_user());
		return usuarioservice.update(usuario);
	}
}
