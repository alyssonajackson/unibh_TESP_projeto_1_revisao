package br.ajackson.persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import br.ajackson.entidades.Professor;

public class ProfessorDAO implements DAO<Professor, Long> {

	@Override
	public Professor find(Long id) {
		try {
			PreparedStatement ps = JDBCUtil.getConnection().prepareStatement(
					"SELECT * FROM TB_PROFESSOR WHERE ID = ?");
			ps.setLong(1, id);

			ResultSet row = ps.executeQuery();

			if (row.next()) {
				return new Professor(row.getLong("ID"), row.getString("NOME"),
						row.getString("CPF"), row.getBigDecimal("SALARIO"));
			}

		} catch (Exception e) {

		}

		return null;
	}

	public Professor findByCPF(String cpf) {
		try {
			PreparedStatement ps = JDBCUtil.getConnection().prepareStatement(
					"SELECT * FROM TB_PROFESSOR WHERE CPF = ?");
			ps.setString(1, cpf);

			System.out.println(ps.toString());
			
			ResultSet row = ps.executeQuery();

			if (row.next()) {
				return new Professor(row.getLong("ID"), row.getString("NOME"),
						row.getString("CPF"), row.getBigDecimal("SALARIO"));
			}

		} catch (Exception e) {

		}

		return null;
	}

	@Override
	public void insert(Professor t) {
		try {
			PreparedStatement ps = JDBCUtil
					.getConnection()
					.prepareStatement(
							"INSERT INTO TB_PROFESSOR (NOME, CPF, SALARIO) VALUES(?, ?, ?);");
			ps.setString(1, t.getNome());
			ps.setString(2, t.getCPF());
			ps.setBigDecimal(3, t.getSalario());

			ps.executeUpdate();

			JDBCUtil.closeConnection();

		} catch (Exception e) {
			// TODO: handle exception
		}
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
