package br.com.fiap.b2w.model;

import br.com.fiap.b2w.enumeration.ArquivoQuestaoEnum;
import br.com.fiap.b2w.enumeration.QuestaoEnum;

public class Questao {
	private String enunciado;
	private ArquivoQuestaoEnum tipoArquivo;
	private QuestaoEnum tipoQuestao;
	private double valorPontuacaoQuestao;

	public Questao(String enunciado, QuestaoEnum tipoQuestao, double valorPontuacaoQuestao) {
		this.tipoQuestao = tipoQuestao;
		this.enunciado = enunciado;
		this.valorPontuacaoQuestao = valorPontuacaoQuestao;
	}

	public Questao(String enunciado, ArquivoQuestaoEnum tipoArquivo, QuestaoEnum tipoQuestao,
			double valorPontuacaoQuestao) {
		this(enunciado, tipoQuestao, valorPontuacaoQuestao);
		this.tipoArquivo = tipoArquivo;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public Questao() {
	}
	
	
	public ArquivoQuestaoEnum getTipoArquivo() {
		return tipoArquivo;
	}

	public void setTipoArquivo(ArquivoQuestaoEnum tipoArquivo) {
		this.tipoArquivo = tipoArquivo;
	}

	public QuestaoEnum getTipoQuestao() {
		return tipoQuestao;
	}

	public void setTipoQuestao(QuestaoEnum tipoQuestao) {
		this.tipoQuestao = tipoQuestao;
	}

	public double getValorPontuacaoQuestao() {
		return valorPontuacaoQuestao;
	}

	public void setValorPontuacaoQuestao(double valorPontuacaoQuestao) {
		this.valorPontuacaoQuestao = valorPontuacaoQuestao;
	}

	// Métodos

	public void incluirQuestao(Questao questao) {
		// TODO:
	}

}
