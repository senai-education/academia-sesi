

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Luiz Felipe
 */
public class CadastroTreinos extends javax.swing.JFrame {
    
    
    public static String HorIniUpd;
    public static String HorFimUpd;

  
    
    public void HorariosIguais(String sql) { //Busca os horários existentes da mesma categoria

        String user = "postgres";
        String senha = "senai";
        String url = "jdbc:postgresql://localhost:5432/sesiacademia";
        try {
            Connection con = DriverManager.getConnection(url, user, senha);
            PreparedStatement banco = (PreparedStatement) con.prepareStatement(sql);
            banco.execute(); // cria o vetor

            ResultSet resultado = banco.executeQuery();
            while (resultado.next()) {
                if (resultado.getString(1).equals(Hor1.getText())) {
                    Hor1.setSelected(true);
                }
                if (resultado.getString(1).equals(Hor2.getText())) {
                    Hor2.setSelected(true);
                }
                if (resultado.getString(1).equals(Hor3.getText())) {
                    Hor3.setSelected(true);
                }
                if (resultado.getString(1).equals(Hor4.getText())) {
                    Hor4.setSelected(true);
                }
                if (resultado.getString(1).equals(Hor5.getText())) {
                    Hor5.setSelected(true);
                }
                if (resultado.getString(1).equals(Hor6.getText())) {
                    Hor6.setSelected(true);
                }
                if (resultado.getString(1).equals(Hor7.getText())) {
                    Hor7.setSelected(true);
                }
                if (resultado.getString(1).equals(Hor8.getText())) {
                    Hor8.setSelected(true);
                }
                if (resultado.getString(1).equals(Hor9.getText())) {
                    Hor9.setSelected(true);
                }
                if (resultado.getString(1).equals(Hor10.getText())) {
                    Hor10.setSelected(true);
                }
                if (resultado.getString(1).equals(Hor11.getText())) {
                    Hor11.setSelected(true);
                }
                if (resultado.getString(1).equals(Hor12.getText())) {
                    Hor12.setSelected(true);
                }
                if (resultado.getString(1).equals(Hor13.getText())) {
                    Hor13.setSelected(true);
                }
                if (resultado.getString(1).equals(Hor14.getText())) {
                    Hor14.setSelected(true);
                }

            }
            banco.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("o erro foi " + ex);
        }
    } //Busca os horários existentes da mesma categoria

    public void HorariosDiferentes(String sql) { //Busca os horários existentes da outras categorias

        String user = "postgres";
        String senha = "senai";
        String url = "jdbc:postgresql://localhost:5432/sesiacademia";
        try {
            Connection con = DriverManager.getConnection(url, user, senha);
            PreparedStatement banco = (PreparedStatement) con.prepareStatement(sql);
            banco.execute(); // cria o vetor

            ResultSet resultado = banco.executeQuery();
            while (resultado.next()) {
                if (resultado.getString(1).equals(Hor1.getText())) {
                    Hor1.setSelected(true);
                    Hor1.setEnabled(false);
                }
                if (resultado.getString(1).equals(Hor2.getText())) {
                    Hor2.setSelected(true);
                    Hor2.setEnabled(false);
                }
                if (resultado.getString(1).equals(Hor3.getText())) {
                    Hor3.setSelected(true);
                    Hor3.setEnabled(false);
                }
                if (resultado.getString(1).equals(Hor4.getText())) {
                    Hor4.setSelected(true);
                    Hor4.setEnabled(false);
                }
                if (resultado.getString(1).equals(Hor5.getText())) {
                    Hor5.setSelected(true);
                    Hor5.setEnabled(false);
                }
                if (resultado.getString(1).equals(Hor6.getText())) {
                    Hor6.setSelected(true);
                    Hor6.setEnabled(false);
                }
                if (resultado.getString(1).equals(Hor7.getText())) {
                    Hor7.setSelected(true);
                    Hor7.setEnabled(false);
                }
                if (resultado.getString(1).equals(Hor8.getText())) {
                    Hor8.setSelected(true);
                    Hor8.setEnabled(false);
                }
                if (resultado.getString(1).equals(Hor9.getText())) {
                    Hor9.setSelected(true);
                    Hor9.setEnabled(false);
                }
                if (resultado.getString(1).equals(Hor10.getText())) {
                    Hor10.setSelected(true);
                    Hor10.setEnabled(false);
                }
                if (resultado.getString(1).equals(Hor11.getText())) {
                    Hor11.setSelected(true);
                    Hor11.setEnabled(false);
                }
                if (resultado.getString(1).equals(Hor12.getText())) {
                    Hor12.setSelected(true);
                    Hor12.setEnabled(false);
                }
                if (resultado.getString(1).equals(Hor13.getText())) {
                    Hor13.setSelected(true);
                    Hor13.setEnabled(false);
                }
                if (resultado.getString(1).equals(Hor14.getText())) {
                    Hor14.setSelected(true);
                    Hor14.setEnabled(false);
                }

            }

            banco.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("o erro foi " + ex);
        }
    }  //Busca os horários existentes da outras categorias

