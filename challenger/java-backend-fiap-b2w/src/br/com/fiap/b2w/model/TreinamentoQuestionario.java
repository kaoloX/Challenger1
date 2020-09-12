package br.com.fiap.b2w.model;
import java.util.Date;
import java.util.List;

import br.com.fiap.b2w.enumeration.StatusTreinamentoEnum;
import br.com.fiap.b2w.model.Questionario;
import br.com.fiap.b2w.model.Treinamento;

public class TreinamentoQuestionario extends Treinamento {
	private List<Questionario> questionarios;

	public TreinamentoQuestionario(int idTreinamento, String temaTreinamento, String descricao, Date cargaHoraria, Date dataInicio,
			Date dataFim, String conteudo, Setor setor, StatusTreinamentoEnum status, Date dataHora,
			List<Questionario> questionarios) {
		super(idTreinamento, temaTreinamento, descricao, cargaHoraria, dataInicio, dataFim, conteudo, setor, status, dataHora);
		this.questionarios = questionarios;
	}
	
	public TreinamentoQuestionario() {}

	public List<Questionario> getQuestionarios() {
		return questionarios;
	}

	public void setQuestionarios(List<Questionario> questionarios) {
		this.questionarios = questionarios;
	}
}
