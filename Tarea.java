package tarea1;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Tarea {
    public static void main(String[] args) {

        Lista palabrasArr =  new Lista(); // Filtrar

        String palabras;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca palabras: ");
        palabras = teclado.nextLine();

        palabrasArr.rellenar(palabras); // Filtrar

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; // Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Filtrar");
            System.out.println("2. Dividir");
            System.out.println("3. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado Filtar");
                        break;
                    case 2:
                        System.out.println("Has seleccionado Dividir");
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número. ");
                sn.next();
            }
        }

    }
}
