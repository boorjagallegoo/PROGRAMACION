import java.io.Console;

/*
 * Dadas las edades y alturas de 5 alumnos, mostrar
 * la edad y la estatura media, la cantidad de alumnos
 * mayores de 18 años, y a cantidad de alumnos que 
 * miden más de 1.75 cm.
 */

public class Ejercicio15 {
    public static void main(String[] args) {
        Console c = System.console();

        int edad, sumaEdad = 0, conteoMayor18 = 0, contadorMayor175 = 0;
        float altura, sumaAltura = 0, mediaEdad, mediaAltura;

        for (int i = 1; i <= 5; i++) {
            edad = Integer.parseInt(c.readLine("Alumno " + i + "\nDigite su edad: "));
            altura = Float.parseFloat(c.readLine("Alumno " + i + "\nDigite su estatura: "));

            sumaEdad += edad;
            sumaAltura += altura;

            if (edad > 18) { // Si la edad es mayor de 18.
                conteoMayor18++;
            }
            if (altura > 1.75) { // Si la altura es mayor de 1.75 cm
                contadorMayor175++;
            }

        }
        mediaEdad = (float) sumaEdad / 5;
        mediaAltura = (float) sumaAltura / 5;

        System.out.println("La edad promedia es: " + mediaEdad);
        System.out.println("La estatura promedio es: " + mediaAltura);
        System.out.println("Cantidad de alumnos mayores a 18 es: " + conteoMayor18);
        System.out.println("Cantidad de alumnos que miden mas de 1.75cm es: " + contadorMayor175);

    }

}
