import java.io.Console;

/*
 * Una empresa que se dedica a la venta de desinfectantes necesita un programa
 * paa gestionar las facturas. En cada factura figura:
 * el código del artículo
 * la cantidad vendida de litros
 * el precio por litro
 * Se pide de 5 facturas introducidas:
 * -Facturación total
 * -Cantidad en litros vendidos del artículo 1
 * - Cuantas facturas se emitieron de más de $600
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        Console c = System.console();

        int codigo, litros, litrosArticulo1=0, conteoMayor600=0;
        float precioLitro, importeFactura, facturacionTotal=0;

        for (int i=1 ; i<=5 ; i++) {
            codigo = Integer.parseInt(c.readLine("Artículo N"+i+ "\nDigite el código: "));
            litros = Integer.parseInt(c.readLine("Artículo N"+i+ "\nDigite la cantidad en litros: "));
            precioLitro = Integer.parseInt(c.readLine("Artículo N"+i+ "\nDigite el precio por litro: "));
        
            importeFactura = (float) litros * precioLitro; // Importe por factura.
            facturacionTotal += importeFactura; // Suma iteractiva de las facturas.

            if (codigo == 1) {
                litrosArticulo1 += litros;
            }
            if (importeFactura > 600) {
                conteoMayor600++;
            }
        }

        System.out.println("Resumen de Ventas");
        System.out.println("Facturación Total: "+facturacionTotal);
        System.out.println("Cantidad en litros vendidos del Artículo 1: "+litrosArticulo1);
        System.out.println("Cantidad de facturas de más de $600: "+conteoMayor600);
        
    }
    
}
