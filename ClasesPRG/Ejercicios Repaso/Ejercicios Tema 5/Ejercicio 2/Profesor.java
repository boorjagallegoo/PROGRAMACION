

public class Profesor extends Trabajador{

    public String departamento;

    public Profesor() {
        
    };

    public Profesor(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesor [departamento=" + departamento + "]";
    }

    

    
}