    public void AddCheckBox(String sql) { //Confere se os horarios existem e adiciona ele às CheckBox

        String user = "postgres";
        String senha = "senai";
        String url = "jdbc:postgresql://localhost:5432/sesiacademia";
        try {
            Connection con = DriverManager.getConnection(url, user, senha);
            PreparedStatement banco = (PreparedStatement) con.prepareStatement(sql);
            banco.execute(); // cria o vetor

            ResultSet resultado = banco.executeQuery();
            ArrayList<String> horarios = new ArrayList<String>();

            while (resultado.next()) {

                horarios.add(resultado.getString(1));

            }

            if (horarios.size() > 0) {
                Hor1.setVisible(true);
                Hor1.setText(horarios.get(0));
            } else {
                Hor1.setVisible(false);
            }
            if (horarios.size() > 1) {
                Hor2.setVisible(true);
                Hor2.setText(horarios.get(1));
            } else {
                Hor2.setVisible(false);
            }
            if (horarios.size() > 2) {
                Hor3.setVisible(true);
                Hor3.setText(horarios.get(2));
            } else {
                Hor3.setVisible(false);
            }
            if (horarios.size() > 3) {
                Hor4.setVisible(true);
                Hor4.setText(horarios.get(3));
            } else {
                Hor4.setVisible(false);
            }
            if (horarios.size() > 4) {
                Hor5.setVisible(true);
                Hor5.setText(horarios.get(4));
            } else {
                Hor5.setVisible(false);
            }
            if (horarios.size() > 5) {
                Hor6.setVisible(true);
                Hor6.setText(horarios.get(5));
            } else {
                Hor6.setVisible(false);
            }
            if (horarios.size() > 6) {
                Hor7.setVisible(true);
                Hor7.setText(horarios.get(6));
            } else {
                Hor7.setVisible(false);
            }
            if (horarios.size() > 7) {
                Hor8.setVisible(true);
                Hor8.setText(horarios.get(7));
            } else {
                Hor8.setVisible(false);
            }
            if (horarios.size() > 8) {
                Hor9.setVisible(true);
                Hor9.setText(horarios.get(8));
            } else {
                Hor9.setVisible(false);
            }
            if (horarios.size() > 9) {
                Hor10.setVisible(true);
                Hor10.setText(horarios.get(9));
            } else {
                Hor10.setVisible(false);
            }
            if (horarios.size() > 10) {
                Hor11.setVisible(true);
                Hor11.setText(horarios.get(10));
            } else {
                Hor11.setVisible(false);
            }
            if (horarios.size() > 11) {
                Hor12.setVisible(true);
                Hor12.setText(horarios.get(11));
            } else {
                Hor12.setVisible(false);
            }
            if (horarios.size() > 12) {
                Hor13.setVisible(true);
                Hor13.setText(horarios.get(12));
            } else {
                Hor13.setVisible(false);
            }
            if (horarios.size() > 13) {
                Hor14.setVisible(true);
                Hor14.setText(horarios.get(13));
            } else {
                Hor14.setVisible(false);
            }

            banco.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("o erro foi " + ex);
        }
    }  //Confere se os horarios existem e adiciona ele às CheckBox

    public void LimpaHoras() {

        Hor1.setEnabled(true);
        Hor2.setEnabled(true);
        Hor3.setEnabled(true);
        Hor4.setEnabled(true);
        Hor5.setEnabled(true);
        Hor6.setEnabled(true);
        Hor7.setEnabled(true);
        Hor8.setEnabled(true);
        Hor9.setEnabled(true);
        Hor10.setEnabled(true);
        Hor11.setEnabled(true);
        Hor12.setEnabled(true);
        Hor13.setEnabled(true);
        Hor14.setEnabled(true);

        Hor1.setSelected(false);
        Hor2.setSelected(false);
        Hor3.setSelected(false);
        Hor4.setSelected(false);
        Hor5.setSelected(false);
        Hor6.setSelected(false);
        Hor7.setSelected(false);
        Hor8.setSelected(false);
        Hor9.setSelected(false);
        Hor10.setSelected(false);
        Hor11.setSelected(false);
        Hor12.setSelected(false);
        Hor13.setSelected(false);
        Hor14.setSelected(false);

    } // Limpa as ComboBox

