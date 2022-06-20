package gui;

import entities.Client;
import implement.ImplPerson;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import resources.Resources;
import javax.swing.table.DefaultTableModel;

public class JIFClientGUI extends javax.swing.JInternalFrame {
    ButtonGroup grupoRadio = new ButtonGroup();
    ImplPerson ip = new ImplPerson();  
    Resources resource= new Resources();
    DefaultTableModel modelo; 
    
    public JIFClientGUI(String title) {
        super(title);
    }

    public JIFClientGUI() {
        initComponents();
        grupoRadio.add(jRadioButtonNatural);
        grupoRadio.add(jRadioButtonJuridica);
        jButton_actualizar.setVisible(true);
        jButton_eliminar.setVisible(true);
        jTextField_id.setVisible(false);
        ReporteDataDB();
    }
    
    public void Clear_Table1(){         
          /*
        for (int i = jTableWorkers.getRowCount()-1; i >= 0; i--){
            System.out.println("fila:"+i);            
            modelo.removeRow(i);
            
        }*/
        modelo.removeTableModelListener(jTableClientes);
        jTableClientes.removeAll();
      }
    
    public void limpiarJTextField(){
            jTextField_nombres.setText("");
            jTextField_paterno.setText("");
            jTextField_materno.setText("");
            jTextField_numero.setText("");
            jTextField_codigo_cliente.setText("");
            jTextField_usuario.setText("");
            jPasswordField_password.setText("");
            jTextField_id.setText("");
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
            jTableClientes.setModel(modelo);
    }
    
