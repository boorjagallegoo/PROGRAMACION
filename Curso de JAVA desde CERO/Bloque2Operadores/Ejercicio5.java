import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float participación, primerEX, segundoEX, exfinal, notaFinal;

        // Pedir los datos necesarios.
        System.out.print("Digite la nota de participación: ");
        participación = entrada.nextFloat();

        System.out.print("Digite la nota del 1º Examen: ");
        primerEX = entrada.nextFloat();

        System.out.print("Digite la nota del 2º Examen: ");
        segundoEX = entrada.nextFloat();

        System.out.print("Digite la nota del Examen Final: ");
        exfinal = entrada.nextFloat();

        // Sacando los calculos.
        participación = participación * 0.10f;
        primerEX *= 0.25f;
        segundoEX *= 0.25f;
        exfinal *= 0.40f;

        // Sumando las notas.
        notaFinal = participación + primerEX + segundoEX + exfinal;

        // Imprimir el esultado en pantalla.
        System.out.print("La Nota Final obtenida es : " + notaFinal );
    }
    
}
