import javax.swing.JOptionPane;

/*
 * Programa que lea un carácter por teclado y compruebe
 * si es una letra mayúscula.
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        char letra;

        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);

        if (Character.isUpperCase(letra)) { // Este metodo calcula si es una letra mayus automaticamente.
            JOptionPane.showMessageDialog(null, "Es una letra mayúscula.");

        } else {
            JOptionPane.showMessageDialog(null, "Es una letra minúscula.");
        }

    }

}
