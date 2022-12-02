package PRUEBAS;

import java.io.Console;

public class Cadena {
    String str1 = "Hola";
    String str2 = new String(original: "Hola");
    
    if (str1 == str2 ) {
        System.out.println(x: "Mismo objeto.");
    } else if (str1.equals(str2)) {
        System.out.println(x: "Distinto objeto. Mismo contenido");
    } else {
        System.out.println(x: "Distinto objeto. Mismo contenido");
    
    }

    Console c = System.console();

    // String str1 = c.readLine();
    // str1 = str1.trim().toLowerCase();

    // String str2 = new String(original:"");

    // if (str1.isEmpty()) System.out.println("Cadena vacía.");
    // else System.out.println("Cadena no vacía.");

      String str1 = "0123456789";

      String str2 = str1.substring(beginIndex: 1, endIndex: 6);

    
    
}
