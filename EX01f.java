/**
 *
 * @author coelho
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class EX01f {
    public static void main(String [] args){
        double base, altura;
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo [m]:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo [m]:"));
    
    DecimalFormat deci = new DecimalFormat("0.00");

    JOptionPane.showMessageDialog(null, "A área do retângulo é igual a: " + deci.format((base * altura)/2) + " m^2");
   }
}