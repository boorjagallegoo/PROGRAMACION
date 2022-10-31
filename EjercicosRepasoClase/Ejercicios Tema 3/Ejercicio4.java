// package persona.viajero;

public class Ejercicio4 {

    public class Viajero {
        private String DNI;
        private String nombre;
        private String apellidos;
        private String nacionalidad;
        private String dirección;

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
            this.dirección = direccion;
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
            return dirección;
        }

        public static void main(String[] args) {
            System.out.println("Hola mundo.");
        }
    }
}
/*
 * Incluye la clase en un paquete viajero que a su vez
 * esté contenido dentro del paquete persona.
 */