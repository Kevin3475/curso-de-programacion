package co.edu.uniquindio.poo;


import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String nombre;
    private String nit;
    private List<Cliente> listClientes;
    private List<Producto> listProductos;
    private List<Venta> listVentas;

    public Tienda(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.listClientes = new ArrayList<>();
        this.listVentas = new ArrayList<>();
        this.listProductos = new ArrayList<>();
    }


    public void registrarCliente(Cliente cliente) {
        this.listClientes.add(cliente);
    }

    public  void listarClientes() {
        if(listClientes.isEmpty()) {
            System.out.println("no hay clientes registrados");
        } else {
            System.out.println("lista de clientes:");
            for (Cliente cliente : listClientes) {
                System.out.println(cliente);
            }
        }
    }

    public void actualizarCliente(String cedula, Cliente clienteActualizado){
        boolean clientesActualizar = false;
        for (int i = 0; i<listClientes.size(); i++) {
            if (listClientes.get(i).getcedula().equals(cedula)) {
                listClientes.set(i, clienteActualizado);
                System.out.println("cliente actualizado");
                clientesActualizar = true;
                break;
            }
        }
        System.out.println("cliente con cedula" + cedula + " no encontrado");
    }

    public void eliminarCliente(String cedula){
        for (int i = 0; i < listClientes.size(); i++) {
            if (listClientes.get(i).getcedula().equals(cedula)) {
                listClientes.remove(i);
                System.out.println("cliente eliminado");
                return;
            }
        }
    }

    public void crearVentas(Venta venta) {
        listVentas.add(venta);
    }

    public void registrarProducto(Producto producto) {
        listProductos.add(producto);
    }

    public double calcularTotalDeVentas() {
        double total = 0;
        for (Venta venta : listVentas) {
            venta.calcularTotal();
            total += venta.getValorTotal();
        }
        return total;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {

        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public List<Cliente> getListClientes() {
        return listClientes;
    }

    public void setListClientes(List<Cliente> listClientes) {
        this.listClientes = listClientes;
    }

    public List<Venta> getListVentas() {
        return listVentas;
    }

    public void setListVentas(List<Venta> listVentas) {
        this.listVentas = listVentas;
    }

    public List<Producto> getListProductos() {
        return listProductos;
    }

    public void setListProductos(List<Producto> listProductos) {
        this.listProductos = listProductos;
    }

    public void mostrarVentas() {
        System.out.println("\n=== Ventas Registradas ===");
        if (listVentas.isEmpty()) {
            System.out.println("No hay ventas registradas.");
        } else {
            for (Venta venta : listVentas) {
                System.out.println("\nFecha: " + venta.getFecha());
                System.out.println("Cliente: " + venta.getCliente().getnombre() + " - Cédula: " + venta.getCliente().getcedula());
                System.out.println("Productos vendidos:");
                for (DetalleVenta detalle : venta.getListDetalleVentas()) {
                    System.out.println("  - Producto: " + detalle.getProducto().getNombre() +
                            ", Cantidad: " + detalle.getCantidad() +
                            ", Subtotal: $" + detalle.getSubTotal());
                }
                System.out.println("Total de la venta: $" + venta.getValorTotal());
                System.out.println("=========================");
            }
        }
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "nombre='" + nombre + '\'' +
                ", nit='" + nit + '\'' +
                ", clientes=" + listClientes +
                ", productos=" + listProductos +
                ", ventas=" + listVentas +
                '}';
    }

}
