import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] ar) {
        Scanner teclado = new Scanner(System.in);

        String palabra1,palabra2;

        System.out.print("Ingrese la primera palabra:");
        palabra1=teclado.next();

        System.out.print("Ingrese la segunda palabra:");
        palabra2=teclado.next();

        // if (palabra1.equals(palabra2)) {
        //     System.out.print("Las palabras son iguales");
        // } 
        // else {
        //     System.out.print("Las palabras son distintas. ");
        // } 

        if (palabra1.compareTo(palabra2) < 0) {
            System.out.printf("La palabra %s está antes que %s.%n", palabra1, palabra2);
        } else if (palabra1.compareTo(palabra2) > 0) {
            System.out.printf("La palabra %s está después que %s.%n", palabra1, palabra2);
        } else {
            System.out.printf("Las palabra %s y %s son la misma.%n", palabra1, palabra2);
        }

    }

}
        // LO HICE YO
 
        // if (palabra1.compareTo(palabra2) < 0 ) { 
        //     System.out.println("La primera es " + palabra1); }

        // else if (palabra1.compareTo(palabra2) > 0 ) {
        //     System.out.println("La segunda palabra es " + palabra2); }

        // else { 
        //     System.out.println ("La palabra1 es igual a la palabra2"); }