package Excepciones;

public class DNI {
    /*
     * Así, al 0 le corresponde una T, al 1 una R, al 2 una W,
     * al 3 una A, al 4 una G, al 5 una M, al 6 una Y", al 7 una F,
     * al 8 una P, al 9 una D, al 10 una X, al 11 una B, al 12 una N,
     * al 13 una J, al 14 una Z, al 15 una S, al 16 una Q, al 17 una V,
     * al 18 una H, al 19 una L, al 20 una C, al 21 una K y al 22, una E.
     */
    private static final char[] TABLA_LETRAS = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
    /*
     * Número asociado al DNI.
     */
    private int numero;
    /*
     * Letra asociada al DNI (en un).
     */
    private char letra;
    /*
     * Constructor del DNI. No se comprueba la validez
     * del mísmo.
     */
    public DNI(int numero, char letra) {
        if (calcularLetra(numero) != letra)

        this.numero = numero;
        this.letra = letra;

    }

    /**
     * Genera la letra correspondiente al DNI
     * 
     * @param numero
     * @return
     */
    private char calcularLetra(int numero) {
        return TABLA_LETRAS[this.numero % 22];
    }
    private boolean isValid() {
        return dniValido(this);
    }
    /**
     * Determina si un DNI que se le pasa como argumento es válido
     * 
     * @param dni
     * @return
     */
    public static boolean dniValido(DNI dni) {
        return dni.letra == calcularLetra(dni.numero);
    }

}
