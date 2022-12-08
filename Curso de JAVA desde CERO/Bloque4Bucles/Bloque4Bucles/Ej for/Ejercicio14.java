import java.io.Console;

/*
 * Pedir 10 sueldos. Mostrar su suma y cuantos hay 
 * mayores de 1000 euros.
 */

public class Ejercicio14 {
    public static void main(String[] args) {
        Console c = System.console();

        float sueldos, suma = 0;
        int contador = 0;

        for (int i = 1; i <= 10; i++) {
            sueldos = Float.parseFloat(c.readLine("Digite su sueldo: "));

            if (sueldos > 1000) { // Si el sueldo supera a 1000.
                contador++; // Aumentamos uno a contador.
            }

            suma += sueldos; // Suma iteratva de sueldos.
        }

        System.out.println("La suma de todos los sueldos es: $"+suma);
        System.out.println("Cantidad de sueldos mayores a 1000: "+contador);

    }

}
