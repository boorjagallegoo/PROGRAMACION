import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, nota3, suma;

        // Guardamos las 3 calificaciones.
        System.out.print("Digita 3 calificaciones: ");
        nota1= entrada.nextFloat();
        nota2= entrada.nextFloat();
        nota3= entrada.nextFloat();

        suma = nota1+nota2+nota3; //Sumamos las 3 notas.

        System.out.println("La suma de las 3 es: " +suma);
    }
    
}
    // Haz un programa que calcule e imprima la suma de 3 calificaciones.4,