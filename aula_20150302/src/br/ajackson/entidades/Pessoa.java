/**
 * 
 */
package br.ajackson.entidades;

/**
 * @author alysson
 *
 */
public abstract class Pessoa {

	private Long id;
	private String nome;
	private String CPF;
	
	public Pessoa(Long id, String nome, String cPF) {
		super();
		this.id = id;
		this.nome = nome;
		CPF = cPF;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
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
	
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", CPF=" + CPF + "]";
	}
	
	
}
