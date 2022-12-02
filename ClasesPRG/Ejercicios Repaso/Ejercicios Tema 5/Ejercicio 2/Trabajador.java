

public class Trabajador extends Persona{

    public int nrp;

    public Trabajador() {

    };

    public Trabajador(int nrp) {
        this.nrp = nrp;
    }

    public int getNrp() {
        return nrp;
    }

    public void setNrp(int nrp) {
        this.nrp = nrp;
    }

    @Override
    public String toString() {
        return "Trabajador [nrp=" + nrp + "]";
    }

    
    
    
    
}
