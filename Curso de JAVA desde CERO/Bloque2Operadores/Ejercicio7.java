import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horasTotales, semanas, días, horas;

        System.out.print("Digite el Nº Total de horas: ");
        horasTotales = entrada.nextInt();

        semanas = horasTotales / 168; // 7 días * 24 horas = 168 horas semanles
        días = horasTotales%168 / 24;
        // Ponemos % para sacar el residuo de la anterior operación, qe nos hace falta.
        horas = horasTotales%24;

        System.out.println("El equivalente es: ");
        System.out.println("Semanas: " + semanas );
        System.out.println("Días: " + días);
        System.out.println("Horas: " + horas);

    }
    
}
/* Construir un programa que, dando un número total
 * de horas, devuelva el número de semanas, días y
 * horas equivalentes. 
 * Ej: 1000 horas debe mostrar 5 semanas, 6 días y 
 * 16 horas.
 */