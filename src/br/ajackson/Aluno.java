/**
 * 
 */
package br.ajackson;

import java.util.Date;

/**
 * @author Alysson Ajackson
 * @date 2015-02-24
 *
 */
public class Aluno {

	private Long matricula;
	private String nome;
	private String cpf;
	private Date dataAniversario;

	public Aluno(Long matricula, String nome, String cpf, Date dataAniversario) {
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
		this.dataAniversario = dataAniversario;
	}

	public Aluno(Long matricula, String nome, String cpf) {
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
	}

	public Aluno(Long matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(Date dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", cpf="
				+ cpf + ", dataAniversario=" + dataAniversario + "]";
	}

}
