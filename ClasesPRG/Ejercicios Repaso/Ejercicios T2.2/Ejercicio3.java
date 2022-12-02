import java.io.Console;
import java.util.Arrays;

public class Ejercicio3 {
    public static void main (String[] args) {

        Console c = System.console();

        String[] strArr = new String[10];
        // El bucle terminará si fin == true.
        boolean fin = false;
        // El bucle terminará si idx > 10.
        int idx = 0; 
        do {
            System.out.printf("Introduzca la palabra %d:", idx + 1);
            String str = c.readLine();

            if (str.isEmpty()) {
                fin = true;
            } else {
            strArr [idx] = str;
            idx = idx + 1;
            }
            } while (!fin && idx < 10);

            if (idx < 10) strArr = Arrays.copyOfRange(strArr, 0, idx);
        // EJERCICIO 4
            Arrays.toString(strArr);

            System.out.println(Arrays.toString(strArr));


            // System.out.println("strArr: " );
            // strArr=in.nextLine();

       }
            
}
