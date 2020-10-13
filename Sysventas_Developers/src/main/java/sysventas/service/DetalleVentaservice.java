package sysventas.service;

import java.util.List;
import java.util.Map;

import sysventas.dao.DetalleVentadao;

public interface DetalleVentaservice {
	    int create (DetalleVentadao dv);
	    int update (DetalleVentadao dv);
	    int delete (int id);
	    DetalleVentadao read (int id);
	    List<Map<String,Object>> readAll();
}
