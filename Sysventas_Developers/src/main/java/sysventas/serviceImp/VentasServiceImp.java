package sysventas.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import sysventas.dao.Ventasdao;
import sysventas.entity.Ventas;
import sysventas.service.VentasService;

public class VentasServiceImp implements VentasService{
    @Autowired
    private Ventasdao ventasdao;
	@Override
	public int create(Ventas v) {
		// TODO Auto-generated method stub
		return ventasdao.create(v);
	}

	@Override
	public int update(Ventas v) {
		// TODO Auto-generated method stub
		return ventasdao.update(v);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return ventasdao.delete(id);
	}

	@Override
	public Ventas read(int id) {
		// TODO Auto-generated method stub
		return ventasdao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return ventasdao.readAll();
	}

}
