package br.com.fiap.b2w.dao;

import br.com.fiap.b2w.connection.ConnectionOne;
import br.com.fiap.b2w.model.Treinamento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;


public class TreinamentoDAO {

    private List<Treinamento> treinamento;
    private Connection conn;
    private Object ClassNotFoundException;
    private Object SQLException;

    public TreinamentoDAO() {
    }

    public Treinamento incluirTreinamento(Treinamento treinamento) throws SQLException {

        Connection conn = null;
        PreparedStatement pstmt = null;
        Treinamento tr = null;


        //Alterar os nomes das tabelas//

        try {
            conn = ConnectionOne.getConn();

            String sql = String.format(
                    "select * from  T_TREINAMENTOS where TEMA_TREINAMENTOS, DESCRICAO, CARGA_HORARIA," +
                            "USUARIO, DATA_INICIO, DATA_FIM, INSTRUTOR, CONTEUDO, ARQUIVO, SETOR," +
                            "STATUS_TREIN_ENUM, DATA_HORA, TOPICO_DISPONIVEIS, TOTAL_PONT_DISP, " +
                            "TOTAL_PONT_TREIN, PROGRESSO");

            pstmt.setInt(1, Treinamento.getIdTreinamento());
            pstmt.setString(2, Treinamento.getTemaTreinamento());
            pstmt.setString(3, Treinamento.getDescricao());
            pstmt.setDate(4, Treinamento.getcargaHoraria());
            pstmt.setInt(5, Treinamento.getUsuario());
            pstmt.setDate(6, Treinamento.getDataInicio());
            pstmt.setDate(7, Treinamento.getDataFim());
            pstmt.setString(8, Treinamento.getInstrutor());
            pstmt.setString(9, Treinamento.getConteudo());
            pstmt.setInt(10, Treinamento.getArquivo());
            pstmt.setLong(11, Treinamento.getSetor());
            pstmt.setInt(12, Treinamento.getStatusTreinamentoEnum());
            pstmt.setDate(13, Treinamento.getDataHora());
            pstmt.setInt(14, Treinamento.getTotalTopicoDisponiveis());
            pstmt.setInt(15, Treinamento.getTotalDePontosTreinamento());
            pstmt.setDouble(16, Treinamento.getProgresso());
            pstmt.setDouble(17, Treinamento.getTreinamentos());

            pstmt = this.conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int idTreinamento = rs.getInt("ID_TREINAMENTO");
                String temaTreinamento = rs.getString("TEMA_TREINAMENTO");
                String descricao = rs.getString("DESCRICAO");
                Date cargaHoraria = rs.getDate("CARGA_HR");
                int usuario = rs.getInt("USUARIO");
                Date dataInicio = rs.getDate("DATA_INICIO");
                Date dataFim = rs.getDate("DATA_FIM");
                String instrutor = rs.getString("INSTRUTOR");
                String conteudo = rs.getString("CONTEUDO");
                int arquivo = rs.getInt("ARQUIVO");
                long setor = rs.getLong("SETOR");
                int statusTreinamentoEnum = rs.getInt("STATUS");
                Date dataHora = rs.getDate("DATA_HORA");
                int totalTopicoDisponiveis = rs.getInt("TOTAL_TOPIC");
                int totalPontosTreinamento = rs.getInt("TOTAL_TP_VIS");
                double progresso = rs.getDouble("PROGRESSO");
                double totalDePontosTreinamentos = rs.getDouble("TOTAL_PT_TREIN");


                treinamento.add(new Treinamento(idTreinamento, temaTreinamento, descricao, cargaHoraria, usuario, dataInicio,
                        dataFim, instrutor, conteudo, arquivo, setor, statusTreinamentoEnum, dataHora, totalTopicoDisponiveis,
                        totalPontosTreinamento, progresso, (int) totalDePontosTreinamentos));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            pstmt.close();
            conn.close();
            return tr;
        }

    }


