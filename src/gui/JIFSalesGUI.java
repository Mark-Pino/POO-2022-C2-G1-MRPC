package gui;

import entities.Client;
import entities.DetailSales;
import entities.Sales;
import implement.ImplPerson;
import implement.ImplSales;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;
import resources.Resources;

public class JIFSalesGUI extends javax.swing.JInternalFrame implements Printable{
Resources r= new Resources();
Resources re= new Resources();
     DefaultTableModel modelo;
    public JIFSalesGUI() {
        
        initComponents();
        tablaEncabezado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDetalle = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCodigoCliente = new javax.swing.JTextField();
        jLabelCLIENTE = new javax.swing.JLabel();
        jComboBoxpRODUCTOS = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabelCLIENTE1 = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jButtonAgregarProductos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSpinnerCantidad = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jButton_ConfirmarVenta = new javax.swing.JButton();
        jTextFieldPrecioUnitario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jTableDetalle.setForeground(new java.awt.Color(204, 102, 0));
        jTableDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CANTIDAD", "DESCRIPCION", "PRECIO UNIT", "PRECIO"
            }
        ));
        jScrollPane1.setViewportView(jTableDetalle);

        jLabel2.setForeground(new java.awt.Color(58, 152, 164));
        jLabel2.setText("TOTAL:");

        jLabelCLIENTE.setForeground(new java.awt.Color(58, 152, 164));
        jLabelCLIENTE.setText("DIRECCION");

        jComboBoxpRODUCTOS.setForeground(new java.awt.Color(58, 152, 164));
        jComboBoxpRODUCTOS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guitarra", "Piano", "Trompeta", "Flauta" }));
        jComboBoxpRODUCTOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxpRODUCTOSActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(58, 152, 164));
        jLabel1.setText("PRODUCTOS:");

        jLabelCLIENTE1.setForeground(new java.awt.Color(58, 152, 164));
        jLabelCLIENTE1.setText("CLIENTE:");

        jTextFieldDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDireccionActionPerformed(evt);
            }
        });

        jButtonAgregarProductos.setForeground(new java.awt.Color(58, 152, 164));
        jButtonAgregarProductos.setText("AGREGAR");
        jButtonAgregarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarProductosActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(58, 152, 164));
        jLabel3.setText("CANTIDAD");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(58, 152, 164));
        jLabel4.setText("Tienda Al fondo hay música");

        jButton_ConfirmarVenta.setForeground(new java.awt.Color(58, 152, 164));
        jButton_ConfirmarVenta.setText("CONFIRMAR VENTA");
        jButton_ConfirmarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConfirmarVentaActionPerformed(evt);
            }
        });

        jTextFieldPrecioUnitario.setText("50");

        jLabel5.setForeground(new java.awt.Color(58, 152, 164));
        jLabel5.setText("Precio Unit.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                                .addComponent(jTextFieldCodigoCliente)
                                .addComponent(jLabelCLIENTE1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelCLIENTE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxpRODUCTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(jButtonAgregarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(595, 595, 595)
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(jButton_ConfirmarVenta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxpRODUCTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(55, 55, 55))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCLIENTE1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jTextFieldPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAgregarProductos)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCLIENTE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jButton_ConfirmarVenta)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void comboBox(){
        //jComboBoxpRODUCTOS.setModel(aModel);
    }
 
    
    private void jTextFieldDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDireccionActionPerformed
        
    }//GEN-LAST:event_jTextFieldDireccionActionPerformed

    private void jComboBoxpRODUCTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxpRODUCTOSActionPerformed
        
    }//GEN-LAST:event_jComboBoxpRODUCTOSActionPerformed

    public void tablaEncabezado(){
       modelo = new DefaultTableModel();
            
            modelo.addColumn("cantidad");
            modelo.addColumn("producto");
            modelo.addColumn("PU");
            modelo.addColumn("Total");
    }
    
    private void jButtonAgregarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarProductosActionPerformed
           Object[] fila = new Object[4];
                    fila[0] = jSpinnerCantidad.getValue().toString();
                    fila[1] = jComboBoxpRODUCTOS.getSelectedItem().toString();
                    fila[2] = jTextFieldPrecioUnitario.getText();
                    fila[3] = Double.parseDouble(jSpinnerCantidad.getValue().toString())   *   Double.parseDouble(jTextFieldPrecioUnitario.getText());
                    
                    modelo.addRow(fila);
                
            jTableDetalle.setModel(modelo); 
    }//GEN-LAST:event_jButtonAgregarProductosActionPerformed

    private void jButton_ConfirmarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConfirmarVentaActionPerformed
            String vta_id=re.generaID();
            String detalle_id="";
            Sales sales= new Sales();            
            Client cl= new Client();
            ArrayList<DetailSales> ld= new ArrayList<>();
            double total=0;  
            
            for (int i = 0; i < jTableDetalle.getRowCount(); i++) {
                System.out.println("dsd"+i);
                r= new Resources();
                DetailSales ds= new DetailSales();
                ds.setDetailsales_id(i+""+r.generaID());
                ds.setDetailsales_cantidad( Double.parseDouble(   jTableDetalle.getValueAt(i, 0).toString()   ));  
                ds.setDetailsales_descripcion(jTableDetalle.getValueAt(i, 1).toString() );                
                ds.setDetailsales_preciounitario(Double.parseDouble(jTableDetalle.getValueAt(i, 2).toString() ));                
                ds.setDetailsales_precioitem(Double.parseDouble( jTableDetalle.getValueAt(i,3).toString() ));
                
                total= total+ds.getDetailsales_precioitem();
                ld.add(ds);
                
            }
            ImplSales is= new ImplSales();
            cl.setPerson_nombres(jTextFieldCodigoCliente.getText());
            sales.setSales_id(vta_id);
            sales.setSales_importetotal(total);
            sales.setSales_client(cl);            
            sales.setSales_tipocomprobante("Boleta");
            sales.setSales_serie("B");
            sales.setListDetailSales(ld);
            sales.setSales_numeroventa(""+is.numeroVta("B"));
            
            
            
            is.registrarSales(sales);
          /*  
            for(DetailSales d :ld){
                System.out.println("ld cargado datos :"+d.getDetailsales_id());
                System.out.println("ld cargado datos :"+d.getDetailsales_cantidad());
                System.out.println(" :"+d.getDetailsales_descripcion());
                System.out.println(" :"+d.getDetailsales_preciounitario());
                System.out.println(" :"+d.getDetailsales_precioitem());
            }   
        System.out.println("total"+total);
        
        */

    }//GEN-LAST:event_jButton_ConfirmarVentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarProductos;
    private javax.swing.JButton jButton_ConfirmarVenta;
    private javax.swing.JComboBox<String> jComboBoxpRODUCTOS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCLIENTE;
    private javax.swing.JLabel jLabelCLIENTE1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerCantidad;
    private javax.swing.JTable jTableDetalle;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldCodigoCliente;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldPrecioUnitario;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex == 0) {
            Graphics2D graphics2d = (Graphics2D) graphics;
            graphics2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            printAll(graphics2d);
            return PAGE_EXISTS;
        } else {
            return NO_SUCH_PAGE;
        }
    }
}
