import javax.swing.JOptionPane;

/*
 * La sentencia if:
 * 
 * if (condición) {
 *      Introduccion1;
 * }
 * else (condición) {
 *      Introduccion2;
 * }
*/


public class ifOelse {
    public static void main(String[] args) {
        int numero, dato = 5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

        if (numero == dato) { // si numero es igual a dato.
            JOptionPane.showMessageDialog(null, "El número es 5");
        } // entonces es 5.
        else {
            JOptionPane.showMessageDialog(null,"El número es diferente de 5");
        } // caso contrario el numero es diferente de 5.
    }

}

/*  
  * OPERADOR DE IGUALDAD:
    if (==) si es igual

 *   OPERADOR DE DESIGUALDAD:
    if (!=) si no es igual

 *   OPERADOR DE MAYOR:
    if (>) si es mayor que.

    if ... "El número es mayor a 5"
    else ... "El número es 5 o menor"

 *   OPERADOR DE MENOR o IGUAL:
    if (<=) si es mayor que.

    if ... "El número es 5 o menor"
    else ... "El número es mayor a 5"

*/