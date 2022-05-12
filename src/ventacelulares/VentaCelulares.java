package ventacelulares;
import entidades.Celular;
import implementacion.ImplCelular;

public class VentaCelulares {
    public static void main(String[] args) {
        Celular c=new Celular();
        c.setProd_id("1");
        c.setProd_nombre("Samsung A03");
        c.setProd_precio("200");
        c.setProd_marca("Samsung");
        
        Celular c2=new Celular();
        c2.setProd_id("2");
        c2.setProd_nombre("Samsung A50");
        c2.setProd_precio("500");
        c2.setProd_marca("Samsung");
        
        ImplCelular ic=new ImplCelular();
        ic.agregarCelulares(c);
        ic.reporteCelular();
        
        System.out.println("asdasd: ");
    }
}
//