import javax.sound.sampled.SourceDataLine;

public class Animal extends SerVivo {

    public int peso;
    public int altura;

    public Animal(String NombreCientifico, String NombreComun, String alimentacion, int edad, int altura) {
        super(NombreCientifico, NombreComun, alimentacion);
        this.peso = edad;
        this.altura = altura;
    }

    public int getEdad() {
        return peso;
    }

    public void setEdad(int edad) {
        this.peso = edad;
    }

    public int getAltura() {
        return altura;
    }
    
    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString() + peso + ", altura=" + altura + "]";
    } // super se refiere al padre de, en este caso SerVivo es el padre.

}
