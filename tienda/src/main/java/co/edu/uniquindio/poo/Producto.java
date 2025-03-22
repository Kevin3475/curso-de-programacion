package co.edu.uniquindio.poo;

public class Producto {
    private String nombre;
    private double valor;
    private String categoria;
    private int codigoProducto;
    public int stock;

    public Producto(String nombre, double valor, String categoria, int codigoProducto, int stock) {
        this.nombre = nombre;
        this.valor = valor;
        this.categoria = categoria;
        this.codigoProducto = codigoProducto;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", valor=" + valor +
                ", categoría='" + categoria + '\'' +
                ", códigoProducto=" + codigoProducto +
                ", stock=" + stock +
                '}';
    }
}