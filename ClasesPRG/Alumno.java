package CLASES;

public class Alumno {
    public static final String TABLA_L_DNI = "TRWAGMYPDXBNJZSQVHLCKE";

    public static int alumnos;

    public char letraDNI(int resto) {
        return TABLA_L_DNI.charAt(resto);
    }

    public String nombre;
    public String apellidos;
    public String DNI;
    public String data_nacimiento;
    public String ciclo;
    public byte curso;

    //Constructores

    public Alumno(String nombre, String apellidos, String DNI, String data_nacimiento, ); {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI; 
        this.data_nacimiento = data_nacimiento;
        alumnos++;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void ponNombre(String n) {
        this.nombre = n;
    }

    public int edad() {
        return 0;
    }
    
}
