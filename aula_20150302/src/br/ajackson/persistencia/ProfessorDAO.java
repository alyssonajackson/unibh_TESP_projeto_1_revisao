package br.ajackson.persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import br.ajackson.entidades.Professor;

public class ProfessorDAO implements DAO<Professor, Long> {

	@Override
	public Professor find(Long id) {
		try{
			PreparedStatement ps = JDBCUtil.getConnection().prepareStatement("SELECT * FROM TB_PROFESSOR WHERE ID = ?");
			ps.setLong(1, id);
			
			ResultSet row = ps.executeQuery();
			
			if(row.next()){
				return new Professor(row.getLong("ID"), row.getString("NOME"), row.getString("CPF"), row.getBigDecimal("SALARIO"));
			}
			
		}catch(Exception e){
			
		}
		
		return null;
	}

	@Override
	public boolean insert(Professor t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update(Professor t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Professor t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Professor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
