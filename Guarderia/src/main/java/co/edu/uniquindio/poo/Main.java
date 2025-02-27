package co.edu.uniquindio.poo;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Guarderia guarderia = new Guarderia("Pequeños Gigantes");

        int opcion = 0;

        while (opcion != 10) {
            System.out.println("\n Menu interativo de la guarderia");
            System.out.println("1. Agregar Niño");
            System.out.println("2. Eliminar Niño");
            System.out.println("3. Actualizar Niño");
            System.out.println("4. Mostrar lista de Niños");
            System.out.println("5. Mostrar Niño con mas vocales en el nombre");
            System.out.println("6. Mostrar Niño con nombre palindromo");
            System.out.println("7. Mostrar Niño con mas consonantes en el nombre");
            System.out.println("8. Mostrar Niño de mayor edad");
            System.out.println("9. Eliminar vocales del nombre de todos los niños");
            System.out.println("10. Salir");

            //------------------------------

            System.out.println("Selecciona una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();


            if(opcion == 1) {
                System.out.println("Ingrese el nombre del Niño");
                String nombre = scanner.nextLine();
                System.out.println("Ingrese la edad del Niño");
                int edad = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Ingrese el genero del Niño");
                String genero = scanner.nextLine();
                System.out.println("Ingrese el documento del Niño");
                String documento = scanner.nextLine();
                System.out.println("Ingrese la alergia del Niño");
                String alergia = scanner.nextLine();
                System.out.println("Ingrese el nombre del acudiente del Niño");
                String acudiente = scanner.nextLine();
                System.out.println("Ingrese el numero de contacto del acudiente del Niño");
                String contactoAcudiente = scanner.nextLine();
                System.out.println("Ingrese el ID del Niño");
                String ID = scanner.nextLine();

                Ninio ninio = new Ninio(nombre, edad, genero, documento, alergia, acudiente, contactoAcudiente, ID);
                guarderia.almacenarNinios(ninio);

            } else if (opcion == 2) {
                System.out.println("Ingrese ID del Niño a eliminar: ");
                String IDEliminarNinio = scanner.nextLine();
                guarderia.eliminarNinio(IDEliminarNinio);
            } else if (opcion == 3) {
                System.out.println("Ingrese el ID del Niño a actualizar: ");
                String IDActualizar = scanner.nextLine();

                System.out.println("Ingrese el nombre del Niño a actualizar: ");
                String nombre = scanner.nextLine();
                System.out.println("Ingrese la edad del Niño a actualizar: ");
                int edad = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Ingrese el genero del Niño a actualizar: ");
                String genero = scanner.nextLine();
                System.out.println("Ingrese el documento del Niño a actualizar: ");
                String documento = scanner.nextLine();
                System.out.println("Ingrese la alergia del Niño a actualizar: ");
                String alergia = scanner.nextLine();
                System.out.println("Ingrese el nombre del acudiente del Niño a actualizar: ");
                String acudiente = scanner.nextLine();
                System.out.println("Ingrese el numero de contacto del acudiente del Niño a actualizar: ");
                String contactoAcudiente = scanner.nextLine();
                System.out.println("Ingrese el ID del Niño a actualizar: ");
                String ID = scanner.nextLine();

                Ninio ninio = new Ninio(nombre, edad, genero, documento, alergia, acudiente, contactoAcudiente, ID);
                guarderia.actualizarNinio(IDActualizar, ninio);
            } else if (opcion == 4) {
                System.out.println("Mostrar la lista de niños almacenados: ");
                for(Ninio ninio : guarderia.getListNinios()){
                    System.out.println(ninio);
                }
            } else if (opcion == 5) {
                System.out.println("Mostrar Niño con mas vocales en el nombre: ");
                guarderia.obtenerNinioConMasVocales();
            }else if  (opcion == 6) {
                System.out.println("Mostrar Niño con nombre Palindromo: ");
                guarderia.obtenerNinioConNombrePalindromo();

            }else if (opcion == 7) {
                System.out.println("Mostrar Niño con mas consonantes en el nombre: ");
                guarderia.obtenerNinioConMasConsonantes();

            }else if (opcion == 8) {
                System.out.println("Mostrar Niño con la mayor edad: ");
                guarderia.obtenerNinioMayor();

            }else if  (opcion == 9) {
                System.out.println("Mostrar nombre de el niño sin vocales");
                guarderia.eliminarVocalesDeNombres();
            }
            else if (opcion == 10) {
                System.out.println("Chaooo pues.............. ");
                break;
            }else {
                System.out.println("Opcion no valida");
            }
        }
        scanner.close();
    }
}


