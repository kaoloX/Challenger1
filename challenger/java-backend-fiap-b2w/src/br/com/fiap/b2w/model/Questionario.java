package br.com.fiap.b2w.model;

import java.util.List;

public class Questionario {
	private int idQuestionario;
	private Usuario usuario;
	private List<Questao> questoes;
	private double totalAcertos;
	private double totalErros;
	private static double percentualAcertos;
	private static double percentualErros; 
	private static double totalDePontosQuestionario;
	
	
	public Questionario(int idQuestionario, Usuario usuario, List<Questao> questoes) {
		this.idQuestionario = idQuestionario;
		this.usuario = usuario;
		this.questoes = questoes;
	}

	public int getIdQuestionario() {
		return idQuestionario;
	}

	public void setIdQuestionario(int idQuestionario) {
		this.idQuestionario = idQuestionario;
	}

	public Questionario() {}
	
	

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Questao> getQuestoes() {
		return questoes;
	}

	public void setQuestoes(List<Questao> questoes) {
		this.questoes = questoes;
	}

	public double getTotalAcertos() {
		return totalAcertos;
	}

	public void setTotalAcertos(double totalAcertos) {
		this.totalAcertos = totalAcertos;
	}

	public double getTotalErros() {
		return totalErros;
	}

	public void setTotalErros(double totalErros) {
		this.totalErros = totalErros;
	}

	public double getPercentualAcertos() {
		double total = this.totalAcertos / questoes.size() * 100;
		Questionario.percentualAcertos = total;
		return percentualAcertos;
	}

	public static void setPercentualAcertos(double percentualAcertos) {
		Questionario.percentualAcertos = percentualAcertos;
	}

	public double getPercentualErros() {
		double total = this.totalErros / questoes.size() * 100;
		Questionario.percentualErros = total;
		return percentualErros;
	}
	
	public static void setPercentualErros(double percentualErros) {
		Questionario.percentualErros = percentualErros;
	}
// SÓ PODE ACUMULAR SE A QUESTÃO ESTIVER CORRETA
	public double getTotalDePontos() {
		double acumulador = 0;

		for (int i = 0; i < questoes.size(); i++) {
			acumulador += questoes.get(i).getValorPontuacaoQuestao();
		}
		
		Questionario.totalDePontosQuestionario = acumulador;
		
		return totalDePontosQuestionario;
	}
	
	public static void setTotalDePontos(double totalDePontos) {
		Questionario.totalDePontosQuestionario = totalDePontos;
	}

}
