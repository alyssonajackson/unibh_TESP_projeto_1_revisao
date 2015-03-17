package br.ajackson;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Date;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.ajackson.entidades.Aluno;
import br.ajackson.entidades.Professor;
import br.ajackson.persistencia.AlunoDAO;
import br.ajackson.persistencia.JDBCTestes;
import br.ajackson.persistencia.JDBCUtil;
import br.ajackson.persistencia.ProfessorDAO;

public class Testes {

	@Test
	public void testeInsereAluno() {
		AlunoDAO alu = new AlunoDAO();
		Aluno a = new Aluno(1L, 8790L, "Carl", "7654231", new Date());
		alu.insert(a);

		Aluno row = alu.findByCPF(a.getCPF());
		Assert.assertEquals(row.getCPF(), a.getCPF());
	}

	@Test
	public void testeBuscarAluno() {
		AlunoDAO dao = new AlunoDAO();
		Aluno a = dao.findByCPF("9191919191");
		Assert.assertEquals(a.getNome(), "Ann");
	}

	@Test
	public void testeInsereProfessor() {
		ProfessorDAO prof = new ProfessorDAO();
		Professor p = new Professor(5L, "Kenny", "212121", new BigDecimal(
				"1000"));

		prof.insert(p);

		Professor row = prof.findByCPF(p.getCPF());
		Assert.assertEquals(row.getCPF(), p.getCPF());
	}

	@Test
	public void testeBuscarProfessor() {
		ProfessorDAO prof = new ProfessorDAO();
		Professor row = prof.find(1L);
		Assert.assertEquals(row.getNome(), "Girafales");
	}

	@Before
	public void preparaBanco() {
		AlunoDAO alu = new AlunoDAO();
		Aluno a1 = new Aluno(1L, 1234L, "Ann", "9191919191", new Date());
		Aluno a2 = new Aluno(2L, 4567L, "Betty", "8181818181", new Date());
		Aluno a3 = new Aluno(3L, 8910L, "Clair", "7171717171", new Date());

		alu.insert(a1);
		alu.insert(a2);
		alu.insert(a3);

		ProfessorDAO prof = new ProfessorDAO();
		Professor p1 = new Professor(1L, "Girafales", "1212121",
				new BigDecimal("6000"));
		Professor p2 = new Professor(2L, "Harold", "32323232", new BigDecimal(
				"5000"));
		Professor p3 = new Professor(2L, "John Doe", "54454545",
				new BigDecimal("2000"));

		prof.insert(p1);
		prof.insert(p2);
		prof.insert(p3);
	}

	@After
	public void limpaBanco() {
		JDBCTestes.limparBanco("TB_ALUNO");
		JDBCTestes.limparBanco("TB_PROFESSOR");
	}

	@Test
	public void testeAtualizaAluno() {
		AlunoDAO alu = new AlunoDAO();

		String cpf = "8181818181";
		Aluno a = alu.findByCPF(cpf);
		a.setNome("Betty Anne");

		alu.update(a);

		Aluno b = alu.findByCPF(cpf);
		Assert.assertEquals(b.getNome(), "Betty Anne");
	}

	@Test
	public void testeAtualizaProfessor() {
		ProfessorDAO prof = new ProfessorDAO();

		String cpf = "32323232";

		Professor p = prof.findByCPF(cpf);
		p.setNome("Harold Finch");

		prof.update(p);

		Professor p2 = prof.findByCPF(cpf);
		Assert.assertEquals(p2.getNome(), "Harold Finch");
	}

	@Test
	public void testeDeletaAluno() {
		AlunoDAO dao = new AlunoDAO();
		Aluno a = dao.find(1L);
		String cpf = a.getCPF();
		dao.delete(a);
		
		Aluno row = dao.findByCPF(cpf);
		Assert.assertNull(row);
	}

	@Test
	public void testeDeletaProfessor() {
		ProfessorDAO dao = new ProfessorDAO();
		Professor p = dao.find(1L);
		String cpf = p.getCPF();
		dao.delete(p);
		
		Professor row = dao.findByCPF(cpf);
		Assert.assertNull(row);
	}

}
