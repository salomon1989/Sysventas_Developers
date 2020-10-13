package sysventas.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import sysventas.dao.Personadao;
import sysventas.entity.Persona;
import sysventas.service.PersonaService;

public class PersonaServiceImp implements PersonaService{
    @Autowired
    private Personadao personadao;
	@Override
	public int create(Persona per) {
		// TODO Auto-generated method stub
		return personadao.create(per);
	}

	@Override
	public int update(Persona per) {
		// TODO Auto-generated method stub
		return personadao.update(per);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return personadao.delete(id);
	}

	@Override
	public Persona read(int id) {
		// TODO Auto-generated method stub
		return personadao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return personadao.readAll();
	}
     
}
