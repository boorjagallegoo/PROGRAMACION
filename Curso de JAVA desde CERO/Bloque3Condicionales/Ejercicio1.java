import javax.swing.JOptionPane;

/*
 * Haz un programa que lea un número entero y muestre
 * si el número es múltiplo de 10.
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        int numero1;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un número que sea múltiplo de 10: "));
    
        if  (numero1%10 == 0) {
            JOptionPane.showMessageDialog(null, "El número "+ numero1 + " es múltiplo de 10. ");

        }
        else { 
            JOptionPane.showMessageDialog(null, "El número no es múltiplo de 10. ");

        }
    
    }

    
}
