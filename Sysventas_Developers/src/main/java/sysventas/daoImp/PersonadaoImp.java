package sysventas.daoImp;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import sysventas.dao.Personadao;
import sysventas.entity.Persona;

@Repository
public class PersonadaoImp implements Personadao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Persona per) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("insert into producto(nombres)values(?)", per.getNombres());
	}

	@Override
	public int update(Persona per) {
		// TODO Auto-generated method stub
		String SQL ="update persona set nombres=? where idpersona=?";
		return jdbcTemplate.update(SQL, per.getNombres(), per.getIdpersona());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete persona where idpersona=?";
		return jdbcTemplate.update(SQL, id);
	}

	@Override
	public Persona read(int id) {
		// TODO Auto-generated method stub
		String SQL ="select *from persona where idpersona=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {id}, new BeanPropertyRowMapper<Persona>(Persona.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL ="select *from persona";
		return jdbcTemplate.queryForList(SQL);
	}

}
