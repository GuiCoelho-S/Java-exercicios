/**
 *
 * @author coelho
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class EX01e {
    public static void main(String [] args){
        double largura, altura;
        largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do retângulo [m]:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do retângulo [m]:"));

    DecimalFormat deci = new DecimalFormat("0.00");

    JOptionPane.showMessageDialog(null, "A área do retângulo é igual a: " + deci.format(largura * altura) + " m^2");
   }
}