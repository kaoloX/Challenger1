package br.com.fiap.b2w.model;

import br.com.fiap.b2w.enumeration.ArquivoTreinamentoEnum;

public class Arquivo {
	private int Arquivo;
	private String nome;
	private String base64;
	private String tamanho;
	private ArquivoTreinamentoEnum tipo;
	
	public Arquivo(String nome, String base64, String tamanho, ArquivoTreinamentoEnum tipo) {
		this.nome = nome;
		this.base64 = base64;
		this.tamanho = tamanho;
		this.tipo = tipo;
	}
	
	public Arquivo() {}
	
	
	public int getArquivo() {
		return Arquivo;
	}

	public void setArquivo(int arquivo) {
		Arquivo = arquivo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBase64() {
		return base64;
	}

	public void setBase64(String base64) {
		this.base64 = base64;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public ArquivoTreinamentoEnum getTipo() {
		return tipo;
	}

	public void setTipo(ArquivoTreinamentoEnum tipo) {
		this.tipo = tipo;
	}
	
	// Métodos
	
	public Arquivo adicionarArquivo(Arquivo arquivo) {
		// TODO:
		return arquivo;
	}
	
	public void excluirArquivo(int idTreinamento, int idArquivo) {
		// TODO:
	}
	
}
