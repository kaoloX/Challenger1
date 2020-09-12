package br.com.fiap.b2w.model;

import java.util.Date;
import java.util.List;

import br.com.fiap.b2w.enumeration.StatusTreinamentoEnum;
import br.com.fiap.b2w.model.Prova;
import br.com.fiap.b2w.model.Questionario;
import br.com.fiap.b2w.model.Treinamento;

public class TreinamentoQuestionarioProva extends Treinamento {
	private List<Questionario> questionaios;
	private List<Prova> provas;

	public TreinamentoQuestionarioProva(int idTreinamento, String temaTreinamento, String descricao, Date cargaHoraria,
			Date dataInicio, Date dataFim, String conteudo, Setor setor, StatusTreinamentoEnum status, Date dataHora,
			List<Questionario> questionaios, List<Prova> provas) {
		super(idTreinamento, temaTreinamento, descricao, cargaHoraria, dataInicio, dataFim, conteudo, setor, status,
				dataHora);
		this.questionaios = questionaios;
		this.provas = provas;
	}

	public TreinamentoQuestionarioProva() {
	}

	public List<Questionario> getQuestionaios() {
		return questionaios;
	}

	public void setQuestionaios(List<Questionario> questionaios) {
		this.questionaios = questionaios;
	}

	public List<Prova> getProvas() {
		return provas;
	}

	public void setProvas(List<Prova> provas) {
		this.provas = provas;
	}
}
