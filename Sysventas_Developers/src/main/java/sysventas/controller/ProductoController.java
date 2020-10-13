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
import sysventas.entity.Producto;
import sysventas.service.ProductoService;
@RestController
@RequestMapping("/productos")
public class ProductoController {
	@Autowired
	private ProductoService productoservice;
	@GetMapping("/roles")
	public List<Map<String, Object>> listar(){
		return productoservice.readAll();
	}
	@GetMapping("/{id}")
	public Producto read(@PathVariable int id) {
		return productoservice.read(id);
	}
	@DeleteMapping("/delete{id}")
	public int delete(@PathVariable int id) {
		return productoservice.delete(id);
	}
	@PostMapping("/rol")
	public int create(@RequestBody Producto producto) {
		return productoservice.create(producto);
	}
	@PutMapping("edit/{id}")
	public int update(@RequestBody Producto producto, @PathVariable int id) {
		Producto p = productoservice.read(id);
		p.setNom_prod(producto.getNom_prod());;
		return productoservice.update(producto);
	}
}
