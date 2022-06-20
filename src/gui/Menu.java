package gui;

import java.awt.BorderLayout;
import oracle.jrockit.jfr.events.ContentTypeImpl;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();                
        jInternalFrameMain.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameMain = new javax.swing.JInternalFrame();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu_File = new javax.swing.JMenu();
        jMenuItem_exit = new javax.swing.JMenuItem();
        jMenu_Workers = new javax.swing.JMenu();
        jMenuItemWorker = new javax.swing.JMenuItem();
        jMenu_Clients = new javax.swing.JMenu();
        jMenuItemClient = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrameMain.setVisible(true);

        javax.swing.GroupLayout jInternalFrameMainLayout = new javax.swing.GroupLayout(jInternalFrameMain.getContentPane());
        jInternalFrameMain.getContentPane().setLayout(jInternalFrameMainLayout);
        jInternalFrameMainLayout.setHorizontalGroup(
            jInternalFrameMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 855, Short.MAX_VALUE)
        );
        jInternalFrameMainLayout.setVerticalGroup(
            jInternalFrameMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
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

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrameMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrameMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem_exitActionPerformed

    private void jMenuItemWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemWorkerActionPerformed
        WorkerGUI wk= new WorkerGUI();   
        wk.setSize(2000,3500);
        wk.setLocation(0,0);
        
        jInternalFrameMain.repaint();        
        jInternalFrameMain.add(wk, BorderLayout.CENTER);
        jInternalFrameMain.setVisible(true); 

    }//GEN-LAST:event_jMenuItemWorkerActionPerformed

    private void jMenu_WorkersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_WorkersActionPerformed

    }//GEN-LAST:event_jMenu_WorkersActionPerformed

    private void jMenuItemClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClientActionPerformed

        ClientGUI cl= new ClientGUI();   
        cl.setSize(2000,3500);
        cl.setLocation(0,0);
        
        jInternalFrameMain.repaint();
        jInternalFrameMain.add(cl, BorderLayout.CENTER);
        jInternalFrameMain.setVisible(true); 
    }//GEN-LAST:event_jMenuItemClientActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrameMain;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItemClient;
    private javax.swing.JMenuItem jMenuItemWorker;
    private javax.swing.JMenuItem jMenuItem_exit;
    private javax.swing.JMenu jMenu_Clients;
    private javax.swing.JMenu jMenu_File;
    private javax.swing.JMenu jMenu_Workers;
    // End of variables declaration//GEN-END:variables
}
