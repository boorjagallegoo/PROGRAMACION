import java.io.Console;

public class ParOImpar {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.print("Dame un número: ");
        int x = Integer.parseInt(c.readLine());
        
        if ((x % 2) == 0) {
            System.out.println(x + "es par."); 
       } else {
            System.out.println(x + "es impar."); 
       }

    }

}
