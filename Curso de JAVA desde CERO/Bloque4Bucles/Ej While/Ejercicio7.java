import java.io.Console;

/*
 * Pedir números hasta que se 
 * introduzca uno negativo, y calcular la media.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Console c = System.console();
        int numero, elementos = 0, suma = 0;
        float media;

        numero = Integer.parseInt(c.readLine("Digite un número: "));

        while(numero>= 0) {
            suma += numero; // Suma interactiva.
            elementos++; // Aumentamos 1 a elementos.

            numero = Integer.parseInt(c.readLine("Digite un número: "));

        }

        if (elementos == 0) { // elementos nunca entro al while por lo que sigue siendo 0.
            System.out.println("Error: La división entre 0 no existe.");
        } else {
            media = (float) suma / elementos;
            System.out.println("La media es: " + media);
        }

    }

}
