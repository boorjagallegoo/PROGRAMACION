
public class Main {
    public static void main(String[] args) {
        Alumno a = new AlumnoFP("Borja ", "Gallego", 20 , "DAM Dual", 
        new String[] {"BD", "PR", "CD", "SI", "LM"});

        AlumnoFP afp = new AlumnoFP("Borja ", "Gallego", 20 , "DAM Dual", 
            new String[] {"BD", "PR", "CD", "SI", "LM"});

        System.out.println(afp);
        
        // System.out.println(a.nombre);
        // System.out.println(a.apellidos);

    }
    
}
