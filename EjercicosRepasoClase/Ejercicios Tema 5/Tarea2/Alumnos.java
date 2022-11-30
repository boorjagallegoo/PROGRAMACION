

/* Tarea2: Orientación a objetos
Necesitamos crear una jerarquía de clases que represente la situación de alumnos, profesores, ciclos, módulos y aulas.

Todas los objetos han de poder generar una cadena de caracteres que los represente (método toString).

Objetivos / requerimientos:
- Se ha de poder almacenar información de alumnos, ciclos y módulos.
- Se ha de poder mostar el ciclo y los módulos en los que está matriculado un alumno.
- Se ha de poder mostar los alumnos que están matriculados en un ciclo.
*/
public class Alumnos {
    public String nombre;
    public String apellidos;
    private int DNI;
    private String email;
    private String direccion;
    private int telefono;
    
    public Alumnos(String nombre, String apellidos, int dNI, String email, String direccion, int telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        DNI = dNI;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
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

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int dNI) {
        DNI = dNI;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
   
    
    
}
