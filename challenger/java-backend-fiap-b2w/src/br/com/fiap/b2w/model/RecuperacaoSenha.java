package br.com.fiap.b2w.model;

import java.sql.Date;

public class RecuperacaoSenha {
	private String email;
	private Date dataNascimento;
	
	public RecuperacaoSenha(String email, Date dataNascimento) {
		this.email = email;
		this.dataNascimento = dataNascimento;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public void validarDadosRecuperacao(String email, Date dataNascimento) {
		// TODO: 
	}
	
	public void criarNovaSenha(String novaSenha) {
		// TODO: Criar uma lógica que criptografe a nova senha(?)
	}
	
	
}
