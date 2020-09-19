package br.com.fiap.b2w.model;

import br.com.fiap.b2w.enumeration.UsuarioEnum;
import java.util.List;
import java.lang.String;

public class Usuario {
	private static int idUsuario;
	private static Setor setor;
	private static String senha;
	public int getLogin;
	private int idUsuario;
	private String nome;
	private String login;
	private String senha = "AB1CD2";
	private Setor setor;
	private List<Treinamento> treinamentos;
	private UsuarioEnum tipoUsuario;
	private boolean status;
	private double totalPontos;


	public Usuario( int idUsuario, String nome, String login, String senha, Setor setor, boolean status) {
		super();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.setor = setor;
		this.tipoUsuario = tipoUsuario;
		this.status = status;
	}


	public Usuario(int idUsuario, String nome, String login, String senha, String setor, int idTreinamento, int tipoDoUsuarioEnum, boolean status, double totalPontos) {
		this(idUsuario, nome, login, senha, setor, status);
	}


	public Usuario(int idUsuario, int idTreinamento, int tipoDoUsuarioEnum) {
	}

	public Usuario(int idUsuario, String login, String setor, int tipoDoUsuarioEnum) {
	}

	public Usuario(int idUsuario, String setor, int idTreinamento, int tipoDoUsuarioEnum, boolean status, double totalPontos) {
	}

	public Usuario(int idUsuario, String nome, String login, String senha, String setor, boolean status) {
	}

	public Usuario(int idUsuario) {
	}

	public Usuario() {

	}


	public static Usuario valueOf(String usuario) {
	}

	public static int getIdUsuario() {
		return idUsuario;
	}

	public static int getIdTreinamento() {
	}

	public static int getTipoDoUsuario() {
	}

	public static int getTipoDoUsuarioEnum() {
	}

	public static boolean getStatus() {
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public static double getTotalPontos() {
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

	
	public static String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public static String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public static String getSetor() {
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

	public void setId(int id) {
	}

	public void add(Usuario usuario) {
	}
}
