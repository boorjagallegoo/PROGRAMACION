import java.io.Console;

/*
 * Pedir números hasta que se teclee un 0,
 * mostrar la suma de todos los números 
 * introducidos.
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        Console c = System.console();

        int numero, suma = 0;

        do {
            numero = Integer.parseInt(c.readLine("Digite un número: "));

            suma += numero; // Suma interactiva.

        } while (numero != 0);

        System.out.println("La suma total es " + suma);

    }

}