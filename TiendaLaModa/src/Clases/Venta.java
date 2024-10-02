/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Frander
 */
public class Venta {
    String ID,monto,productos,pago,comprador,vendedor,fecha,cantidades;

    public Venta(String ID, String monto, String productos, String pago, String comprador, String vendedor, String fecha, String cantidades) {
        this.ID = ID;
        this.monto = monto;
        this.productos = productos;
        this.pago = pago;
        this.comprador = comprador;
        this.vendedor = vendedor;
        this.fecha = fecha;
        this.cantidades = cantidades;
    }

    public String getCantidades() {
        return cantidades;
    }

    public void setCantidades(String cantidades) {
        this.cantidades = cantidades;
    }

    

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
