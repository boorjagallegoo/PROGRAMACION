import java.io.Console;

/*
 * Construir un programa que simule el funcionamiento de una calculadora
 * que pueda realizar las 4 operaciones aritmáticas básicas con valores
 * númericos enteros. El usuario debe especificar la operación con el 1º
 * carácter del 1º parámetro de la línea de comandos:
 * S o s para la suma.
 * R o r para la resta.
 * P o p para el producto.
 * M o m para la multiplicación.
 * D o d para la división.
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Console c = System.console();
        int num1, num2, suma, resta, mult, div;
        char operación;

        num1 = Integer.parseInt(c.readLine("Introduce un número: "));
        num2 = Integer.parseInt(c.readLine("Introduce otro número: "));

        operación = (c.readLine("Para realizar cualquier operación introduzca la primera letra en mayus o minus: ").charAt(0));

        switch (operación) {
            case 's':
            case 'S':
                suma = num1 + num2;
                System.out.println("Ha introducido Sumar: " + suma);
                break;
            case 'r':
            case 'R':
                resta = num1 - num2;
                System.out.println("Ha introducido Restar: " + resta);
                break;
            case 'p':
            case 'P':
            case 'm':
            case 'M':
                mult = num1 * num2;
                System.out.println("Ha introducido Multiplicar: " + mult);
                break;
            case 'd':
            case 'D':
                div = num1 / num2;
                System.out.println("Ha introducido Dividir: " + div);
                break;
            default: System.out.println("ERROR ha introducido mal los datos.");

        }

    }

}
