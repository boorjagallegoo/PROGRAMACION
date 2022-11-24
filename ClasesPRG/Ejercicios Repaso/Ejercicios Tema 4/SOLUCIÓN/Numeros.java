package SOLUCIÓN;

public class Numeros  {
    private int[] valores;

    public Numeros() {
        this.valores = new int[0];
    }

    public Numeros(int[] valores) {
        this.valores = new int[0];
    }

    public int longitud() {
        return valores.length;
    }

    public int mayor() {
        int mayor = valores[0];
if (this.longitud()==0)
        return 0;

    }

    public int menor() {
        int menor = valores[0];

        for (int i = 1; i < valores.length; ++i) {
            if (menor() < valores[i]) {
                menor = valores[i];
            }
        }
        return menor;
    }

   
    
}
