
/**
 *
 * @author coelho
 */

//e) [for] Desenvolva um programa que exibe a tabuada de um número natural escolhido pelo usuário. Os múltiplos apresentados devem ser de 1 a 10. *
import javax.swing.JOptionPane;

public class EX03e {
    public static void main(String [] args){
        Integer number = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
        JOptionPane.showMessageDialog(null, "Bem vindo a tabuada");
    for(int i = 0; i < 11 ; i++){
     
        JOptionPane.showMessageDialog(null, i +" x "+ number+ " = "+ number*i);
    }
  }
}
