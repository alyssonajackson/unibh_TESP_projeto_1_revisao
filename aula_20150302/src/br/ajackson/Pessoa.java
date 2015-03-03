/**
 * 
 */
package br.ajackson;

/**
 * @author alysson
 *
 */
public abstract class Pessoa {

	private String nome;
	private String CPF;

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", CPF=" + CPF + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public Pessoa(String nome, String cPF) {
		super();
		this.nome = nome;
		CPF = cPF;
	}

}
