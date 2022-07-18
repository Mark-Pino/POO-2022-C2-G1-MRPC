package gui;

import entities.Client;
import entities.Producto;
import implement.ImplProducto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import resources.Resources;

public class JIFProductoGUI extends javax.swing.JInternalFrame {
    ImplProducto ip= new ImplProducto();
    Resources r= new Resources();
    DefaultTableModel modelo;
    public JIFProductoGUI() {
        initComponents();
        ReporteDataDB();
        jButtonActualizar.setVisible(false);
        jButton_eliminar.setVisible(false);
        jTextField_prod_id.setVisible(false);
        jPanelFormulario.setVisible(true);
    }
    
    public void Clear_Table1(){         
          /*
        for (int i = jTableWorkers.getRowCount()-1; i >= 0; i--){
            System.out.println("fila:"+i);            
            modelo.removeRow(i);
            
        }*/
        modelo.removeTableModelListener(jTableProductos);
        jTableProductos.removeAll();
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
        jTextField_PRODUCTO = new javax.swing.JTextField();
        jTextField_PRECIO_VENTA = new javax.swing.JTextField();
        jTextField_STOCK = new javax.swing.JTextField();
        jTextField_PRECIO_COMPRA = new javax.swing.JTextField();
        jButtonActualizar = new javax.swing.JButton();
        jButtonGrabar = new javax.swing.JButton();
        jTextField_prod_id = new javax.swing.JTextField();
        jButton_eliminar = new javax.swing.JButton();
        jButton_limpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();

        jLabel_titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_titulo.setForeground(new java.awt.Color(245, 124, 0));
        jLabel_titulo.setText("Formulario Producto");
        jLabel_titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre.setForeground(new java.awt.Color(245, 124, 0));
        jLabel_nombre.setText("Nombres:");

        jLabel_paterno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_paterno.setForeground(new java.awt.Color(245, 124, 0));
        jLabel_paterno.setText("Stock:");

        jLabel_materno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_materno.setForeground(new java.awt.Color(245, 124, 0));
        jLabel_materno.setText("Precio Venta:");

        jLabel_nro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nro.setForeground(new java.awt.Color(245, 124, 0));
        jLabel_nro.setText("Precio Compra:");

        jButtonActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonActualizar.setForeground(new java.awt.Color(245, 124, 0));
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonGrabar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonGrabar.setForeground(new java.awt.Color(245, 124, 0));
        jButtonGrabar.setText("Grabar");
        jButtonGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGrabarActionPerformed(evt);
            }
        });

        jButton_eliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_eliminar.setForeground(new java.awt.Color(245, 124, 0));
        jButton_eliminar.setText("Eliminar");
        jButton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarActionPerformed(evt);
            }
        });

        jButton_limpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_limpiar.setForeground(new java.awt.Color(245, 124, 0));
        jButton_limpiar.setText("Limpiar");
        jButton_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFormularioLayout = new javax.swing.GroupLayout(jPanelFormulario);
        jPanelFormulario.setLayout(jPanelFormularioLayout);
        jPanelFormularioLayout.setHorizontalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(jLabel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_paterno)
                            .addComponent(jLabel_nombre)
                            .addComponent(jLabel_materno)
                            .addComponent(jLabel_nro))
                        .addGap(31, 31, 31)
                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_limpiar)
                            .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField_PRODUCTO)
                                .addComponent(jTextField_PRECIO_VENTA, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                .addComponent(jTextField_STOCK)
                                .addComponent(jTextField_PRECIO_COMPRA))))
                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField_prod_id, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGrabar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_eliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelFormularioLayout.setVerticalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nombre)
                    .addComponent(jTextField_PRODUCTO, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_STOCK, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_paterno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_PRECIO_VENTA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_materno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_PRECIO_COMPRA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_limpiar)
                .addGap(18, 18, 18)
                .addComponent(jButtonGrabar)
                .addGap(12, 12, 12)
                .addComponent(jButtonActualizar)
                .addGap(9, 9, 9)
                .addComponent(jButton_eliminar)
                .addGap(18, 18, 18)
                .addComponent(jTextField_prod_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTableProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProductos);
        if (jTableProductos.getColumnModel().getColumnCount() > 0) {
            jTableProductos.getColumnModel().getColumn(2).setResizable(false);
            jTableProductos.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        System.out.print("Actualiza"+jTextField_prod_id.getText());

        if(jTextField_PRODUCTO.getText().equals("")||
            jTextField_STOCK.getText().equals("")||
            jTextField_PRECIO_VENTA.getText().equals("")||
            jTextField_PRECIO_COMPRA.getText().equals("")
        ){
            JOptionPane.showMessageDialog(null, "Ingrese los datos completos");
        }else{
            Producto p = new Producto();
            p.setProd_nombre(jTextField_PRODUCTO.getText());
            p.setProd_stock(jTextField_STOCK.getText());
            p.setProd_precioveta(500);
            p.setProd_preciocompra(500);
            p.setProd_id(jTextField_prod_id.getText());

            ip.ActualizarProducto(p);
            int row=jTableProductos.getSelectedRow();
            updateOneReporteData(row);
            JOptionPane.showMessageDialog(null, "Se actualizo de manera satisfactoria");
            limpiarTXfield();

            ReporteDataDB();
        }
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGrabarActionPerformed
        Producto p= new Producto();
        p.setProd_id(r.generaID());
        p.setProd_nombre(jTextField_PRODUCTO.getText());
        p.setProd_stock(jTextField_STOCK.getText());
        //p.setProd_preciocompra(jTextField_PRECIO_COMPRA.getText());
        //p.setProd_precioveta(jTextField_PRECIO_VENTA.getText());
        
        ip.AddProducto(p);
        ReporteDataDB();
        limpiarTXfield();
    }//GEN-LAST:event_jButtonGrabarActionPerformed

    private void jTableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProductosMouseClicked
        int row=jTableProductos.getSelectedRow();

        System.out.print("Mouse click"+row);
        String Producto = jTableProductos.getValueAt(row, 0).toString();
        String Stock = jTableProductos.getValueAt(row, 1).toString();
        String PrecioVenta = jTableProductos.getValueAt(row, 2).toString();
        String PrecioCompra = jTableProductos.getValueAt(row, 3).toString();
        String id = jTableProductos.getValueAt(row, 4).toString();

        jTextField_PRODUCTO.setText(Producto);
        jTextField_STOCK.setText(Stock);
        jTextField_PRECIO_VENTA.setText(PrecioVenta);
        jTextField_PRECIO_COMPRA.setText(PrecioCompra);
        jTextField_prod_id.setText(id);
        jButtonGrabar.setVisible(false);
        jButtonActualizar.setVisible(true);
        jButton_eliminar.setVisible(true);
    }//GEN-LAST:event_jTableProductosMouseClicked

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed
        System.out.print("Eliminando...");
        ip.EliminarProducto(jTextField_prod_id.getText());
        Clear_Table1();
        ReporteDataDB();
    }//GEN-LAST:event_jButton_eliminarActionPerformed

    private void jButton_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_limpiarActionPerformed
        limpiarTXfield();
        jButtonGrabar.setVisible(true);
        jButtonActualizar.setVisible(false);
    }//GEN-LAST:event_jButton_limpiarActionPerformed
 
    public void limpiarTXfield(){
        jTextField_PRECIO_COMPRA.setText("");
        jTextField_PRECIO_VENTA.setText("");
        jTextField_PRODUCTO.setText("");
        jTextField_STOCK.setText("");
 }
    
    public void ReporteDataDB(){
        System.out.println("Reporte de desde db");
        modelo = new DefaultTableModel();
        modelo.addColumn("Producto");
        modelo.addColumn("Stock");
        modelo.addColumn("Precio Venta");
        modelo.addColumn("Precio compra");
        modelo.addColumn("Producto id");
        
        for (Producto pers : ip.reporteProductos()) {
            Object[] fila = new Object[5];
            fila[0] = pers.getProd_nombre();
            fila[1] = pers.getProd_stock();
            fila[2] = pers.getProd_precioveta();
            fila[3] = pers.getProd_preciocompra();
            fila[4] = pers.getProd_id();
            
            modelo.addRow(fila);
        }
        jTableProductos.setModel(modelo); 
    }
    
    public void AddOneReporteData(){
        Object[] fila = new Object[5];
        fila[0] = jTextField_PRODUCTO.getText();
        fila[1] = jTextField_STOCK.getText();
        fila[2] = jTextField_PRECIO_VENTA.getText();
        fila[3] = jTextField_PRECIO_COMPRA.getText();
        fila[4] = jTextField_prod_id.getText();
        modelo.addRow(fila);

        jTableProductos.setModel(modelo); 
    }
    
    public void updateOneReporteData(int rowSelected){
        Object[] fila = new Object[5];
        jTableProductos.setValueAt(jTextField_PRODUCTO.getText(), rowSelected, 0);
        jTableProductos.setValueAt(jTextField_STOCK.getText(), rowSelected, 1);
        jTableProductos.setValueAt(jTextField_PRECIO_VENTA.getText(), rowSelected, 2);
        jTableProductos.setValueAt(jTextField_PRECIO_COMPRA.getText(), rowSelected, 3);
        jTableProductos.setValueAt(jTextField_prod_id.getText(), rowSelected, 4);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonGrabar;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JButton jButton_limpiar;
    private javax.swing.JLabel jLabel_materno;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_nro;
    private javax.swing.JLabel jLabel_paterno;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JPanel jPanelFormulario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTextField jTextField_PRECIO_COMPRA;
    private javax.swing.JTextField jTextField_PRECIO_VENTA;
    private javax.swing.JTextField jTextField_PRODUCTO;
    private javax.swing.JTextField jTextField_STOCK;
    private javax.swing.JTextField jTextField_prod_id;
    // End of variables declaration//GEN-END:variables
}
