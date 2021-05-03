
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;


public class ConsultaCliente extends javax.swing.JFrame {

    public static String cod;
    
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

            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.setNumRows(0);

            while (resultado.next()) {
                model.addRow(new Object[]{
                    //retorna os dados da tabela do BD, cada campo e um coluna.
                    resultado.getString("cpf"),
                    resultado.getString("nomcli"),
                    resultado.getString("celular"),
                    resultado.getString("nomcat")
                    
                  
                });
            }
            banco.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("o erro foi " + ex);
        }
    }
    
    public ConsultaCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        cpf = new javax.swing.JLabel();
        cliente = new javax.swing.JLabel();
        cidade = new javax.swing.JLabel();
        endereco = new javax.swing.JLabel();
        datnas = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        telefone = new javax.swing.JLabel();
        categoria = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        empresa = new javax.swing.JLabel();
        tipo = new javax.swing.JLabel();
        classi = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        CEP = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        procura = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        musc = new javax.swing.JRadioButton();
        pila = new javax.swing.JRadioButton();
        livre = new javax.swing.JRadioButton();
        todos = new javax.swing.JRadioButton();
        codigo = new javax.swing.JLabel();
        yoga = new javax.swing.JRadioButton();
        func = new javax.swing.JRadioButton();
        conv = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();

        jDialog1.setMinimumSize(new java.awt.Dimension(857, 536));
        jDialog1.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                jDialog1WindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(857, 536));
        jPanel2.setMinimumSize(new java.awt.Dimension(857, 536));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(50, 194, 128));
        jLabel2.setText("Estado:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(50, 194, 128));
        jLabel3.setText("CPF:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(50, 194, 128));
        jLabel4.setText("Nome:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(50, 194, 128));
        jLabel5.setText("Cidade:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(50, 194, 128));
        jLabel7.setText("Endereço:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(50, 194, 128));
        jLabel8.setText("Data de Nascimento:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(50, 194, 128));
        jLabel9.setText("Email:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(50, 194, 128));
        jLabel10.setText("Telefone:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(50, 194, 128));
        jLabel12.setText("Categoria");

        estado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        estado.setText("estado");

        cpf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cpf.setText("cpf");

        cliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cliente.setText("nome");

        cidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cidade.setText("cidade");

        endereco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        endereco.setText("endreco");

        datnas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        datnas.setText("datnas");

        email.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        email.setText("email");

        telefone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        telefone.setText("tel");

        categoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        categoria.setText("cat");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(50, 194, 128));
        jLabel11.setText("Empresa:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(50, 194, 128));
        jLabel13.setText("Tipo:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(50, 194, 128));
        jLabel14.setText("Classificação:");

        empresa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        empresa.setText("emp");

        tipo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tipo.setText("tipo");

        classi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        classi.setText("class");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(50, 194, 128));
        jLabel16.setText("CEP:");

        CEP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CEP.setText("cep");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sesi_Logo.png"))); // NOI18N
        jLabel17.setText("jLabel17");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(50, 194, 128));
        jLabel18.setText("Informações do Cliente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(endereco)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cidade)
                                    .addComponent(datnas)
                                    .addComponent(estado)
                                    .addComponent(cpf)
                                    .addComponent(cliente)
                                    .addComponent(CEP))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel14))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(classi)
                                    .addComponent(telefone)
                                    .addComponent(email)
                                    .addComponent(tipo)
                                    .addComponent(empresa)
                                    .addComponent(categoria)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(jLabel18)
                        .addGap(0, 212, Short.MAX_VALUE)))
                .addGap(103, 103, 103))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cliente)
                    .addComponent(jLabel10)
                    .addComponent(telefone))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cpf)
                    .addComponent(jLabel9)
                    .addComponent(email))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(estado)
                    .addComponent(tipo)
                    .addComponent(jLabel13))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cidade)
                    .addComponent(jLabel11)
                    .addComponent(empresa))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(categoria)
                    .addComponent(jLabel8)
                    .addComponent(datnas))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(CEP))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(classi)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(endereco))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jRadioButton2.setText("jRadioButton2");

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setNextFocusableComponent(func);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Cliente", "Telefone", "Categoria"
            }
        ));
        tabela.setRowHeight(22);
        tabela.setSelectionBackground(new java.awt.Color(50, 194, 128));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabelaMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        procura.setBackground(new java.awt.Color(255, 255, 255));
        procura.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        procura.setForeground(new java.awt.Color(50, 194, 128));
        procura.setText("Procurar");
        procura.setNextFocusableComponent(func);
        procura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procuraActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(50, 194, 128));
        jLabel1.setText("Categoria:");

        musc.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(musc);
        musc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        musc.setForeground(new java.awt.Color(50, 194, 128));
        musc.setText("Musculação");
        musc.setNextFocusableComponent(conv);

        pila.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(pila);
        pila.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pila.setForeground(new java.awt.Color(50, 194, 128));
        pila.setText("Pilates");
        pila.setNextFocusableComponent(yoga);

        livre.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(livre);
        livre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        livre.setForeground(new java.awt.Color(50, 194, 128));
        livre.setText("Livre");
        livre.setNextFocusableComponent(todos);

        todos.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(todos);
        todos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        todos.setForeground(new java.awt.Color(50, 194, 128));
        todos.setText("Todos");
        todos.setNextFocusableComponent(procura);

        codigo.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        codigo.setForeground(new java.awt.Color(240, 240, 240));
        codigo.setText("jLabel11");

        yoga.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(yoga);
        yoga.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        yoga.setForeground(new java.awt.Color(50, 194, 128));
        yoga.setText("Yoga");
        yoga.setNextFocusableComponent(livre);

        func.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(func);
        func.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        func.setForeground(new java.awt.Color(50, 194, 128));
        func.setText("Funcional");
        func.setNextFocusableComponent(musc);

        conv.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(conv);
        conv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        conv.setForeground(new java.awt.Color(50, 194, 128));
        conv.setText("Conv. Bem Estar");
        conv.setNextFocusableComponent(pila);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sesi_Logo.png"))); // NOI18N
        jLabel15.setText("jLabel15");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(musc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                .addComponent(pila)
                                .addGap(4, 4, 4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(func)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(conv)
                                .addGap(48, 48, 48)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yoga)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(livre)))
                        .addGap(3, 3, 3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(112, 112, 112)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(codigo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(todos))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(procura)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(procura))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 42, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yoga)
                            .addComponent(todos)
                            .addComponent(conv)
                            .addComponent(func))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(pila)
                                .addComponent(livre))
                            .addComponent(musc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.PopularJTable("select a.cpf, a.nomcli, a.celular, b.nomcat from cliente a, categoria b where a.codcat=b.codcat;");
        
    }//GEN-LAST:event_formWindowOpened

    private void procuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procuraActionPerformed
        if (musc.isSelected()) {
            this.PopularJTable("select a.cpf, a.nomcli, a.celular, b.nomcat from cliente a, categoria b where a.codcat=b.codcat and b.nomcat ilike '%Musculacao%'");
                    }
         if (pila.isSelected()) {
            this.PopularJTable("select a.cpf, a.nomcli, a.celular, b.nomcat from cliente a, categoria b where a.codcat=b.codcat and b.nomcat ilike '%Pilates%'");
                    }
         if (livre.isSelected()) {
            this.PopularJTable("select a.cpf, a.nomcli, a.celular, b.nomcat from cliente a, categoria b where a.codcat=b.codcat and b.nomcat ilike '%Livre%'");
                    }
         if (func.isSelected()) {
            this.PopularJTable("select a.cpf, a.nomcli, a.celular, b.nomcat from cliente a, categoria b where a.codcat=b.codcat and b.nomcat ilike '%Funcional%'");
                    }
         if (yoga.isSelected()) {
            this.PopularJTable("select a.cpf, a.nomcli, a.celular, b.nomcat from cliente a, categoria b where a.codcat=b.codcat and b.nomcat ilike '%Yoga%'");
                    }
         if (conv.isSelected()) {
            this.PopularJTable("select a.cpf, a.nomcli, a.celular, b.nomcat from cliente a, categoria b where a.codcat=b.codcat and b.nomcat ilike '%Conv. Bem Estar%'");
                    }
         
         if (todos.isSelected()) {
            this.PopularJTable("select a.cpf, a.nomcli, a.celular, b.nomcat from cliente a, categoria b where a.codcat=b.codcat");
                    }
         
    }//GEN-LAST:event_procuraActionPerformed

    private void jDialog1WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jDialog1WindowOpened
      
    }//GEN-LAST:event_jDialog1WindowOpened

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        if(evt.getClickCount()==2){
            int selectedRow = tabela.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
       
        cod = model.getValueAt(selectedRow, 0).toString();
        
        jDialog1.setVisible(true); 
        jDialog1.setLocationRelativeTo(null);
        conexao.PesquisaCliente();
        System.out.println(cod);
        }
        
    }//GEN-LAST:event_tabelaMouseClicked

    private void tabelaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel CEP;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JLabel categoria;
    public static javax.swing.JLabel cidade;
    public static javax.swing.JLabel classi;
    public static javax.swing.JLabel cliente;
    public static javax.swing.JLabel codigo;
    private javax.swing.JRadioButton conv;
    public static javax.swing.JLabel cpf;
    public static javax.swing.JLabel datnas;
    public static javax.swing.JLabel email;
    public static javax.swing.JLabel empresa;
    public static javax.swing.JLabel endereco;
    public static javax.swing.JLabel estado;
    private javax.swing.JRadioButton func;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton livre;
    private javax.swing.JRadioButton musc;
    private javax.swing.JRadioButton pila;
    private javax.swing.JButton procura;
    private javax.swing.JTable tabela;
    public static javax.swing.JLabel telefone;
    public static javax.swing.JLabel tipo;
    private javax.swing.JRadioButton todos;
    private javax.swing.JRadioButton yoga;
    // End of variables declaration//GEN-END:variables
}
