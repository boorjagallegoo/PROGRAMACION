import java.io.Console;

public class Comparacion {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.print("Dame un número: ");
        int x = Integer.parseInt(c.readLine());
        
        System.out.print("Dame un otro número: ");
        int y = Integer.parseInt(c.readLine());

        if (x < y) {
            System.out.println("El valor " + x + "es menor que " + y); 
       } else if (x < y) {
            System.out.println("El valor " + x + "es mayor que " + y); 
       } else {
            System.out.println("Los dos valores son iguales "); 
       } 
       
       System.out.println("Fin. "); 

    }
}
