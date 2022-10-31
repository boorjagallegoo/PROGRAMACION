import java.io.Console;
import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        Console c = System.console();

        String[] cadenas = new String[10];
        boolean fin = false;
        int idx = 0;

        do {
            System.out.printf("Introduzca la palabra %d: ", idx + 1);
            String str = c.readLine(); 

            if (str.isEmpty()) {
                fin = true;
            } else {
                cadenas [idx] = str;
                idx = idx + 1;
            }
            } while (!fin && idx < 10);

            if (idx < 10) cadenas = Arrays.copyOfRange(cadenas, 0, idx);
    }
}


/*
 * Haz ahora que el programa permita introducir hasta 10 palabras y las almacene
 * en un array de cadenas. El usuario podrá interrumpir la introducción de
 * cadenas si pulsa ENTER sin escribir nada (cadena vacía).
 * 
 * Una vez terminada la introducción de cadenas muestra al usuario la lista de
 * palabras introducidas.
 */