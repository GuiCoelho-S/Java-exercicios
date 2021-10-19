/**
 *
 * @author coelho
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class EX01j {
    public static void main(String [] args){

      double n1 , n2 ;
      n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
      n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sgunda nota:"));
                   
      JOptionPane.showMessageDialog(null,"A média ponderada entre essas notas é: " 
                                           + (n1*0.4+n2*0.6));
    }
}
