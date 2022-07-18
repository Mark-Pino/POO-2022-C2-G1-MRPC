package implement;

import conexion.ConexionMysql;
import entities.DetailSales;
import entities.Sales;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ImplSales {
    String sql="";
    String sql2="";
    Statement stmt=null; 
    ResultSet rset=null;
    ConexionMysql cx= new ConexionMysql();

    public int numeroVta(String serie){
        int n=0;
        try {
            sql=" select max(vta_numeroventa)+1 from ventas "    
               +" where vta_serie= '"+serie+"'";
               
            stmt=cx.conectaDB().createStatement();
            rset=stmt.executeQuery(sql);
            
            if(rset.next()){               
                
                n=rset.getInt(1);
            }
        } catch (SQLException ex) {
                ex.getMessage();
        }
        return n;
    }
    
    public void registrarSales(Sales sales){
        try {
            sql = " insert into ventas "+
                    " values ('"+sales.getSales_id()+"', "
                    + "  '"+sales.getSales_tipocomprobante()+"',"
                    + "  '"+sales.getSales_serie()+"',"
                    + "  '"+sales.getSales_numeroventa()+"', "
                    + "  now(), "
                    + "  '"+sales.getSales_importetotal()+"',"
                    + "  '"+sales.getSales_client().getPerson_nombres()+"',"
                    + "  'trabajador' )";
            int i=0;            
            stmt=cx.conectaDB().createStatement();
            i=stmt.executeUpdate(sql);
            System.out.println("implement.ImplSales.registrarSales()"+sql);                       
                        
            for(DetailSales dv : sales.getListDetailSales()){
                
                System.out.println("en el impl"+dv.getDetailsales_cantidad());
                sql2 = " insert into detalle_vtas "
                      +" values('"+dv.getDetailsales_id()+"',"
                      +" '"+dv.getDetailsales_cantidad()+"',"
                      +" '"+dv.getDetailsales_descripcion()+"',"
                      +" '"+dv.getDetailsales_preciounitario()+"',"
                      +" '"+dv.getDetailsales_precioitem()+"',"
                      +"'"+sales.getSales_id()+"')  ";
                stmt=cx.conectaDB().createStatement();
                i=stmt.executeUpdate(sql2);
                System.out.println("()"+sql2);                       
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImplSales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
