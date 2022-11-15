package HolaMundo;

import java.util.Scanner; //Necesario para utilizar la clase Scanner

public class Introduccion6 {
    public static void main(String[] args) {
                 // Numero Entero.
    Scanner entrada = new Scanner(System.in);
    char letra;
    // String cadena;

    System.out.println("Digitaliza una cadena: ");
    letra = entrada.next().charAt (0); 
        //charAt (0) solo guarda el primer caracter de una palabra.
    //cadena = entrada.nextLine(); 
        //Solo con next no reconoce espacios.

    System.out.println("La cadena es: "+letra);
                                       //cadena

    }

}
    
/*  Min:48:08
        6º PRIMER VIDEO -> Entrada de Datos

        Con Scanner vamos a poder guardar los datos.

GUARDAR NUMEROS ENTEROS y DECIMALES:

    Scanner entrada = new Scanner(System.in);
    int numero; // int Numero Entero.

    System.out.println("Digitaliza un numero: ");
    numero = entrada.nextInt(); 
    / nextInt para los Nº enteros.
    / nextFloat para los Nº enteros.
    / nextDouble

    System.out.println("El numero entero es: "+numero);
*/
