import java.io.Console;
import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;

public class Ejercico5 {
    public static String[] leePalabras (int numPalabras);

    Console c = System.console();

    String[] arr = new String[numPalabras];
    int palabrasLeidas = 0;

    do {
        System.out.printf("Introduzca la palabra %d: ", palabrasLeidas + 1);
        String palabra = c.readLine();

        arr[palabrasLeidas] = palabra;
        ++palabrasLeidas;
    } while (palabrasLeidas < numPalabras);

    return arr;
    }

    private static String ponMayus(String strIn) {
        return StringUtils.capitalize(strIn);
    }

    public static void main(String[] args) {
        String[] arr leePalabras(10);

        for (int i = 0; i < arr.length; ++i) {
            arr[i] = ponMayus(arr[i]);
    }

    System.out.println(Arrays.toString(arr));
        
}



/*
 * Haz que el programa ponga el mayúsculas 
 * la primera letra de cada palabra.
 */