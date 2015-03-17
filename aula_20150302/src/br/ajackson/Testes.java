package br.ajackson;

import org.junit.Assert;
import org.junit.Test;

import br.ajackson.entidades.Aluno;
import br.ajackson.persistencia.AlunoDAO;

public class Testes {
	
	@Test
	public void testeBuscarAluno(){
		AlunoDAO dao = new AlunoDAO();
		Aluno a = dao.find(1L);
		Assert.assertEquals(a.getCPF(), "746.617.375");
	}
	
}
