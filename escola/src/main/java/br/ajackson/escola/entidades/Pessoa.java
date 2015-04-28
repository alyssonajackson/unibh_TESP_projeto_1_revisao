/**
 * 
 */
package br.ajackson.escola.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author alysson
 *
 */

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="TB_PESSOA")
public abstract class Pessoa {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID", nullable=false)
	private Long id;

//	@NotBlank
	@Pattern(regexp = "^[A-Za-zÀ-ú ]{5,100}$", message="favor fornecer apenas letras e espacos")
	@Column(name="NOME", length=100, columnDefinition="VARCHAR(100)")
	private String nome;
	
	@Column(name="CPF", unique=true, columnDefinition="CHAR(14)", length=14, nullable=false)
//	@NotBlank
//	@Size(min=14, max=14)
	@Pattern(regexp = "^\\d{3}.\\d{3}.\\d{3}-\\d{2}$", message="CPF invalido")
	private String CPF;
	
	public Pessoa(){
		
	}
	
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
