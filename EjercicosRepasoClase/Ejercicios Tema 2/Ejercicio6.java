import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio6 {
    public static void main(String[] args) {
        List<String> palabraStrings = Arrays.asList("Cantante", "Semilla", "Peón", "Torre");
        System.out.println("Lista Original: " + palabraStrings);

        Collections.sort(palabraStrings);
        System.out.println("Lista Ordenada: " + palabraStrings);
    }

}

/*
 * Crea un método (estático) que reciba un Array de palabras
 * como entrada y devuelva una copia del Array con las
 * palabras ordenadas.
 */
