package sysventas.service;

import java.util.List;
import java.util.Map;

import sysventas.entity.Usuario;

public interface UsuarioService {
	   int create (Usuario u);
	   int update (Usuario u);
	   int delete (int id);
	   Usuario read (int id);
	   List<Map<String,Object>> readAll();
}
