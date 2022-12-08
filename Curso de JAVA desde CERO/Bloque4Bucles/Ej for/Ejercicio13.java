import java.io.Console;
import java.text.ParsePosition;

/*
 * Pedir 10 números. Mostrar la media de los números positivos,
 * la media de los números negativos y la cantidad de ceros.
 */

public class Ejercicio13 {
    public static void main(String[] args) {
        Console c = System.console();
        int numero, suma_pos = 0, conteo_pos = 0,
                suma_neg = 0, conteo_neg = 0, conteo_ceros = 0;
        float media_pos, media_neg;

        for (int i = 1; i <= 10; i++) {
            numero = Integer.parseInt(c.readLine("Digite un número: "));

            if (numero == 0) { // Si el número es cero.
                conteo_ceros++; // Aumentamos en 1 el conteo de 0s.
            } 
            else if (numero > 0) { // Si el númeo es positivo.
                suma_pos += numero; // Suma iterativa de positivos.
                conteo_pos++;
            } 
            else {// Si el número es neativo.
                suma_neg += numero;
                conteo_neg++;
            }
        }

        // Tratamos con los positivos
        if (conteo_pos == 0) {
            System.out.println("No se puede sacar la media de los positivos.");
        }
        else {
            media_pos = (float) suma_pos/conteo_pos;
            System.out.println("La media de los números positivos es: "+media_pos);
        }

        // Tratamos con los negativos
        if (conteo_neg == 0) {
            System.out.println("No se puede sacar la media de los positivos.");
        }
        else {
            media_neg = (float) suma_neg/conteo_neg;
            System.out.println("La media de los números positivos es: "+media_neg);
        }

        System.out.println("La cantidad de ceros es: "+conteo_ceros);
    }

}
