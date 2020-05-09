package br.com.vizi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity @Table(name = "endereco")
@Getter @Setter 
public class Endereco implements Serializable {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_endereco")
	private Long idEndereco;
	
	@Column(name = "logradouro")
	private String logradouro;
	
	@Column(name = "numero")
	private String numero;
	
	@Column(name = "complemento")
	private String complemento;
	
	@Column(name = "bairro")
	private String bairro;
	
	@Column(name = "cidade")
	private String cidade;
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "uf")
	private String uf;
	
	@Column(name = "cep")
	private String cep;
}
