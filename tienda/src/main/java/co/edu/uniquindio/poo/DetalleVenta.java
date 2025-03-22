package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;


public class DetalleVenta {
    private int cantidad;
    private double subtotal;
    private double total;
    private Producto producto;

    public DetalleVenta(int cantidad, double subtotal, double total, Producto producto) {
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.total = total;
        this.producto = producto;
    }

    public void calcularSubTotal() {
        this.subtotal = cantidad * producto.getValor();
        this.total = subtotal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subtotal;
    }

    public void setSubTotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String toString() {
        return  "detalle venta{" +
                "cantidad =" + cantidad + '/' +
                ", subtotal =" + subtotal + '/' +
                ", total =" + total + '/' +
                ", producto=" + producto + '/' +
                '}';

    }
}
