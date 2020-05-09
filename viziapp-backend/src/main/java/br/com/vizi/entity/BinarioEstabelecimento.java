package br.com.vizi.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity 
@Table(name = "binario_estabelecimento") 
@Getter @Setter
public class BinarioEstabelecimento {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;	
	private String nome;
	private String contentType;		
	private LocalDateTime dataCadastro;
	@Column(name="bytes", columnDefinition = "LONGBLOB")
	private byte[] bytes;	
	
	//@Column(name = "id_estabelecimento", insertable =false, updatable =false)
	//private Long idEstabelecimento;

	@OneToOne
	@JoinColumn(name = "id_estabelecimento")
	private Estabelecimento estabelecimento;
	
	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}
	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
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
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public byte[] getBytes() {
		return bytes;
	}
	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}
	
}
