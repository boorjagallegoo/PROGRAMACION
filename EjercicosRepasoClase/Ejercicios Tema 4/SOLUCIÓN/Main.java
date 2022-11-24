package SOLUCIÓN;

public class Main {
    public static final int[] VALORES_PRUEBAS = { 1, 2, 3, 4, 5};
    public static void main(String[] args) {
        NumerosE4 numeros = new NumerosE4(VALORES_PRUEBAS);
        // Numeros numeros = new Numeros();

        // System.out.println("El mayor es: " + numeros.mayor());
        // System.out.println("La media es: " + numeros.media());
        // System.out.println("La mediana es: " + numeros.mediana());

        System.out.println(numeros);
        numeros.insertarInicio(10);
        numeros.insertarFinal(20);
        System.out.println(numeros);
        numeros.eliminar(1);
        numeros.eliminar(1);
        System.out.println(numeros);
        numeros.eliminarFin();
        System.out.println(numeros);


    }
}