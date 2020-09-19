package br.com.fiap.b2w.dao;

import br.com.fiap.b2w.connection.ConnectionOne;
import br.com.fiap.b2w.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    private Connection conn;


    public Usuario inserirUsuario(Usuario usuario) throws ClassNotFoundException, SQLException {

        Connection conn = null;
        PreparedStatement pstmt = null;
        Usuario us = null;

        try {
            conn = ConnectionOne.getConn();


            String sql = String.format("select * from t_usuario where id_usuario ");

            pstmt.setInt(1, Usuario.getIdUsuario());
            pstmt.setString(2, Usuario.getNome());
            pstmt.setString(3, Usuario.getSenha());
            pstmt.setString(4, Usuario.getSetor());
            pstmt.setInt(5, Usuario.getIdTreinamento());
            pstmt.setInt(6, Usuario.getTipoDoUsuarioEnum());
            pstmt.setBoolean(7, Usuario.getStatus());
            pstmt.setDouble(8, Usuario.getTotalPontos());

            pstmt = this.conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery(sql);

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
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            pstmt.close();
            conn.close();
            return us;
        }
    }


    public Usuario desativarUsuario(Usuario usuario) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        Usuario us = null;

        try {
            conn = ConnectionOne.getConn();


            String sql = String.format("select * from t_usuario where id_usuario");

            pstmt.setInt(1, Usuario.getIdUsuario());
            pstmt.setInt(5, Usuario.getIdTreinamento());
            pstmt.setInt(6, Usuario.getTipoDoUsuarioEnum());

            pstmt = this.conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                int idUsuario = rs.getInt("ID_USUARIO");
                int idTreinamento = rs.getInt("TREINAMENTO");
                int tipoDoUsuarioEnum = rs.getInt("TIPO_USUARIO");

                usuario.add(new Usuario(idUsuario, idTreinamento, tipoDoUsuarioEnum));

            }

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            pstmt.close();
            conn.close();
            return us;
        }
    }

    public Usuario redefinirSenha(Usuario usuario) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        Usuario us = null;

        try {
            conn = ConnectionOne.getConn();

            String sql = String.format("select * from t_usuario where id_usuario ");
            pstmt.setInt(1, Usuario.getIdUsuario());
            pstmt.setString(2, Usuario.getLogin());
            pstmt.setString(4, Usuario.getSetor());
            pstmt.setInt(6, Usuario.getTipoDoUsuarioEnum());

            pstmt = this.conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                int idUsuario = rs.getInt("ID_USUARIO");
                String login = rs.getString("LOGIN");
                String setor = rs.getString("SETOR");
                int tipoDoUsuarioEnum = rs.getInt("TIPO_USUARIO");

                usuario.add(new Usuario(idUsuario, login, setor, tipoDoUsuarioEnum));

            }
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            pstmt.close();
            conn.close();
            return us;
        }
    }

    public Usuario calcularPontos(Usuario usuario) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        Usuario us = null;

        try {
            conn = ConnectionOne.getConn();

            String sql = String.format("select * from t_usuario where id_usuario ");

            pstmt.setInt(1, Usuario.getIdUsuario());
            pstmt.setString(4, Usuario.getSetor());
            pstmt.setInt(5, Usuario.getIdTreinamento());
            pstmt.setInt(6, Usuario.getTipoDoUsuarioEnum());
            pstmt.setBoolean(7, Usuario.getStatus());
            pstmt.setDouble(8, Usuario.getTotalPontos());


            pstmt = this.conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery(sql);

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
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            pstmt.close();
            conn.close();
            return us;
        }
    }


}