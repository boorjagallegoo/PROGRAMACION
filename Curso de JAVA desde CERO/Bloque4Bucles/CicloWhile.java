import java.io.Console;

/*
 * Ciclo While
 * while (condición) {
 *      Instrucciones;
 * }
 */
public class CicloWhile {
    public static void main(String[] args) {
        Console c = System.console();
        int iterador = 1, contador;

        contador = Integer.parseInt(c.readLine("Digite cuantos numeros quiere por pantalla: "));

        while (iterador <= contador) {
            System.out.println(iterador);
            iterador += 2; // los números se muestran sumando 2 desde el 1.
        }

    }

}

// public static void main(String[] args) {
// int iterador = 1;
// // ORDEN ASCENDENTE:
// while (iterador <= 10) {
// System.out.println(iterador);
// ++iterador;
// /*
// * Esto es lo mismo que poner iterador +1;
// * Esto lo vamos a poner para que (++iterador = 1)
// * vaya sumando +1 hasta que se cumpla nuestra condición.
// */
// }

// int iterador2 = 10;
// // ORDEN DESCENDENTE:
// while (iterador2 >= 1) {
// System.out.println(iterador2);
// --iterador2;

// }
// }
