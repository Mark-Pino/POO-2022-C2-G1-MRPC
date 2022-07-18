package entities;

public class Producto {
    
    private String prod_id;
    private String prod_nombre;
    private String prod_stock;
    private double prod_preciocompra;
    private double prod_precioventa;

    public String getProd_id() {
        return prod_id;
    }

    public void setProd_id(String prod_id) {
        this.prod_id = prod_id;
    }

    public String getProd_nombre() {
        return prod_nombre;
    }

    public void setProd_nombre(String prod_nombre) {
        this.prod_nombre = prod_nombre;
    }

    public String getProd_stock() {
        return prod_stock;
    }

    public void setProd_stock(String prod_stock) {
        this.prod_stock = prod_stock;
    }

    public double getProd_preciocompra() {
        return prod_preciocompra;
    }

    public void setProd_preciocompra(double prod_preciocompra) {
        this.prod_preciocompra = prod_preciocompra;
    }

    public double getProd_precioveta() {
        return prod_precioventa;
    }

    public void setProd_precioveta(double prod_precioventa) {
        this.prod_precioventa = prod_precioventa;
    }
    
    
    
}
