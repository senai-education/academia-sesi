


import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Agendamento extends javax.swing.JFrame {

    public Agendamento() {
        initComponents();
        jPanel1.setFocusable(true); //Não seleciona nenhuma caixa de texto quando a tela é aberta
    }

    //********** INÍCIO DO MÉTODO PARA PUXAR DADOS DO BANCO **********//
    public void PopularJTable(String sql) {

        String driver = "org.postgresql.Driver";
        String user = "postgres";
        String senha = "senai";
        String url = "jdbc:postgresql://localhost:5432/sesiacademia";
        try {
            Connection con = DriverManager.getConnection(url, user, senha);
            PreparedStatement banco = (PreparedStatement) con.prepareStatement(sql);
            banco.execute(); // cria o vetor

            ResultSet resultado = banco.executeQuery();

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setNumRows(0);

            while (resultado.next()) {
                model.addRow(new Object[]{
                    //retorna os dados da tabela do BD, cada campo e um coluna.
                    // resultado.getString("codage"),
                    resultado.getString("nomcat"),
                    // resultado.getString("dia"),
                    resultado.getString("horario"),
                    resultado.getString("qtdpes"),});
            }
            banco.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("o erro foi " + ex);
        }
    }  //********** FIM DO MÉTODO PARA PUXAR DADOS DO BANCO **********//

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cat = new javax.swing.JTextField();
        dia = new javax.swing.JTextField();
        hor = new javax.swing.JTextField();
        vag = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jLabel10 = new javax.swing.JLabel();
        USU = new javax.swing.JLabel();
        sair = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        categoria = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabelCategoria = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<String>();

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(50, 194, 128));
        jLabel4.setText("Confirmação de Agendamento");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(50, 194, 128));
        jLabel5.setText("Categoria:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(50, 194, 128));
        jLabel6.setText("Dia:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(50, 194, 128));
        jLabel7.setText("Horário:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(50, 194, 128));
        jLabel8.setText("Vagas:");

        cat.setEditable(false);
        cat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cat.setSelectionColor(new java.awt.Color(50, 194, 128));

        dia.setEditable(false);
        dia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dia.setSelectionColor(new java.awt.Color(50, 194, 128));

        hor.setEditable(false);
        hor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hor.setSelectionColor(new java.awt.Color(50, 194, 128));

        vag.setEditable(false);
        vag.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        vag.setSelectionColor(new java.awt.Color(50, 194, 128));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(50, 194, 128));
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(50, 194, 128));
        jButton2.setText("Confirmar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cat, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vag, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(102, 102, 102)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(35, 35, 35))
        );

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sesi_Logo.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(50, 194, 128));
        jLabel1.setText("Agendamento de Treino");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(50, 194, 128));
        jLabel3.setText("Dia:");

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Categoria", "Horário", "Vagas Restantes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(50, 194, 128));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox1.setSelectedItem(null);
        jComboBox1.setNextFocusableComponent(jButton3);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(50, 194, 128));
        jLabel10.setText("Usuário:");

        USU.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        USU.setForeground(new java.awt.Color(50, 194, 128));
        USU.setText("jLabel11");

        sair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sair.setForeground(new java.awt.Color(50, 194, 128));
        sair.setText("Sair");
        sair.setToolTipText("");
        sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(50, 194, 128));
        jLabel11.setText("Categoria:");

        categoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        categoria.setForeground(new java.awt.Color(50, 194, 128));
        categoria.setText("jLabel12");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(50, 194, 128));
        jButton3.setText("Sua Agenda");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabelCategoria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCategoria.setForeground(new java.awt.Color(50, 194, 128));
        jLabelCategoria.setText("Categoria:");

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Musculação", "Pilates" }));
        jComboBox2.setSelectedItem("Musculação");
        jComboBox2.setNextFocusableComponent(jComboBox1);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
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
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                .addGap(403, 403, 403))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCategoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(sair)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10))
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(USU)
                                    .addComponent(categoria)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)))
                        .addGap(15, 15, 15))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(USU)
                            .addComponent(sair))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(categoria))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCategoria)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        //conexao.categoriaCliente();
        this.setLocationRelativeTo(null); //Centraliza o JFrame
