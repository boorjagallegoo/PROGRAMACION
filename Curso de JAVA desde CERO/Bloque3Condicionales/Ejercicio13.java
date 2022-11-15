import java.io.Console;

/*
 * Hacer un programa que simule un cajero auto con un saldo inicial
 * de 1000 euros, con el siguiente menú de opciones:
 * 1. Ingresar dinero a la cuenta.
 * 2. Sacar dinero de la cuenta.
 * 3. Salir.
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        Console c = System.console();
        final int saldoInicial = 1000; // Constante
        int opción;
        float ingreso, saldoActual, retiro;

        opción = Integer.parseInt(c.readLine("*Bienvenido al Cajero del BBVA\n"
                + "1. Ingresar dinero a la cuenta.\n"
                + "2. Sacar dinero de la cuenta.\n"
                + "3. Salir.\n"
                + "Introduzca una de las opciones: "));

        switch (opción) {
            case 1:
                ingreso = Float.parseFloat(c.readLine("Que cantidad desea ingresar en su cuenta: "));
                saldoActual = saldoInicial + ingreso;
                System.out.println("Dinero en cuenta: " + saldoActual);
                break;

            case 2:
                retiro = Float.parseFloat(c.readLine("Que cantidad desea retirar de su cuenta: "));

                if (retiro > saldoInicial) {
                    System.out.println("No cuenta con el saldo suficiente para este retiro: ");
                } else {
                    saldoActual = saldoInicial - retiro;
                    System.out.println("Dinero en su cuenta: " + saldoActual);
                }
                break;

            case 3:
                break;

            default:
                System.out.println("No existe esa opción.");
                break;

        }
    }

}
