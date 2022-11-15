import javax.swing.JOptionPane;

/*
 * En MegaPlaza se hace un 20% de descuento
 * a los clientes cuya compra supere los 300 euros.
 * ¿Cuál será la cantidad que pagará una persona por su compra?
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        float precioCompra, descuento;

        precioCompra = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el precio de compra: "));
        
        if (precioCompra > 300) {
            descuento = precioCompra * 0.20f;
            precioCompra -= descuento;
            JOptionPane.showMessageDialog(null, "El precio de compra es: " + precioCompra);
        }
        else {
            JOptionPane.showMessageDialog(null,"El precio de compra es:" + precioCompra);
        }
    }
}
