import java.io.Console;

/*
 * Pedir un número y calcular su factorial.
 * N! = 1*2*3*...*N
 * 
 * Ejemplos: 
 * 5! = 1*2*3*4*5
 * 7! = 1*2*3*4*5*6*7
 */

public class Ejercicio12 {
    public static void main(String[] args) {
        Console c = System.console();
        int numero;
        long factorial = 1;

        numero = Integer.parseInt(c.readLine("Digite un número: "));
        for (int i = 1; i <= numero; i++) {
            factorial *= i; // multiplicación iterativa
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }

}
