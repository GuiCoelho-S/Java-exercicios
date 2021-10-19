/**
 *
 * @author coelho
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class EX01g {
    public static void main(String [] args){
        double perimetro, area, pi;
        perimetro = Double.parseDouble(JOptionPane.showInputDialog("Digite o perímetro do cícrulo: [m]"));
    
    DecimalFormat deci = new DecimalFormat("0.00");
    pi = Math.PI;

// P = 2pi * r  e A = pi * r^2 

    area = perimetro * perimetro / (4* pi);
    
    JOptionPane.showMessageDialog(null, "A área do círculo é igual a: "+ deci.format(area) + " [m^2]");
   }
}