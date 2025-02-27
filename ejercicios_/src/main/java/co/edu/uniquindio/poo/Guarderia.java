package co.edu.uniquindio.poo;

public class Guarderia {
    private String nombres;
    private String genero;
    private String alergias;
    private String nombreAcudiente;
    private int edad;
    private int identificacion;
    private int telefonoAcudiente;

    public Guarderia(String nombres , String genero, String alergias, String nombreAcudiente, int edad, int identificacion, int telefonoAcudiente) {
        this.nombres = nombres;
        this.genero = genero;
        this.alergias = alergias;
        this.nombreAcudiente = nombreAcudiente;
        this.edad = edad;
        this.identificacion = identificacion;
        this.telefonoAcudiente = telefonoAcudiente;
    }
    @Override
    public String toString() {
        return "NIÑO {" +
                "Nombre='" + nombres + '\'' +
                ", Género='" + genero + '\'' +
                ", Alergias='" + alergias + '\'' +
                ", Nombre del Acudiente='" + nombreAcudiente + '\'' +
                ", Edad=" + edad +
                ", Identificación=" + identificacion +
                ", Teléfono del Acudiente=" + telefonoAcudiente +
                '}';
    }
}
