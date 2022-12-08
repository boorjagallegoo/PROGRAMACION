import java.io.Console;

/*
 * Pedir números hasta que se teclee uno negativo, y mostar
 * cuántos números se han introducido.
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        Console c = System.console();

        int numero, contador = 0;

        numero = Integer.parseInt(c.readLine("Digite un número: "));

        while (numero >= 0) { // mientras numero no sea negativo.
            contador++; // Aumentamos en 1 el contador.

            numero = Integer.parseInt(c.readLine("Digite un número: "));

        }
        System.out.println("Ha introducido "+contador+ " números no negativos.");
        
    }
    
}
