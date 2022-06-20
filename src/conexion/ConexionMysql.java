package conexion;
import java.sql.*;

public class ConexionMysql {
    Connection conexion=null;
        String userDB="root";
        String paswordDB="(Mark_19-$)";
        String url="";
        
    public Connection conectaDB(){
        try {   
        url="jdbc:mysql://localhost:3306/ventas-peru";
        conexion=DriverManager.getConnection(url, userDB, paswordDB);
            if(conexion!=null){
                System.out.println("se establecio la conexion");
            } else{
                System.out.print("no existe conexion");
            }  
        }catch (SQLException e) {
            e.getMessage();
        }           
        return conexion;
    }
    
    public static void main(String[] args) {
        ConexionMysql cx = new ConexionMysql();
        cx.conectaDB();
    } 
}
