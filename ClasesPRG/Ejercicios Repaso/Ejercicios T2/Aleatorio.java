import java.io.Console;
import java.util.Random;

import javax.management.relation.InvalidRelationIdException;;

public class Aleatorio {
    public static int generaAleatorio (int min, int, max) {
        Random r = new Random();
        return min + r.nextInt(max - min);
    }
       
   public static void main(String[] args) {
    Console c = System.console();

    int min = Integer.parseInt(args[0]);
    int max = Integer.parseInt(args[1]);  

    int numero_buscado = generaAleatorio(min, max);

    boolean encontrado = false;
    int intento = 0;

    do {
        System.out.print("Introduce un número entre " + min "y" + max);
    
        int numero_introducido = Integer


            ++intento;
    } while (!encontrado);

    if (intento == 1) {
        System.out.println()
    }

    }

    }
    


