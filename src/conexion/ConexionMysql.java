package conexion;
import java.sql.*;
import javax.swing.JOptionPane;

public class ConexionMysql {
    Connection conexion=null;
        String userDB="root";
        String passwordDB="(Mark_19-$)";
        String url="";
        
    public Connection conectaDB(){
        try {   
        url="jdbc:mysql://localhost:3306/ventas-peru";
        conexion=DriverManager.getConnection(url, userDB, passwordDB);
            if(conexion!=null){
                System.out.println("se establecio la conexion");
            } else{
                System.out.print("no existe conexion");
            }  
        }catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "No hay conexion a db");         
        }           
        return conexion;
    }
    
    public static void main(String[] args) {
        ConexionMysql cx = new ConexionMysql();
        cx.conectaDB();
    }
    
}
