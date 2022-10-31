public class Ejercicio3 {

    public class Viajero {
        private String DNI;
        private String nombre;
        private String apellidos;
        private String nacionalidad;
        private String dirección;
    }

    // "set" es un verbo transitivo que se puede traducir como "poner".
    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // "get" es un verbo transitivo que se puede traducir como "conseguir".
    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getDireccion() {
        return direccion;
    }
}

/*
 * Añade a la cLase anterior los métodos necesarios para la lectura y escritura
 * de sus campos (propiedades) y
 * establece el nivel de visibilidad adecuado para ellos.,
 */