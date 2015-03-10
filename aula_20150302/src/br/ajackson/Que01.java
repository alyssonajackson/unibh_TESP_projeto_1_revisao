package br.ajackson;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import br.ajackson.entidades.Aluno;
import br.ajackson.entidades.Professor;
import br.ajackson.persistencia.JDBCUtil;

/**
 * @author: Alysson Ajackson
 * @date: 2015-02-24 Esse algoritmo imprime 10 vezes o texto "Alô mundo" na
 *        saída padrão
 */

public class Que01 {

	public static void main(String[] args) {

		Aluno a1 = new Aluno(1L, 1234L, "João", "9191919191", new Date());
		Aluno a2 = new Aluno(2L, 5678L, "Maria", "12812128128");
		Aluno a3 = new Aluno(3L, 5678L, "Maria");

		Professor p1 = new Professor(4L, "Pollyanna", "1212121", new BigDecimal(
				"999999999"));

		System.out.println("BÔNUS ===== " + Professor.BONUS);
		System.out.println(Aluno.verificaMatricula(("1212121212")));
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(p1);
		
		try {
			ResultSet rs = JDBCUtil.getConnection().prepareStatement("SELECT * FROM TB_ALUNO;").executeQuery();
			while(rs.next()){
				System.out.println(rs.getLong("ID") + "\t" + rs.getString("NOME"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 

		// for(int i = 0; i < 10; i++)
		// System.out.println("Alô mundo");
	}

}
