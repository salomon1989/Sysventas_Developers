package sysventas.service;

import java.util.List;
import java.util.Map;

import sysventas.entity.Ventas;

public interface VentasService {
	   int create (Ventas v);
	   int update (Ventas v);
	   int delete (int id);
	   Ventas read (int id);
	   List<Map<String,Object>> readAll();
}
