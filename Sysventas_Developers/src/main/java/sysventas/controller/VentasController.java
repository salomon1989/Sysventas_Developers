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
import sysventas.entity.Ventas;
import sysventas.service.VentasService;

@RestController
@RequestMapping("/ventas")
public class VentasController {
	@Autowired
	private VentasService ventaservice;
	@GetMapping("/ventas")
	public List<Map<String, Object>> listar(){
		return ventaservice.readAll();
	}
	@GetMapping("/{id}")
	public Ventas read(@PathVariable int id) {
		return ventaservice.read(id);
	}
	@DeleteMapping("/delete{id}")
	public int delete(@PathVariable int id) {
		return ventaservice.delete(id);
	}
	@PostMapping("/venta")
	public int create(@RequestBody Ventas ventas) {
		return ventaservice.create(ventas);
	}
	@PutMapping("edit/{id}")
	public int update(@RequestBody Ventas ventas, @PathVariable int id) {
		Ventas v = ventaservice.read(id);
		v.setFecha(ventas.getFecha());
		return ventaservice.update(ventas);
	}
}
