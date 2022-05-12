package implementacion;
import conexion.ConectaDBSqlite;
import entidades.Celular;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ImplCelular {
    ConectaDBSqlite cc=new ConectaDBSqlite();
    Celular cli=new Celular();
    
    ArrayList<Celular>listaCelular = new ArrayList<>();
    
    public void agregarCelulares(Celular cel){
        try {
            String query="insert into celulares values('"+cel.getProd_id()+"','"+cel.getProd_nombre()+"','"+cel.getProd_precio()+"','"+cel.getProd_marca()+"')";
            Statement st = cc.getConnect().createStatement();
            st.execute(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    /*public void delete(int id){
        for(Celular ps: listaCelular){
            if (id == ps.getProd_id) {
                System.out.println("Eliminando a: "+ps.getProd_nombre());
                listaCelular.remove(ps);
            }
        }
    }*/
    
    public void EliminarPersona(String Nombre, String Codigo){
        for(int i=0; i<listaCelular.size(); i++ ) {
        Celular dp = listaCelular.get(i);
           if(Nombre.equals(dp.getProd_nombre()) && Codigo.equals(dp.getProd_id())){
               System.out.print("Eliminando"+dp.getProd_nombre());
               listaCelular.remove(i);
           }
       }
    }
    
    public void reporteCelular(){
        try {
            String query="select * from celulares";
            Statement st = cc.getConnect().createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                Celular celu = new Celular();
                celu.setProd_id(rs.getString(1));
                celu.setProd_nombre(rs.getString(2));
                celu.setProd_precio(rs.getString(3));
                celu.setProd_marca(rs.getString(4));
                listaCelular.add(celu);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
