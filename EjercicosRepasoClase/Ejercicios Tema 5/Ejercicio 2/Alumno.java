import java.sql.Date;

public class Alumno extends Persona {

    public int nia;

    public Alumno(String dNI, String nombre, String apellidos, Date fechaNacimiento, int nia) {
        super(dNI, nombre, apellidos, fechaNacimiento);
        this.nia = nia;
    }

    public int getNia() {
        return nia;
    }

    public void setNia(int nia) {
        this.nia = nia;
    }

    @Override
    public String toString() {
        return "Alumno [nia=" + nia + "]";
    };

}
