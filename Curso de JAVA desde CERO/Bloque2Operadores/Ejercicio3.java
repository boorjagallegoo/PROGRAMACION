import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float Guillermo, Luis, Juan, Total;

        System.out.println("Digita la cantidad de dinero que tiene Guillermo: ");
        Guillermo = entrada.nextFloat();

        Luis = Guillermo/2; // Luis tiene la mitad de lo de Guillermo.
        Juan = (Guillermo+Luis)/2; 

        Total = Guillermo+Luis+Juan;

        System.out.println("La cantidad de dinero entre los 3 es: " +Total);
    }   
    
}
