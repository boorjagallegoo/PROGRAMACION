import java.io.Console;
/*
 * Pedir tres números y mostrarlos ordenados
 * de mayor a menor.
*/

public class Ejercicio7 {
    public static void main(String[] args) {
        Console c = System.console();
        int num1, num2, num3;

        num1 = Integer.parseInt(c.readLine("Digite un número: "));
        num2 = Integer.parseInt(c.readLine("Digite un número: "));
        num3 = Integer.parseInt(c.readLine("Digite un número: "));

        if ((num1 > num2) && (num2 > num3)) {
            System.out.println("Orden: " + num1 + " - " + num2 + " - " + num3);
        } else if ((num1 > num3) && (num3 > num2)) {
            System.out.println("Orden: " + num1 + " - " + num3 + " - " + num2);
        } else if ((num2 > num1) && (num1 > num3)) {
            System.out.println("Orden: " + num2 + " - " + num1 + " - " + num3);
        } else if ((num2 > num3) && (num3 > num1)) {
            System.out.println("Orden: " + num2 + " - " + num3 + " - " + num1);
        } else if ((num3 > num1) && (num1 > num2)) {
            System.out.println("Orden: " + num3 + " - " + num1 + " - " + num2);
        } else {
            System.out.println("Orden: " + num3 + " - " + num2 + " - " + num1);
        }
    }

}
