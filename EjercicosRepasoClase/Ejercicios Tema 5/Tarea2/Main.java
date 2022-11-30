
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /* Almacenamos información de alumno. */
        System.out.print("Ingrese nombre: ");
        String nombre = input.next();
        System.out.print("Ingrese sus apellidos: ");
        String apellidos = input.next();
        System.out.print("Ingrese DNI: ");
        int dNI = input.nextInt();
        System.out.print("Ingrese su email: ");
        String email = input.next();
        System.out.print("Ingrese su dirección: ");
        String direccion = input.next();
        System.out.print("Ingrese su teléfono: ");
        int telefono = input.nextInt();


        Alumnos alumnos = new Alumnos(nombre, apellidos, dNI, email, direccion, telefono);
        ArrayList<Alumnos> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(alumnos);
    }
}
