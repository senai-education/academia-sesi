import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juliano
 */
public class TelaConsultaCliente extends javax.swing.JInternalFrame {

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

    private void pegarResolucao() {
        //Faz a tela pegar o tamanho inteiro 
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension dimensao = t.getScreenSize();
        this.setSize((dimensao.width), (dimensao.height));

        //Elimina as bordas do Frame Interno
        setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null); //retirar o painel superior janela.setBorder(null);//retirar bordas

        //Define a cor verde para os padrões
        UIManager.put("nimbusSelectionBackground", new Color(9, 82, 82));//define a cor dos menus da CB
        UIManager.put("nimbusFocus", new Color(9, 82, 82)); //Define a cor das seleções
        UIManager.put("nimbusSelection", new Color(9, 82, 82)); //Define a cor das seleções
        UIManager.put("nimbusInfoBlue", new Color(9, 82, 82)); //Define a cor das seleções
    }

    public TelaConsultaCliente() {
        initComponents();
        pegarResolucao();

        this.PopularJTable("select a.cpf, a.nomcli, a.celular, b.nomcat from cliente a, categoria b where a.codcat=b.codcat;");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        procura = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        codigo = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cat = new javax.swing.JComboBox();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Cliente", "Telefone", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setGridColor(new java.awt.Color(255, 255, 255));
        tabela.setRowHeight(22);
        tabela.setSelectionBackground(new java.awt.Color(9, 82, 82));
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
        procura.setForeground(new java.awt.Color(9, 82, 82));
        procura.setText("Procurar");
        procura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procuraActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(9, 82, 82));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_sesi_topo2.png"))); // NOI18N

        codigo.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        codigo.setForeground(new java.awt.Color(240, 240, 240));
        codigo.setText("jLabel11");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(9, 82, 82));
        jLabel15.setText("Consulta Clientes");

        cat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Musculação", "Livre", "Funcional", "Pilates", "Ginastica", "Yoga", "Muculação Restrita", "Todos" }));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(9, 82, 82));
        jLabel19.setText("Categorias:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(1084, Short.MAX_VALUE)
                .addComponent(codigo)
                .addGap(162, 162, 162))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel19)
                        .addGap(60, 60, 60)
                        .addComponent(cat, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(procura))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel15))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(procura)
                            .addComponent(cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

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

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        if (evt.getClickCount() == 2) {
            int selectedRow = tabela.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) tabela.getModel();

            cod = model.getValueAt(selectedRow, 0).toString();
           Inicial.jDesktopPane1.removeAll();
        TelaAlteracaoCliente obj = new TelaAlteracaoCliente();
       Inicial.jDesktopPane1.add(obj);
        obj.setVisible(true);
        obj.moveToFront();

        try {
            obj.setMaximum(true);
        } catch (java.beans.PropertyVetoException e) {
        }
      
           

          //  conexao.PesquisaCliente();

        }

    }//GEN-LAST:event_tabelaMouseClicked

    private void tabelaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaMouseEntered

    private void procuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procuraActionPerformed
        if (cat.getSelectedItem().equals("Musculaçao")) {
            this.PopularJTable("select a.cpf, a.nomcli, a.celular, b.nomcat from cliente a, categoria b where a.codcat=b.codcat and b.nomcat ilike '%Musculação%'");
        }
        if (cat.getSelectedItem().equals("Pilates")) {
            this.PopularJTable("select a.cpf, a.nomcli, a.celular, b.nomcat from cliente a, categoria b where a.codcat=b.codcat and b.nomcat ilike '%Pilates%'");
        }
        if (cat.getSelectedItem().equals("Livre")) {
            this.PopularJTable("select a.cpf, a.nomcli, a.celular, b.nomcat from cliente a, categoria b where a.codcat=b.codcat and b.nomcat ilike '%Livre%'");
        }
        if (cat.getSelectedItem().equals("Funcional")) {
            this.PopularJTable("select a.cpf, a.nomcli, a.celular, b.nomcat from cliente a, categoria b where a.codcat=b.codcat and b.nomcat ilike '%Funcional%'");
        }
        if (cat.getSelectedItem().equals("Yoga")) {
            this.PopularJTable("select a.cpf, a.nomcli, a.celular, b.nomcat from cliente a, categoria b where a.codcat=b.codcat and b.nomcat ilike '%Yoga%'");
        }
        if (cat.getSelectedItem().equals("Musculação Restrita")) {
            this.PopularJTable("select a.cpf, a.nomcli, a.celular, b.nomcat from cliente a, categoria b where a.codcat=b.codcat and b.nomcat ilike '%Restrita%'");
        }
        if (cat.getSelectedItem().equals("Ginástica")) {
            this.PopularJTable("select a.cpf, a.nomcli, a.celular, b.nomcat from cliente a, categoria b where a.codcat=b.codcat and b.nomcat ilike '%Ginástica%'");
        }

        if (cat.getSelectedItem().equals("Todos")) {
            this.PopularJTable("select a.cpf, a.nomcli, a.celular, b.nomcat from cliente a, categoria b where a.codcat=b.codcat");
        }

    }//GEN-LAST:event_procuraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cat;
    public static javax.swing.JLabel codigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton procura;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}