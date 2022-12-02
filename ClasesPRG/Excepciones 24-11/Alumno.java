
public class Alumno {
    public static final int FILTRAR = 1;
    public static final int DIVIDIR = 2;
    public static final int SALIR = 3;
    public static final int ORDEN_CRECIENTE = 3;

    public static int numAlumnos = 0;

    private String nombre; // En este caso es bueno ponerlas private en vez de públicas.
    private String apellidos;
    public int edad;

    public Alumno() {
        System.out.println("Constructor de Alumno.");

    }; // Al poner esto el new Alumno de Main va sin necesidad de quitar la clase de
       // abajo.

    public Alumno(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        System.out.println("Constructor de Alumno.");
    } // si tapamos esto el new Alumno de Main va.

    public Alumno(String nombre, String apellidos, int edad) {
        this(nombre, apellidos);
        this.edad = edad;
    }

    public static void incrementaNumAlumnos() {
        ++numAlumnos;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setApellidos(String apellidos) {
        this.nombre = apellidos;
    }
    public String getApellidos() {
        return apellidos;
    }

    @Override
    public String toString() {
        return nombre + "" + apellidos + ", " + edad + "años.";
    }
}