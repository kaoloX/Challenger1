package br.com.fiap.b2w.enumeration;

public enum QuestaoEnum {
	
	DISSERTATIVA(1, "DISSERTATIVA"), MULTIPLAESCOLHA(2, "MULTIPLAESCOLHA");
	
	private int tipoQuestaoId;
	private String tipoQuestaoDescricao;
	
	private QuestaoEnum(int tipoQuestaoId, String tipoQuestaoDescricao) {
		this.tipoQuestaoId = tipoQuestaoId;
		this.tipoQuestaoDescricao = tipoQuestaoDescricao;
	}

	public int getTipoQuestaoId() {
		return tipoQuestaoId;
	}

	public void setTipoQuestaoId(int tipoQuestaoId) {
		this.tipoQuestaoId = tipoQuestaoId;
	}

	public String getTipoQuestaoDescricao() {
		return tipoQuestaoDescricao;
	}

	public void setTipoQuestaoDescricao(String tipoQuestaoDescricao) {
		this.tipoQuestaoDescricao = tipoQuestaoDescricao;
	}

}

	@Override
	public int toInt (){
	return int.format ("Tipo de Questão Dissertativa: 1 -> Tipo de Questão Multiplaescolha: Dissertativa: 2", tipoQuestaoId)
		}
	public 	String toString () {
	return String.format ("Tipo de Questão Descrição 1: Dissertativa -> Tipo de Descrição 2: Multiplaescolha", tipoQuestaoDescricao)
		}