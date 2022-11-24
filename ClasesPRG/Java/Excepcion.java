public class Excepcion {
    public double div(int x, int y) {
        double resultado;
        int[] intArray = new int[2];

        try {
            resultado = x / y;
        } catch (ArithmeticException ae) {
            System.out.println(ae);
            System.out.println("El segundo argumento ha de ser distinto: ");
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("Muy mal. Malo!");
        }
        return resultado;
    }

    public static void main(String[] args) {
        
        System.out.println(div(1, 0));
    }
}