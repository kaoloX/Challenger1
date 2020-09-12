package br.com.fiap.b2w.model;

import java.util.List;

public class Faq {
	private List<Pergunta> perguntas;

	public Faq(List<Pergunta> perguntas) {
		this.perguntas = perguntas;
	}
	
	public Faq() {}
	
	public List<Pergunta> getPerguntas() {
		return perguntas;
	}

	public void setPerguntas(List<Pergunta> perguntas) {
		this.perguntas = perguntas;
	}
	
}
 