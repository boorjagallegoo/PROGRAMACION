import java.io.Console;

/*
 * Pide un número (que debe estar entre 0 y 10) y
 * mostrar la tabla de multiplicar de dicho número.
 */

public class Ejercicio16 {
    public static void main(String[] args) {
        Console c = System.console();

        int numero;

        do {
            numero = Integer.parseInt(c.readLine("Digite un número: "));
        } while (numero < 0 || numero > 10);

        System.out.println("La tabla de multiplicar del número "+numero+" es: ");
 
        for (int i=1 ; i <=12 ; i++)
        System.out.println(" * " +i+ " = "+numero*i);
    }

}
