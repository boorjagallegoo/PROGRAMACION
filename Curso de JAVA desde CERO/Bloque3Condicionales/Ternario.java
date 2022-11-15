import javax.swing.JOptionPane;

/*
 El operador Ternario '?'

 valor = (Condición) ? valor1: valor2

 Si es verdadero se cumple el 1º y si es falso el 2º.
*/
public class Ternario {
    public static void main(String[] args) {
        int numero;
        // String mensaje; 

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

        // mensaje = (numero%2==0) ? "El par" : "Es impar";

        // JOptionPane.showMessageDialog(null, mensaje);
        JOptionPane.showMessageDialog(null, (numero%2==0) ? "El par" : "Es impar");

    }
    
}
