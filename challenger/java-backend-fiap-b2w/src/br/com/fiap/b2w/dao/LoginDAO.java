package br.com.fiap.b2w.dao;

import br.com.fiap.b2w.connection.ConnectionOne;
import br.com.fiap.b2w.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDAO {

    private Connection conn;
    private Object HibernateUtil;

    public LoginDAO(Object hibernateUtil) {
        HibernateUtil = hibernateUtil;
    }



    public Usuario logarTreinamento(Usuario Usuario) throws SQLException {

        Connection con = null;
        PreparedStatement pstmt = null;
        Usuario usr = null;


        //Alterar os nomes das tabelas//

        try {
            conn = ConnectionOne.getConn();

            String sql = String.format(
                    "INSERT INTO T_LOGIN(ID_USUARIO, LOGIN, SENHA)");

            pstmt.setString(1, Usuario.getLogin());
            pstmt.setString(2, Usuario.getSenha());

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("ID_USUARIO");
                String login = rs.getString("LOGIN");
                String senha = rs.getString("SENHA");

                usr = new Usuario();
                usr.setId(id);
                usr.setNome(login);
                usr.setSenha(senha);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            pstmt.close();
            conn.close();
            return usr;
        }

    }

}