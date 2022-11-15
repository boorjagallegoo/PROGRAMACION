import java.io.Console;

/*
 * Pedir un número entre 0 y 99.999 
 * y decir cuantas cifras tiene.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Console c = System.console();
        int num;

        num = Integer.parseInt(c.readLine("Digite un número: "));

        if ( num < 10) {
            System.out.println("El número " + num + " tiene 1 cifra.");
        }
        else if (num < 100) {
            System.out.println("El número " + num + " tiene 2 cifras.");
        }
        else if (num < 1000) {
            System.out.println("El número " + num + " tiene 3 cifras.");
        }
        else if (num < 10000) {
            System.out.println("El número " + num + " tiene 4 cifras.");
        }
        else if (num < 100000) {
            System.out.println("El número " + num + " tiene 5 cifras.");
        }
   
    }
    
}
