import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio6 {
    public static void main(String[] args) {

        List<String> palabrStrings = Arrays.asList("Cantante", "Amor", "Dentista", "Beny JR");
        System.out.println("lista original:" + palabrStrings);

        Collections.sort(palabrStrings);
        System.out.println("lista ordenada:" + palabrStrings);

    }
    
}
