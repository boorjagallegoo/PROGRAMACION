import java.io.Console;

/*
 * Leer un número y mostrar su cuadrado, repetir el proceso
 * hasta que se introduzca un número negativo.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Console c = System.console();
        int numero, cuadrado;

        numero = Integer.parseInt(c.readLine("Digite un número: "));

        while (numero >= 0 ) { // Mientras el número sea 0 o positivo.
            cuadrado = (int)Math.pow(numero, 2);

            System.out.println("El número "+numero+" elevado al cuadrado es: "+cuadrado);

            numero = Integer.parseInt(c.readLine("Digite otro número: "));
        }
        
    }
    
}
