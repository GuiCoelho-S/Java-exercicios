/**
 *
 * @author coelho
 */
import javax.swing.JOptionPane;

public class EX03j {
    
    public static void main(String [] args){
    int idadeMenor, idadeMaior, idade;
    
    idadeMenor = 100;
    idadeMaior = 1;

        for(int i =0; i < 5 ; i++){
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));

        if(idade < idadeMenor){
          idadeMenor = idade;
        }
        if(idade > idadeMaior){
          idadeMaior = idade;
        }
    }
        JOptionPane.showMessageDialog(null, "A menor idade é "+ idadeMenor+ " anos \n"
+ "A maior idade é "+ idadeMaior+ " anos");
  }    
}
