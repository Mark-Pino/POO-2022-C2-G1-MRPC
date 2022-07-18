package implement; 

import conexion.ConexionMysql;
import entities.Producto;
import resources.Resources;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ImplProducto {
    Producto prod = new Producto();
    Resources resources= new Resources();
    conexion.ConexionMysql cx= new ConexionMysql();
    String sql=""; 
    String sql2="";
    Statement stmt=null;
    ResultSet rset=null;
    ArrayList<Producto> lisproductos = new ArrayList<>();
    
    public void AddProducto(Producto p){
        try {
            int i=0;
            sql =" insert into producto ( prod_id, prod_nombre, prod_stock, prod_precioventa, prod_preciocompra)"+
                    " values ('"+p.getProd_id()+
                    "','"+p.getProd_nombre()+
                    "','"+p.getProd_stock()+
                    "','"+p.getProd_precioveta()+
                    "','"+p.getProd_preciocompra()+"')";
                   
                System.out.println("sql:"+ sql );
                stmt=cx.conectaDB().createStatement();
                i=stmt.executeUpdate(sql);
                
        } catch (SQLException ex) {
            System.out.println("capturando"+ex.getMessage()); 
        }
    }
    
    public ArrayList<Producto> reporteProductos(){
        lisproductos = new ArrayList<>();
        try {
            sql=" select * from producto ";
            stmt=cx.conectaDB().createStatement();
            rset=stmt.executeQuery(sql);
            while(rset.next()){
                Producto ps = new Producto();
                ps.setProd_id(rset.getString(1));
                ps.setProd_nombre(rset.getString(2));
                ps.setProd_stock(rset.getString(3));
                ps.setProd_preciocompra(rset.getDouble(5));
                ps.setProd_precioveta(rset.getDouble(4));
                
                lisproductos.add(ps);            
            }
        } catch (SQLException ex) {
                ex.getMessage();
        }
        return lisproductos;
    }
    
    public void ActualizarProducto(Producto p){        
        int i=0;  
        try {
            sql = " update producto "+
                  " set prod_nombre= '"+p.getProd_nombre()+"' "+  
                  " , prod_stock= '"+p.getProd_stock()+"'"+
                  " , prod_precioventa= '"+p.getProd_precioveta()+"'"+
                  " , prod_preciocompra= '"+p.getProd_preciocompra()+"'"+
                  " where prod_id='P'||"+p.getProd_id()+"' ";
                  
            stmt=cx.conectaDB().createStatement();
            i=stmt.executeUpdate(sql);
            
        }catch (SQLException ex) {
            System.out.println("capturando"+ex.getMessage()); 
        }
    }
    
    public void EliminarProducto(String id){
        int i=0;
        try {
            sql = " delete from producto "+
                  " where prod_id='"+id+"' ";
                     
            stmt=cx.conectaDB().createStatement();
            i=stmt.executeUpdate(sql);
            
        }catch (SQLException ex) {
            System.out.println("capturando"+ex.getMessage()); 
        }
    }
}
