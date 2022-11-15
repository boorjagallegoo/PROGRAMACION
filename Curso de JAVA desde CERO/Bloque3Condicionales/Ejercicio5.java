import javax.swing.JOptionPane;

/*
 * Un obrero necesita calcular su salario semanal, el cual
 * se obtiene de la siguiente manera:
 * Si trabaja 40 horas o menos cobra 16$/h
 * Si trabaja mas de 40 h cobra 16$/h por cada
 * una de las primeras y 20 por cada h extra.  
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        int horasTrabajadas;
        float salarioTotal;

        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite las horas que ha trabajado: "));

        if (horasTrabajadas <= 40){
            salarioTotal = horasTrabajadas * 16;
        }
        else {
            salarioTotal = (40*16) + (horasTrabajadas-40)*20;
            JOptionPane.showMessageDialog(null, "El salario total es: " + salarioTotal);
        }

    }
    
}
