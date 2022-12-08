import java.io.Console;

/*
 * Realizar un juego para adivinar un número. Para ello generar un número
 * aleatorio entre 0-100, y luego ir pidiendo números indicando "es mayor"
 * o es "es menor" según sea mayor o menor respecto a N. El proceso
 * termina cuando el usuario acierte y mostrar el número de intentos.
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        Console c = System.console();
        int numero, aleatorio, intentos = 0;
        

        aleatorio = (int)(Math.random()*100); 
        // Math.random() va generar numeros aleatorios entre 0-1 por defecto.

       do {
            numero = Integer.parseInt(c.readLine("Digite un número: "));

            if (aleatorio > numero) {
                System.out.println("Digite un número mayor: "); 
            } else {
                System.out.println("Digite un número menor.");
            }
            intentos++; // Aumentamos en +1 los intentos.
       } while (numero != aleatorio);

       System.out.println("\n Genial!! Adivinaste el número en " + intentos + " intentos.");
        
    }
    
}
