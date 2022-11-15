import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int salario = 1000; // CONSTANTE siempre pagan 1000 euros.
        int nCarrosVendidos; // ENTERO.
        float costeCarro,salarioTotal;

        System.out.print("Total de carros vendidos: ");
        nCarrosVendidos = entrada.nextInt(); // Lo guardamos.
        System.out.print("Digite el coste del carro: ");
        costeCarro = entrada.nextFloat();

        salarioTotal = salario + (nCarrosVendidos * 150) + (0.05f * costeCarro * nCarrosVendidos);

        System.out.println("El salario del empleado es: " + salarioTotal);
    }


}
