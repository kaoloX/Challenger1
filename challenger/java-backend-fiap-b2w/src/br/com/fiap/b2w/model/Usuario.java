package br.com.fiap.b2w.model;

import java.util.List;
import br.com.fiap.b2w.enumeration.UsuarioEnum;

public class Usuario {
	private int idUsuario;
	private String nome;
	private String login;
	private String senha = "AB1CD2";
	private Setor setor;
	private List<Treinamento> treinamentos;
	private UsuarioEnum tipoUsuario;
	private boolean status;
	private double totalPontos;
	
	public Usuario(String login, String senha, Setor setor, UsuarioEnum tipoUsuario, boolean status) {
		this.login = login;
		this.senha = senha;
		this.setor = setor;
		this.tipoUsuario = tipoUsuario;
		this.status = status;
	}

	public Usuario(String nome, String login, String senha, Setor setor, UsuarioEnum tipoUsuario, boolean status) {
		this(login, senha, setor, tipoUsuario, status);
		this.nome = nome;
	}

	public Usuario(int idUsuario, String nome, String login, String senha, String setor, int idTreinamento, int tipoDoUsuarioEnum, boolean status, double totalPontos) {
	}

	public Usuario(int idUsuario, int idTreinamento, int tipoDoUsuarioEnum) {
	}

	public Usuario(int idUsuario, String login, String setor, int tipoDoUsuarioEnum) {
	}

	public Usuario(int idUsuario, String setor, int idTreinamento, int tipoDoUsuarioEnum, boolean status, double totalPontos) {
	}

	public static Usuario valueOf(String usuario) {
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public double getTotalPontos() {
		return totalPontos;
	}

	public void setTotalPontos(double totalPontos) {
		this.totalPontos = totalPontos;
	}

	public List<Treinamento> getTreinamentos() {
		return treinamentos;
	}

	public void setTreinamentos(List<Treinamento> treinamentos) {
		this.treinamentos = treinamentos;
	}

	public Usuario() {
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public UsuarioEnum getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(UsuarioEnum tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	// M�todos

	public Usuario inserirUsuario(Usuario usuario) {
		// TODO:
		return usuario;
	}

	public void desativarUsuario(int idUsuario) {
		// TODO:
	}
	
	public void redefinirSenha(String senhaAtual, String novaSenha, int idUsuario) {
		// TODO:
	}
	
	public double calcularPontos(double pontuacaoTreinamentos, double pontuacaoQuestionario) {
		// TODO:
		return 0;
	}
	
	public double calcularPontos(double pontuacaoTreinamentos) {
		// TODO:
		return 0;
	}
	
}