    public void PopularJTableDialogHorario(String sql) { // Tabela para alteração dos intervalos de treino

        String driver = "org.postgresql.Driver";
        String user = "postgres";
        String senha = "senai";
        String url = "jdbc:postgresql://localhost:5432/sesiacademia";
        try {
            Connection con = DriverManager.getConnection(url, user, senha);
            PreparedStatement banco = (PreparedStatement) con.prepareStatement(sql);
            banco.execute(); // cria o vetor

            ResultSet resultado = banco.executeQuery();

            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
            model.setNumRows(0);

            while (resultado.next()) {
                model.addRow(new Object[]{
                    //retorna os dados da tabela do BD, cada campo e um coluna.
                    resultado.getString("horini"),
                    resultado.getString("horfim"),});
            }
            banco.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("o erro foi " + ex);
        }
    }  // Tabela para alteração dos intervalos de treino

    public CadastroTreinos() {
        initComponents();
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        JDqtdpes = new javax.swing.JLabel();
        JDcat = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        JDdia = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        JDhor = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jSeparator4 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabelCategoria4 = new javax.swing.JLabel();
        jComboBoxDialogHorario = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        horiniJD = new javax.swing.JFormattedTextField();
        horfimJD = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelCategoria = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<String>();
        jLabelCategoria1 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<String>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelCategoria2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelCategoria3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Hor1 = new javax.swing.JCheckBox();
        Hor2 = new javax.swing.JCheckBox();
        Hor3 = new javax.swing.JCheckBox();
        Hor4 = new javax.swing.JCheckBox();
        Hor5 = new javax.swing.JCheckBox();
        Hor6 = new javax.swing.JCheckBox();
        Hor7 = new javax.swing.JCheckBox();
        Hor14 = new javax.swing.JCheckBox();
        Hor13 = new javax.swing.JCheckBox();
        Hor12 = new javax.swing.JCheckBox();
        Hor11 = new javax.swing.JCheckBox();
        Hor10 = new javax.swing.JCheckBox();
        Hor9 = new javax.swing.JCheckBox();
        Hor8 = new javax.swing.JCheckBox();
        dia = new com.toedter.calendar.JDateChooser();
        jButton5 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        jDialog1.setBackground(new java.awt.Color(255, 255, 255));
        jDialog1.setMinimumSize(new java.awt.Dimension(485, 600));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(474, 600));

        JDqtdpes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JDqtdpes.setForeground(new java.awt.Color(50, 194, 128));
        JDqtdpes.setText("Label");

        JDcat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JDcat.setForeground(new java.awt.Color(50, 194, 128));
        JDcat.setText("Label");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setGridColor(new java.awt.Color(255, 255, 255));
        jTable2.setRowHeight(22);
        jScrollPane2.setViewportView(jTable2);

        JDdia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JDdia.setForeground(new java.awt.Color(50, 194, 128));
        JDdia.setText("Label");

