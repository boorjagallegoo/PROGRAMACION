import java.sql.Date;

/*
 * Implementa el escenario propuesto en la figura y añade las 
 * declaraciones de los métodos get y set para cada uno de los campos, 
 * así como constructores parametrizados a cada una de las clases.
 */

public class Persona {
    private String DNI;
    public String nombre;
    public String apellidos;
    private Date fechaNacimiento;

    public Persona(String dNI, String nombre, String apellidos, Date fechaNacimiento) {
        DNI = dNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona [DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento="
                + fechaNacimiento + "]";
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
