import java.io.Console;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Introduce algunas palabras: ");
        Console c = System.console();

        String palabra1;
        String palabra2;

        palabra1 = c.readLine();
        palabra2 = c.readLine();

        palabra1.equals(palabra2);

        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras son iguales. ");
        }

        else{ 
            System.out.println("Las palabras son distintas. ");
        } 
            
    }
}

/*
 * Escribe un programa que pida al usuario dos palabras por consola e indique si
 * son iguales o disntintas.
 * if significa "si".
 * else significa "si no".
 */