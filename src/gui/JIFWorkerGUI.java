package gui;

import entities.Worker;
import javax.swing.JOptionPane;
import resources.Resources;
import implement.ImplPerson;
import javax.swing.table.DefaultTableModel;

public class JIFWorkerGUI extends javax.swing.JInternalFrame {
    DefaultTableModel modelo;
    ImplPerson ip = new ImplPerson();   
    public JIFWorkerGUI() {
        initComponents();
        ReporteDataDB();
        jButtonActualizar.setVisible(false);
        jButtonDelete.setVisible(false);
        jTextField_id.setVisible(false);
        jPanelFormulario.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelFormulario = new javax.swing.JPanel();
        jLabel_titulo = new javax.swing.JLabel();
        jLabel_nombre = new javax.swing.JLabel();
        jLabel_paterno = new javax.swing.JLabel();
        jLabel_materno = new javax.swing.JLabel();
        jLabel_nro = new javax.swing.JLabel();
        jLabel_nro1 = new javax.swing.JLabel();
        jLabel_nro2 = new javax.swing.JLabel();
        jTextField_nombres = new javax.swing.JTextField();
        jTextField_materno = new javax.swing.JTextField();
        jTextField_paterno = new javax.swing.JTextField();
        jTextField_usuario = new javax.swing.JTextField();
        jTextField_numero = new javax.swing.JTextField();
        jPasswordField_paswd = new javax.swing.JPasswordField();
        jButton_grabar = new javax.swing.JButton();
        jTextField_id = new javax.swing.JTextField();
        jButtonActualizar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableWorkers = new javax.swing.JTable();

        jLabel_titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_titulo.setForeground(new java.awt.Color(255, 115, 96));
        jLabel_titulo.setText("Formulario Trabajador");
        jLabel_titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre.setForeground(new java.awt.Color(255, 115, 96));
        jLabel_nombre.setText("Nombres:");

        jLabel_paterno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_paterno.setForeground(new java.awt.Color(255, 115, 96));
        jLabel_paterno.setText("Ap. Paterno:");

        jLabel_materno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_materno.setForeground(new java.awt.Color(255, 115, 96));
        jLabel_materno.setText("Ap. Materno:");

        jLabel_nro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nro.setForeground(new java.awt.Color(255, 115, 96));
        jLabel_nro.setText("Nro Ruc / Dni:");

        jLabel_nro1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nro1.setForeground(new java.awt.Color(255, 115, 96));
        jLabel_nro1.setText("Usuario:");

        jLabel_nro2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nro2.setForeground(new java.awt.Color(255, 115, 96));
        jLabel_nro2.setText("Contraseña:");

        jButton_grabar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_grabar.setForeground(new java.awt.Color(255, 115, 96));
        jButton_grabar.setText("Grabar");
        jButton_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_grabarActionPerformed(evt);
            }
        });

        jButtonActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonActualizar.setForeground(new java.awt.Color(255, 115, 96));
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLimpiar.setForeground(new java.awt.Color(255, 115, 96));
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jButtonDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 115, 96));
        jButtonDelete.setText("Eliminar");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFormularioLayout = new javax.swing.GroupLayout(jPanelFormulario);
        jPanelFormulario.setLayout(jPanelFormularioLayout);
        jPanelFormularioLayout.setHorizontalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormularioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel_paterno)
                                            .addComponent(jLabel_nombre)
                                            .addComponent(jLabel_materno)
                                            .addComponent(jLabel_nro)
                                            .addComponent(jLabel_nro1)
                                            .addComponent(jLabel_nro2))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonLimpiar)
                                            .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextField_nombres)
                                                .addComponent(jTextField_materno)
                                                .addComponent(jTextField_paterno)
                                                .addComponent(jTextField_usuario)
                                                .addComponent(jTextField_numero)
                                                .addComponent(jPasswordField_paswd, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormularioLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton_grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanelFormularioLayout.setVerticalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nombre)
                    .addComponent(jTextField_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_paterno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_materno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_materno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nro1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField_paswd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nro2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonLimpiar)
                .addGap(18, 18, 18)
                .addComponent(jButton_grabar)
                .addGap(18, 18, 18)
                .addComponent(jButtonActualizar)
                .addGap(18, 18, 18)
                .addComponent(jButtonDelete)
                .addGap(7, 7, 7)
                .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        jTableWorkers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombres", "Paterno", "Materno", "Ruc / Dni", "Usuario", "Contraseña", "Id"
            }
        ));
        jTableWorkers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableWorkersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableWorkers);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_grabarActionPerformed
        Resources resource= new Resources();
        if(jTextField_nombres.getText().equals("")||
            jTextField_paterno.getText().equals("")||
            jTextField_materno.getText().equals("")||
            jTextField_numero.getText().equals("")||
            jTextField_usuario.getText().equals("")||
            jPasswordField_paswd.getText().equals("")
        ){
            JOptionPane.showMessageDialog(null, "Ingrese los datos completos");
        }else{
            Worker w = new Worker();
            w.setWorker_id("W"+resource.generaID());
            w.setPerson_id("P"+resource.generaID());
            w.setPerson_nombres(jTextField_nombres.getText());
            w.setPerson_paterno(jTextField_paterno.getText());
            w.setPerson_materno(jTextField_materno.getText());
            w.setPerson_nro_di(jTextField_numero.getText());
            w.setPerson_usuario(jTextField_usuario.getText());
            w.setPerson_password(jPasswordField_paswd.getText());
            w.setWorker_salario("0");
            w.setWorker_codigotrabajador("codigo");

            Clear_Table1();
            ip.registrarPerson(w);

            JOptionPane.showMessageDialog(null, "Se registro de manera satisfactoria");
            //AddOneReporteData();

            ReporteDataDB();
            limpiarJTextField();
        }
    }//GEN-LAST:event_jButton_grabarActionPerformed

    public void Clear_Table1(){         
          /*
        for (int i = jTableWorkers.getRowCount()-1; i >= 0; i--){
            System.out.println("fila:"+i);            
            modelo.removeRow(i);
            
        }*/
        modelo.removeTableModelListener(jTableWorkers);
        jTableWorkers.removeAll();
    }
      
    public void limpiarJTextField(){
        jTextField_nombres.setText("");
        jTextField_paterno.setText("");
        jTextField_materno.setText("");
        jTextField_numero.setText("");
        jTextField_usuario.setText("");
        jTextField_id.setText("");
        jPasswordField_paswd.setText("");
    }

    public void AddOneReporteData(){
        Object[] fila = new Object[7];
                    fila[0] = jTextField_nombres.getText();
                    fila[1] = jTextField_paterno.getText();
                    fila[2] = jTextField_materno.getText();
                    fila[3] = jTextField_numero.getText();
                    fila[4] = jTextField_usuario.getText();
                    fila[5] = "*******";
                    fila[6] = jTextField_id.getText();

                    modelo.addRow(fila);
                
            jTableWorkers.setModel(modelo); 
    }
    
    public void updateOneReporteData(int rowSelected){
        Object[] fila = new Object[7];
        jTableWorkers.setValueAt(jTextField_nombres.getText(), rowSelected, 0);
        jTableWorkers.setValueAt(jTextField_paterno.getText(), rowSelected, 1);
        jTableWorkers.setValueAt(jTextField_materno.getText(), rowSelected, 2);
        jTableWorkers.setValueAt(jTextField_numero.getText(), rowSelected, 3);
        jTableWorkers.setValueAt(jTextField_usuario.getText(), rowSelected, 4);
        jTableWorkers.setValueAt("********", rowSelected, 5);
        jTableWorkers.setValueAt(jTextField_id.getText(), rowSelected, 6);
    }

    public void ReporteDataDB(){
        System.out.println("Reporte de desde db");
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Paterno");
        modelo.addColumn("Materno");
        modelo.addColumn("Ruc / Dni");
        modelo.addColumn("Usuario");
        modelo.addColumn("Contraseña");
        modelo.addColumn("Id");

        for (Worker pers : ip.reporteWorkers()) {
            Object[] fila = new Object[7];
            fila[0] = pers.getPerson_nombres();
            fila[1] = pers.getPerson_paterno();
            fila[2] = pers.getPerson_materno();
            fila[3] = pers.getPerson_nro_di();
            fila[4] = pers.getPerson_usuario();
            fila[5] = "*******";
            fila[6] = pers.getPerson_id();

            modelo.addRow(fila);
        }
        jTableWorkers.setModel(modelo); 
    }
    
    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        System.out.print("Actualiza"+jTextField_id.getText());

        if(jTextField_nombres.getText().equals("")||
            jTextField_paterno.getText().equals("")||
            jTextField_materno.getText().equals("")||
            jTextField_numero.getText().equals("")||
            jTextField_usuario.getText().equals("")||
            jPasswordField_paswd.getText().equals("")
        ){
            JOptionPane.showMessageDialog(null, "Ingrese los datos completos");
        }else{
            Worker w = new Worker();
            w.setPerson_nombres(jTextField_nombres.getText());
            w.setPerson_paterno(jTextField_paterno.getText());
            w.setPerson_materno(jTextField_materno.getText());
            w.setPerson_nro_di(jTextField_numero.getText());
            w.setPerson_usuario(jTextField_usuario.getText());
            w.setPerson_password(jPasswordField_paswd.getText());
            w.setWorker_salario("0");
            w.setWorker_codigotrabajador("codigo");
            w.setPerson_id(jTextField_id.getText());

            ip.ActualizarWorker(w);
            int row=jTableWorkers.getSelectedRow();
            updateOneReporteData(row);
            JOptionPane.showMessageDialog(null, "Se actualizo de manera satisfactoria");
            // limpiarJTextField();

            ReporteDataDB();
        }
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        limpiarJTextField();
        jButton_grabar.setVisible(true);
        jButtonActualizar.setVisible(false);
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        System.out.print("Eliminando...");
        ip.EliminarWorker(jTextField_id.getText());
        Clear_Table1();
        ReporteDataDB();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTableWorkersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableWorkersMouseClicked
        int row=jTableWorkers.getSelectedRow();

        System.out.print("Mouse click"+row);
        String nombres  = jTableWorkers.getValueAt(row, 0).toString();
        String paterno  = jTableWorkers.getValueAt(row, 1).toString();
        String materno  = jTableWorkers.getValueAt(row, 2).toString();
        String numero   = jTableWorkers.getValueAt(row, 3).toString();
        String usuario  = jTableWorkers.getValueAt(row, 4).toString();
        String id       = jTableWorkers.getValueAt(row, 6).toString();

        jTextField_nombres.setText(nombres);
        jTextField_paterno.setText(paterno);
        jTextField_materno.setText(materno);
        jTextField_numero.setText(numero);
        jTextField_usuario.setText(usuario);
        jTextField_id.setText(id);
        jButton_grabar.setVisible(false);
        jButtonActualizar.setVisible(true);
        jButtonDelete.setVisible(true);
    }//GEN-LAST:event_jTableWorkersMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButton_grabar;
    private javax.swing.JLabel jLabel_materno;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_nro;
    private javax.swing.JLabel jLabel_nro1;
    private javax.swing.JLabel jLabel_nro2;
    private javax.swing.JLabel jLabel_paterno;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFormulario;
    private javax.swing.JPasswordField jPasswordField_paswd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableWorkers;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_materno;
    private javax.swing.JTextField jTextField_nombres;
    private javax.swing.JTextField jTextField_numero;
    private javax.swing.JTextField jTextField_paterno;
    private javax.swing.JTextField jTextField_usuario;
    // End of variables declaration//GEN-END:variables
}
