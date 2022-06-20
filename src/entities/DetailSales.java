
package entities;


public class DetailSales {
    
    private String detailsales_id;
    private double detailsales_cantidad;
    private String detailsales_descripcion;
    private double detailsales_preciounitario;
    private double detailsales_precioitem;
    private Producto detailsales_Producto;

    public String getDetailsales_id() {
        return detailsales_id;
    }

    public void setDetailsales_id(String detailsales_id) {
        this.detailsales_id = detailsales_id;
    }

    public double getDetailsales_cantidad() {
        return detailsales_cantidad;
    }

    public void setDetailsales_cantidad(double detailsales_cantidad) {
        this.detailsales_cantidad = detailsales_cantidad;
    }

    public String getDetailsales_descripcion() {
        return detailsales_descripcion;
    }

    public void setDetailsales_descripcion(String detailsales_descripcion) {
        this.detailsales_descripcion = detailsales_descripcion;
    }

    public double getDetailsales_preciounitario() {
        return detailsales_preciounitario;
    }

    public void setDetailsales_preciounitario(double detailsales_preciounitario) {
        this.detailsales_preciounitario = detailsales_preciounitario;
    }

    public double getDetailsales_precioitem() {
        return detailsales_precioitem;
    }

    public void setDetailsales_precioitem(double detailsales_precioitem) {
        this.detailsales_precioitem = detailsales_precioitem;
    }

    public Producto getDetailsales_Producto() {
        return detailsales_Producto;
    }

    public void setDetailsales_Producto(Producto detailsales_Producto) {
        this.detailsales_Producto = detailsales_Producto;
    }
    
    
    
}
