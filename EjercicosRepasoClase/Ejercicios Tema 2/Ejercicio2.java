import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String palabra1, palabra2;

        System.out.print("Introduce una palabra: ");
        palabra1 = teclado.nextLine();

        System.out.print("Introduce otra palabra: ");
        palabra2 = teclado.nextLine();


        // Comparamos ahora las palabras para determinar cual es menor:
        if (palabra1.compareTo(palabra2) > 0) { // Si devuelve mayor que cero es que palabra1 está antes que palabra2.
             System.out.printf("La palabra %s está antes que %s.%n", palabra1, palabra2);
        } else if (palabra1.compareTo(palabra2) < 0) { // Comprobamos ahora si es menor.
            System.out.printf("La palabra %s está después que %s.%n", palabra1, palabra2);
        } else { // Si no es mayor ni menor, es que son iugales.
            System.out.printf("Las palabra %s y %s son a misma.%n", palabra1, palabra2);
        }

    }

}
/*
 * Tomando como base el código del ejercicio anterior, haz que el programa nos
 * indique que palabra está antes lexicográficamente.
 */