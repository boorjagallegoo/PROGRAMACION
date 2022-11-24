import java.io.Console;

public class Tareaprofe {
    public static final String SEPARADOR = ", ";
    public static String[] leerPalabras (String separador) {
        return texto.split(separador);
    }

    private static int selecionDeOpcion(String[] opciones) {
        Console c = System.console();
        System.out.println("Elija una opción: ");
        System.out.println("------------------");

        for (int i = 0; i < opciones.length; ++i) {
            System.out.println(i + ") " + opciones[i] + ".");
        }

        System.out.println("------------------");
        String opcion = c.readLine("Opción: ");

        numOpcion = Integer.parseInt(opcion);

        if (numOpcion >= 1 && numOpcion <= opciones.length) opcionNoValida = false;
        opcionNoValida = numOpcion < 1 numOpcion > opciones.length;
    }
       
       
       
       
        public static void main(String[] args) {
       
        Console c = System.console();
        String linea = c.readLine("Introduzca una lista de palbras separadas por \"" + SEPARADOR + "\"");
        String[] palabras = linea.split(SEPARADOR);

        Arrays.sort(palabras);



    }

    
}
