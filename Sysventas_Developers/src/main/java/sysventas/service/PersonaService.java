package sysventas.service;

import java.util.List;
import java.util.Map;

import sysventas.entity.Persona;

public interface PersonaService {
	    int create (Persona per);
	    int update (Persona per);
	    int delete (int id);
	    Persona read (int id);
	    List<Map<String,Object>> readAll();
}
