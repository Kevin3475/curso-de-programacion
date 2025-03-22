package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tienda tienda = new Tienda("Mi Tienda", "123456789");

        int opcion = 0;

        while (opcion != 7) {
            System.out.println("\n Menu Interactivo de la Tienda");
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Registrar Producto");
            System.out.println("3. Hacer Venta");
            System.out.println("4. Mostrar Ventas");
            System.out.println("5. mostrar lista de clientes");
            System.out.println("6. actualizar cliente");
            System.out.println("7. Salir");

            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                System.out.print("Ingrese el nombre del Cliente: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese la cédula del Cliente: ");
                String cedula = scanner.nextLine();
                System.out.print("Ingrese la dirección del Cliente: ");
                String direccion = scanner.nextLine();
                System.out.print("Ingrese el teléfono del Cliente: ");
                int telefono = scanner.nextInt();
                scanner.nextLine();

                tienda.registrarCliente(new Cliente(nombre, cedula, direccion, telefono));
                System.out.println("Cliente registrado exitosamente.");
            } else if (opcion == 2) {
                System.out.print("Ingrese el nombre del Producto: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese el valor del Producto: ");
                double valor = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Ingrese la categoría del Producto: ");
                String categoria = scanner.nextLine();
                System.out.print("Ingrese el código del Producto: ");
                int codigo = scanner.nextInt();
                System.out.print("Ingrese el stock del Producto: ");
                int stock = scanner.nextInt();
                scanner.nextLine();

                tienda.registrarProducto(new Producto(nombre, valor, categoria, codigo, stock));
                System.out.println("Producto registrado exitosamente.");
            } else if (opcion == 3) {
                System.out.print("Ingrese la cédula del Cliente : ");
                String cedulaCliente = scanner.nextLine();

                Cliente clienteEncontrado = null;
                for (Cliente c : tienda.getListClientes()) {
                    if (c.getcedula().equals(cedulaCliente)) {
                        clienteEncontrado = c;
                        break;
                    }
                }

                if (clienteEncontrado == null) {
                    System.out.println("Cliente no encontrado.");
                } else {
                    System.out.print("Ingrese la fecha de la venta: ");
                    String fecha = scanner.nextLine();
                    Venta venta = new Venta(fecha, 0, 0, 0, clienteEncontrado);

                    boolean agregarProductos = true;
                    while (agregarProductos) {
                        System.out.print("Ingrese el código del Producto: ");
                        int codigoProducto = scanner.nextInt();
                        scanner.nextLine();

                        Producto productoEncontrado = null;
                        for (Producto p : tienda.getListProductos()) {
                            if (p.getCodigoProducto() == codigoProducto) {
                                productoEncontrado = p;
                                break;
                            }
                        }

                        if (productoEncontrado == null) {
                            System.out.println("Producto no encontrado.");
                        } else {
                            System.out.print("Ingrese la cantidad: ");
                            int cantidad = scanner.nextInt();
                            scanner.nextLine();

                            double subtotal = cantidad * productoEncontrado.getValor();
                            double total = subtotal;

                            DetalleVenta detalle = new DetalleVenta(cantidad, subtotal, total, productoEncontrado);
                            venta.getListDetalleVentas().add(detalle);

                            System.out.print("¿Desea agregar otro producto? (si/no): ");
                            String respuesta = scanner.nextLine();
                            if (!respuesta.equalsIgnoreCase("si")) {
                                agregarProductos = false;
                            }
                        }
                    }

                    venta.calcularTotal();
                    tienda.crearVentas(venta);
                    System.out.println("Venta registrada exitosamente.");
                }
            } else if (opcion == 4) {
                tienda.mostrarVentas();
            }else if (opcion ==5){
                System.out.println("lista de clientes registrados exitosamente:");
                tienda.listarClientes();
            }else if (opcion == 6){
                System.out.println("ingrese la cedula del Cliente que quiere modificar:");
                String cedula = scanner.nextLine();

                System.out.print("Ingrese el nuevo nombre del Cliente: ");
                String nuevoNombre = scanner.nextLine();
                System.out.print("Ingrese la nueva dirección del Cliente: ");
                String nuevaDireccion = scanner.nextLine();
                System.out.print("Ingrese el nuevo teléfono del Cliente: ");
                int nuevoTelefono = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                // Crear un nuevo objeto Cliente con los datos actualizados
                Cliente clienteActualizado = new Cliente(nuevoNombre, cedula, nuevaDireccion, nuevoTelefono);

                // Llamar al método de actualizar en Tienda, que se encargará de buscar y actualizar
                tienda.actualizarCliente(cedula, clienteActualizado);
            }else if (opcion == 7) {
                System.out.println("Saliendo del sistema...");
            } else {
                System.out.println("Opción no válida, intente nuevamente.");
            }
        }
        scanner.close();
    }

}



