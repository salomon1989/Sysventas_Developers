package sysventas.daoImp;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import sysventas.dao.Usuariodao;
import sysventas.entity.Usuario;
@Repository
public class UsuariodaoImp implements Usuariodao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Usuario u) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("insert into usuario(nomuser)values(?)", u.getNom_user());
	}

	@Override
	public int update(Usuario u) {
		// TODO Auto-generated method stub
		String SQL ="update usuario set nomuser=? where idusuario=?";
		return jdbcTemplate.update(SQL, u.getNom_user(), u.getIdusuario());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete usuario where idusuario=?";
		return jdbcTemplate.update(SQL, id);
	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		String SQL ="select *from usuario where idusuario=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {id}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL ="select *from usuario";
		return jdbcTemplate.queryForList(SQL);
	}

}
