package HolaMundo;

import javax.swing.JOptionPane;

public class Introduccion7 {
       public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;

        // El showInputDialog se utiliza para la entrada de datos.
        cadena = JOptionPane.showInputDialog("Digitaliza una cadena: "); 
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digitaliza un entero: "));
        letra = JOptionPane.showInputDialog("Digitaliza un caracter:" ).charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digitaliza un decimal: "));

        // El showMessageDialog se utiliza para la salida de datos.
        JOptionPane.showMessageDialog(null, "La cadena es: " +cadena);
        JOptionPane.showMessageDialog(null, "El numero entero es: "+entero);
        JOptionPane.showMessageDialog(null, "El caracter es: "+letra);
        JOptionPane.showMessageDialog(null, "El decimal es: "+decimal);
        }
            
}
/*  Min:57:23
        7º PRIMER VIDEO -> Entrada/Salida de Datos con JoptionPane
*/