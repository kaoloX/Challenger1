package br.com.fiap.b2w.model;

import br.com.fiap.b2w.enumeration.ArquivoQuestaoEnum;

public class Dissertativa extends Questao{
	private String respostaUsuario;
	
	
	public Dissertativa(String enunciado, ArquivoQuestaoEnum tipoArquivo, br.com.fiap.b2w.enumeration.QuestaoEnum tipoQuestao, double valorPontuacaoQuestao) {
		super(enunciado, tipoArquivo, tipoQuestao, valorPontuacaoQuestao);
	}
	
	public Dissertativa() {}

	public String getRespostaUsuario() {
		return respostaUsuario;
	}

	public void setRespostaUsuario(String respostaUsuario) {
		this.respostaUsuario = respostaUsuario;
	}
}
