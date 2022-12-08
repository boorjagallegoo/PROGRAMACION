import java.util.Scanner;

/*
 * Ciclo do While
 * do {
 *       Instrucciones;
 * } while (condición);
 * 
 * Este ciclo se va ejecutar mínimo una vez hasta comprobar que la condición
 * sea correcta.
 */

public class CiclodoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int i = 1, contador;

        System.out.print("Digite la de terminos: ");
        contador = entrada.nextInt();

        do {
            System.out.print(i);
            ++i;
        } while (i<=contador);
        
    }
    
}
