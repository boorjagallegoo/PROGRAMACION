import java.util.Scanner;
import java.io.Console;
import java.util.InputMismatchException;
import java.util.Arrays;

public class Tarea {
    public static void main(String[] args) {

        String[] lista;

        String palabras;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca palabras separadas por \", \": ");
        palabras = teclado.nextLine();

        lista = palabras.split(", ");

        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        int opcion; // Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Filtrar");
            System.out.println("2. Dividir");
            System.out.println("3. Salir");

            try {

                System.out.println("Escribe una de las 3 opciones.");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado Filtar.");
                        filtrar(lista);
                        break;
                    case 2:
                        System.out.println("Has seleccionado Dividir.");
                        dividir(lista);
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número. ");
                entrada.next();
            }

        }

    }

    public static void filtrar(String[] lista) {
        Console c = System.console();

        System.out.print("Introduce un carácter/es para Filtar: ");
        String x = c.readLine();
        // Primero contamos las palabras (lista) válidas.
        for (int i = 0; i < lista.length; i++) { // El for recorre todo el Array (String[]).
            if (lista[i].indexOf(x) == 0) {
                System.out.println(lista[i]);
            }
        }

    }

    public static void dividir(String[] lista) {
        Console c = System.console();

        String[] ordered = lista.clone();
        Arrays.sort(ordered);

        String div;
        int key;

        System.out.print("Introduce una palabra para Dividir: ");
        
        do {
            div = c.readLine();
        } while (div.isEmpty() || div.isBlank());

        key = Arrays.binarySearch(ordered, div);
        if (key < 0) {
            key = Math.abs(Arrays.binarySearch(ordered, div)) - 1;
        }
        System.out.println("Palabras anteriores a \"" + div + "\": ");
        for (int i = 0; i < key; i++) {
            System.out.println(ordered[i]);
        }
        System.out.println("Palabras iguales o posteriores a \"" + div + "\": ");
        for (int i = key; i < ordered.length; i++) {
            System.out.println(ordered[i]);
        }

    }
}