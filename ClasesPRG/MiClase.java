package 03 del 10;

public class MiClase {
    // Propiedades de instancia / objeto.
    // Son como cualquier otra variable pero ligada al objeto.
    public int id;
    public String nombre;
    private int privado;

    void set
   
    int miId () {
        return this.id;
    }

    String miNombre() {
        return this.nombre;
    }

    String miInfo() {
        return "Soy " + this.nombre + "mi id es" + this.id + ". ";
    }
    
}
