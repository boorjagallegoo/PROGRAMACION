package tarea1;

import java.util.Arrays;

public class Lista {
    String[] lista; // Array de String VARIABLE


    // Metodo = trozo de codigo que hace algo.
    public void rellenar(String stra) {
        this.lista = stra.split(", "); // Referenciar lo que tenemos en la linea 6.
        for (int i = 0; i < this.lista.length; i++) {
            /*
             * for: Recorre el Array un número de veces igual a lo que te devuelve el
             * this.lista.length
             * this.lista.length: Devuelve el tamaño del Array con .length
             */
            System.out.println(this.lista[i]);

        }

    } // metodo

    public void lista(String stra) { // Declare una variable publica, que recibe como parametro de entrada un String.

        System.out.println();

    } 

}
