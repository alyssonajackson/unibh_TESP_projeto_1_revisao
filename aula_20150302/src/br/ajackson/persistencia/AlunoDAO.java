package br.ajackson.persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.List;

import br.ajackson.entidades.Aluno;

public class AlunoDAO implements DAO<Aluno, Long> {
	
	private SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

	@Override
	public Aluno find(Long id) {
		try {
			PreparedStatement ps = JDBCUtil.getConnection().prepareStatement(
					"SELECT * FROM TB_ALUNO WHERE ID = ?");
			ps.setLong(1, id);
			ResultSet row = ps.executeQuery();

			if (row.next()) {
				return new Aluno(row.getLong("ID"), row.getLong("MATRICULA"), row.getString("NOME"), row.getString("CPF"), row.getString("DATA_ANIVERSARIO") == null ? null : df.parse(row.getString("DATA_ANIVERSARIO"))); 
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean insert(Aluno t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update(Aluno t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Aluno t) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Aluno> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
