package sysventas.dao;

import java.util.List;
import java.util.Map;

public interface DetalleVentadao {
    int create (DetalleVentadao dv);
    int update (DetalleVentadao dv);
    int delete (int id);
    DetalleVentadao read (int id);
    List<Map<String,Object>> readAll();
}
