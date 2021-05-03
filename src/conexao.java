import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
//bom dia
//boa noite, Pachequitos

public class conexao {

    public static void CidadeComboBoxCliente() {

        String driver = "org.postgresql.Driver";
        String user = "postgres";
        String senha = "senai";
        String url = "jdbc:postgresql://localhost:5432/sesiacademia";
        String a = (String) TelaCadastroCliente.estado.getSelectedItem();
        String sql = "select nomcid from cidade where codest = (select codest from estado where nomest like '" + a + "') order by nomcid";
        try {
            Connection con = DriverManager.getConnection(url, user, senha);
            PreparedStatement banco = (PreparedStatement) con.prepareStatement(sql);
            banco.execute(); // cria o vetor

            ResultSet resultado = banco.executeQuery();

            while (resultado.next()) {
                TelaCadastroCliente.cidade.addItem(resultado.getString(1));
                TelaCadastroCliente.cidade.updateUI();

            }
            banco.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("o erro foi " + ex);
        }
    }

    public static void CategoriaComboBoxCliente() {

        String driver = "org.postgresql.Driver";
        String user = "postgres";
        String senha = "senai";
        String url = "jdbc:postgresql://localhost:5432/sesiacademia";
        String sql = "select nomcat from categoria ";
        try {
            Connection con = DriverManager.getConnection(url, user, senha);
            PreparedStatement banco = (PreparedStatement) con.prepareStatement(sql);
            banco.execute(); // cria o vetor

            ResultSet resultado = banco.executeQuery();

            while (resultado.next()) {
                TelaCadastroCliente.categoria.addItem(resultado.getString(1));
                TelaCadastroCliente.categoria.updateUI();

            }
            banco.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("o erro foi " + ex);
        }
    }

    public static void PesquisaCliente() {

        //String driver = "org.postgresql.Driver";
        String user = "postgres";
        String senha = "senai";
        String url = "jdbc:postgresql://localhost:5432/sesiacademia";
        String cod = (String) TelaConsultaCliente.cod;
        String sql = "select to_char (a.ana, 'DD/MM/YYYY') as ana, to_char (a.datnas, 'DD/MM/YYYY') as datnas,  a.nomcli, a.cpf, b.nomcid, c.nomest, a.endereco, a.email, a.celular, d.nomcat, e.nomemp, a.tipo, a.classificacao, a.cep,  a.obs, a.genero from cliente a, cidade b, estado c, categoria d, empresa e where a.codcat=d.codcat and b.codcid=a.codcid and b.codest=c.codest and a.codemp = e.codemp and a.codcli = (select codcli from cliente where cpf like '"+cod+"');";

        try {
            Connection con = DriverManager.getConnection(url, user, senha);
            PreparedStatement banco = (PreparedStatement) con.prepareStatement(sql);
            banco.execute(); // cria o vetor

            ResultSet resultado = banco.executeQuery();

            while (resultado.next()) {
                TelaAlteracaoCliente.estado.setSelectedItem(resultado.getString(6));
                TelaAlteracaoCliente.estado.updateUI();
                TelaAlteracaoCliente.cpf.setText(resultado.getString(4));
                TelaAlteracaoCliente.cpf.updateUI();
                TelaAlteracaoCliente.nome.setText(resultado.getString(3));//ok
                TelaAlteracaoCliente.nome.updateUI();
                TelaAlteracaoCliente.cidade.setSelectedItem(resultado.getString(5));
                TelaAlteracaoCliente.cidade.updateUI();
                TelaAlteracaoCliente.end.setText(resultado.getString(7));
                TelaAlteracaoCliente.end.updateUI();
                TelaAlteracaoCliente.datnas.setText(resultado.getString(2));//ok
                TelaAlteracaoCliente.datnas.updateUI();//ok
                TelaAlteracaoCliente.email.setText(resultado.getString(8));
                TelaAlteracaoCliente.email.updateUI();
                TelaAlteracaoCliente.tel.setText(resultado.getString(9));
                TelaAlteracaoCliente.tel.updateUI();
                TelaAlteracaoCliente.cate.setSelectedItem(resultado.getString(10));
                TelaAlteracaoCliente.cate.updateUI();
                TelaAlteracaoCliente.tipo.setSelectedItem(resultado.getString(12));
                TelaAlteracaoCliente.tipo.updateUI();
                TelaAlteracaoCliente.emp.setSelectedItem(resultado.getString(11));
                TelaAlteracaoCliente.emp.updateUI();
                TelaAlteracaoCliente.cla.setSelectedItem(resultado.getString(13));
                TelaAlteracaoCliente.cla.updateUI();
                TelaAlteracaoCliente.cep.setText(resultado.getString(14));
                TelaAlteracaoCliente.cep.updateUI();
                TelaAlteracaoCliente.ana.setText(resultado.getString(1));//ok
                TelaAlteracaoCliente.ana.updateUI();//ok
                TelaAlteracaoCliente.obs.setText(resultado.getString(15));
                TelaAlteracaoCliente.obs.updateUI();
                TelaAlteracaoCliente.gen.setSelectedItem(resultado.getString(16));
                TelaAlteracaoCliente.gen.updateUI();

            }
            banco.close();

            con.close();
        } catch (SQLException ex) {
            System.out.println("o erro foi " + ex);
        }
    }

