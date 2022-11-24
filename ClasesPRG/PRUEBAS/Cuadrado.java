package CLASES;

public class Cuadrado extends FigurasGeometricas {
    private int lado;

    public void ponLado (int Lado) {
        this.lado = lado;
    }
    
    public int perímetro() {
        return this.lado * 4;

    }

    public int area () {
        return this.lado * this.lado^2
    }

}