    public Treinamento alterarTreinamento(Treinamento treinamento) throws ClassNotFoundException, SQLException {

        Connection conn = null;
        PreparedStatement pstmt = null;
        Treinamento tr = null;


        //Alterar os nomes das tabelas//

        try {
            conn = ConnectionOne.getConn();

            String sql = String.format(
                    "select * from  T_TREINAMENTOS where  CARGA_HORARIA," +
                            "USUARIO, DATA_INICIO, DATA_FIM, INSTRUTOR, CONTEUDO, SETOR," +
                            "STATUS_TREIN_ENUM, DATA_HORA, TOPICO_DISPONIVEIS, TOTAL_PONT_DISP, " +
                            "TOTAL_PONT_TREIN, PROGRESSO");

            pstmt.setInt(1, Treinamento.getIdTreinamento());
            pstmt.setDate(4, Treinamento.getcargaHoraria());
            pstmt.setInt(5, Treinamento.getUsuario());
            pstmt.setDate(6, Treinamento.getDataInicio());
            pstmt.setDate(7, Treinamento.getDataFim());
            pstmt.setString(8, Treinamento.getInstrutor());
            pstmt.setString(9, Treinamento.getConteudo());
            pstmt.setLong(11, Treinamento.getSetor());
            pstmt.setInt(12, Treinamento.getStatusTreinamentoEnum());
            pstmt.setDate(13, Treinamento.getDataHora());
            pstmt.setInt(14, Treinamento.getTotalTopicoDisponiveis());
            pstmt.setInt(15, Treinamento.getTotalDePontosTreinamento());
            pstmt.setDouble(16, Treinamento.getProgresso());
            pstmt.setDouble(17, Treinamento.getTreinamentos());

            pstmt = this.conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                int numero = rs.getInt("ID_TREINAMENTO");
                Date cargaHoraria = rs.getDate("CARGA_HR");
                int usuario = rs.getInt("USUARIO");
                Date dataInicio = rs.getDate("DATA_INICIO");
                Date dataFim = rs.getDate("DATA_FIM");
                String instrutor = rs.getString("INSTRUTOR");
                String conteudo = rs.getString("CONTEUDO");
                long setor = rs.getLong("SETOR");
                int statusTreinamentoEnum = rs.getInt("STATUS");
                Date dataHora = rs.getDate("DATA_HORA");
                int totalTopicoDisponiveis = rs.getInt("TOTAL_TOPIC");
                int totalPontosTreinamento = rs.getInt("TOTAL_TP_VIS");
                double progresso = rs.getDouble("PROGRESSO");
                double totalDePontosTreinamentos = rs.getDouble("TOTAL_PT_TREIN");


                treinamento.add(new Treinamento(numero, cargaHoraria, usuario, dataInicio,
                        dataFim, instrutor, conteudo, setor, statusTreinamentoEnum, dataHora, totalTopicoDisponiveis,
                        totalPontosTreinamento, progresso, (int) totalDePontosTreinamentos));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            pstmt.close();
            conn.close();
            return tr;
        }

    }


    public Treinamento consultarTreinamento(Treinamento treinamento) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        Treinamento tr = null;

