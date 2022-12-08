import java.io.Console;

/*
 * Pedir un número N, y mostrar todos
 * los números del 1 al N.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Console c = System.console();

        int numero, iterador;

        numero = Integer.parseInt(c.readLine("Digite un número: "));

        iterador = 1;
        while (iterador <= numero) {
            System.out.println(iterador);
            iterador++; // 1 2 3 4
        }
    }
    
}
