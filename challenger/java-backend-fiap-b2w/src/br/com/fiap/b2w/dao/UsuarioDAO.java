package br.com.fiap.b2w.dao;

import br.com.fiap.b2w.model.Treinamento;
import br.com.fiap.b2w.model.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    private Connection conn;
    private List <Usuario> usuario;

    private void conecta() throws ClassNotFoundException, SQLException {
        this.conn = DriverManager.getConnection("oracle.fiap.com.br:1521:orcl", "RM83560",
                "281198" );
    }
}

    public List<Usuario> inserirUsuario() throws ClassNotFoundException, SQLException {
        List<Usuario> usuario = new ArrayList<>();
        this.conecta();

        String sql = "select * from t_usuario where id_usuario ";
        Statement stmt = this.conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            int idUsuario = rs.getInt("ID_USUARIO");
            String nome = rs.getString("NOME_USUARIO");
            String login = rs.getString("LOGIN");
            String senha = rs.getString("SENHA");
            String setor = rs.getString("SETOR");
            int idTreinamento = rs.getInt("TREINAMENTO");
            int tipoDoUsuarioEnum = rs.getInt("TIPO_USUARIO");
            boolean status = rs.getBoolean("STATUS");
            double totalPontos = rs.getDouble("TOTAL_PONTOS");

            usuario.add(new Usuario(idUsuario, nome, login, senha, setor, idTreinamento, tipoDoUsuarioEnum,
                    status, totalPontos));

    }
        this.desconecta();
        return usuario.isEmpty() ? null: usuario;
}

    private void desconecta() {
    }

    public List<Usuario> desativarUsuario() throws ClassNotFoundException, SQLException {
        List<Usuario> usuario = new ArrayList<>();
        this.conecta();

        String sql = "select * from t_usuario where id_usuario ";
        Statement stmt = this.conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            int idUsuario = rs.getInt("ID_USUARIO");
            int idTreinamento = rs.getInt("TREINAMENTO");
            int tipoDoUsuarioEnum = rs.getInt("TIPO_USUARIO");

            usuario.add(new Usuario(idUsuario, idTreinamento, tipoDoUsuarioEnum));

        }
        this.desconecta();
        return usuario.isEmpty() ? null: usuario;
    }

    public List<Usuario> redefinirSenha () throws ClassNotFoundException, SQLException {
        List<Usuario> usuario = new ArrayList<>();
        this.conecta();

        String sql = "select * from t_usuario where id_usuario ";
        Statement stmt = this.conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            int idUsuario = rs.getInt("ID_USUARIO");
            String login = rs.getString("LOGIN");
            String setor = rs.getString("SETOR");
            int tipoDoUsuarioEnum = rs.getInt("TIPO_USUARIO");

            usuario.add(new Usuario(idUsuario, login, setor, tipoDoUsuarioEnum));

        }
        this.desconecta();
        return usuario.isEmpty() ? null: usuario;
    }

    public List<Usuario> calcularPontos() throws ClassNotFoundException, SQLException {
        List<Usuario> usuario = new ArrayList<>();
        this.conecta();

        String sql = "select * from t_usuario where id_usuario ";
        Statement stmt = this.conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            int idUsuario = rs.getInt("ID_USUARIO");
            String setor = rs.getString("SETOR");
            int idTreinamento = rs.getInt("TREINAMENTO");
            int tipoDoUsuarioEnum = rs.getInt("TIPO_USUARIO");
            boolean status = rs.getBoolean("STATUS");
            double totalPontos = rs.getDouble("TOTAL_PONTOS");

            usuario.add(new Usuario(idUsuario, setor, idTreinamento, tipoDoUsuarioEnum,
                    status, totalPontos));

        }
        this.desconecta();
        return usuario.isEmpty() ? null: usuario;
    }

    public void desconecta(Connection conn) throws SQLException {
        if (!conn.isClosed()) this.conn.close();

    }