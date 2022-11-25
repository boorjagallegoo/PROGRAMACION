
public class Planta extends SerVivo {

    public int altura;

    public Planta(String NombreCientifico, String NombreComun, String alimentacion) {
        super(NombreCientifico, NombreComun, alimentacion);

    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Planta [altura=" + altura + "]";
    }

    

}
