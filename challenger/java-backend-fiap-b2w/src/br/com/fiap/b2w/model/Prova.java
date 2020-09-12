package br.com.fiap.b2w.model;

import java.util.List;

public class Prova extends Questionario{
	private int idProva;
	private double nota;
	private double media;
	
	public Prova() {}
	
	public Prova(int idProva, Usuario usuario, List<Questao> questoes) {
		super(idProva, usuario, questoes);
	}
	
	

	public int getIdProva() {
		return idProva;
	}

	public void setIdProva(int idProva) {
		this.idProva = idProva;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
	
}
