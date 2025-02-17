package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListaNombresPython {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();


        for (int i = 1; i <= 5; i++) {
            System.out.println("ingrese el nombre: "+ i +": ");
            nombres.add(scanner.nextLine());
        }

        ArrayList<String> nombresInversos = new ArrayList<>(nombres);
        Collections.reverse(nombresInversos);

        String mensaje = generarMensaje(nombres,nombresInversos);
        System.out.println(mensaje);

        scanner.close();
    }


    public static String generarMensaje(ArrayList<String> nombres, ArrayList<String> nombresInversos) {
        return  "La lista con los nombres normales: " + nombres + "\n" +
                "La lista con los nombres inversos: " + nombresInversos;
    }
}