    public static void nomcliLabel() {

        String driver = "org.postgresql.Driver";
        String user = "postgres";
        String senha = "senai";
        String url = "jdbc:postgresql://localhost:5432/sesiacademia";
        String a = (String) TelaAlteracaoSenha.cpf.getText();
        String sql = "select nomcli from cliente where cpf like '" + a + "';";

        try {
            Connection con = DriverManager.getConnection(url, user, senha);
            PreparedStatement banco = (PreparedStatement) con.prepareStatement(sql);
            banco.execute(); // cria o vetor

            ResultSet resultado = banco.executeQuery();

            while (resultado.next()) {

                TelaAlteracaoSenha.nome.setText(resultado.getString(1));
                TelaAlteracaoSenha.nome.updateUI();

            }
            banco.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("o erro foi " + ex);
        }
    }
    public static void EstadoComboBoxCliente() {

        String driver = "org.postgresql.Driver";
        String user = "postgres";
        String senha = "senai";
        String url = "jdbc:postgresql://localhost:5432/sesiacademia";
        String sql = "select nomest from estado order by nomest";
        try {
            Connection con = DriverManager.getConnection(url, user, senha);
            PreparedStatement banco = (PreparedStatement) con.prepareStatement(sql);
            banco.execute(); // cria o vetor

            ResultSet resultado = banco.executeQuery();

            while (resultado.next()) {
                TelaCadastroCliente.estado.addItem(resultado.getString(1));
                TelaCadastroCliente.estado.updateUI();

            }
            banco.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("o erro foi " + ex);
        }
    }

