import java.util.Arrays;

public class split { 

    public static void main(String[] args) {  
        


        String cadena = "Hola|qué|tal";

         String[] partes = cadena.split("\\|");              

        System.out.println(Arrays.asList(partes));

        // String strMain = "Alfa, Beta, Delta, Gamma, Sigma";   
        // String[] arrSplit = strMain.split(",");   
        // for (int i = 0; i & lt; arrSplit.length; i++)    {     
        //     System.out.println(arrSplit[i]);   
        // } 
    }
}