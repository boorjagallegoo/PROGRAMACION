import java.io.Console;

/*
 * Pedir una nota de 0 a 10 y mostrarla de la forma:
 * Insuficiente, Suficiente, Bien, Notable y Sobresaliente.
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Console c = System.console();
        int nota;

        nota = Integer.parseInt(c.readLine("Cual ha sido tu nota media del Curso 1ºDAM Dual: "));

        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                    System.out.println("Sacaste un Insuficiente, vete a tomar por culo. ");
                    break;
            case 5:
                    System.out.println("Sacaste un Suficiente, safado por los pelos de tu padre.");
                     break;
            case 6:
                    System.out.println("Sacaste un Bien, lo mismo que decir que el agua moja.");
                    break;
            case 7:
            case 8:
                    System.out.println("Sacaste un Notable, bien echo crack mañana toca pierna.");
                    break;
            case 9:
            case 10:
                    System.out.println("Sacaste un Sobresaliente, me quito el sombrero ahora espabila para hacerlo realidad.");
                    break;
            default: 
                    System.out.println("Estas gracioso hoy eh, payaso.");

        }

    }

}
