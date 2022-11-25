

public class Alumno extends Persona {

    public int nia; 

    public Alumno() {

    };

    public Alumno(int nia) {
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
