
public class Arista {
    public Punto a;
    public Punto b;
    public double longitud;

    public double getLongitud() {
        return Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - b.y, 2));
    }
    
    @Override
    public String toString() {
        return String.format("Arista de %s a %s.%n", a, b,);
    }
}
