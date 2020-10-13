package sysventas.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import sysventas.dao.Productodao;
import sysventas.entity.Producto;
import sysventas.service.ProductoService;

public class ProductoServiceImp implements ProductoService{
	@Autowired
	private Productodao productodao;
	@Override
	public int create(Producto p) {
		// TODO Auto-generated method stub
		return productodao.create(p);
	}

	@Override
	public int update(Producto p) {
		// TODO Auto-generated method stub
		return productodao.update(p);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return productodao.delete(id);
	}

	@Override
	public Producto read(int id) {
		// TODO Auto-generated method stub
		return productodao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return productodao.readAll();
	}

}
