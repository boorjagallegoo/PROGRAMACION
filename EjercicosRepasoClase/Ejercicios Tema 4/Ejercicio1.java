

/*
Utilizando arrays y la clase de utilidades java.util.Arrays...

Crea una clase Numeros que:

Pueda almacenar una lista de números enteros.
Se pueda consultar el tamaño de la lista.
Se puedan obtener el número mayor y el número menor de la lista.
Se pueda obtener la media de los números de la lista.
Se pueda obtener la mediana de los números de la lista.
 */

import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int n;
  
        do {
            System.out.println("Introduce números enteros. 0 para acabar: ");                                     
            System.out.println("Numero: ");
            n = sc.nextInt();
            if (n != 0){
                numeros.add(n);
            }
        }while (n != 0);
       
        System.out.println("Ha introducido: " + numeros.size() + " números:");
       
        //mostrar el arrayList completo
        System.out.println(numeros);
       
        //recorrido usando un iterador para mostrar un elemento por línea                                         
        Iterator it = numeros.iterator();
        while(it.hasNext()){
              System.out.println(it.next());
        }
  
        //recorrido usando foreach para sumar los elementos
        double suma = 0;
        for(Integer i: numeros){
            suma = suma + i;
        }
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + suma/numeros.size());


        public static double Máx(double... TérminosDeComparación) {
            double NúmeroMayor = TérminosDeComparación[0];
            for (int i = 1; i < TérminosDeComparación.length; i++) {
                double Número = TérminosDeComparación[i];
                if (Número > NúmeroMayor) {
                    NúmeroMayor = Número;
                }
            }
            return NúmeroMayor;
        


    }
}
}   

 
   /*  http://puntocomnoesunlenguaje.blogspot.com/2012/12/arraylist-en-java.html
    
        Otra página

        http://puntocomnoesunlenguaje.blogspot.com/2012/07/arreglos-en-java-calcular-media.html

        Número mayor y menor.

        https://sites.google.com/view/jeff-aporta/tutoriales-cortos/c%C3%B3mo-obtener-el-mayor-o-el-menor-en-una-lista-de-n%C3%BAmeros
*/