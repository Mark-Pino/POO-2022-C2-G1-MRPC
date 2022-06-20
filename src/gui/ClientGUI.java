package gui;

import entities.Client;
import implement.ImplPerson;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import resources.*;

public class ClientGUI extends javax.swing.JPanel {
    ImplPerson ip=new ImplPerson();
    Client cl=new Client();
    Resources resources=new Resources();
    DefaultTableModel modelo;  
    ButtonGroup grupoDeRadios=new ButtonGroup();
    
    public ClientGUI() {
        initComponents();
        ReporteDataDB();
        jButton_actualizar.setVisible(false);
        jButton_eliminar.setVisible(false);
        jTextField_id.setVisible(false);
        jPanel_Formulario.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Formulario = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClient = new javax.swing.JTable();
        jButton_eliminar = new javax.swing.JButton();
        jLabel_titulo = new javax.swing.JLabel();
        jTextField_materno = new javax.swing.JTextField();
        jLabel_nombre = new javax.swing.JLabel();
        jTextField_paterno = new javax.swing.JTextField();
        jLabel_paterno = new javax.swing.JLabel();
        jButton_grabar = new javax.swing.JButton();
        jLabel_materno = new javax.swing.JLabel();
        jTextField_usuario = new javax.swing.JTextField();
        jLabel_nro = new javax.swing.JLabel();
        jTextField_numero = new javax.swing.JTextField();
        jLabel_nro1 = new javax.swing.JLabel();
        jPasswordField_paswd = new javax.swing.JPasswordField();
        jLabel_nro2 = new javax.swing.JLabel();
        jRadioButton_juridica = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField_nombres = new javax.swing.JTextField();
        jTextField_codigo = new javax.swing.JTextField();
        jButton_actualizar = new javax.swing.JButton();
        jRadioButton_natural = new javax.swing.JRadioButton();
        jButton_limpiar = new javax.swing.JButton();
        jTextField_id = new javax.swing.JTextField();
        jLabel_codigo = new javax.swing.JLabel();

        jTableClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombres", "Ap. Paterno", "Ap. Materno", "Nro Ruc / Dni", "Usuario", "Contraseña", "ID", "Codigo", "Tipo"
            }
        ));
        jTableClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClient);

        jButton_eliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_eliminar.setForeground(new java.awt.Color(204, 102, 0));
        jButton_eliminar.setText("Eliminar");
        jButton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarActionPerformed(evt);
            }
        });

        jLabel_titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_titulo.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_titulo.setText("Formulario Cliente");
        jLabel_titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_nombre.setText("Nombres:");

        jLabel_paterno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_paterno.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_paterno.setText("Ap. Paterno:");

        jButton_grabar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_grabar.setForeground(new java.awt.Color(204, 102, 0));
        jButton_grabar.setText("Grabar");
        jButton_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_grabarActionPerformed(evt);
            }
        });

        jLabel_materno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_materno.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_materno.setText("Ap. Materno:");

        jLabel_nro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nro.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_nro.setText("Nro Ruc / Dni:");

        jLabel_nro1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nro1.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_nro1.setText("Usuario:");

        jLabel_nro2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nro2.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_nro2.setText("Contraseña:");

        jRadioButton_juridica.setText("Persona Juridica");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 102, 0));
        jLabel2.setText("Tipo:");

        jButton_actualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_actualizar.setForeground(new java.awt.Color(204, 102, 0));
        jButton_actualizar.setText("Actualizar");
        jButton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizarActionPerformed(evt);
            }
        });

        jRadioButton_natural.setText("Persona Natural");

        jButton_limpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_limpiar.setForeground(new java.awt.Color(204, 102, 0));
        jButton_limpiar.setText("Limpiar");
        jButton_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_limpiarActionPerformed(evt);
            }
        });

        jLabel_codigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_codigo.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_codigo.setText("Codigo:");

        javax.swing.GroupLayout jPanel_FormularioLayout = new javax.swing.GroupLayout(jPanel_Formulario);
        jPanel_Formulario.setLayout(jPanel_FormularioLayout);
        jPanel_FormularioLayout.setHorizontalGroup(
            jPanel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_FormularioLayout.createSequentialGroup()
                        .addGroup(jPanel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_FormularioLayout.createSequentialGroup()
                                .addGroup(jPanel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel_paterno)
                                    .addComponent(jLabel_nombre)
                                    .addComponent(jLabel_nro)
                                    .addComponent(jLabel_nro1)
                                    .addComponent(jLabel_nro2)
                                    .addComponent(jLabel_materno)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel_codigo))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_nombres)
                                    .addComponent(jTextField_paterno)
                                    .addComponent(jTextField_usuario)
                                    .addComponent(jTextField_numero)
                                    .addComponent(jPasswordField_paswd)
                                    .addComponent(jTextField_codigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_materno, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton_juridica)
                                    .addComponent(jRadioButton_natural)))
                            .addGroup(jPanel_FormularioLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel_titulo))
                            .addComponent(jButton_grabar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_actualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_FormularioLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel_FormularioLayout.setVerticalGroup(
            jPanel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_FormularioLayout.createSequentialGroup()
                        .addComponent(jLabel_titulo)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_nombre)
                            .addComponent(jTextField_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_paterno))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_materno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_materno))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_nro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_nro1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordField_paswd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_nro2))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_codigo))
                        .addGroup(jPanel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_FormularioLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2))
                            .addGroup(jPanel_FormularioLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jRadioButton_natural)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton_juridica)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_grabar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_actualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_limpiar)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Formulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Formulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void limpiarJTextField(){
            jTextField_nombres.setText("");
            jTextField_paterno.setText("");
            jTextField_materno.setText("");
            jTextField_numero.setText("");
            jTextField_usuario.setText("");
            jPasswordField_paswd.setText("");
            jTextField_id.setText("");
            jTextField_codigo.setText("");
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
            jTableClient.setModel(modelo);
    }
    
    public void updateOneReporteData(int rowSelected){
        Object[] fila = new Object[7];
                    jTableClient.setValueAt(jTextField_nombres.getText(), rowSelected, 0);
                    jTableClient.setValueAt(jTextField_paterno.getText(), rowSelected, 1);
                    jTableClient.setValueAt(jTextField_materno.getText(), rowSelected, 2);
                    jTableClient.setValueAt(jTextField_numero.getText(), rowSelected, 3);
                    jTableClient.setValueAt(jTextField_usuario.getText(), rowSelected, 4);
                    jTableClient.setValueAt("********", rowSelected, 5);
                    jTableClient.setValueAt(jTextField_id.getText(), rowSelected, 6);
                    jTableClient.setValueAt(jTextField_codigo.getText(), rowSelected, 7);
    }
    
    public void ReporteDataDB(){
            modelo = new DefaultTableModel();
            modelo.addColumn("Nombre");
            modelo.addColumn("Paterno");
            modelo.addColumn("Materno");
            modelo.addColumn("Ruc / Dni");
            modelo.addColumn("Usuario");
            modelo.addColumn("Contraseña");
            modelo.addColumn("Id");
            modelo.addColumn("Codigo");

                for (Client pers : ip.reporteClient()) {
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
            jTableClient.setModel(modelo); 
    }
    
    private void jButton_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_grabarActionPerformed

        String v_id=resources.generaID();
        if(jTextField_nombres.getText().equals("")||
           jTextField_paterno.getText().equals("")||
           jTextField_materno.getText().equals("")||
           jTextField_numero.getText().equals("")||
           jTextField_usuario.getText().equals("")||
           jPasswordField_paswd.getText().equals("")
           ){
            JOptionPane.showMessageDialog(null, "Ingrese los datos completos");
        }else{
            Client cl = new Client();
            cl.setPerson_id(v_id);
            cl.setPerson_nombres(jTextField_nombres.getText());
            cl.setPerson_paterno(jTextField_paterno.getText());
            cl.setPerson_materno(jTextField_materno.getText());
            cl.setPerson_nro_di(jTextField_numero.getText());
            cl.setPerson_usuario(jTextField_usuario.getText());
            cl.setPerson_password(jPasswordField_paswd.getText());
            cl.setClient_id("C"+resources.generaID());
            cl.setClient_tipo("Natural");
            cl.setClient_codigocliente(v_id);
            cl.setClient_person_id(v_id);
            
            grupoDeRadios.add(jRadioButton_natural);
            grupoDeRadios.add(jRadioButton_juridica);
        
            //System.out.println("ddd"+jRadioButton_normal.isSelected());
            //System.out.println("ddd"+jRadioButton_juridica.isSelected());
            
            ip.registrarPerson(cl);
            
            JOptionPane.showMessageDialog(null, "Se registro de manera satisfactoria");            
            AddOneReporteData();
            limpiarJTextField();            
        }
    }//GEN-LAST:event_jButton_grabarActionPerformed

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed
        System.out.print(""+jTextField_codigo.getText());
             
         if(jTextField_nombres.getText().equals("")||
           jTextField_paterno.getText().equals("")||
           jTextField_materno.getText().equals("")||
           jTextField_numero.getText().equals("")||
           jTextField_usuario.getText().equals("")||
           jPasswordField_paswd.getText().equals("")
           ){
            JOptionPane.showMessageDialog(null, "Ingrese los datos completos");
        
        }else{
            Client c = new Client();
            c.setPerson_nombres(jTextField_nombres.getText());
            c.setPerson_paterno(jTextField_paterno.getText());
            c.setPerson_materno(jTextField_materno.getText());
            c.setPerson_nro_di(jTextField_numero.getText());
            c.setPerson_usuario(jTextField_usuario.getText());
            c.setPerson_password(jPasswordField_paswd.getText());
            c.setClient_tipo("0");
            c.setClient_codigocliente("codigo");
            c.setPerson_id(jTextField_id.getText());
            
            ip.ActualizarClient(c);
            int row=jTableClient.getSelectedRow();
            updateOneReporteData(row);
            JOptionPane.showMessageDialog(null, "Se actualizo de manera satisfactoria");            
            limpiarJTextField();            
           // ReporteDataDB(); 
        } 
    }//GEN-LAST:event_jButton_actualizarActionPerformed

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed
        System.out.print(jTextField_id.getText()+"Eliminando");
            ip.EliminarClient(jTextField_id.getText());
            int row=jTableClient.getSelectedRow();
            jTableClient.removeAll();
            limpiarJTextField();
    }//GEN-LAST:event_jButton_eliminarActionPerformed

    private void jTableClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientMouseClicked
        int row=jTableClient.getSelectedRow();

        System.out.print(""+row);
        String nombres  = jTableClient.getValueAt(row, 0).toString();
        String paterno  = jTableClient.getValueAt(row, 1).toString();
        String materno  = jTableClient.getValueAt(row, 2).toString();
        String numero   = jTableClient.getValueAt(row, 3).toString();
        String usuario  = jTableClient.getValueAt(row, 4).toString();
        String id       = jTableClient.getValueAt(row, 6).toString();

        jTextField_nombres.setText(nombres);
        jTextField_paterno.setText(paterno);
        jTextField_materno.setText(materno);
        jTextField_numero.setText(numero);
        jTextField_usuario.setText(usuario);
        jTextField_id.setText(id);
        jButton_grabar.setVisible(false);
        jButton_actualizar.setVisible(true);
        jButton_eliminar.setVisible(true);
    }//GEN-LAST:event_jTableClientMouseClicked

    private void jButton_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_limpiarActionPerformed
        limpiarJTextField();
        jButton_grabar.setVisible(true);
        jButton_actualizar.setVisible(false);
    }//GEN-LAST:event_jButton_limpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_actualizar;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JButton jButton_grabar;
    private javax.swing.JButton jButton_limpiar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_codigo;
    private javax.swing.JLabel jLabel_materno;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_nro;
    private javax.swing.JLabel jLabel_nro1;
    private javax.swing.JLabel jLabel_nro2;
    private javax.swing.JLabel jLabel_paterno;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JPanel jPanel_Formulario;
    private javax.swing.JPasswordField jPasswordField_paswd;
    private javax.swing.JRadioButton jRadioButton_juridica;
    private javax.swing.JRadioButton jRadioButton_natural;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClient;
    private javax.swing.JTextField jTextField_codigo;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_materno;
    private javax.swing.JTextField jTextField_nombres;
    private javax.swing.JTextField jTextField_numero;
    private javax.swing.JTextField jTextField_paterno;
    private javax.swing.JTextField jTextField_usuario;
    // End of variables declaration//GEN-END:variables
}
