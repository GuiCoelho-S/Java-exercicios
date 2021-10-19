/**
 *
 * @author coelho
 */
import javax.swing.JOptionPane;

public class EX03g {
    public static void main(String [] args){

        int total = 2, numero;
   
   numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para saber seu fatorial correspondente"));
   

    for(int i = 0; i < numero + 1; i++){                                                                                                                                                                                                                      
       
       if(i != 0){
        total = total * i;
      }
       if(i == 0){
        total = 1;
      }
    }
   JOptionPane.showMessageDialog(null, numero + "! é igual a "+ total);
  }    
}
