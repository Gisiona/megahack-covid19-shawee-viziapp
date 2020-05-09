package br.com.vizi.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.vizi.dto.request.VizerRequestDto;
import lombok.Getter;
import lombok.Setter;

@Entity @Table(name = "vizer") 
@Getter @Setter
public class Vizer {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;	
	
	private String nomeVizer;
	private String apelido;
	private String email;
	private String cpf;
	private String telefoneWhatsapp;
	private String cep;
	private String enderecoCompleto;
	private LocalDate dataNascimento;
	private LocalDate dataCadastro;
	private boolean isAtivo;
	private String senha;
	
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeVizer() {
		return nomeVizer;
	}
	public void setNomeVizer(String nomeVizer) {
		this.nomeVizer = nomeVizer;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefoneWhatsapp() {
		return telefoneWhatsapp;
	}
	public void setTelefoneWhatsapp(String telefoneWhatsapp) {
		this.telefoneWhatsapp = telefoneWhatsapp;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEnderecoCompleto() {
		return enderecoCompleto;
	}
	public void setEnderecoCompleto(String enderecoCompleto) {
		this.enderecoCompleto = enderecoCompleto;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public boolean getIsAtivo() {
		return isAtivo;
	}
	public void setAtivo(boolean isAtivo) {
		this.isAtivo = isAtivo;
	}
	
	public Vizer() {}
	
		
	public Vizer(VizerRequestDto dto) {
		this.nomeVizer = dto.getNomeVizer();
		this.apelido = dto.getApelido();
		this.email = dto.getEmail();
		this.cpf = dto.getCpf();
		this.telefoneWhatsapp = dto.getTelefoneWhatsapp();
		this.cep = dto.getCep();
		this.enderecoCompleto = dto.getEnderecoCompleto();
		this.dataNascimento = dto.getDataNascimento();
		this.dataCadastro = LocalDate.now();
		this.isAtivo = true;
		this.senha = dto.getSenha();
	}
		
}
