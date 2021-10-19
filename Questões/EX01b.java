/**
 *
 * @author coelho
 */
import javax.swing.JOptionPane;

public class EX01b {
    public static void main(String [] args){

         double n1 , n2 , teste;
           n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
           n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
           teste = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do teste:")); 
        
           JOptionPane.showMessageDialog(null,"A média entre as 3 notas é: "+ (n1 + n2 + teste)/3);
    }
}