//        conexao.dataComboBoxAgendamento(); //Pega as datas da semana
        sair.setText("<HTML><U>Sair</U></HTML>"); //Sublinha a label de sair

    }//GEN-LAST:event_formWindowOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        jDialog1.setVisible(true); //Abre o JDialog
        jDialog1.setSize(new Dimension(614, 491)); //Abre o JDialog no tamanho certo
        jDialog1.setLocationRelativeTo(null); //Centraliza o JDialog

        //********** CÓDIGO PARA PEGAR OS DADOS DA TABELA **********//
        int selectedRow = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        //********** CÓDIGO PARA SUBSTITUIR OS CAMPOS DE TEXTO **********//
        dia.setText(jComboBox1.getSelectedItem().toString());
        cat.setText(model.getValueAt(selectedRow, 0).toString());
        //dia.setText(model.getValueAt(selectedRow, 2).toString());
        hor.setText(model.getValueAt(selectedRow, 1).toString());
        vag.setText(model.getValueAt(selectedRow, 2).toString());


    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jDialog1.setVisible(false); //Fecha a tela de confirmação

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        String data = jComboBox1.getSelectedItem().toString(); //Seleciona o dia da ComboBox Data
        //Atualiza a tabela de acordo com o dia especificado pelo usuário
        switch (categoria.getText()) {
            case "1": //Verifica se a categoria é Musculação

                this.PopularJTable("select a.codage, c.nomcat, a.dia, b.horario, a.qtdpes from agendamentomc a, categoria c, horariomc b, where a.codhor=b.codhor and c.codcat=a.codcat and c.codcat = 1 and a.dia = '" + data + "' and a.qtdpes > 0 order by a.codage asc");
               // this.PopularJTable("select a.codage, c.nomcat, a.dia, b.horario, a.qtdpes from agendamento a, categoria c, horario b, cliente d where a.codhor=b.codhor and c.codcat=a.codcat and d.codcat = c.codcat and c.codcat = 1 and a.dia = '" + data + "' and a.qtdpes > 0 order by a.codage asc");
                
                jComboBox2.setVisible(false); //Não mostra a ComboBox de Categoria
                jLabelCategoria.setVisible(false); //Não mostra a jLabel de Categoria
                break;

            case "2": //Verifica se a categoria é Pilates

                this.PopularJTable("select a.codage, c.nomcat, a.dia, b.horario, a.qtdpes from agendamento a, categoria c, horario b, cliente d where a.codhor=b.codhor and c.codcat=a.codcat and d.codcat = c.codcat and c.codcat = 2 and a.dia = '" + data + "' and a.qtdpes > 0 order by a.codage asc");
                jComboBox2.setVisible(false); //Não mostra a ComboBox de Categoria
                jLabelCategoria.setVisible(false); //Não mostra a jLabel de Categoria
                break;

            default: //Categoria é Livre

                if (jComboBox2.getSelectedItem().toString().equals("Musculação")) { //Verifica se a ComboBox de Categoria está selecionada em 'Musculação'

                    this.PopularJTable("select a.codage, c.nomcat, a.dia, b.horario, a.qtdpes from agendamentomc a, categoria c, horariomc b where a.codhor=b.codhor and c.codcat=a.codcat and c.codcat = 1 and a.dia = '"+data+"' and a.qtdpes > 0  group by a.codage, c.nomcat, a.dia, b.horario, a.qtdpes order by a.codage asc;");

                } else { //ComboBox de Categoria está selecionada em 'Pilates'

                    this.PopularJTable("select a.codage, c.nomcat, a.dia, b.horario, a.qtdpes from agendamento a, categoria c, horario b, cliente d where a.codhor=b.codhor and c.codcat=a.codcat and c.codcat = 2 and a.dia = '"+data+"' and a.qtdpes > 0  group by a.codage, c.nomcat, a.dia, b.horario, a.qtdpes order by a.codage asc;");

                }
                break;
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked

        dispose(); //Fecha a janela
        new Login().setVisible(true); //Abre a tela de Login

    }//GEN-LAST:event_sairMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

//        conexao.insertAgendamento(); //Insere o agendamento no BD
        //cod.setText(""); //Limpa o campo código
        dia.setText(""); //Limpa o campo dia
        hor.setText(""); //Limpa o campo horário
        vag.setText(""); //Limpa o campo vagas disponíveis
        cat.setText(""); //Limpa o campo categoria

        jDialog1.setVisible(false); //Fecha a tela de confirmaçãoobr

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        new AgendamentoConsulta().setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

        String data = jComboBox1.getSelectedItem().toString(); //Seleciona o dia da ComboBox Data

        if (jComboBox2.getSelectedItem().toString().equals("Musculação")) { //Verifica se a ComboBox de Categoria está selecionada em 'Musculação'

            this.PopularJTable("select a.codage, c.nomcat, a.dia, b.horario, a.qtdpes from agendamento a, categoria c, horario b, cliente d where a.codhor=b.codhor and c.codcat=a.codcat and c.codcat = 1 and a.dia = '"+data+"' and a.qtdpes > 0  group by a.codage, c.nomcat, a.dia, b.horario, a.qtdpes order by a.codage asc;");

        } else { //ComboBox de Categoria está selecionada em 'Pilates'

            this.PopularJTable("select a.codage, c.nomcat, a.dia, b.horario, a.qtdpes from agendamento a, categoria c, horario b, cliente d where a.codhor=b.codhor and c.codcat=a.codcat and c.codcat = 2 and a.dia = '"+data+"' and a.qtdpes > 0  group by a.codage, c.nomcat, a.dia, b.horario, a.qtdpes order by a.codage asc;");

        }

    }//GEN-LAST:event_jComboBox2ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agendamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel USU;
    public static javax.swing.JTextField cat;
    public static javax.swing.JLabel categoria;
    public static javax.swing.JTextField dia;
    public static javax.swing.JTextField hor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public static javax.swing.JComboBox<String> jComboBox1;
    public static javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel sair;
    public static javax.swing.JTextField vag;
    // End of variables declaration//GEN-END:variables
}
