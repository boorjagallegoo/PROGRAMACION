import java.util.Arrays;

/*
Utilizando arrays y la clase de utilidades java.util.Arrays...
Crea una clase Numeros que:
Pueda almacenar una lista de números enteros.
Se pueda consultar el tamaño de la lista.
Se puedan obtener el número mayor y el número menor de la lista.
Se pueda obtener la media de los números de la lista.
Se pueda obtener la mediana de los números de la lista.
 */

public class Numeros {
    private int[] valores;

    public Numeros(int[] valores) {
        this.valores = valores;
        Arrays.sort(valores);
    }

    public void asignaValores(int[] valores) {
        this.valores = valores;
    }

    public int[] dameValores() {
        return valores;
    }

    public int longitud() {
        return valores.length;
    }

    public int mayor() {
        int mayor = valores[0];

        for (int i = 1; i < valores.length; ++i) {
            if (mayor < valores[i]) {
                mayor = valores[i];
            }
        }
        return mayor;

    }

    public int menor() {
        int menor = valores[0];

        for (int i = 1; i < valores.length; ++i) {
            if (menor() < valores[i]) {
                menor = valores[i];
            }
        }
        return menor;
    }

    public double media() {
        int suma = 0;

        for (int valor : valores) {
            suma = suma + valor;
        }

        return suma / valores.length;
    }

    public double mediana() {
        
        if (valores.length % 2 != 0) {
        // Caso 1: longitud impar.
        // 1.Ordenar la lista.
        Arrays.sort(valores); 
        int posiCentral = valores.length / 2;
        return valores[posiCentral];
        }
        else 

        // Caso 2: longitud par.
        Arrays.sort(valores); 
        int posiCentral = valores.length / 2;
        return (valores[posiCentral - 1 ] + valores[posiCentral]) / 2;

    public int[] dameLosPares() {
            // Contar pares:
            int numeroDePares = 0;
            for (int valor : valores) {
                if (valor % 2 == 0) {
                    ++numeroDePares
                }
            }
        

            int[] pares = new int[numeroDePares];
            int posiPares = 0;
            for (int valor : valores) {
                if (valor % 2 == 0) {
                    pares[posiPares] = valor;
                    ++posiPares;
                }
            }

            return pares;

        
        }
}
}