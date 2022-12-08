import java.io.Console;

/*
 * Pedir 10 números y escribir la suma total.
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        Console c = System.console();
        int numero, suma = 0;

        for (int i = 1; i <= 10; i++) {
            numero = Integer.parseInt(c.readLine("Digite un número: "));

            suma = suma + numero; // suma iterativa
            // suma += numero
        }
        System.out.println("La suma es: " +suma);
    }

}