        try {
            conn = ConnectionOne.getConn();

            String sql = String.format(
                    "select * from  T_TREINAMENTOS where  CARGA_HORARIA," +
                            "USUARIO, DATA_INICIO, DATA_FIM, INSTRUTOR, CONTEUDO, SETOR," +
                            "STATUS_TREIN_ENUM, DATA_HORA, TOPICO_DISPONIVEIS, TOTAL_PONT_DISP, " +
                            "TOTAL_PONT_TREIN, PROGRESSO");

            pstmt.setInt(1, Treinamento.getIdTreinamento());
            pstmt.setDate(4, Treinamento.getcargaHoraria());
            pstmt.setInt(5, Treinamento.getUsuario());
            pstmt.setDate(6, Treinamento.getDataInicio());
            pstmt.setDate(7, Treinamento.getDataFim());
            pstmt.setString(8, Treinamento.getInstrutor());
            pstmt.setString(9, Treinamento.getConteudo());
            pstmt.setLong(11, Treinamento.getSetor());
            pstmt.setInt(12, Treinamento.getStatusTreinamentoEnum());
            pstmt.setDate(13, Treinamento.getDataHora());
            pstmt.setInt(14, Treinamento.getTotalTopicoDisponiveis());
            pstmt.setInt(15, Treinamento.getTotalDePontosTreinamento());
            pstmt.setDouble(16, Treinamento.getProgresso());
            pstmt.setDouble(17, Treinamento.getTreinamentos());

            pstmt = this.conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                int numero = rs.getInt("ID_TREINAMENTO");
                String temaTreinamento = rs.getString("TEMA_TREINAMENTO");
                String descricao = rs.getString("DESCRICAO");
                Date cargaHoraria = rs.getDate("CARGA_HR");
                int usuario = rs.getInt("USUARIO");
                Date dataInicio = rs.getDate("DATA_INICIO");
                Date dataFim = rs.getDate("DATA_FIM");
                String instrutor = rs.getString("INSTRUTOR");
                String conteudo = rs.getString("CONTEUDO");
                int arquivo = rs.getInt("ARQUIVO");
                long setor = rs.getLong("SETOR");
                int statusTreinamentoEnum = rs.getInt("STATUS");
                Date dataHora = rs.getDate("DATA_HORA");
                int totalTopicoDisponiveis = rs.getInt("TOTAL_TOPIC");
                int totalPontosTreinamento = rs.getInt("TOTAL_TP_VIS");
                double progresso = rs.getDouble("PROGRESSO");
                double totalDePontosTreinamentos = rs.getDouble("TOTAL_PT_TREIN");


                treinamento.add(new Treinamento(numero, temaTreinamento, descricao, cargaHoraria, usuario, dataInicio,
                        dataFim, instrutor, conteudo, arquivo, setor, statusTreinamentoEnum, dataHora, totalTopicoDisponiveis,
                        totalPontosTreinamento, progresso, (int) totalDePontosTreinamentos));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            pstmt.close();
            conn.close();
            return tr;

        }

    }


        public Treinamento consultarTreinamentoPorStatus (Treinamento treinamento) throws
        ClassNotFoundException, SQLException
        {
            Connection conn = null;
            PreparedStatement pstmt = null;
            Treinamento tr = null;

            try {
                conn = ConnectionOne.getConn();

                String sql = String.format(
                        "select * from  T_TREINAMENTOS where ID_TREINAMENTO" +
                                "STATUS_TREIN_ENUM");

                pstmt.setInt(1, Treinamento.getIdTreinamento());
                pstmt.setInt(12, Treinamento.getStatusTreinamentoEnum());

                pstmt = this.conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery(sql);

                while (rs.next()) {
                    int numero = rs.getInt("ID_TREINAMENTO");
                    int statusTreinamentoEnum = rs.getInt("STATUS");

                    treinamento.add(new Treinamento(numero, statusTreinamentoEnum));
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                throw ex;
            } finally {
                pstmt.close();
                conn.close();
                return tr;


            }
        }

    public Treinamento excluirTreinamento(Treinamento treinamento) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        Treinamento tr = null;
        try {
            conn = ConnectionOne.getConn();

        String sql = String.format("select * from t_treinamentos where id_treinamento");
        pstmt = this.conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery(sql);

        pstmt.setInt(1, Treinamento.getIdTreinamento());
        pstmt.setString(1, Treinamento.getInstrutor());

        while (rs.next()) {
            int idTreinamento = rs.getInt("ID_TREINAMENTO");
            String instrutor = rs.getString("INSTRUTOR");

            treinamento.add(new Treinamento(idTreinamento, instrutor));
        }
    }catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            pstmt.close();
            conn.close();
            return tr;
        }
    }

    public Treinamento alterarStatusParaUsuarios(Treinamento treinamento) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        Treinamento tr = null;

        try {
            conn = ConnectionOne.getConn();

        String sql = String.format("select * from t_treinamentos where id_treinamento");
        pstmt = this.conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery(sql);

        pstmt.setInt(1, Treinamento.getIdTreinamento());
        pstmt.setInt(12, Treinamento.getStatusTreinamentoEnum());

        while(rs.next()) {
            int idTreinamento = rs.getInt("ID_TREINAMENTO");
            int statusTreinamentoEnum = rs.getInt("STATUS");


            treinamento.add(new Treinamento(idTreinamento, statusTreinamentoEnum));
        }
    } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            pstmt.close();
            conn.close();
            return tr;
        }
    }

}