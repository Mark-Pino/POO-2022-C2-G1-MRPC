/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author LAB REDES
 */
public class Sales {
    
    private String sales_id;
    private String sales_tipocomprobante;
    private String sales_serie;
    private String sales_numeroventa;
    private Date   sales_fecha;
    private double sales_importetotal;
    private Client sales_client;
    private Worker sales_worker;
    private ArrayList<DetailSales> listDetailSales;
    private DetailSales DetailSales;

    public String getSales_id() {
        return sales_id;
    }

    public void setSales_id(String sales_id) {
        this.sales_id = sales_id;
    }

    public String getSales_tipocomprobante() {
        return sales_tipocomprobante;
    }

    public void setSales_tipocomprobante(String sales_tipocomprobante) {
        this.sales_tipocomprobante = sales_tipocomprobante;
    }

    public String getSales_serie() {
        return sales_serie;
    }

    public void setSales_serie(String sales_serie) {
        this.sales_serie = sales_serie;
    }

    public String getSales_numeroventa() {
        return sales_numeroventa;
    }

    public void setSales_numeroventa(String sales_numeroventa) {
        this.sales_numeroventa = sales_numeroventa;
    }

    public Date getSales_fecha() {
        return sales_fecha;
    }

    public void setSales_fecha(Date sales_fecha) {
        this.sales_fecha = sales_fecha;
    }

    public double getSales_importetotal() {
        return sales_importetotal;
    }

    public void setSales_importetotal(double sales_importetotal) {
        this.sales_importetotal = sales_importetotal;
    }

    public Client getSales_client() {
        return sales_client;
    }

    public void setSales_client(Client sales_client) {
        this.sales_client = sales_client;
    }

    public Worker getSales_worker() {
        return sales_worker;
    }

    public void setSales_worker(Worker sales_worker) {
        this.sales_worker = sales_worker;
    }

    public ArrayList<DetailSales> getListDetailSales() {
        return listDetailSales;
    }

    public void setListDetailSales(ArrayList<DetailSales> listDetailSales) {
        this.listDetailSales = listDetailSales;
    }

    public DetailSales getDetailSales() {
        return DetailSales;
    }

    public void setDetailSales(DetailSales DetailSales) {
        this.DetailSales = DetailSales;
    }
    
    
    
}
