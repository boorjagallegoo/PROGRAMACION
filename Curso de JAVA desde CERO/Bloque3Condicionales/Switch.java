
import javax.swing.JOptionPane;

/* La sentencia switch:

        switch (dato) {
            case 1: Instrucciones1;
                    break;
            case 2: Instrucciones2;
                break;
        
            ...
            case n: InstruccionesN;
                break;
            default: CasoContrario;
                break;
        }
 */

public class Switch {
        public static void main(String[] args) {
                int dato;

                dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un número entre 1 y 5: "));

                switch (dato) {
                        case 1:
                                JOptionPane.showMessageDialog(null, "Es el número 1.");
                                break;
                        case 2:
                                JOptionPane.showMessageDialog(null, "Es el número 2.");
                                break;
                        case 3:
                                JOptionPane.showMessageDialog(null, "Es el número 3.");
                                break;
                        case 4:
                                JOptionPane.showMessageDialog(null, "Es el número 4.");
                                break;
                        case 5:
                                JOptionPane.showMessageDialog(null, "Es el número 5.");
                                break;
                        default:
                                JOptionPane.showMessageDialog(null, "El número no está en el rango 1-5.");
                                break;
                }

        }

}
