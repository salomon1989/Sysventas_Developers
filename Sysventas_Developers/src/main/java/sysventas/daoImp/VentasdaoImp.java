package sysventas.daoImp;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import sysventas.dao.Ventasdao;
import sysventas.entity.Ventas;
@Repository
public class VentasdaoImp implements Ventasdao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Ventas v) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("insert into ventas(fecha)values(?)", v.getFecha());
	}

	@Override
	public int update(Ventas v) {
		// TODO Auto-generated method stub
		String SQL ="update ventas set fecha=? where idventas=?";
		return jdbcTemplate.update(SQL, v.getFecha(), v.getIdventas());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete ventas where idventas=?";
		return jdbcTemplate.update(SQL, id);
	}

	@Override
	public Ventas read(int id) {
		// TODO Auto-generated method stub
		String SQL ="select *from ventas where idventas=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {id}, new BeanPropertyRowMapper<Ventas>(Ventas.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL ="select *from ventas";
		return jdbcTemplate.queryForList(SQL);
	}

}
