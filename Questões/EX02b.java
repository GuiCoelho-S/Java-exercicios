/**
 *
 * @author coelho
 */
import javax.swing.JOptionPane;
 
public class EX02b {
    public static void main(String [] args){
        double altura,pesoIdeal;
 
        String sexo = JOptionPane.showInputDialog("Digite o seu sexo: [m] ou [f]");  
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));  


   pesoIdeal = 0;
   

   if(sexo.equals("m")){
      pesoIdeal = (altura * 72.7) - 58;   
      JOptionPane.showMessageDialog(null, "Seu peso ideal é: "+ pesoIdeal);     

   }
   if(sexo.equals("f")){
      pesoIdeal =  (altura * 62.1) - 44.7 ;   
      JOptionPane.showMessageDialog(null, "Seu peso ideal é: "+ pesoIdeal);     

    }
   }    
}
