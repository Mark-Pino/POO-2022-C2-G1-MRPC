package gui;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {
ImageIcon icon= new  ImageIcon(getClass().getResource("/img/logoventasperu.jpg"));
Image image=icon.getImage();
    
    public Menu() {
        initComponents();                
        jDesktopPanePrincipal.setVisible(true);
        setTitle("Sistema de ventas");
        
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPanePrincipal = new javax.swing.JDesktopPane();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu_File = new javax.swing.JMenu();
        jMenuItem_exit = new javax.swing.JMenuItem();
        jMenu_Workers = new javax.swing.JMenu();
        jMenuItemWorker = new javax.swing.JMenuItem();
        jMenu_Clients = new javax.swing.JMenu();
        jMenuItemClient = new javax.swing.JMenuItem();
        jMenuSales = new javax.swing.JMenu();
        jMenuItemSalesRegister = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPanePrincipalLayout = new javax.swing.GroupLayout(jDesktopPanePrincipal);
        jDesktopPanePrincipal.setLayout(jDesktopPanePrincipalLayout);
        jDesktopPanePrincipalLayout.setHorizontalGroup(
            jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1066, Short.MAX_VALUE)
        );
        jDesktopPanePrincipalLayout.setVerticalGroup(
            jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
        );

        jMenu_File.setText("File");

        jMenuItem_exit.setText("Exit");
        jMenuItem_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_exitActionPerformed(evt);
            }
        });
        jMenu_File.add(jMenuItem_exit);

        jMenuBar.add(jMenu_File);

        jMenu_Workers.setText("Workers");
        jMenu_Workers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_WorkersActionPerformed(evt);
            }
        });

        jMenuItemWorker.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemWorker.setText("Register");
        jMenuItemWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemWorkerActionPerformed(evt);
            }
        });
        jMenu_Workers.add(jMenuItemWorker);

        jMenuBar.add(jMenu_Workers);

        jMenu_Clients.setText("Clients");

        jMenuItemClient.setText("Register");
        jMenuItemClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClientActionPerformed(evt);
            }
        });
        jMenu_Clients.add(jMenuItemClient);

        jMenuBar.add(jMenu_Clients);

        jMenuSales.setText("Sales");

        jMenuItemSalesRegister.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSalesRegister.setText("SalesRegister");
        jMenuItemSalesRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalesRegisterActionPerformed(evt);
            }
        });
        jMenuSales.add(jMenuItemSalesRegister);

        jMenuBar.add(jMenuSales);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanePrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanePrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void paintComponent(Graphics g){
            g.drawImage(image,0,0,getWidth(),getHeight(),this);
    }
    
    private void jMenuItem_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem_exitActionPerformed
  
    private void jMenuItemWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemWorkerActionPerformed
        JIFWorkerGUI jwk= new JIFWorkerGUI();
        jDesktopPanePrincipal.removeAll();
        jDesktopPanePrincipal.add(jwk);
        jwk.show();
    }//GEN-LAST:event_jMenuItemWorkerActionPerformed

    private void jMenu_WorkersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_WorkersActionPerformed
    
    }//GEN-LAST:event_jMenu_WorkersActionPerformed
    
    private void jMenuItemClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClientActionPerformed
        JIFClientGUI  jcl= new JIFClientGUI(); 
        jDesktopPanePrincipal.removeAll();
        jDesktopPanePrincipal.add(jcl);
        jcl.show();  
    }//GEN-LAST:event_jMenuItemClientActionPerformed

    private void jMenuItemSalesRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalesRegisterActionPerformed
        
    }//GEN-LAST:event_jMenuItemSalesRegisterActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPanePrincipal;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItemClient;
    private javax.swing.JMenuItem jMenuItemSalesRegister;
    private javax.swing.JMenuItem jMenuItemWorker;
    private javax.swing.JMenuItem jMenuItem_exit;
    private javax.swing.JMenu jMenuSales;
    private javax.swing.JMenu jMenu_Clients;
    private javax.swing.JMenu jMenu_File;
    private javax.swing.JMenu jMenu_Workers;
    // End of variables declaration//GEN-END:variables
}
