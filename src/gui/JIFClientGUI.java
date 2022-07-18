package gui;

import entities.Client;
import implement.ImplPerson;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import resources.Resources;

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
        ReporteDataDB();
        grupoRadio.add(jRadioButtonNatural);
        grupoRadio.add(jRadioButtonJuridica);
        jButtonActualizar.setVisible(false);
        jButtonEliminar.setVisible(false);
        jTextField_id.setVisible(false);
        jPanelFormulario.setVisible(true);
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
        modelo.addColumn("Codigo");
        modelo.addColumn("Tipo");
        modelo.addColumn("Id");

        for (Client pers : ip.reporteClients()) {
            Object[] fila = new Object[9];
            fila[0] = pers.getPerson_nombres();
            fila[1] = pers.getPerson_paterno();
            fila[2] = pers.getPerson_materno();
            fila[3] = pers.getPerson_nro_di();
            fila[4] = pers.getPerson_usuario();
            fila[5] = "*******";
            fila[6] = pers.getClient_codigocliente();
            fila[7] = pers.getClient_tipo();
            fila[8] = pers.getPerson_id();

            modelo.addRow(fila);
        }
        jTableClientes.setModel(modelo); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTipo = new javax.swing.ButtonGroup();
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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jButtonActualizar = new javax.swing.JButton();
        jTextField_id = new javax.swing.JTextField();
        jButtonEliminar = new javax.swing.JButton();

        jLabel_titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_titulo.setForeground(new java.awt.Color(127, 145, 187));
        jLabel_titulo.setText("Formulario Cliente");
        jLabel_titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre.setForeground(new java.awt.Color(127, 145, 187));
        jLabel_nombre.setText("Nombres:");

        jLabel_paterno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_paterno.setForeground(new java.awt.Color(127, 145, 187));
        jLabel_paterno.setText("Ap. Paterno:");

        jLabel_materno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_materno.setForeground(new java.awt.Color(127, 145, 187));
        jLabel_materno.setText("Ap. Materno:");

        jLabel_nro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nro.setForeground(new java.awt.Color(127, 145, 187));
        jLabel_nro.setText("Nro Ruc / Dni:");

        jLabel_codiog_cliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_codiog_cliente.setForeground(new java.awt.Color(127, 145, 187));
        jLabel_codiog_cliente.setText("Codigo Cliente:");

        jButton_grabar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_grabar.setForeground(new java.awt.Color(127, 145, 187));
        jButton_grabar.setText("Grabar");
        jButton_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_grabarActionPerformed(evt);
            }
        });

        jLabel_nro3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nro3.setForeground(new java.awt.Color(127, 145, 187));
        jLabel_nro3.setText("Tipo Cliente:");

        buttonGroupTipo.add(jRadioButtonNatural);
        jRadioButtonNatural.setText("Persona Natural");

        buttonGroupTipo.add(jRadioButtonJuridica);
        jRadioButtonJuridica.setText("Persona Juridica");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(127, 145, 187));
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFormularioLayout = new javax.swing.GroupLayout(jPanelFormulario);
        jPanelFormulario.setLayout(jPanelFormularioLayout);
        jPanelFormularioLayout.setHorizontalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_paterno)
                            .addComponent(jLabel_nombre)
                            .addComponent(jLabel_materno)
                            .addComponent(jLabel_nro)
                            .addComponent(jLabel_codiog_cliente)
                            .addComponent(jLabel_nro3))
                        .addGap(31, 31, 31)
                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField_nombres)
                                .addComponent(jTextField_materno, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                .addComponent(jTextField_paterno, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                .addComponent(jTextField_numero, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                .addComponent(jRadioButtonJuridica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButtonNatural, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_codigo_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanelFormularioLayout.setVerticalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nro))
                .addGap(11, 11, 11)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_codigo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_codiog_cliente))
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel_nro3))
                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonJuridica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonNatural, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(28, 28, 28)
                .addComponent(jButton_grabar)
                .addContainerGap())
        );

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClientes);

        jButtonActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonActualizar.setForeground(new java.awt.Color(127, 145, 187));
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(127, 145, 187));
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))))
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonActualizar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEliminar)
                .addGap(30, 30, 30)
                .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
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
                c.setPerson_usuario("USER*CLIENTE");
                c.setPerson_password("***PSW***");
                

                ip.registrarPerson(c);
                ReporteDataDB();
                JOptionPane.showMessageDialog(null, "Se registro de manera satisfactoria");
                limpiarJTextField();
            }
        }else{
                JOptionPane.showMessageDialog(null, "Ingrese los datos completos");
        }
    }//GEN-LAST:event_jButton_grabarActionPerformed

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        int row = 0;
        String tp="";
        row=jTableClientes.getSelectedRow();
        System.out.println("la fila es :::"+row);
        
        jTextField_nombres.setText( jTableClientes.getValueAt(row, 0).toString());
        jTextField_paterno.setText( jTableClientes.getValueAt(row, 1).toString());
        jTextField_materno.setText( jTableClientes.getValueAt(row, 2).toString());
        jTextField_numero.setText( jTableClientes.getValueAt(row, 3).toString());
        jTextField_codigo_cliente.setText(jTableClientes.getValueAt(row, 6).toString());
        jTextField_id.setText(jTableClientes.getValueAt(row, 8).toString());
        
        tp=jTableClientes.getValueAt(row, 7).toString();
        System.out.print("dddd"+tp);
        grupoRadio.add(jRadioButtonNatural);
        grupoRadio.add(jRadioButtonJuridica);
        
        if(tp.equals("Natural")){
            buttonGroupTipo.setSelected(jRadioButtonNatural.getModel(), true);
            jRadioButtonNatural.setName("Natural");
            jRadioButtonNatural.isSelected();
        }
        if(tp.equals("Juridica")){
            buttonGroupTipo.setSelected(jRadioButtonJuridica.getModel(), true);
            jRadioButtonJuridica.setName("Juridica");
            jRadioButtonJuridica.isSelected();
        }
    }//GEN-LAST:event_jTableClientesMouseClicked

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        String tp="";
        if(jRadioButtonNatural.isSelected()){            tp="Natural";        }
        if(jRadioButtonJuridica.isSelected()){            tp="Juridica";        }
        
        Client  c = new Client();          
        c.setPerson_id(jTextField_id.getText());
        c.setPerson_nombres(jTextField_nombres.getText());
        c.setPerson_paterno(jTextField_paterno.getText());
        c.setPerson_materno(jTextField_materno.getText());
        c.setPerson_nro_di(jTextField_numero.getText());
        c.setPerson_usuario("USER*CLIENTE");
        c.setPerson_password("***PSW***");
        c.setClient_codigocliente(jTextField_codigo_cliente.getText());

        c.setClient_tipo(tp);

        ip.ActualizarClient(c);
        ReporteDataDB();
        JOptionPane.showMessageDialog(null, "Se registro de manera satisfactoria");
        limpiarJTextField();  
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
                ip.EliminarClient(jTextField_id.getText());
                JOptionPane.showMessageDialog(null, "Se registro de manera satisfactoria");
                ReporteDataDB();                
                limpiarJTextField();
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiarJTextField();
        jButton_grabar.setVisible(true);
        jButtonActualizar.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void limpiarJTextField(){
            jTextField_nombres.setText("");
            jTextField_paterno.setText("");
            jTextField_materno.setText("");
            jTextField_numero.setText("");
            jTextField_codigo_cliente.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.ButtonGroup buttonGroupTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButton_grabar;
    private javax.swing.JLabel jLabel_codiog_cliente;
    private javax.swing.JLabel jLabel_materno;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_nro;
    private javax.swing.JLabel jLabel_nro3;
    private javax.swing.JLabel jLabel_paterno;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JPanel jPanelFormulario;
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
    // End of variables declaration//GEN-END:variables
}
