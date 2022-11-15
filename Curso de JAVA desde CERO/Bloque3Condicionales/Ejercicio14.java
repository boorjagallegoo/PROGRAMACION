import java.io.Console;

/*
 * Hacer un programa que pase de kg aotra unidad de 
 * medida de masa, mostrar en pantalla un menú con las opciones
 * posibles.
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Console c = System.console();
        float medida;
        int opcion;

        medida = Float.parseFloat(c.readLine("Digite la cantidad de kilogramos: "));

        opcion = Integer.parseInt(c.readLine("MENU: \n"
                + "1. Hectogramos \n"
                + "2. Decagramos\n"
                + "3. Gramos\n"
                + "4. Decigramos\n"
                + "5. Centigramos\n"
                + "6. Miligramos\n"
                + "Introduzca una de las opciones: "));

        switch (opcion) {
            case 1:
                medida *= 10;
                System.out.println("La nueva medida es Hectogramos es: " + medida);
                break;
            case 2:
                medida *= 100;
                System.out.println("La nueva medida es Decagramos es: " + medida);
                break;
            case 3:
                medida *= 1000;
                System.out.println("La nueva medida es Gramos es: " + medida);
                break;
            case 4:
                medida *= 10000;
                System.out.println("La nueva medida es Decigramos es: " + medida);
                break;
            case 5:
                medida *= 100000;
                System.out.println("La nueva medida es Centigramos es: " + medida);
                break;
            case 6:
                medida *= 1000000;
                System.out.println("La nueva medida es Miligramos es: " + medida);
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }

}
