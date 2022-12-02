import java.util.Arrays;

public class ArraysUtils {
    private static String[] palabrasTest = { "uno", "dos", "tres", "cuatro", "cinco" };

    public static String [][] split(String[] palabras, String palabra) { 
        // Función/Metodo es split en este caso.
        String[][] resultado = new String[2][]; 
        // Devuelve 2 Arrays por eso ponemos dos [].

        int = posicionPrimeraMayor = palabras.length;
        int posicion = palabras.length;
        for (int idx = 0; idx < palabras.length; ++idx;) {
            if (palabras[idx].compareTo(palabra) >= 0) {
                posicion = idx;
                break;
                
            }
    }

                // posicionPrimeraMayor es la posición del primer elemento mayor que nuestra palabra.

    // int longArrMenores = posicionPrimeraMayor;
    // int longArrMayores = palabras.length - posicionPrimeraMayor;

    // String arrayMenores = new String[longArrMenores];
    // String arrayMayores = new String[longArrMayores];

    // int idxMayores = 0;
    // for (int idx = 0; idx < palabras.length; ++idx) {
    //     if (idx < posicionPrimeraMayor) {
    //         arrayMenores[idxMenores] = palabras[idx];
    //     } else {
    //         arrayMayores[idxMayores] = palabras[idx];
    //         ++idxMayores;
    //     }
    // }

    // resultado[0] = arrayMayores;
    // resultado[1] = arrayMenores;


}

    public static void main(String[] args) {

        ArraysUtils au = new ArraysUtils();

        String palabraDivisor = System.console().readLine("Introduce una palabra: ");

        Arrays.sort(palabrasTest);
        // Ordenamos las palabras.

        System.out.println(Arrays.toString(palabrasTest));

        System.out.println("Posición corte: " + buscaPosicion(palabrasTest, palabraDivisor));

        String[][] cosa = split(palabrasTest);

        System.out.println(Arrays.deepToString(cosa));

    }

}