package br.com.fiap.b2w.model;

import java.util.Date;
import java.util.List;

import br.com.fiap.b2w.enumeration.StatusTreinamentoEnum;

public class Treinamento {
	private int idTreinamento;
	private String temaTreinamento;
	private String descricao;
	private Date cargaHoraria;
	private List<Usuario> usuario;
	private Date dataInicio;
	private Date dataFim;
	private String instrutor;
	private String conteudo;
	private Arquivo arquivo;
	private Setor setor;
	private StatusTreinamentoEnum status;
	private Date dataHora;
	private int totalTopicosDisponiveis;
	private int totalTopicosVisualizados;
	private static double progresso;
	private static double totalDePontosTreinamento;

	public Treinamento(int idTreinamento, String temaTreinamento, String descricao, Date cargaHoraria, Date dataInicio,
			Date dataFim, String conteudo, Setor setor, StatusTreinamentoEnum status, Date dataHora) {
		this.idTreinamento = idTreinamento;
		this.temaTreinamento = temaTreinamento;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.conteudo = conteudo;
		this.setor = setor;
		this.status = status;
		this.dataHora = dataHora;
	}

	public Treinamento(int idTreinamento, String temaTreinamento, String descricao, Date cargaHoraria, Date dataInicio,
			Date dataFim, String conteudo, Arquivo arquivo, Setor setor, StatusTreinamentoEnum status, Date dataHora) {
		this(idTreinamento, temaTreinamento, descricao, cargaHoraria, dataInicio, dataFim, conteudo, setor, status,
				dataHora);
		this.arquivo = arquivo;
	}

	public Treinamento() {
	}

	public Treinamento(int numero, String temaTreinamento, String descricao, Date cargaHoraria, int usuario, Date dataInicio, Date dataFim, String instrutor, String conteudo, int arquivo, long setor, int statusTreinamentoEnum, Date dataHora, int totalTopicoDisponiveis, int totalPontosTreinamento, double progresso, int totalPontosTreinamento1) {
	}


	public int getIdTreinamento() {
		return idTreinamento;
	}

	public void setIdTreinamento(int idTreinamento) {
		this.idTreinamento = idTreinamento;
	}

	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}

	public String getTemaTreinamento() {
		return temaTreinamento;
	}

	public void setTemaTreinamento(String temaTreinamento) {
		this.temaTreinamento = temaTreinamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Date cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Arquivo getArquivo() {
		return arquivo;
	}

	public void setArquivo(Arquivo arquivo) {
		this.arquivo = arquivo;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public StatusTreinamentoEnum getStatus() {
		return status;
	}

	public void setStatus(StatusTreinamentoEnum status) {
		this.status = status;
	}

	public Date getData() {
		return dataHora;
	}

	public void setData(Date data) {
		this.dataHora = data;
	}

	public double getProgresso() {
		Treinamento.progresso = totalTopicosVisualizados / totalTopicosDisponiveis * 100;
		return progresso;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public int getTotalTopicosDisponiveis() {
		return totalTopicosDisponiveis;
	}

	public void setTotalTopicosDisponiveis(int totalTopicosDisponiveis) {
		this.totalTopicosDisponiveis = totalTopicosDisponiveis;
	}

	public int getTotalTopicosVisualizados() {
		return totalTopicosVisualizados;
	}

	public void setTotalTopicosVisualizados(int totalTopicosVisualizados) {
		this.totalTopicosVisualizados = totalTopicosVisualizados;
	}

	public static double getTotalDePontosTreinamento() {
		return totalDePontosTreinamento;
	}

	public static void setTotalDePontosTreinamento(double totalDePontosTreinamento) {
		Treinamento.totalDePontosTreinamento = totalDePontosTreinamento;
	}

	public static void setProgresso(double progresso) {
		Treinamento.progresso = progresso;
	}

	// M�todos

	public void incluirTreinamento(Treinamento treinamento) {

	}
	
	public void alterarTreinamento(Treinamento treinamento) {

	}
	
	public Treinamento consultarTreinamentos(int idUsuario) {
		// TODO:
		return new Treinamento();
	}
	
	public Treinamento consultarTreinamentosPorStatus(int idUsuario, StatusTreinamentoEnum status) {
		// TODO:
		return new Treinamento();
	}
	
	public void excluirTreinamento(int idTreinamento) {
		// TODO:
	}

	// Altera o status do treinamento para um usu�rio
	public void alterarStatusParaUsuarios(int idTreinamento, StatusTreinamentoEnum status,
			List<Usuario> usuarioTreinamento) {
		// TODO:
	}

	public void add(Treinamento treinamento) {
	}
}
