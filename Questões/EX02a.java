/**
 *
 * @author coelho
 */
import javax.swing.JOptionPane;

public class EX02a {
     public static void main(String [] args){

       double n1 , n2, result;
           n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
           n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
       
    result = (n1+n2) /2;
     
    if(result < 6){
        JOptionPane.showMessageDialog(null, "Você foi reprovado");
    }
    else{
        JOptionPane.showMessageDialog(null, "Você foi aprovado, nota final igual a "+ result);
    }
  }
}
