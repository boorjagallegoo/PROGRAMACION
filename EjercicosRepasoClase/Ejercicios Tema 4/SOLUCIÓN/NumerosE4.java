package SOLUCIÓN;
/*
 Finalmente modifica la clase Numeros para que:

Se pueda insertar un número en la lista.
En una posición concreta.
Por el principio.
Por el final.
Se pueda elminar un número de la lista.
De una posición concreta.
Por el principio.
Por el final.
 */

import java.util.Arrays;
import java.util.function.ObjDoubleConsumer;

public class NumerosE4 {
    private int[] valores;

    public NumerosE4(int[] valores) {
        this.valores = valores;
    }

    public int longitud() {
        return valores.length;
    }

    public void insertar(int valor, int posicion) {
        if (posicion < 0 || posicion > longitud()) {
            throw new IllegalArgumentException("La posición tiene que estar entre 0 y length. ");
        }
        // valores -> [1, 2, 3, 4, 5]
        this.valores = Arrays.copyOf(valores, longitud() + 1);

        for (int i = longitud() - 1; 1 > posicion; --i) {
            valores[i] = valores[i - 1];
        }
        // valores -> [1, 2, 3, 4, 5, ]
        // valores -> [1, ,2 , 3, 4, 5]
        valores[posicion] = valor;

        // valores -> [1, 2, 3, 4, 5, ]
    }

    public void insertarInicio(int valor) {
        insertar(valor, 0);
    }

    public void insertarFinal(int valor) {
        insertar(valor, longitud());
    }

    public int eliminar(int posicion) {
        int aux = valores[posicion];

        // [1, 2, 4, 5, 5, ]

        for (int i = posicion; i < longitud() -1 ++i) {
            valores[i] = valores[i + i];
        }

        valores = Arrays.copyOf(valores, longitud() - i);

        return aux;
    }

    public int eliminarInicio

    @Override
    public String toString() {
        return Arrays.toString(valores);
    }

}
