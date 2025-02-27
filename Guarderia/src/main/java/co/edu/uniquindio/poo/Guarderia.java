package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Guarderia {

    private String nombres;
    private List<Ninio> listNinios;

    public Guarderia(String nombres) {
        this.nombres = nombres;
        this.listNinios = new ArrayList<>();
    }

    public boolean verificarNinio(Ninio ninio){
        boolean existe = true;
        for(Ninio ninios : listNinios){
            if(ninios.getID().equals(ninio.getID())){
                existe = false;
            }
        }
        return existe;
    }

    public void eliminarNinio(String ID){
        Boolean ninioEliminar = false;
        for(int i = 0; i < listNinios.size(); i++){
            if(listNinios.get(i).getID().equals(ID)){
                listNinios.remove(i);
                ninioEliminar = true;
                break;
            }
        }
    }

    public void actualizarNinio(String ID, Ninio ninio){
        Boolean ninioActualizar = false;
        for(int i = 0; i < listNinios.size(); i++){
            if(listNinios.get(i).getID().equals(ID)){
                listNinios.set(i, ninio);
                ninioActualizar = true;
                break;
            }
        }
    }

    public void almacenarNinios(Ninio ninio) {
        if(verificarNinio(ninio)){
            listNinios.add(ninio);
            System.out.println("Niño almacenado com exito");
        }else{
            System.out.println("Niño ya esta almacenado");
        }
    }

    public void obtenerNinioConMasVocales() {
        boolean encontrado = false;
        String nombreConMasVocales = "";
        int maxVocales = 0;

        for(Ninio ninio : listNinios){
            int vocales = contarVocales(ninio.getNombres());
            if(vocales > maxVocales){
                maxVocales = vocales;
                nombreConMasVocales = ninio.getNombres();
                encontrado = true;
            }
        }
        if(encontrado){
            System.out.println("no hay niños registrados");
        } else {
            System.out.println("Niño con mas vocales en el nombre: " + nombreConMasVocales + " (vocales: " + maxVocales + ")");
        }
    }

    private int contarVocales(String nombre) {
        int contador = 0;
        nombre = nombre.toLowerCase();
        for (char letra : nombre.toCharArray()) {
            if ("aeiou".indexOf(letra) != -1) { // Si es vocal, aumenta el contador
                contador++;
            }
        }
        return contador;
    }


    public void obtenerNinioConNombrePalindromo() {
        boolean existePalindromo = false;
        String nombrePalindromo = "";

        for (Ninio ninio : listNinios) {
            if (esPalindromo(ninio.getNombres())) {
                nombrePalindromo = ninio.getNombres();
                existePalindromo = true;
                break; // Detenemos el ciclo al encontrar el primer palíndromo
            }
        }

        if (existePalindromo) {
            System.out.println("El niño con nombre palíndromo es: " + nombrePalindromo);
        } else {
            System.out.println("No hay niños con nombres palíndromos.");
        }
    }

    public boolean esPalindromo(String nombre) {
        nombre = nombre.toLowerCase().replaceAll("\\s+", ""); // Convierte a minúsculas y elimina espacios
        return new StringBuilder(nombre).reverse().toString().equals(nombre);
    }



    public void obtenerNinioConMasConsonantes() {
        boolean encontrado = false;
        String nombreConMasConsonantes = "";
        int maxConsonantes = 0;

        for (Ninio ninio : listNinios) {
            int consonantes = contarConsonantes(ninio.getNombres());
            if (consonantes > maxConsonantes) {
                maxConsonantes = consonantes;
                nombreConMasConsonantes = ninio.getNombres();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay niños registrados.");
        } else {
            System.out.println("Niño con más consonantes en el nombre: " + nombreConMasConsonantes + " (Consonantes: " + maxConsonantes + ")");
        }
    }
    private int contarConsonantes(String nombre) {
        int contador = 0;
        nombre = nombre.toLowerCase();

        for (char c : nombre.toCharArray()) {
            if ("bcdfghjklmnpqrstvwxyz".indexOf(c) != -1) { // Si es consonante, aumenta el contador
                contador++;
            }
        }

        return contador;
    }


    public void obtenerNinioMayor() {
        boolean encontrado = false;
        String nombreMayor = "";
        int edadMayor = 0;

        if (listNinios.isEmpty()) { // Verifica si la lista está vacía
            System.out.println("No hay niños registrados.");
            return;
        }

        for (Ninio ninio : listNinios) {
            if (ninio.getEdad() > edadMayor) {
                edadMayor = ninio.getEdad();
                nombreMayor = ninio.getNombres();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró un niño con edad registrada.");
        } else {
            System.out.println("Niño de mayor edad: " + nombreMayor + " (Edad: " + edadMayor + " años)");
        }
    }


    public void eliminarVocalesDeNombres() {
        boolean modificado = false;

        if (listNinios.isEmpty()) { // Verifica si la lista está vacía
            System.out.println("No hay niños registrados.");
            return;
        }

        for (Ninio ninio : listNinios) {
            String nombreOriginal = ninio.getNombres();
            String nombreSinVocales = nombreOriginal.replaceAll("[aeiouAEIOU]", ""); // Elimina vocales

            if (!nombreOriginal.equals(nombreSinVocales)) {
                ninio.setNombres(nombreSinVocales); // Actualiza el nombre sin vocales
                modificado = true;
            }
        }

        if (!modificado) {
            System.out.println("No se modificaron nombres (ninguno contenía vocales).");
        } else {
            System.out.println("Se han eliminado las vocales de los nombres de todos los niños.");
        }
    }


    @Override
    public String toString() {
        return "Guarderia{" +
                "nombres='" + nombres + '\'' +
                ", listNinios=" + listNinios +
                '}';
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public List<Ninio> getListNinios() {
        return listNinios;
    }

    public void setListNinios(List<Ninio> listNinios) {
        this.listNinios = listNinios;
    }
}