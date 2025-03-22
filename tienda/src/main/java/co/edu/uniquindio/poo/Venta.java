package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Venta {
    private String fecha;
    private double subTotal;
    private double impuesto;
    private double valorTotal;
    private Cliente cliente;
    private List<DetalleVenta> listDetalleVentas;

    public Venta(String fecha, double subTotal, double impuesto, double valorTotal, Cliente cliente) {
        this.fecha = fecha;
        this.subTotal = subTotal;
        this.impuesto = impuesto;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.listDetalleVentas = new ArrayList<>();
    }

    public void calcularSubTotal() {
        this.subTotal = 0;
        for (DetalleVenta detalle : listDetalleVentas) {
            detalle.calcularSubTotal(); // Asegurar que cada detalle tiene su subtotal actualizado
            this.subTotal += detalle.getSubTotal();
        }
    }

    public void calcularTotal() {
        calcularSubTotal(); // Primero, aseguramos que el subtotal está actualizado
        this.impuesto = subTotal * 0.19; // Suponiendo un 19% de IVA
        this.valorTotal = subTotal + impuesto; // Total = Subtotal + Impuesto
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<DetalleVenta> getListDetalleVentas() {
        return listDetalleVentas;
    }

    public void setListDetalleVentas(List<DetalleVenta> listDetalleVentas) {
        this.listDetalleVentas = listDetalleVentas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "fecha='" + fecha + '\'' +
                ", subTotal=" + subTotal +
                ", impuesto=" + impuesto +
                ", valorTotal=" + valorTotal +
                ", cliente=" + cliente +
                ", detalles=" + listDetalleVentas +
                '}';
    }



}

