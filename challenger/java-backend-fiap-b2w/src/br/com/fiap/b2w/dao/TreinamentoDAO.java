package br.com.fiap.b2w.dao;

import br.com.fiap.b2w.model.Treinamento;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TreinamentoDAO {

    private Connection conn;
    private List<Treinamento> treinamento;

    private void conecta() throws ClassNotFoundException, SQLException {
        this.conn = DriverManager.getConnection("oracle.fiap.com.br:1521:orcl", "RM83560",
                "281198" );
    }

    public List<Treinamento> incluirTreinamentos() throws ClassNotFoundException, SQLException {
        List<Treinamento> treinamentos = new ArrayList<>();
        this.conecta();

        String sql = "select * from t_treinamentos where tema_treinamento ";
        Statement stmt = this.conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

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


            treinamento.add(new Treinamento(numero, temaTreinamento, descricao, cargaHoraria, usuario, dataInicio,
                    dataFim, instrutor, conteudo, arquivo, setor, statusTreinamentoEnum, dataHora, totalTopicoDisponiveis,
                    totalPontosTreinamento, progresso, totalDePontosTreinamentos));
        }
        this.desconecta();
        return treinamento.isEmpty() ? null: treinamento;
    }

    private void desconecta() {
    }



        public Treinamento alterarTreinamento(int idTreinamento) throws ClassNotFoundException, SQLException {
            Treinamento treinamento = null;
            this.conecta();

            String sql = "select * from t_treinamentos where id_treinamento";
            Statement  stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()) {
                int numero = rs.getInt("ID_TREINAMENTO");
                String temaTreinamento = rs.getString("TEMA_TREINAMENTO");
                String descricao = rs.getString("DESCRICAO");
                Date cargaHoraria = rs.getDate("CARGA_HR");
                int usuario = rs.getInt("USUARIO");
                Date dataInicio = rs.getDate("DATA_INICIO");
                Date dataFim = rs.getDate("DATA_FIM");
                String instrutor = rs.getString("INSTRUTOR");
                String conteudo = rs.getString("CONTEUDO");
                int  arquivo = rs.getInt("ARQUIVO");
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
            this.desconecta();
            return treinamento;
}


    public Treinamento consultarTreinamento(int idUsuario) throws ClassNotFoundException, SQLException {
        Treinamento treinamento = null;
        this.conecta();

        String sql = "select * from t_treinamento where id_usuario";
        Statement  stmt = this.conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next()) {
            int numero = rs.getInt("ID_TREINAMENTO");
            String temaTreinamento = rs.getString("TEMA_TREINAMENTO");
            String descricao = rs.getString("DESCRICAO");
            Date cargaHoraria = rs.getDate("CARGA_HR");
            int usuario = rs.getInt("USUARIO");
            Date dataInicio = rs.getDate("DATA_INICIO");
            Date dataFim = rs.getDate("DATA_FIM");
            String instrutor = rs.getString("INSTRUTOR");
            String conteudo = rs.getString("CONTEUDO");
            int  arquivo = rs.getInt("ARQUIVO");
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
        this.desconecta();
        return treinamento;
    }


    public Treinamento consultarTreinamentoPorStatus(int idUsuario, int statusTreinamentoEnum) throws ClassNotFoundException, SQLException {
        Treinamento treinamento = null;
        this.conecta();

        String sql = "select * from t_treinamentos where id_usuario";
        Statement  stmt = this.conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next()) {
            int numero = rs.getInt("ID_TREINAMENTO");
            String temaTreinamento = rs.getString("TEMA_TREINAMENTO");
            String descricao = rs.getString("DESCRICAO");
            Date cargaHoraria = rs.getDate("CARGA_HR");
            int usuario = rs.getInt("USUARIO");
            Date dataInicio = rs.getDate("DATA_INICIO");
            Date dataFim = rs.getDate("DATA_FIM");
            String instrutor = rs.getString("INSTRUTOR");
            String conteudo = rs.getString("CONTEUDO");
            int  arquivo = rs.getInt("ARQUIVO");
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
        this.desconecta();
        return treinamento;
    }

    public Treinamento excluirTreinamento(int idTreinamento) throws ClassNotFoundException, SQLException {
        Treinamento treinamento = null;
        this.conecta();

        String sql = "select * from t_treinamentos where id_treinamento";
        Statement  stmt = this.conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next()) {
            int numero = rs.getInt("ID_TREINAMENTO");
            String instrutor = rs.getString("INSTRUTOR");



            treinamento.add(new Treinamento(numero, idTreinamento, instrutor));
        }
        this.desconecta();
        return treinamento;
    }

    public Treinamento alterarStatusParaUsuarios(int idTreinamento, int statusTreinamentoEnum) throws ClassNotFoundException, SQLException {
        Treinamento treinamento = null;
        this.conecta();

        String sql = "select * from t_treinamentos where id_treinamento";
        Statement  stmt = this.conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next()) {
            int numero = rs.getInt("ID_TREINAMENTO");
            int statusTreinamentoEnum = rs.getInt("STATUS");


            treinamento.add(new Treinamento(idTreinamento, statusTreinamentoEnum));
        }
        this.desconecta();
        return treinamento;
    }




    public void desconecta(Connection conn) throws SQLException {
        if (!conn.isClosed()) this.conn.close();

        }