/**
 *
 * @author coelho
 */
import javax.swing.JOptionPane;
 
public class EX02e {
    public static void main(String [] args){
        Integer n1;
 
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para saber se ele é par ou impar"));  
        
        if(n1 % 2 == 0){
            JOptionPane.showMessageDialog(null, "O número "+ n1 + " é par");
        }else{
            JOptionPane.showMessageDialog(null, "O número "+ n1 + " é impar");        
        }
   }    
}
