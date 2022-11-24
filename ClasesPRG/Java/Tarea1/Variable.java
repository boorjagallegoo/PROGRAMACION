
import java.util.Scanner;

public class Variable{
    public static void main(String[] args){
      
        String palabras;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca palabras: ");
        palabras = teclado.nextLine();
        System.out.println("¡A introducido lo siguiente: " + palabras + "!");

        System.out.println("Selecciona unas de las Opciones: ");

   
            
            Scanner sn = new Scanner(System.in);
            boolean salir = false;
            int opcion; //Guardaremos la opcion del usuario
             
            while(!salir){
                 
                System.out.println("1. Filtrar");
                System.out.println("2. Dividir y ordenar");
                System.out.println("3. Salir");
                 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
                
                switch(opcion){
                    case 1:
                        System.out.println("Has seleccionado Filtrar. ");
                        break;
                    case 2:
                        System.out.println("Has seleccionado Dividir y ordenar. ");
                        break;
                     case 3:
                        salir=true;
                        break;
                     default:
                        System.out.println("Solo números entre 1 y 3");
                }
                 
            }
        }
    }

        

    

