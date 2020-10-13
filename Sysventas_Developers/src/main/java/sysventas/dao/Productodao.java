package sysventas.dao;

import java.util.List;
import java.util.Map;
import sysventas.entity.Producto;

public interface Productodao {
   int create (Producto p);
   int update (Producto p);
   int delete (int id);
   Producto read (int id);
   List<Map<String,Object>> readAll();
}
