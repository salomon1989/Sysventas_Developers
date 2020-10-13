package sysventas.daoImp;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import sysventas.dao.Roldao;
import sysventas.entity.Rol;
@Repository
public class RoldaoImp implements Roldao{
@Autowired
private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Rol r) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("insert into rol(nomrol)values(?)", r.getNomrol());
	}

	@Override
	public int update(Rol r) {
		// TODO Auto-generated method stub
		String SQL ="update rol set nomrol=? where idrol=?";
		return jdbcTemplate.update(SQL, r.getNomrol(), r.getIdrol());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete rol where idrol=?";
		return jdbcTemplate.update(SQL, id);
	}

	@Override
	public Rol read(int id) {
		// TODO Auto-generated method stub
		String SQL ="select *from rol where idrol=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {id}, new BeanPropertyRowMapper<Rol>(Rol.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL ="select *from rol";
		return jdbcTemplate.queryForList(SQL);
	}

}
