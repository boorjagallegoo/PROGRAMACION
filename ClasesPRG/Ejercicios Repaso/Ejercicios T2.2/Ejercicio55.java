import java.io.Console;
import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;

public class Ejercicio55 {
    public static String[] leePalabras (int numPalabras) {

        String[] arr = new String[numPalabras];

        Console con = System.console();
        int palabrasLeidas = 0;

        do {
            System.out.printf("Introduzca la plabra %d: ", palabrasLeidas + 1);
            String palabra = con.readLine();

            arr[palabrasLeidas] = palabra;
            ++palabrasLeidas;
        
        } while (palabrasLeidas < numPalabras);

        return arr;
    }

    private static String pasaACapital(String strIn) {
        return StringUtils.capitalize(strIn);                   
        // return Character.toUpperCase(strIn.charAt(0)) + strIn.substring(1); 

        // Los 2 metodos sirven.
    }

    public static void main(String[] args) {
        String[] arr = leePalabras(10);
        
        for  (int i = 0; i < arr.length; ++i) {
            arr[i] = pasaACapital(arr[i]);
        }
        
        System.out.println(Arrays.toString(arr));
    }


}