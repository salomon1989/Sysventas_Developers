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
import sysventas.dao.DetalleVentadao;
import sysventas.service.DetalleVentaservice;
@RestController
@RequestMapping("/detalles")
public class DetalleVentaController {
	@Autowired
	private DetalleVentaservice detalleservice;
	@GetMapping("/detalles")
	public List<Map<String, Object>> listar(){
		return detalleservice.readAll();
	}
	@GetMapping("/{id}")
	public DetalleVentadao read(@PathVariable int id) {
		return detalleservice.read(id);
	}
	@DeleteMapping("/delete{id}")
	public int delete(@PathVariable int id) {
		return detalleservice.delete(id);
	}
	@PostMapping("/detalles")
	public int create(@RequestBody DetalleVentadao detalle) {
		return detalleservice.create(detalle);
	}
	@PutMapping("edit/{id}")
	public int update(@RequestBody DetalleVentadao detalle, @PathVariable int id) {
		DetalleVentadao dv = detalleservice.read(id);
		//dv.setCantidad(detalle);
		return detalleservice.update(dv);
	}
}
