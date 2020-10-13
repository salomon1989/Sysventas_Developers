package sysventas.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import sysventas.dao.Roldao;
import sysventas.entity.Rol;
import sysventas.service.RolService;

public class RolServiceImp implements RolService{
    @Autowired
    private Roldao roldao;
	@Override
	public int create(Rol r) {
		// TODO Auto-generated method stub
		return roldao.create(r);
	}

	@Override
	public int update(Rol r) {
		// TODO Auto-generated method stub
		return roldao.update(r);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return roldao.delete(id);
	}

	@Override
	public Rol read(int id) {
		// TODO Auto-generated method stub
		return roldao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return roldao.readAll();
	}

}
