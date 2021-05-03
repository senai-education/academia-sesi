
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Luiz Felipe
 */
public class Lixao {
    
    
     public static void insertAgendamento() {

        String driver = "org.postgresql.Driver";
        String user = "postgres";
        String senha = "senai";
        String url = "jdbc:postgresql://localhost:5432/sesiacademia";

        try {
            Class.forName(driver);
            System.out.println("Driver carregado");
            Connection con = null;
            con = DriverManager.getConnection(url, user, senha);
            System.out.println("Conexão realizada com sucesso.");
            java.sql.Statement stmt = con.createStatement();

            String codcli = Agendamento.USU.getText();
            String dia = Agendamento.dia.getText();
            String hor = Agendamento.hor.getText();
            String cat = Agendamento.cat.getText();
            String codage = "select a.codage from agendamento a, horario b, categoria c where a.codhor = b.codhor and a.codcat = c.codcat and a.codhor = (select codhor from horario where horario like '" + hor + "') and a.codcat =  (select codcat from categoria where nomcat like '" + cat + "') and a.dia = '" + dia + "'";

            String Insert = "insert into agendacliente values (" + codcli + ", '" + dia + "', (" + codage + "))";
            System.out.println(Insert);
            String Insert2 = "update agendamento set qtdpes = qtdpes-1 where codage = (" + codage + ")";

            stmt.executeUpdate(Insert);
            stmt.executeUpdate(Insert2);
            //System.out.println(Insert);
            //System.out.println(Insert2);
            JOptionPane.showMessageDialog(null, "Agendamento feito com Sucesso!"); //Mensagem de confirmação para o usuário
            con.close();

        } catch (ClassNotFoundException ex) {
            System.err.print(ex.getMessage());
        } catch (SQLException e) {
            System.err.print(e.getMessage());
            JOptionPane.showMessageDialog(null, "Já há agendamentos para o dia selecionado");
        }
    }

    public static void dataComboBoxAgendamento() {

        String driver = "org.postgresql.Driver";
        String user = "postgres";
        String senha = "senai";
        String url = "jdbc:postgresql://localhost:5432/sesiacademia";
        String sql = "select dia from agendamento where dia >= CURRENT_DATE and dia < CURRENT_DATE+7 group by dia order by dia asc";

        try {
            Connection con = DriverManager.getConnection(url, user, senha);
            PreparedStatement banco = (PreparedStatement) con.prepareStatement(sql);
            banco.execute(); // cria o vetor

            ResultSet resultado = banco.executeQuery();

            while (resultado.next()) {

                Agendamento.jComboBox1.addItem(resultado.getString(1));
                Agendamento.jComboBox1.updateUI();

            }
            banco.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("o erro foi " + ex);
        }
    }

    public static void categoriaCliente() {

        String driver = "org.postgresql.Driver";
        String user = "postgres";
        String senha = "senai";
        String url = "jdbc:postgresql://localhost:5432/sesiacademia";
        String cod = Agendamento.USU.getText();
        String sql = "select codcat from cliente where codcli = " + cod;

        try {
            Connection con = DriverManager.getConnection(url, user, senha);
            PreparedStatement banco = (PreparedStatement) con.prepareStatement(sql);
            banco.execute(); // cria o vetor

            ResultSet resultado = banco.executeQuery();

            while (resultado.next()) {

                Agendamento.categoria.setText(resultado.getString(1));
                Agendamento.categoria.updateUI();

            }
            banco.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("o erro foi " + ex);
        }
    }
}
