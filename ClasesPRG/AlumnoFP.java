import java.util.Arrays;

public final class AlumnoFP extends Alumno {
    private String ciclo;
    private String[] modulos;
    
    public AlumnoFP(String nombre, String apellidos, int edad, String ciclo, String[] modulos) {
        super(nombre, apellidos, edad);
        this.ciclo = ciclo;
        this.modulos = modulos;
        System.out.println("Constructor de AlumnoFP.");
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }   

    public String getCiclo() {
        return ciclo;
    }

    public void setModulos(String[] modulos) {
        this.modulos = modulos;
    }   

    public String[] getModulos() {
        return modulos;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n" + 
            "Ciclo: " + ciclo + "\n" + 
            "Modulos" + Arrays.toString(modulos);
    }

}
/*
 * Object 
 * |
 * Alumno
 * |
 * AlumnoFP
 */
