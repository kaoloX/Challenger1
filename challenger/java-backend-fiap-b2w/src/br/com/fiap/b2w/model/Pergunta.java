package br.com.fiap.b2w.model;

public class Pergunta {
	private String conteudoPergunta;
	private long idPergunta;
	private String resposta;

	public Pergunta(String conteudoPergunta, long idPergunta, String resposta) {
		this.conteudoPergunta = conteudoPergunta;
		this.idPergunta = idPergunta;
		this.resposta = resposta;
	}
	
	public Pergunta() {}

	public String getConteudoPergunta() {
		return conteudoPergunta;
	}

	public void setConteudoPergunta(String conteudoPergunta) {
		this.conteudoPergunta = conteudoPergunta;
	}

	public long getIdPergunta() {
		return idPergunta;
	}

	public void setIdPergunta(long idPergunta) {
		this.idPergunta = idPergunta;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
}
