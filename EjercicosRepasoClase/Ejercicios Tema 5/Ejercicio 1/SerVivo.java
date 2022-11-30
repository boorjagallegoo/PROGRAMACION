/*
 * Codifica la jerarquía ser vivo, animal y planta, creando las estructuras 
 * que consideres necesario para almacenar de cada elemento, como mínimo, 
 * nombre científico y nombre común. Para los animales almacenaremos peso y altura. 
 * Paralos vegetales únicamente altura. Cada ser vivo se alimentará de una manera 
 * diferente, por lo que deberá reflejar este aspecto de alguna forma.
 */

public class SerVivo {

    private String NombreCientifico;
    private String NombreComun;
    public String alimentacion;

    public SerVivo(String NombreCientifico, String NombreComun, String alimentacion) {
        this.NombreCientifico = NombreCientifico;
        this.NombreComun = NombreComun;
        this.alimentacion = alimentacion;

    }

    @Override
    public String toString() {
        return "SerVivo [NombreCientifico=" + NombreCientifico + ", NombreComun=" + NombreComun + ", alimentacion="
                + alimentacion + "]";
    }

    public String getNombreCientifico() {
        return NombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        NombreCientifico = nombreCientifico;
    }

    public String getNombreComun() {
        return NombreComun;
    }

    public void setNombreComun(String nombreComun) {
        NombreComun = nombreComun;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    // public class Animal {

    // public int edad;
    // public int altura;

    // public Animal(int edad, int altura) {
    // this.edad = edad;
    // this.altura = altura;
    // }

    // public int getEdad() {
    // return edad;
    // }

    // public void setEdad(int edad) {
    // this.edad = edad;
    // }

    // public int getAltura() {
    // return altura;
    // }

    // public void setAltura(int altura) {
    // this.altura = altura;
    // }

    // }

    // public class Planta {

    // public int altura;

    // public Planta(int altura) {
    // this.altura = altura;
    // }

    // public int getAltura() {
    // return altura;
    // }

    // public void setAltura(int altura) {
    // this.altura = altura;
    // }

    // }
}