    public static void InsertCliente() {
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

            Statement stmt = con.createStatement();

            String nome = TelaCadastroCliente.nome.getText();
            String cpf = TelaCadastroCliente.cpf.getText();
            String email = TelaCadastroCliente.email.getText();
            String cep = TelaCadastroCliente.cep.getText();
            String rua = TelaCadastroCliente.rua.getText();
            String bairro = TelaCadastroCliente.bairro.getText();
            String numero = TelaCadastroCliente.numero.getText();
            String telefone = TelaCadastroCliente.telefone.getText();
            String complemento = TelaCadastroCliente.complemento.getText();
            String bla = (String) TelaCadastroCliente.senha.getText();
            String dia = (String) TelaCadastroCliente.dia.getSelectedItem();
            String mes = (String) TelaCadastroCliente.mes.getSelectedItem();
            String ano = (String) TelaCadastroCliente.ano.getSelectedItem();
            String genero = (String) TelaCadastroCliente.genero.getSelectedItem();
            String empresa = (String) TelaCadastroCliente.empresa.getSelectedItem();
            String cidade = (String) TelaCadastroCliente.cidade.getSelectedItem();
            String tipo = (String) TelaCadastroCliente.tipo.getSelectedItem();
            String categoria = (String) TelaCadastroCliente.categoria.getSelectedItem();
            String classificacao = (String) TelaCadastroCliente.classificacao.getSelectedItem();
            String ana = TelaCadastroCliente.ana.getText();
            String obs = TelaCadastroCliente.obs.getText();

            String Insert = "insert into cliente values ((select coalesce (max(codcli),0)+1 from cliente),(select codcid from cidade where nomcid like'" + cidade + "'),(select codcat from categoria where nomcat like '" + categoria + "'),(select codemp from empresa where nomemp like '" + empresa + "'),'" + cpf + "','" + tipo + "','" + nome + "','" + dia + "/" + mes + "/" + ano + "','" + genero + "','" + classificacao + "','" + email + "','" + telefone + "'," + bla + ",'" + cep + "','" + rua + "," + bairro + "," + numero + "," + complemento + "','" + ana + "','" + obs + "');";
            System.out.println(Insert);

            stmt.executeUpdate(Insert);
            JOptionPane.showMessageDialog(null, "Dados inseridos!");
            

            con.close();

        } catch (ClassNotFoundException ex) {
            System.err.print(ex.getMessage());
        } catch (SQLException e) {
            System.err.print(e.getMessage());
        }
    }

    public static void InsertEmpresaNova() {
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

            Statement stmt = con.createStatement();

            String cnpj = TelaCadastroCliente.cnpjemp.getText();
            String nome = TelaCadastroCliente.empresaemp.getText();
            String telefone = TelaCadastroCliente.telemp.getText();

            String Insert2 = "insert into empresa values ((select coalesce (max(codemp),0)+1 from empresa), '" + nome + "', '" + telefone + "', '" + cnpj + "')";

            stmt.executeUpdate(Insert2);

            JOptionPane.showMessageDialog(null, "Dados inseridos!");

            con.close();

        } catch (ClassNotFoundException ex) {
            System.err.print(ex.getMessage());
        } catch (SQLException e) {
            System.err.print(e.getMessage());
        }
    }

    public static void EmpresaComboBoxCliente() {

        String driver = "org.postgresql.Driver";
        String user = "postgres";
        String senha = "senai";
        String url = "jdbc:postgresql://localhost:5432/sesiacademia";
        String sql = "select nomemp from empresa order by nomemp";
        try {
            Connection con = DriverManager.getConnection(url, user, senha);
            PreparedStatement banco = (PreparedStatement) con.prepareStatement(sql);
            banco.execute(); // cria o vetor

            ResultSet resultado = banco.executeQuery();

            while (resultado.next()) {
                TelaCadastroCliente.empresa.addItem(resultado.getString(1));
                TelaCadastroCliente.empresa.updateUI();

            }
            banco.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("o erro foi " + ex);
        }
    }

    public static void CadastroTreinosInsert(String Hor) {
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

            Statement stmt = con.createStatement();

            String categoria = (String) TelaCadastroTreinos.jComboBox3.getSelectedItem();
            Date dia = TelaCadastroTreinos.dia.getDate();

            if (dia == null) {
                JOptionPane.showMessageDialog(null, "Selecione um dia!");

            } else {

                if (categoria == "Musculação") {
                    String Insert = "insert into agendamentomc values ((select coalesce (max(codagemc),0)+1 from agendamentomc), \n"
                            + "'" + Hor + "',1,1,'" + dia + "',25);";
                    stmt.executeUpdate(Insert);
                } else {
                    String Insert = "insert into agendamentomf values ((select coalesce (max(codagemf),0)+1 from agendamentomf), \n"
                            + "'" + Hor + "',(select codcat from categoria where nomcat ilike '" + categoria + "'),1,'" + dia + "',12);";
                    stmt.executeUpdate(Insert);
                }
            }

            //JOptionPane.showMessageDialog(null, "Dados inseridos!");
            con.close();

        } catch (ClassNotFoundException ex) {
            System.err.print(ex.getMessage());
        } catch (SQLException e) {
            System.err.print(e.getMessage());
        }
    }

    public static void CadastroTreinosDelete(String Hor) {
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

            Statement stmt = con.createStatement();

            String categoria = (String) TelaCadastroTreinos.jComboBox3.getSelectedItem();
            Date dia = TelaCadastroTreinos.dia.getDate();

            if (dia == null) {
                JOptionPane.showMessageDialog(null, "Selecione um dia!");
                

            } else {

                if (categoria == "Musculação") {
                    String Delete = "delete from agendamentomc where hormc= '" + Hor + "' and dia ='" + dia + "'";
                    stmt.executeUpdate(Delete);
                } else {
                    String Delete = "delete from agendamentomf where hormf ='" + Hor + "' and dia='" + dia + "'";
                    stmt.executeUpdate(Delete);
                }
            }

            //JOptionPane.showMessageDialog(null, "Dados inseridos!");
            con.close();

        } catch (ClassNotFoundException ex) {
            System.err.print(ex.getMessage());
        } catch (SQLException e) {
            System.err.print(e.getMessage());
        }
    }

    public static void CadastroHorariosIDA(String HorIni, String HorFim, Integer op) {
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

            Statement stmt = con.createStatement();

            String categoria = (String) TelaCadastroTreinos.jComboBoxDialogHorario.getSelectedItem();

            if (op == 1) {
                if (categoria == "Musculação") {
                    String Insert = "insert into horariomc values((select coalesce (max(codhormc),0)+1 from horariomc),'" + HorIni + "','" + HorFim + "')";
                    stmt.executeUpdate(Insert);

                } else {
                    String Insert = "insert into horariomf values((select coalesce (max(codhormf),0)+1 from horariomf),'" + HorIni + "','" + HorFim + "')";
                    stmt.executeUpdate(Insert);

                }

            } else if (op == 2) {
                if (categoria == "Musculação") {
                    String Delete = "delete from horariomc where horariomcini = '" + HorIni + "' and horariomcfim ='" + HorFim + "'";
                    stmt.executeUpdate(Delete);
                } else {
                    String Delete = "delete from horariomf where horariomfini = '" + HorIni + "' and horariomffim ='" + HorFim + "'";
                    stmt.executeUpdate(Delete);
                }
            } else if (op == 3) {
                if (categoria == "Musculação") {
                    String Update = "update horariomc set horariomcini = '" + HorIni + "', horariomcfim ='" + HorFim + "' where horariomcini = '" + TelaCadastroTreinos.HorIniUpd + "' and horariomcfim ='" + TelaCadastroTreinos.HorFimUpd + "'";
                    System.out.println(Update);
                    stmt.executeUpdate(Update);
                } else {
                    String Update = "update horariomf set horariomfini = '" + HorIni + "', horariomffim ='" + HorFim + "' where horariomfini = '" + TelaCadastroTreinos.HorIniUpd + "' and horariomffim ='" + TelaCadastroTreinos.HorFimUpd + "'";
                    stmt.executeUpdate(Update);
                }
            }

            con.close();

        } catch (ClassNotFoundException ex) {
            System.err.print(ex.getMessage());
        } catch (SQLException e) {
            System.err.print(e.getMessage());
        }
    }

    public static void AgendaAlunosIDA(String cpf, String dia, String hor, Integer op) {
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

            Statement stmt = con.createStatement();

            String categoria = TelaAgendaTreinos.JDcat.getText();

            if (op == 1) {
                if (categoria == "Musculação") {
                    String Insert = "insert into agendacliente values((select codcli from cliente where cpf like '" + cpf + "'), \n"
                            + "'" + dia + "',null,(select codagemc from agendamentomc where dia = '" + dia + "' and hormc like '" + hor + "'), 0);";
                    System.out.println(Insert);
                    stmt.executeUpdate(Insert);

                } else {
                    String Insert = "insert into agendacliente values((select codcli from cliente where cpf like '" + cpf + "'), \n"
                            + "'" + dia + "',(select codagemf from agendamentomf where dia = '" + dia + "' and hormf like '" + hor + "'),null,0);";
                    System.out.println(Insert);
                    stmt.executeUpdate(Insert);
                    
                }

            } else if (op == 2) {

                String Delete = "delete from agendacliente where codcli= (select codcli from cliente where cpf like '" + cpf + "') \n"
                        + "and dia='" + dia + "';";

                stmt.executeUpdate(Delete);
            }

            con.close();

        } catch (ClassNotFoundException ex) {
            System.err.print(ex.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Já existe um cadastro nesse dia para o aluno!");
            System.err.print(e.getMessage());
        }
    }

    public static void CidadeComboBoxConsultaCliente() {

        String driver = "org.postgresql.Driver";
        String user = "postgres";
        String senha = "senai";
        String url = "jdbc:postgresql://localhost:5432/sesiacademia";
        String a = (String) TelaAlteracaoCliente.estado.getSelectedItem();
        String sql = "select nomcid from cidade where codest = (select codest from estado where nomest like '" + a + "') order by nomcid";
        try {
            Connection con = DriverManager.getConnection(url, user, senha);
            PreparedStatement banco = (PreparedStatement) con.prepareStatement(sql);
            banco.execute(); // cria o vetor

            ResultSet resultado = banco.executeQuery();

            while (resultado.next()) {
                TelaAlteracaoCliente.cidade.addItem(resultado.getString(1));
                TelaAlteracaoCliente.cidade.updateUI();

            }
            banco.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("o erro foi " + ex);
        }
    }

    public static void CategoriaComboBoxConsultaCliente() {

        String driver = "org.postgresql.Driver";
        String user = "postgres";
        String senha = "senai";
        String url = "jdbc:postgresql://localhost:5432/sesiacademia";
        String sql = "select nomcat from categoria ";
        try {
            Connection con = DriverManager.getConnection(url, user, senha);
            PreparedStatement banco = (PreparedStatement) con.prepareStatement(sql);
            banco.execute(); // cria o vetor

            ResultSet resultado = banco.executeQuery();

            while (resultado.next()) {
                TelaAlteracaoCliente.cate.addItem(resultado.getString(1));
                TelaAlteracaoCliente.cate.updateUI();

            }
            banco.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("o erro foi " + ex);
        }
    }

    public static void EmpresaComboBoxConsultaCliente() {

        String driver = "org.postgresql.Driver";
        String user = "postgres";
        String senha = "senai";
        String url = "jdbc:postgresql://localhost:5432/sesiacademia";
        String sql = "select nomemp from empresa order by nomemp";
        try {
            Connection con = DriverManager.getConnection(url, user, senha);
            PreparedStatement banco = (PreparedStatement) con.prepareStatement(sql);
            banco.execute(); // cria o vetor

            ResultSet resultado = banco.executeQuery();

            while (resultado.next()) {
                TelaAlteracaoCliente.emp.addItem(resultado.getString(1));
                TelaAlteracaoCliente.emp.updateUI();

            }
            banco.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("o erro foi " + ex);
        }
    }

    public static void EstadoComboBoxConsultaCliente() {

        String driver = "org.postgresql.Driver";
        String user = "postgres";
        String senha = "senai";
        String url = "jdbc:postgresql://localhost:5432/sesiacademia";
        String sql = "select nomest from estado order by nomest";
        try {
            Connection con = DriverManager.getConnection(url, user, senha);
            PreparedStatement banco = (PreparedStatement) con.prepareStatement(sql);
            banco.execute(); // cria o vetor

            ResultSet resultado = banco.executeQuery();

            while (resultado.next()) {
                TelaAlteracaoCliente.estado.addItem(resultado.getString(1));
                TelaAlteracaoCliente.estado.updateUI();

            }
            banco.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("o erro foi " + ex);
        }
    }

    public static void updateClientes() {
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

            Statement stmt = con.createStatement();

            String nome = TelaAlteracaoCliente.nome.getText();
            String cpf = TelaAlteracaoCliente.cpf.getText();
            String cep = TelaAlteracaoCliente.cep.getText();
            String datnas = TelaAlteracaoCliente.datnas.getText();

            String cidade = (String) TelaAlteracaoCliente.cidade.getSelectedItem();
            String tel = TelaAlteracaoCliente.tel.getText();
            String ana = TelaAlteracaoCliente.ana.getText();
            String end = TelaAlteracaoCliente.end.getText();
            String email = TelaAlteracaoCliente.email.getText();
            String tipo = (String) TelaAlteracaoCliente.tipo.getSelectedItem();
            String emp = (String) TelaAlteracaoCliente.emp.getSelectedItem();
            String cat = (String) TelaAlteracaoCliente.cate.getSelectedItem();
            String cla = (String) TelaAlteracaoCliente.cla.getSelectedItem();
            String obs = TelaAlteracaoCliente.obs.getText();
            String genero = (String) TelaAlteracaoCliente.gen.getSelectedItem();

            String Insert = "update cliente set nomcli = '" + nome + "', tipo = '" + tipo + "', email = '" + email + "', genero = '" + genero + "', classificacao = '" + cla + "', datnas = '" + datnas + "', celular = '" + tel + "', cep = '" + cep + "', endereco = '" + end + "', ana = '" + ana + "', obs = '" + obs + "', codcid = (select codcid from cidade where nomcid ilike '%" + cidade + "%'), codcat = (select codcat from categoria where nomcat ilike '%" + cat + "%'), codemp = (select codemp from empresa where nomemp ilike '" + emp + "') where codcli = (select codcli from cliente where cpf like '" + cpf + "');";
            stmt.executeUpdate(Insert);

            con.close();

        } catch (ClassNotFoundException ex) {
            System.err.print(ex.getMessage());
        } catch (SQLException e) {
            System.err.print(e.getMessage());
        }
    }

    public static void InsertEmpresaNovaConsulta() {
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

            Statement stmt = con.createStatement();

            String cnpj = TelaAlteracaoCliente.cnpj.getText();
            String nome = TelaAlteracaoCliente.nomemp.getText();
            String telefone = TelaAlteracaoCliente.telemp.getText();

            String Insert2 = "insert into empresa values ((select coalesce (max(codemp),0)+1 from empresa), '" + nome + "', '" + telefone + "', '" + cnpj + "')";

            stmt.executeUpdate(Insert2);

            JOptionPane.showMessageDialog(null, "Dados inseridos!");

            con.close();

        } catch (ClassNotFoundException ex) {
            System.err.print(ex.getMessage());
        } catch (SQLException e) {
            System.err.print(e.getMessage());
        }
    }
    
     public static void Teste() {

        String driver = "org.postgresql.Driver";
        String user = "postgres";
        String senha = "senai";
        String url = "jdbc:postgresql://localhost:5432/sesiacademia";
        String a = AgendaCliente.nome.getText();
       
        String sql = "select a.nomcat from categoria a, cliente b where a.codcat= b.codcat and codcli = (select codcli from cliente where nomcli ilike '"+a+"');";

        try {
            Connection con = DriverManager.getConnection(url, user, senha);
            PreparedStatement banco = (PreparedStatement) con.prepareStatement(sql);
            banco.execute(); // cria o vetor

            ResultSet resultado = banco.executeQuery();

            while (resultado.next()) {
               AgendaCliente.teste.setText(resultado.getString(1));
               AgendaCliente.teste.updateUI();
              
            }
            banco.close();

            con.close();
        } catch (SQLException ex) {
            System.out.println("o erro foi " + ex);
        }
    }

    static void updateSenha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
