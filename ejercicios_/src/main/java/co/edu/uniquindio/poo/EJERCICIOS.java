package co.edu.uniquindio.poo;

import java.util.Scanner;

public class EJERCICIOS {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Datos del estudiante

        System.out.println("Ingrese la información del estudiante:");

        System.out.print("Número de identificación: ");
        int identificacion = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nombres: ");
        String nombres = scanner.nextLine();

        System.out.print("Apellidos: ");
        String apellidos = scanner.nextLine();

        System.out.print("Correo electrónico: ");
        String correo = scanner.nextLine();

        System.out.print("Teléfono: ");
        int telefono = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Edad: ");
        byte edad = scanner.nextByte();
        scanner.nextLine();

        // Mostrar la información

        System.out.println("\nInformación del estudiante:");
        System.out.println("Identificación: " + identificacion);
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Correo electrónico: " + correo);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Edad: " + edad);

        scanner.close();
    }
}
