import java.io.Console;

/*
 * Hacer un programa que tome 2 números
 * y diga si ambos son pares o impares.
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        Console c = System.console();
        int numero1, numero2;

        numero1 = Integer.parseInt(c.readLine("Digite un número: "));
        numero2 = Integer.parseInt(c.readLine("Digite otro número: 1"));

        if ((numero1 % 2 == 0) && (numero2 % 2 == 0)) {
            System.out.println("Ambos números son pares.");
        } else if ((numero1 % 2 != 0) && (numero2 % 2 != 0)) { // Con la ! decimos "Si es diferente de 0"
            System.out.println("Ambos números son impares.");

        } else {
            System.out.println("Un número es par y el otro es impar.");
        }

    }

}
