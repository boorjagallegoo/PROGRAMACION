import java.io.Console;

/*
 * Leer un número e indicar si es positivo o
 * negativo. El proceso se repetirá hasta que
 * introduzca un 0.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Console c = System.console();

        int numero;

        numero = Integer.parseInt(c.readLine("Digite un número: "));

        while (numero != 0) { // mientras el numero sea diferente de 0.
            if (numero > 0) {
                System.out.println("El número " + numero + " es Positivo.");
            } 
            else {
                System.out.println("El número " + numero + " es Negativo.");
            }

            numero = Integer.parseInt(c.readLine("Digite un número: "));

        }
    }

}
