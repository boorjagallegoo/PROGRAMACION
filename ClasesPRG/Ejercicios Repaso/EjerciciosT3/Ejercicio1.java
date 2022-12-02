import java.text.Format;
import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {
        String arg1 = args[0];
        String arg2 = args[1];

        int min = Integer.parseInt(arg1);
        int max = Integer.parseInt(arg2);

        Random random = new Random();

        int aleatorio1;
        int aleatorio2;

        aleatorio1 = random.nextInt(max - min) + min;
        aleatorio2 = random.nextInt(max - min) + min;

        System.out.println("El primer número es: " + aleatorio1 + ".");
        //System.out.printf(format: "El primer número es: %d.%n", aleatorio1);
        System.out.println("El segundo número es: " + aleatorio2 + ".");

        int max_aleat = Math.max(aleatorio1, aleatorio2);
        System.out.printf( "El número mayor enter (%d y %d) es %d.%n", aleatorio1, aleatorio2, max_aleat);
    }
}

