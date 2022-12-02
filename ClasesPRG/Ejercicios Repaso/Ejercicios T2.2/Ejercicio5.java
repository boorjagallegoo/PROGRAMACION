import java.io.Console;
import java.util.Arrays;

import javax.sound.sampled.SourceDataLine;

public class Ejercicio5 {
    public static String[] leePalabras(int numPalabras) {
        String[] palabrasLeidas = new String[numPalabras];
        int numLeidas = 0;

        Console con = System.console();
        do {
            System.out.printf("Introduzca la plabra %d: ", numLeidas +1);
            String palabra = con.readLine();

            if (!palabra.isEmpty() && !palabra.isBlank()) { // esto lo hacemos como un extra para cuando no hay palabras.
                palabrasLeidas[numLeidas] = palabra;
                ++numLeidas;
            }

        } while (numLeidas < numPalabras);

        return palabrasLeidas;

        for (int idx = 0; idx < palabras.length; ++idx) {
            palabras[idx] = capitalize(palabras[idx]);
        }
    }

    public static void main(String[] args) {
        String[] palabras = leePalabras(3);

        System.out.println(Arrays.toString(palabras));

//        boolean[] array_de_enteros = new boolean[4]; // Array de enteros

    //     array_de_enteros[0] = true;
    //     array_de_enteros[1] = true;
    //     array_de_enteros[2] = false;                 // Así metemos valores al Array.
    //     array_de_enteros[3] = array_de_enteros[2];
    //     array_de_enteros[3] = false;
                 
    //     System.out.println(array_de_enteros[4]);

    //     System.out.println(Arrays.toString(array_de_enteros)); // Con esto se muestra en pantalla
     }
    
}
       