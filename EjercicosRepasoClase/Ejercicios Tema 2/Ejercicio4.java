import java.io.Console;
import java.util.Arrays;

public class Ejercicio4 {
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
                cadenas[idx] = str;
                idx = idx + 1;
            }
        } while (!fin && idx < 10);

        if (idx < 10)
            cadenas = Arrays.copyOfRange(cadenas, 0, idx);

           Arrays.toString(cadenas);
           
           System.out.println(Arrays.toString(cadenas));
    }
}

/*
 * Modifica el programa anterior para que ordene las palabras introducidas
 * previamente por el usuario. (Pista: java.util.Arrays.sort()).
 */
