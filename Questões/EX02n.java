
/**
 *
 * @author coelho
 */
import javax.swing.JOptionPane;

public class EX02n {
    public static void main(String [] args){
        Integer idade;  
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        
                if(idade > 0 && idade <= 10){
                    JOptionPane.showMessageDialog(null, "Você está na categoria infantil");
                }
                if(idade >= 11 && idade <= 14){
                    JOptionPane.showMessageDialog(null, "Você está na categoria júnior");
                }      
                if(idade >= 15 && idade <= 20){
                    JOptionPane.showMessageDialog(null, "Você está na categoria adolescente");
                }
                if(idade >= 21 && idade <= 35){
                    JOptionPane.showMessageDialog(null, "Você está na categoria jovem");
                }else if(idade >= 36){
                    JOptionPane.showMessageDialog(null, "Você está na categoria master");
                }else if(idade < 0){
                    JOptionPane.showMessageDialog(null, "Você não digitou uma idade válida");      
                }
   }
}