        JDhor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JDhor.setForeground(new java.awt.Color(50, 194, 128));
        JDhor.setText("Label");

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Adicionar aluno");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Remover aluno");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JDcat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JDdia))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JDhor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JDqtdpes))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(174, 174, 174)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JDcat)
                    .addComponent(JDdia))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JDhor)
                    .addComponent(JDqtdpes))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jDialog2.setBackground(new java.awt.Color(255, 255, 255));
        jDialog2.setMinimumSize(new java.awt.Dimension(485, 600));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(474, 600));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Horário Inicial", "Horário Final"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setGridColor(new java.awt.Color(255, 255, 255));
        jTable3.setRowHeight(24);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setText("Adicionar horário");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setText("Remover horário");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabelCategoria4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCategoria4.setForeground(new java.awt.Color(50, 194, 128));
        jLabelCategoria4.setText("Sala:");

        jComboBoxDialogHorario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBoxDialogHorario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Musculação", "Multifuncional" }));
        jComboBoxDialogHorario.setSelectedItem(null);
        jComboBoxDialogHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDialogHorarioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("Horário Inicial");

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setText("Alterar horário");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        try {
            horiniJD.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            horfimJD.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setText("Horário Final");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelCategoria4)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxDialogHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(horiniJD)
                                        .addComponent(horfimJD, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel5)))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCategoria4)
                    .addComponent(jComboBoxDialogHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(28, 28, 28)
                        .addComponent(jButton7)
                        .addGap(33, 33, 33)
                        .addComponent(jButton8)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(horiniJD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(horfimJD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_sesi_topo2.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(816, 236));
        jLabel2.setMinimumSize(new java.awt.Dimension(816, 236));
        jLabel2.setPreferredSize(new java.awt.Dimension(816, 236));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(9, 82, 82));
        jLabel1.setText("Cadastro de Treinos");

        jLabelCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCategoria.setForeground(new java.awt.Color(9, 82, 82));
        jLabelCategoria.setText("Sala:");

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Musculação", "Multifuncional" }));
        jComboBox2.setSelectedItem(null);
        jComboBox2.setNextFocusableComponent(jComboBox3);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabelCategoria1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCategoria1.setForeground(new java.awt.Color(9, 82, 82));
        jLabelCategoria1.setText("Categoria:");

        jComboBox3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox3.setSelectedItem(null);
        jComboBox3.setNextFocusableComponent(dia);
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });

        jLabelCategoria2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCategoria2.setForeground(new java.awt.Color(9, 82, 82));
        jLabelCategoria2.setText("Data:");

        jLabelCategoria3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCategoria3.setForeground(new java.awt.Color(9, 82, 82));
        jLabelCategoria3.setText("Horários");

        jButton1.setBackground(new java.awt.Color(9, 82, 82));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("+");

        Hor1.setBackground(new java.awt.Color(255, 255, 255));
        Hor1.setForeground(new java.awt.Color(9, 82, 82));
        Hor1.setText("a");
        Hor1.setNextFocusableComponent(Hor2);
        Hor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hor1ActionPerformed(evt);
            }
        });

        Hor2.setBackground(new java.awt.Color(255, 255, 255));
        Hor2.setForeground(new java.awt.Color(9, 82, 82));
        Hor2.setText("a");
        Hor2.setNextFocusableComponent(Hor3);
        Hor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hor2ActionPerformed(evt);
            }
        });

        Hor3.setBackground(new java.awt.Color(255, 255, 255));
        Hor3.setForeground(new java.awt.Color(9, 82, 82));
        Hor3.setText("a");
        Hor3.setNextFocusableComponent(Hor4);
        Hor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hor3ActionPerformed(evt);
            }
        });

        Hor4.setBackground(new java.awt.Color(255, 255, 255));
        Hor4.setForeground(new java.awt.Color(9, 82, 82));
        Hor4.setText("a");
        Hor4.setNextFocusableComponent(Hor5);
        Hor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hor4ActionPerformed(evt);
            }
        });

        Hor5.setBackground(new java.awt.Color(255, 255, 255));
        Hor5.setForeground(new java.awt.Color(9, 82, 82));
        Hor5.setText("a");
        Hor5.setNextFocusableComponent(Hor6);
        Hor5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hor5ActionPerformed(evt);
            }
        });

        Hor6.setBackground(new java.awt.Color(255, 255, 255));
        Hor6.setForeground(new java.awt.Color(9, 82, 82));
        Hor6.setText("a");
        Hor6.setNextFocusableComponent(Hor7);
        Hor6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hor6ActionPerformed(evt);
            }
        });

        Hor7.setBackground(new java.awt.Color(255, 255, 255));
        Hor7.setForeground(new java.awt.Color(9, 82, 82));
        Hor7.setText("a");
        Hor7.setNextFocusableComponent(Hor8);
        Hor7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hor7ActionPerformed(evt);
            }
        });

        Hor14.setBackground(new java.awt.Color(255, 255, 255));
        Hor14.setText("a");
        Hor14.setNextFocusableComponent(Hor1);
        Hor14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hor14ActionPerformed(evt);
            }
        });

        Hor13.setBackground(new java.awt.Color(255, 255, 255));
        Hor13.setText("a");
        Hor13.setNextFocusableComponent(Hor14);
        Hor13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hor13ActionPerformed(evt);
            }
        });

        Hor12.setBackground(new java.awt.Color(255, 255, 255));
        Hor12.setText("a");
        Hor12.setNextFocusableComponent(Hor13);
        Hor12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hor12ActionPerformed(evt);
            }
        });

        Hor11.setBackground(new java.awt.Color(255, 255, 255));
        Hor11.setText("a");
        Hor11.setNextFocusableComponent(Hor12);
        Hor11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hor11ActionPerformed(evt);
            }
        });

        Hor10.setBackground(new java.awt.Color(255, 255, 255));
        Hor10.setText("a");
        Hor10.setNextFocusableComponent(Hor11);
        Hor10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hor10ActionPerformed(evt);
            }
        });

        Hor9.setBackground(new java.awt.Color(255, 255, 255));
        Hor9.setText("a");
        Hor9.setNextFocusableComponent(Hor10);
        Hor9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hor9ActionPerformed(evt);
            }
        });

        Hor8.setBackground(new java.awt.Color(255, 255, 255));
        Hor8.setText("a");
        Hor8.setNextFocusableComponent(Hor9);
        Hor8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hor8ActionPerformed(evt);
            }
        });

        dia.setBackground(new java.awt.Color(255, 255, 255));
        dia.setForeground(new java.awt.Color(9, 82, 82));
        dia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dia.setMinimumSize(new java.awt.Dimension(120, 27));
        dia.setNextFocusableComponent(jButton5);
        dia.setPreferredSize(new java.awt.Dimension(120, 27));
        dia.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                diaPropertyChange(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(9, 82, 82));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Gerenciar Horários");
        jButton5.setNextFocusableComponent(Hor1);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCategoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabelCategoria1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCategoria2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addGap(0, 329, Short.MAX_VALUE))
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator5)
                    .addComponent(jSeparator2)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabelCategoria3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Hor2)
                            .addComponent(Hor1)
                            .addComponent(Hor3)
                            .addComponent(Hor4)
                            .addComponent(Hor5)
                            .addComponent(Hor6)
                            .addComponent(Hor7))
                        .addGap(187, 187, 187)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Hor9)
                            .addComponent(Hor10)
                            .addComponent(Hor11)
                            .addComponent(Hor12)
                            .addComponent(Hor13)
                            .addComponent(Hor14)
                            .addComponent(Hor8))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCategoria)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCategoria1)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCategoria2))
                        .addGap(16, 16, 16)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCategoria3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Hor1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Hor2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Hor3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Hor4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Hor5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Hor6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Hor7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Hor8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Hor9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Hor10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Hor11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Hor12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Hor13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Hor14)))
                .addContainerGap(430, Short.MAX_VALUE))
        );

        jMenuBar2.setBackground(new java.awt.Color(0, 102, 102));
        jMenuBar2.setForeground(new java.awt.Color(0, 102, 102));
        jMenuBar2.setEnabled(false);
        jMenuBar2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenu3.setBackground(new java.awt.Color(0, 102, 102));
        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("Treinos");
        jMenu3.setOpaque(true);

        jMenuItem1.setBackground(new java.awt.Color(0, 204, 204));
        jMenuItem1.setText("Cadastrar/Alterar Treino");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setBackground(new java.awt.Color(0, 204, 204));
        jMenuItem2.setText("Agenda de Treinos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar2.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(0, 102, 102));
        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("Clientes");
        jMenu4.setOpaque(true);

        jMenuItem3.setText("jMenuItem3");
        jMenu4.add(jMenuItem3);

        jMenuItem4.setText("jMenuItem4");
        jMenu4.add(jMenuItem4);

        jMenuItem5.setText("jMenuItem5");
        jMenu4.add(jMenuItem5);

        jMenuBar2.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(0, 102, 102));
        jMenu5.setForeground(new java.awt.Color(255, 255, 255));
        jMenu5.setText("Sair");
        jMenu5.setOpaque(true);

        jMenuItem6.setText("jMenuItem6");
        jMenu5.add(jMenuItem6);

        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       UIManager.put("nimbusSelectionBackground", new Color(9, 82, 82));//define a cor dos menus da CB
        UIManager.put("nimbusFocus", new Color(9, 82, 82)); //Define a cor das seleções
        UIManager.put("nimbusSelection", new Color(9, 82, 82)); //Define a cor das seleções
        UIManager.put("nimbusInfoBlue", new Color(9, 82, 82)); //Define a cor das seleções
        jMenuBar2.setBorder(BorderFactory.createLineBorder(new Color(9, 82, 82)));
        jMenuBar2.setEnabled(false);
        jMenuBar2.setOpaque(true);
        Hor1.setVisible(false);
        Hor2.setVisible(false);
        Hor3.setVisible(false);
        Hor4.setVisible(false);
        Hor5.setVisible(false);
        Hor6.setVisible(false);
        Hor7.setVisible(false);
        Hor8.setVisible(false);
        Hor9.setVisible(false);
        Hor10.setVisible(false);
        Hor11.setVisible(false);
        Hor12.setVisible(false);
        Hor13.setVisible(false);
        Hor14.setVisible(false);

    }//GEN-LAST:event_formWindowOpened

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

        if (jComboBox2.getSelectedItem().equals("Musculação")) {
            jButton1.setVisible(false);
            jComboBox3.addItem("Musculação");
            this.LimpaHoras();
            jComboBox3.removeItem("Conv. Bem estar");
            jComboBox3.removeItem("Funcional");
            jComboBox3.removeItem("Pilates");
            jComboBox3.removeItem("Yoga");
            jComboBox3.updateUI();

        } else if (jComboBox2.getSelectedItem().equals("Multifuncional")) {
            jButton1.setVisible(true);
            jComboBox3.addItem("Conv. Bem estar");
            jComboBox3.addItem("Funcional");
            jComboBox3.addItem("Pilates");
            jComboBox3.addItem("Yoga");
            this.LimpaHoras();
            jComboBox3.setSelectedItem("Conv. Bem estar");

            jComboBox3.removeItem("Musculação");
            jComboBox3.updateUI();

        }


    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
        dia.setDate(null);
        this.LimpaHoras();
        if (jComboBox3.getSelectedItem().equals("Musculação")) {
            this.AddCheckBox("select concat(to_char(horariomcini, 'HH24:mi')||' - ',to_char(horariomcfim, 'HH24:mi'))as horario from horariomc order by horariomcini;");

        } else {
            this.AddCheckBox("select concat(to_char(horariomfini, 'HH24:mi')||' - ',to_char(horariomffim, 'HH24:mi'))as horario from horariomf order by horariomfini;");
        }
    }//GEN-LAST:event_jComboBox3ItemStateChanged

    //AQUI COMEÇA AS AÇÕES DAS CHECKBOX

    private void Hor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hor1ActionPerformed
        if (Hor1.isSelected() == true) {
            conexao.CadastroTreinosInsert(Hor1.getText());
        } else {
            conexao.CadastroTreinosDelete(Hor1.getText());
        }
    }//GEN-LAST:event_Hor1ActionPerformed

    private void Hor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hor2ActionPerformed
        if (Hor2.isSelected() == true) {
            conexao.CadastroTreinosInsert(Hor2.getText());
        } else {
            conexao.CadastroTreinosDelete(Hor2.getText());
        }
    }//GEN-LAST:event_Hor2ActionPerformed

    private void Hor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hor3ActionPerformed
        if (Hor3.isSelected() == true) {
            conexao.CadastroTreinosInsert(Hor3.getText());
        } else {
            conexao.CadastroTreinosDelete(Hor3.getText());
        }
    }//GEN-LAST:event_Hor3ActionPerformed

    private void Hor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hor4ActionPerformed
        if (Hor4.isSelected() == true) {
            conexao.CadastroTreinosInsert(Hor4.getText());
        } else {
            conexao.CadastroTreinosDelete(Hor4.getText());
        }
    }//GEN-LAST:event_Hor4ActionPerformed

    private void Hor5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hor5ActionPerformed
        if (Hor5.isSelected() == true) {
            conexao.CadastroTreinosInsert(Hor5.getText());
        } else {
            conexao.CadastroTreinosDelete(Hor5.getText());
        }
    }//GEN-LAST:event_Hor5ActionPerformed

    private void Hor6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hor6ActionPerformed
        if (Hor6.isSelected() == true) {
            conexao.CadastroTreinosInsert(Hor6.getText());
        } else {
            conexao.CadastroTreinosDelete(Hor6.getText());
        }
    }//GEN-LAST:event_Hor6ActionPerformed

    private void Hor7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hor7ActionPerformed
        if (Hor7.isSelected() == true) {
            conexao.CadastroTreinosInsert(Hor7.getText());
        } else {
            conexao.CadastroTreinosDelete(Hor7.getText());
        }
    }//GEN-LAST:event_Hor7ActionPerformed

    private void Hor8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hor8ActionPerformed
        if (Hor8.isSelected() == true) {
            conexao.CadastroTreinosInsert(Hor8.getText());
        } else {
            conexao.CadastroTreinosDelete(Hor8.getText());
        }
    }//GEN-LAST:event_Hor8ActionPerformed

    private void Hor9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hor9ActionPerformed
        if (Hor9.isSelected() == true) {
            conexao.CadastroTreinosInsert(Hor9.getText());
        } else {
            conexao.CadastroTreinosDelete(Hor9.getText());
        }
    }//GEN-LAST:event_Hor9ActionPerformed

    private void Hor10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hor10ActionPerformed
        if (Hor10.isSelected() == true) {
            conexao.CadastroTreinosInsert(Hor10.getText());
        } else {
            conexao.CadastroTreinosDelete(Hor10.getText());
        }
    }//GEN-LAST:event_Hor10ActionPerformed

    private void Hor11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hor11ActionPerformed
        if (Hor11.isSelected() == true) {
            conexao.CadastroTreinosInsert(Hor11.getText());
        } else {
            conexao.CadastroTreinosDelete(Hor11.getText());
        }
    }//GEN-LAST:event_Hor11ActionPerformed

    private void Hor12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hor12ActionPerformed
        if (Hor12.isSelected() == true) {
            conexao.CadastroTreinosInsert(Hor12.getText());
        } else {
            conexao.CadastroTreinosDelete(Hor12.getText());
        }
    }//GEN-LAST:event_Hor12ActionPerformed

    private void Hor13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hor13ActionPerformed
        if (Hor13.isSelected() == true) {
            conexao.CadastroTreinosInsert(Hor13.getText());
        } else {
            conexao.CadastroTreinosDelete(Hor13.getText());
        }
    }//GEN-LAST:event_Hor13ActionPerformed

    private void Hor14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hor14ActionPerformed
        if (Hor14.isSelected() == true) {
            conexao.CadastroTreinosInsert(Hor14.getText());
        } else {
            conexao.CadastroTreinosDelete(Hor14.getText());
        }
    }//GEN-LAST:event_Hor14ActionPerformed

    //AQUI TERMINA AS AÇÕES DAS CHECKBOX

    private void diaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_diaPropertyChange
        if (evt != null) {
            if (dia.getDate() != null) {

                this.LimpaHoras();
                if (jComboBox3.getSelectedItem() != null) {

                    if (jComboBox3.getSelectedItem().equals("Musculação")) {
                        this.HorariosIguais("select concat(to_char(horariomcini, 'HH24:mi')||' - ',to_char(horariomcfim, 'HH24:mi'))as horario from horariomc a, agendamentomc b, categoria c where (concat(to_char(horariomcini, 'HH24:mi')||' - ',to_char(horariomcfim, 'HH24:mi'))) = b.hormc and b.codcat = c.codcat and c.codcat=(select codcat from categoria where nomcat ilike 'Musc%')  and b.dia = '" + dia.getDate() + "'");

                    } else {
                        this.HorariosIguais("select concat(to_char(horariomfini, 'HH24:mi')||' - ',to_char(horariomffim, 'HH24:mi'))as horario from horariomf a, agendamentomf b, categoria c where (concat(to_char(horariomfini, 'HH24:mi')||' - ',to_char(horariomffim, 'HH24:mi'))) = b.hormf and b.codcat = c.codcat and c.codcat=(select codcat from categoria where nomcat ilike '" + jComboBox3.getSelectedItem() + "')  and b.dia ='" + dia.getDate() + "'");
                        this.HorariosDiferentes("select concat(to_char(horariomfini, 'HH24:mi')||' - ',to_char(horariomffim, 'HH24:mi'))as horario from horariomf a, agendamentomf b, categoria c where (concat(to_char(horariomfini, 'HH24:mi')||' - ',to_char(horariomffim, 'HH24:mi'))) = b.hormf and b.codcat = c.codcat and c.codcat!=(select codcat from categoria where nomcat ilike '" + jComboBox3.getSelectedItem() + "')  and b.dia='" + dia.getDate() + "'");

                    }
                }
            }
        }
    }//GEN-LAST:event_diaPropertyChange

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBoxDialogHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDialogHorarioActionPerformed
        if (jComboBoxDialogHorario.getSelectedItem().equals("Musculação")) {
            this.PopularJTableDialogHorario("select to_char(horariomcini, 'HH24:mi') as horini, to_char(horariomcfim, 'HH24:mi') as horfim from horariomc order by horariomcini;");
        } else {
            this.PopularJTableDialogHorario("select to_char(horariomfini, 'HH24:mi') as horini, to_char(horariomffim, 'HH24:mi') as horfim from horariomf order by horariomfini;");
        }
    }//GEN-LAST:event_jComboBoxDialogHorarioActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        conexao.CadastroHorariosIDA(horiniJD.getText(), horfimJD.getText(),2);
        
        if (jComboBoxDialogHorario.getSelectedItem().equals("Musculação")) {
            this.PopularJTableDialogHorario("select to_char(horariomcini, 'HH24:mi') as horini, to_char(horariomcfim, 'HH24:mi') as horfim from horariomc order by horariomcini;");
        } else {
            this.PopularJTableDialogHorario("select to_char(horariomfini, 'HH24:mi') as horini, to_char(horariomffim, 'HH24:mi') as horfim from horariomf order by horariomfini;");
        }
        
        if (jComboBox3.getSelectedItem().equals("Musculação")) {
            this.AddCheckBox("select concat(to_char(horariomcini, 'HH24:mi')||' - ',to_char(horariomcfim, 'HH24:mi'))as horario from horariomc order by horariomcini;");

        } else {
            this.AddCheckBox("select concat(to_char(horariomfini, 'HH24:mi')||' - ',to_char(horariomffim, 'HH24:mi'))as horario from horariomf order by horariomfini;");
        }
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        conexao.CadastroHorariosIDA(horiniJD.getText(), horfimJD.getText(),1);
        
        if (jComboBoxDialogHorario.getSelectedItem().equals("Musculação")) {
            this.PopularJTableDialogHorario("select to_char(horariomcini, 'HH24:mi') as horini, to_char(horariomcfim, 'HH24:mi') as horfim from horariomc order by horariomcini;");
        } else {
            this.PopularJTableDialogHorario("select to_char(horariomfini, 'HH24:mi') as horini, to_char(horariomffim, 'HH24:mi') as horfim from horariomf order by horariomfini;");
        }
        
        if (jComboBox3.getSelectedItem().equals("Musculação")) {
            this.AddCheckBox("select concat(to_char(horariomcini, 'HH24:mi')||' - ',to_char(horariomcfim, 'HH24:mi'))as horario from horariomc order by horariomcini;");

        } else {
            this.AddCheckBox("select concat(to_char(horariomfini, 'HH24:mi')||' - ',to_char(horariomffim, 'HH24:mi'))as horario from horariomf order by horariomfini;");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        conexao.CadastroHorariosIDA(horiniJD.getText(), horfimJD.getText(),3);
        
        if (jComboBoxDialogHorario.getSelectedItem().equals("Musculação")) {
            this.PopularJTableDialogHorario("select to_char(horariomcini, 'HH24:mi') as horini, to_char(horariomcfim, 'HH24:mi') as horfim from horariomc order by horariomcini;");
        } else {
            this.PopularJTableDialogHorario("select to_char(horariomfini, 'HH24:mi') as horini, to_char(horariomffim, 'HH24:mi') as horfim from horariomf order by horariomfini;");
        }
        
        if (jComboBox3.getSelectedItem().equals("Musculação")) {
            this.AddCheckBox("select concat(to_char(horariomcini, 'HH24:mi')||' - ',to_char(horariomcfim, 'HH24:mi'))as horario from horariomc order by horariomcini;");

        } else {
            this.AddCheckBox("select concat(to_char(horariomfini, 'HH24:mi')||' - ',to_char(horariomffim, 'HH24:mi'))as horario from horariomf order by horariomfini;");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jDialog2.setVisible(true);
        jDialog2.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int selectedRow = jTable3.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        //********** CÓDIGO PARA SUBSTITUIR OS CAMPOS DE TEXTO **********//
        horiniJD.setText(model.getValueAt(selectedRow, 0).toString());
        horfimJD.setText(model.getValueAt(selectedRow, 1).toString());
        HorIniUpd = (model.getValueAt(selectedRow, 0).toString());
        HorFimUpd = (model.getValueAt(selectedRow, 1).toString());
    }//GEN-LAST:event_jTable3MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

       // new CadastroTreinos().setVisible(true);
       // dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        new AgendaTreinos().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroTreinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroTreinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroTreinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroTreinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroTreinos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Hor1;
    private javax.swing.JCheckBox Hor10;
    private javax.swing.JCheckBox Hor11;
    private javax.swing.JCheckBox Hor12;
    private javax.swing.JCheckBox Hor13;
    private javax.swing.JCheckBox Hor14;
    private javax.swing.JCheckBox Hor2;
    private javax.swing.JCheckBox Hor3;
    private javax.swing.JCheckBox Hor4;
    private javax.swing.JCheckBox Hor5;
    private javax.swing.JCheckBox Hor6;
    private javax.swing.JCheckBox Hor7;
    private javax.swing.JCheckBox Hor8;
    private javax.swing.JCheckBox Hor9;
    private javax.swing.JLabel JDcat;
    private javax.swing.JLabel JDdia;
    private javax.swing.JLabel JDhor;
    private javax.swing.JLabel JDqtdpes;
    public static com.toedter.calendar.JDateChooser dia;
    private javax.swing.JFormattedTextField horfimJD;
    private javax.swing.JFormattedTextField horiniJD;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    public static javax.swing.JComboBox<String> jComboBox2;
    public static javax.swing.JComboBox<String> jComboBox3;
    public static javax.swing.JComboBox<String> jComboBoxDialogHorario;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelCategoria1;
    private javax.swing.JLabel jLabelCategoria2;
    private javax.swing.JLabel jLabelCategoria3;
    private javax.swing.JLabel jLabelCategoria4;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