    public void updateOneReporteData(int rowSelected){
        Object[] fila = new Object[7];
                    jTableClientes.setValueAt(jTextField_nombres.getText(), rowSelected, 0);
                    jTableClientes.setValueAt(jTextField_paterno.getText(), rowSelected, 1);
                    jTableClientes.setValueAt(jTextField_materno.getText(), rowSelected, 2);
                    jTableClientes.setValueAt(jTextField_numero.getText(), rowSelected, 3);
                    jTableClientes.setValueAt(jTextField_usuario.getText(), rowSelected, 4);
                    jTableClientes.setValueAt("********", rowSelected, 5);
                    jTableClientes.setValueAt(jTextField_id.getText(), rowSelected, 6);
                    jTableClientes.setValueAt(jTextField_codigo_cliente.getText(), rowSelected, 7);
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
            jTableClientes.setModel(modelo); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFormulario = new javax.swing.JPanel();
        jLabel_titulo = new javax.swing.JLabel();
        jLabel_nombre = new javax.swing.JLabel();
        jLabel_paterno = new javax.swing.JLabel();
        jLabel_materno = new javax.swing.JLabel();
        jLabel_nro = new javax.swing.JLabel();
        jLabel_codiog_cliente = new javax.swing.JLabel();
        jTextField_nombres = new javax.swing.JTextField();
        jTextField_materno = new javax.swing.JTextField();
        jTextField_paterno = new javax.swing.JTextField();
        jTextField_numero = new javax.swing.JTextField();
        jButton_grabar = new javax.swing.JButton();
        jLabel_nro3 = new javax.swing.JLabel();
        jRadioButtonNatural = new javax.swing.JRadioButton();
        jRadioButtonJuridica = new javax.swing.JRadioButton();
        jTextField_codigo_cliente = new javax.swing.JTextField();
        jLabel_usuario = new javax.swing.JLabel();
        jLabel_contraseña = new javax.swing.JLabel();
        jTextField_usuario = new javax.swing.JTextField();
        jButton_limppiar = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        jPasswordField_password = new javax.swing.JPasswordField();
        jTextField_id = new javax.swing.JTextField();
        jButton_actualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();

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

        jLabel_materno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_materno.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_materno.setText("Ap. Materno:");

        jLabel_nro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nro.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_nro.setText("Nro Ruc / Dni:");

        jLabel_codiog_cliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_codiog_cliente.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_codiog_cliente.setText("Codigo Cliente:");

        jButton_grabar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_grabar.setForeground(new java.awt.Color(204, 102, 0));
        jButton_grabar.setText("Grabar");
        jButton_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_grabarActionPerformed(evt);
            }
        });

        jLabel_nro3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nro3.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_nro3.setText("Tipo Cliente:");

        jRadioButtonNatural.setText("Persona Natural");

        jRadioButtonJuridica.setText("Persona Juridica");

        jLabel_usuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_usuario.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_usuario.setText("Usuario:");

        jLabel_contraseña.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_contraseña.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_contraseña.setText("Contraseña:");

        jButton_limppiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_limppiar.setForeground(new java.awt.Color(204, 102, 0));
        jButton_limppiar.setText("Limpiar");
        jButton_limppiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_limppiarActionPerformed(evt);
            }
        });

        jButton_eliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_eliminar.setForeground(new java.awt.Color(204, 102, 0));
        jButton_eliminar.setText("Eliminar");
        jButton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarActionPerformed(evt);
            }
        });

        jButton_actualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_actualizar.setForeground(new java.awt.Color(204, 102, 0));
        jButton_actualizar.setText("Actualizar");
        jButton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizarActionPerformed(evt);
            }
        });

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClientes);

        javax.swing.GroupLayout jPanelFormularioLayout = new javax.swing.GroupLayout(jPanelFormulario);
        jPanelFormulario.setLayout(jPanelFormularioLayout);
        jPanelFormularioLayout.setHorizontalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_limppiar, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelFormularioLayout.createSequentialGroup()
                            .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel_nombre)
                                .addComponent(jLabel_materno)
                                .addComponent(jLabel_nro)
                                .addComponent(jLabel_usuario)
                                .addComponent(jLabel_contraseña)
                                .addComponent(jLabel_codiog_cliente)
                                .addComponent(jLabel_nro3)
                                .addComponent(jLabel_paterno))
                            .addGap(31, 31, 31)
                            .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField_nombres, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField_materno, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField_paterno, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField_numero, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField_codigo_cliente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField_usuario, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButtonJuridica, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButtonNatural, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                .addComponent(jPasswordField_password, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelFormularioLayout.createSequentialGroup()
                            .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFormularioLayout.setVerticalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_nombre)
                            .addComponent(jTextField_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_paterno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_materno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_materno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_nro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_usuario)
                            .addComponent(jTextField_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_contraseña)
                            .addComponent(jPasswordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                                .addComponent(jLabel_codiog_cliente)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel_nro3))
                            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                                .addComponent(jTextField_codigo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jRadioButtonJuridica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonNatural, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_grabar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jButton_actualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_limppiar)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_grabarActionPerformed
        String tp="";
        
        if(jRadioButtonNatural.isSelected()){            tp="Natural";        }
        if(jRadioButtonJuridica.isSelected()){            tp="Juridica";        }
        
        if(!tp.equals("")){                
            
            if((jTextField_nombres.getText().equals("")||
                jTextField_paterno.getText().equals("")||
                jTextField_materno.getText().equals("")||
                jTextField_codigo_cliente.getText().equals("")||
                jTextField_numero.getText().equals(""))
            ){
                JOptionPane.showMessageDialog(null, "Ingrese los datos completos");

            }else{

                Client  c = new Client();
                c.setClient_id("C"+resource.generaID());
                c.setClient_codigocliente("C"+jTextField_codigo_cliente.getText());
                c.setClient_tipo(tp);
                c.setPerson_id("P"+resource.generaID());
                c.setPerson_nombres(jTextField_nombres.getText());
                c.setPerson_paterno(jTextField_paterno.getText());
                c.setPerson_materno(jTextField_materno.getText());
                c.setPerson_nro_di(jTextField_numero.getText());
                c.setPerson_usuario(jTextField_usuario.getText());
                c.setPerson_password(jPasswordField_password.getText());
                

                ip.registrarPerson(c);
                JOptionPane.showMessageDialog(null, "Se registro de manera satisfactoria");
                AddOneReporteData();
                limpiarJTextField();
            }
        }else{
                JOptionPane.showMessageDialog(null, "Ingrese los datos completos");
        }
    }//GEN-LAST:event_jButton_grabarActionPerformed

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        int row=jTableClientes.getSelectedRow();

        System.out.print("Mouse click "+row);
        String nombres  = jTableClientes.getValueAt(row, 0).toString();
        String paterno  = jTableClientes.getValueAt(row, 1).toString();
        String materno  = jTableClientes.getValueAt(row, 2).toString();
        String numero   = jTableClientes.getValueAt(row, 3).toString();
        String usuario  = jTableClientes.getValueAt(row, 4).toString();
        String id       = jTableClientes.getValueAt(row, 6).toString();

        jTextField_nombres.setText(nombres);
        jTextField_paterno.setText(paterno);
        jTextField_materno.setText(materno);
        jTextField_numero.setText(numero);
        jTextField_usuario.setText(usuario);
        jTextField_id.setText(id);
        jButton_grabar.setVisible(true);
        jButton_actualizar.setVisible(true);
        jButton_eliminar.setVisible(true);
    }//GEN-LAST:event_jTableClientesMouseClicked

    private void jButton_limppiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_limppiarActionPerformed
        System.out.print("Limpiando");
        limpiarJTextField();
        jButton_grabar.setVisible(true);
        jButton_actualizar.setVisible(false);
    }//GEN-LAST:event_jButton_limppiarActionPerformed

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed
        System.out.print(jTextField_id.getText()+"Eliminando");
        ip.EliminarClient(jTextField_id.getText());
        Clear_Table1();
        ReporteDataDB();
        limpiarJTextField();
    }//GEN-LAST:event_jButton_eliminarActionPerformed

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed
        System.out.print("Actualiza"+jTextField_id.getText());

        if(jTextField_nombres.getText().equals("")||
            jTextField_paterno.getText().equals("")||
            jTextField_materno.getText().equals("")||
            jTextField_numero.getText().equals("")||
            jTextField_usuario.getText().equals("")||
            jPasswordField_password.getText().equals("")
        ){
            JOptionPane.showMessageDialog(null, "Ingrese los datos completos");
        }else{
            Client c = new Client();
            c.setPerson_nombres(jTextField_nombres.getText());
            c.setPerson_paterno(jTextField_paterno.getText());
            c.setPerson_materno(jTextField_materno.getText());
            c.setPerson_nro_di(jTextField_numero.getText());
            c.setPerson_usuario(jTextField_usuario.getText());
            c.setPerson_password(jPasswordField_password.getText());
            c.setClient_tipo("0");
            c.setClient_codigocliente("codigo");
            c.setPerson_id(jTextField_id.getText());

            ip.ActualizarClient(c);
            int row=jTableClientes.getSelectedRow();
            updateOneReporteData(row);
            JOptionPane.showMessageDialog(null, "Se actualizo de manera satisfactoria");
            limpiarJTextField();
            ReporteDataDB();
        }
    }//GEN-LAST:event_jButton_actualizarActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_actualizar;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JButton jButton_grabar;
    private javax.swing.JButton jButton_limppiar;
    private javax.swing.JLabel jLabel_codiog_cliente;
    private javax.swing.JLabel jLabel_contraseña;
    private javax.swing.JLabel jLabel_materno;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_nro;
    private javax.swing.JLabel jLabel_nro3;
    private javax.swing.JLabel jLabel_paterno;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JLabel jLabel_usuario;
    private javax.swing.JPanel jPanelFormulario;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JRadioButton jRadioButtonJuridica;
    private javax.swing.JRadioButton jRadioButtonNatural;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField jTextField_codigo_cliente;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_materno;
    private javax.swing.JTextField jTextField_nombres;
    private javax.swing.JTextField jTextField_numero;
    private javax.swing.JTextField jTextField_paterno;
    private javax.swing.JTextField jTextField_usuario;
    // End of variables declaration//GEN-END:variables
}
