package br.ajackson;

import java.math.BigDecimal;

public class Professor {

	private String nome;
	private String cpf;
	private BigDecimal salario;
	
	public Professor(String nome, String cpf, BigDecimal salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	public Professor(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
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
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", cpf=" + cpf + ", salario="
				+ salario + "]";
	}
	
}
