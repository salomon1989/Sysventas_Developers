package sysventas.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import sysventas.dao.Usuariodao;
import sysventas.entity.Usuario;
import sysventas.service.UsuarioService;

public class UsuarioServiceImp implements UsuarioService{
    @Autowired
    private Usuariodao usuariodao;
	@Override
	public int create(Usuario u) {
		// TODO Auto-generated method stub
		return usuariodao.create(u);
	}

	@Override
	public int update(Usuario u) {
		// TODO Auto-generated method stub
		return usuariodao.update(u);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return usuariodao.delete(id);
	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		return usuariodao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return usuariodao.readAll();
	}

}
