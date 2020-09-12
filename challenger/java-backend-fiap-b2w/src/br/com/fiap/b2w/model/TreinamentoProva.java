package br.com.fiap.b2w.model;
import java.util.Date;
import java.util.List;

import br.com.fiap.b2w.enumeration.StatusTreinamentoEnum;
import br.com.fiap.b2w.model.Prova;
import br.com.fiap.b2w.model.Treinamento;

public class TreinamentoProva extends Treinamento{
	private List<Prova> provas;

	public TreinamentoProva(int idTreinamento, String temaTreinamento, String descricao, Date cargaHoraria, Date dataInicio, Date dataFim,
			String conteudo, Setor setor, StatusTreinamentoEnum status, Date dataHora, List<Prova> provas) {
		super(idTreinamento, temaTreinamento, descricao, cargaHoraria, dataInicio, dataFim, conteudo, setor, status, dataHora);
		this.provas = provas;
	}
	
	public TreinamentoProva() {}

	public List<Prova> getProvas() {
		return provas;
	}

	public void setProvas(List<Prova> provas) {
		this.provas = provas;
	}
}
