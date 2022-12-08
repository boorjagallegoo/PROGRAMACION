import java.io.Console;

/*
 * Leer un números hasta que introduzca un 0.
 * Para cada uno indicar si es par o impar.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Console c = System.console();

        int numero;

        numero = Integer.parseInt(c.readLine("Digite un número: "));

        while (numero != 0) {
            if (numero %2 == 0) {
                System.out.println("El número " + numero + " es Par.");

            } 
            else {
                System.out.println("El número " + numero + " es Impar.");
            }

            numero = Integer.parseInt(c.readLine("Digite un número: "));
        }

    }

}
