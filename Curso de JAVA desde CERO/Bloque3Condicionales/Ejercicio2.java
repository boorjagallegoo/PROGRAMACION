import javax.swing.JOptionPane;

/*
 * Pide 2 números y di cual es el mayor o si son iguales.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int numero1, numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe un número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe otro número: "));

        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "El número mayor es: " + numero1);

        } else if (numero2 > numero1) {
            JOptionPane.showMessageDialog(null, "El número mayor es: " + numero2);

        } else {
            JOptionPane.showMessageDialog(null, "Ambos números son iguales. ");
        }

    }

}
