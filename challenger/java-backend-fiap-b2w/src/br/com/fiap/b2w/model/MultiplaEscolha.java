package br.com.fiap.b2w.model;

import java.util.List;

import br.com.fiap.b2w.enumeration.ArquivoQuestaoEnum;
import br.com.fiap.b2w.enumeration.QuestaoEnum;

public class MultiplaEscolha extends Questao {
	private List<String> alternativas;
	private List<String> alternativaCorreta;

	public MultiplaEscolha(String enunciado, ArquivoQuestaoEnum tipoArquivo, QuestaoEnum tipoQuestao, double valorPontuacaoQuestao,
			List<String> alternativas) {
		super(enunciado, tipoArquivo, tipoQuestao, valorPontuacaoQuestao);
		this.alternativas = alternativas;
	}

	public MultiplaEscolha(String enunciado, ArquivoQuestaoEnum tipoArquivo, QuestaoEnum tipoQuestao, double valorPontuacaoQuestao,
			List<String> alternativas, List<String> alternativaCorreta) {
		this(enunciado, tipoArquivo, tipoQuestao, valorPontuacaoQuestao, alternativas);
		this.alternativaCorreta = alternativaCorreta;
	}

	public MultiplaEscolha() {
	}

	public List<String> getAlternativas() {
		return alternativas;
	}

	public void setAlternativas(List<String> alternativas) {
		this.alternativas = alternativas;
	}

	public List<String> getAlternativaCorreta() {
		return alternativaCorreta;
	}

	public void setAlternativaCorreta(List<String> alternativaCorreta) {
		this.alternativaCorreta = alternativaCorreta;
	}

	public void verificaAlternativa(List<Long> alternativasSelecionadas) {
		// TODO:
	}
}
