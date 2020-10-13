package sysventas.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import sysventas.dao.Productodao;
import sysventas.entity.Producto;

@Repository
public class ProductodaoImp implements Productodao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Producto p) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("insert into producto(nom_prod)values(?)", p.getNom_prod());
	}

	@Override
	public int update(Producto p) {
		// TODO Auto-generated method stub
		String SQL ="update producto set nom_prod=? where idproducto=?";
		return jdbcTemplate.update(SQL, p.getNom_prod(), p.getIdproducto());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete producto where idproducto=?";
		return jdbcTemplate.update(SQL, id);
	}

	@Override
	public Producto read(int id) {
		// TODO Auto-generated method stub
		String SQL ="select *from rol where idproducto=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {id}, new BeanPropertyRowMapper<Producto>(Producto.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL ="select *from producto";
		return jdbcTemplate.queryForList(SQL);
	}

}
