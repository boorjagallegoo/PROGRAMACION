import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        int horasSemanales;
        float salarioHora,salarioTotal;

        System.out.print("Horas semanales trabajadas: ");
        horasSemanales = entrada.nextInt();
        System.out.print("El salario que gana por hora es de: ");
        salarioHora = entrada.nextFloat();

        salarioTotal = horasSemanales * salarioHora;

        System.out.println("El salario semanal es de:" + salarioTotal);
        
    }
    
}
