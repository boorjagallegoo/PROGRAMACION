import java.io.Console;

/*
 * Pedir el día, mes y año de una fecha e indicar 
 * si la fecha es correcta. Suponiendo que todos los
 * meses son de 30 días.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Console c = System.console();
        int dia, mes, año;

        dia = Integer.parseInt(c.readLine("Digite el día: "));
        mes = Integer.parseInt(c.readLine("Digite el mes: "));
        año = Integer.parseInt(c.readLine("Digite el año: "));

        if ((dia >= 1 && (dia <= 30))) { // Si el día es correcto.
            if ((mes >= 1) && (mes <= 12)) { // Si el nes es correcto.
                if (año != 0) { // Si el año es correcto.
                    System.out.println("La fecha es correcta.");
                } else {
                    System.out.println("La fecha es incorrecta por el año. ");
                }

            } else {
                System.out.println("La fecha es incorrecta por el mes. ");
            }

        } else {
            System.out.println("La fecha es incorrecta por el día. "); // El día no es correcto.
        }

    }

}
