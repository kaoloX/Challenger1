package br.com.fiap.b2w.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionOne {

    private static Connection conn;

    public ConnectionOne () {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            this.conn = DriverManager.getConnection("oracle.fiap.com.br", "rm83560", "281198");

        } catch (ClassNotFoundException e) {
            System.err.printf("Não foi possível localizar o driver: %s", e.getMessage());
        } catch (SQLException e) {
            System.err.println("Não foi possível conectar ao banco de dados");
            System.err.println(e.getMessage());
        }
    }

    public static Connection getConn() {
        return conn;
    }

    public static void closeConnection(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionOne.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


