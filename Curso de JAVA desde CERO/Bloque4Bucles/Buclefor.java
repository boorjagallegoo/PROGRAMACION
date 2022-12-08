import java.io.Console;

/*
 * Ciclo for
 * 
 * for (inicialización ; condición ; aumento o decremento) {
 *      Instrucciones;
 * }
 */
public class Buclefor {
    public static void main(String[] args) {
        Console c = System.console();
        int contador;

       contador = Integer.parseInt(c.readLine("Digite una cantidad de terminos pares: "));
       
        
        for (int i = 2; i<=contador; i+=2) {
            System.out.println(i);
        }
    }   
}
