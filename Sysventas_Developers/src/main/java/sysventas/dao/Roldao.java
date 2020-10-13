package sysventas.dao;

import java.util.List;
import java.util.Map;
import sysventas.entity.Rol;
public interface Roldao {
  int create (Rol r);
  int update (Rol r);
  int delete (int id);
  Rol read (int id);
  List<Map<String,Object>> readAll();
}
