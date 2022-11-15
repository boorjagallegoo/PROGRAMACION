import java.io.Console;

/*
 * Pedir el día, mes y año de una fecha e indicar 
 * si la fecha es correcta. Con meses de 28, 30
 * y 31 días. Sin años bisiestos
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Console c = System.console();
        int día, mes, año;

        día = Integer.parseInt(c.readLine("El día es: "));
        mes = Integer.parseInt(c.readLine("El mes es: "));
        año = Integer.parseInt(c.readLine("El año es: "));

        if (año == 0) {
            System.out.println("La fecha es incorrecta. ");
        } // Si el año es igual a 0 la fecha esta incorrecta.
        else if ((mes==2) && (día >=1 && día <= 28)) {
            System.out.println("La fecha es correcta. ");
        }
        else if ((mes==4 || mes==6 || mes==9 || mes==11) && (día >=1 && día <=30)) {
            System.out.println("La fecha es correcta. ");
        }
        else if ((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && (día >=1 && día <=31)) {
            System.out.println("La fecha es correcta. ");
        }
        else {
            System.out.println("La fecha es incorrecta. ");
        }
        
    }
}
/*
 * Operador or || solo hace falta que se cumpla una condición.
 * Operador and && todos deben cumplirse.
 */