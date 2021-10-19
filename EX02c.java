/**
 *
 * @author coelho
 */
import javax.swing.JOptionPane;
 
public class EX02c {
    public static void main(String [] args){
        double n1,n2;
 
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));  
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));  

        if(n1 < n2){
            JOptionPane.showMessageDialog(null,"O maior número é: "+ n2);
      }
        if(n2 < n1){
            JOptionPane.showMessageDialog(null,"O maior número é: "+ n1);
      }
   }    
}
