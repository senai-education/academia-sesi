
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.MouseMotionListener;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Luiz Felipe
 */
public class Inicial extends javax.swing.JFrame {

    public Inicial() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuCadTreino = new javax.swing.JMenuItem();
        jMenuAgeTreino = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuCadCli = new javax.swing.JMenuItem();
        jMenuAltCli = new javax.swing.JMenuItem();
        jMenuAltSen = new javax.swing.JMenuItem();
        jMenuAgeSen = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jDesktopPane1.setAutoscrolls(true);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 725, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 421, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        jMenuBar2.setBackground(new java.awt.Color(0, 102, 102));
        jMenuBar2.setForeground(new java.awt.Color(0, 102, 102));
        jMenuBar2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuBar2.setOpaque(false);

        jMenu3.setBackground(new java.awt.Color(0, 102, 102));
        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("Treinos");

        jMenuCadTreino.setBackground(new java.awt.Color(0, 204, 204));
        jMenuCadTreino.setText("Cadastrar/Alterar Treino");
        jMenuCadTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadTreinoActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuCadTreino);

        jMenuAgeTreino.setBackground(new java.awt.Color(0, 204, 204));
        jMenuAgeTreino.setText("Agenda de Treinos");
        jMenuAgeTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAgeTreinoActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuAgeTreino);

        jMenuBar2.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(0, 102, 102));
        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("Clientes");

        jMenuCadCli.setText("Cadastrar Cliente");
        jMenuCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadCliActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuCadCli);

        jMenuAltCli.setText("Consultar/Alterar Cliente");
        jMenuAltCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAltCliActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuAltCli);

        jMenuAltSen.setText("Alterar Senha");
        jMenuAltSen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAltSenActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuAltSen);

        jMenuAgeSen.setText("Agenda do Cliente");
        jMenuAgeSen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAgeSenActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuAgeSen);

        jMenuBar2.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(0, 102, 102));
        jMenu5.setForeground(new java.awt.Color(255, 255, 255));
        jMenu5.setText("Sair");

        jMenuSair.setText("Sair");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuSair);

        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCadTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadTreinoActionPerformed

        jDesktopPane1.removeAll();
        TelaCadastroTreinos obj = new TelaCadastroTreinos();
        jDesktopPane1.add(obj);
        obj.setVisible(true);
        obj.moveToFront();

        try {
            obj.setMaximum(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }//GEN-LAST:event_jMenuCadTreinoActionPerformed

    private void jMenuAgeTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAgeTreinoActionPerformed
        jDesktopPane1.removeAll();
        TelaAgendaTreinos obj = new TelaAgendaTreinos();
        jDesktopPane1.add(obj);
        obj.setVisible(true);
        obj.moveToFront();

        try {
            obj.setMaximum(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }//GEN-LAST:event_jMenuAgeTreinoActionPerformed

    private void jMenuCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadCliActionPerformed
        jDesktopPane1.removeAll();
        TelaCadastroCliente obj = new TelaCadastroCliente();
        jDesktopPane1.add(obj);
        obj.setVisible(true);
        obj.moveToFront();

        try {
            obj.setMaximum(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }//GEN-LAST:event_jMenuCadCliActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        UIManager.put("nimbusSelectionBackground", new Color(9, 82, 82));//define a cor dos menus da CB
        UIManager.put("nimbusFocus", new Color(9, 82, 82)); //Define a cor das seleções
        UIManager.put("nimbusSelection", new Color(9, 82, 82)); //Define a cor das seleções
        UIManager.put("nimbusInfoBlue", new Color(9, 82, 82)); //Define a cor das seleções
        jMenuBar2.setBorder(BorderFactory.createLineBorder(new Color(9, 82, 82)));
        jMenuBar2.setEnabled(false);
        jMenuBar2.setOpaque(true);
    }//GEN-LAST:event_formWindowOpened

    private void jMenuAltCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAltCliActionPerformed
        jDesktopPane1.removeAll();
        TelaConsultaCliente obj = new TelaConsultaCliente();
        jDesktopPane1.add(obj);
        obj.setVisible(true);
        obj.moveToFront();

        try {
            obj.setMaximum(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }//GEN-LAST:event_jMenuAltCliActionPerformed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged

    }//GEN-LAST:event_formWindowStateChanged

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        jDesktopPane1.removeAll();
        dispose(); //Fecha a janela
        new Login().setVisible(true);
    }//GEN-LAST:event_jMenuSairActionPerformed

    private void jMenuAltSenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAltSenActionPerformed
      jDesktopPane1.removeAll();
        TelaAlteracaoSenha obj = new TelaAlteracaoSenha();
        jDesktopPane1.add(obj);
        obj.setVisible(true);
        obj.moveToFront();

        try {
            obj.setMaximum(true);
        } catch (java.beans.PropertyVetoException e) {
        }
        
        
    }//GEN-LAST:event_jMenuAltSenActionPerformed

    private void jMenuAgeSenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAgeSenActionPerformed
         jDesktopPane1.removeAll();
        AgendaCliente obj = new AgendaCliente();
        jDesktopPane1.add(obj);
        obj.setVisible(true);
        obj.moveToFront();

        try {
            obj.setMaximum(true);
        } catch (java.beans.PropertyVetoException e) {
        }
        
    }//GEN-LAST:event_jMenuAgeSenActionPerformed

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
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Inicial().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuAgeSen;
    private javax.swing.JMenuItem jMenuAgeTreino;
    private javax.swing.JMenuItem jMenuAltCli;
    private javax.swing.JMenuItem jMenuAltSen;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuCadCli;
    private javax.swing.JMenuItem jMenuCadTreino;
    private javax.swing.JMenuItem jMenuSair;
    // End of variables declaration//GEN-END:variables
}