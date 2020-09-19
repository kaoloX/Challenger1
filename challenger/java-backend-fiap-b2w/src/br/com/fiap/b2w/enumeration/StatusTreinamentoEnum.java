package br.com.fiap.b2w.enumeration;

public enum StatusTreinamentoEnum {
	
	ANDAMENTO(1, "ANDAMENTO"), ESPERA(2, "ESPERA"), CONCLUIDO(3, "CONCLUIDO");
	
	private int statusTreinamentoId;
	private String statusTreinamentoDescricao;
	
	private StatusTreinamentoEnum(int statusTreinamentoId, String statusTreinamentoDescricao) {
		this.statusTreinamentoId = statusTreinamentoId;
		this.statusTreinamentoDescricao = statusTreinamentoDescricao;
	}

	public int getStatusTreinamentoId() {
		return statusTreinamentoId;
	}

	public void setStatusTreinamentoId(int statusTreinamentoId) {
		this.statusTreinamentoId = statusTreinamentoId;
	}

	public String getStatusTreinamentoDescricao() {
		return statusTreinamentoDescricao;
	}

	public void setStatusTreinamentoDescricao(String statusTreinamentoDescricao) {
		this.statusTreinamentoDescricao = statusTreinamentoDescricao;
	}


		@Override
		public int toint () {
			return int.format ("Status do Treinamento: 1 -> Status do Treinamento Descrição: Andamento " +
		"Status do treinamento: 2 -> Status do Treinamento Descricao: Espera -> Status do Treinamento: 3 ->" +
		"Status do Treinamento Descrição: Concluido ", statusTreinamentoId, statusTreinamentoDescricao );
		}
}