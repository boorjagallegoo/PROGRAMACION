import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Numeros numeros = new Numeros(new int[] { 1, 2, 3, 4, 15, 3, 1, 8, 3, 0 });

        System.out.println(numeros.longitud());
        System.out.println("El Array es: " + numeros);
        System.out.println("El mayor es: " + numeros.mayor());
       // System.out.println("El menor es: " + numeros.menor());
        System.out.println("La media es: " + numeros.media());
        System.out.println(numeros);
        System.out.println("La mediana es: " + numeros.mediana());
        System.out.println(numeros);

    }
    
}
