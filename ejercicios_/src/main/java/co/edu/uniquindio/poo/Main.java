package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del niño: ");
        String nombres = scanner.nextLine();

        System.out.print("Ingrese el género del niño: ");
        String genero = scanner.nextLine();

        System.out.print("Ingrese las alergias (si tiene, si no escriba 'Ninguna'): ");
        String alergias = scanner.nextLine();

        System.out.print("Ingrese el nombre del acudiente: ");
        String nombreAcudiente = scanner.nextLine();

        System.out.print("Ingrese la edad del niño: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese la identificación del niño: ");
        int identificacion = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el teléfono del acudiente: ");
        int telefonoAcudiente = scanner.nextInt();
        scanner.nextLine();


        Guarderia nino1 = new Guarderia(nombres, genero, alergias, nombreAcudiente, edad, identificacion, telefonoAcudiente);

        System.out.println("\nDatos del niño ingresado:");
        System.out.println(nino1);

        scanner.close();

        }
    }
