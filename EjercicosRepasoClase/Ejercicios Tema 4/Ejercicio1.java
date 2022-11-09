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
        ArrayList<Integer> numeros = new ArrayList();
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
       
        System.out.println("Tamaño de la lista: ");
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
        System.out.println("La Suma total es: " + suma);
        System.out.println("La Media de la lista es: " + suma/numeros.size());
        
    
        double max = 0;
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > max) {
                max = numeros.get(i);
            }
        }
        double min = max;
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) < min) {
                min = numeros.get(i);
            }
        }
        System.out.println("El número Máximo es: " + max);
        System.out.println("El número Mínimo es: " + min);
        
        // System.out.println("El tamaño es el siguiente: ");
        // for( int i=0;i<numeros.size();i++) {
      
        //     System.out.println(numeros.get(i));
        //   }
          
    }
}

 
   /*  http://puntocomnoesunlenguaje.blogspot.com/2012/12/arraylist-en-java.html
    
        Otra página
        http://puntocomnoesunlenguaje.blogspot.com/2012/07/arreglos-en-java-calcular-media.html
        
        Número mayor y menor.
        http://panamahitek.com/obtener-el-maximo-y-minimo-de-una-lista-de-numeros-con-java-8/

        Tamaño de la Lista
        https://www.arquitecturajava.com/java-arraylist-count-y-las-apis-de-java/#:~:text=As%C3%AD%20pues%20si%20queremos%20saber,array%20y%20nos%20permitir%C3%A1%20recorrerlo.





*/