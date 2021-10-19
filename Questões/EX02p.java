/**
 *
 * @author coelho
 */
import javax.swing.JOptionPane;

public class EX02p {
    public static void main(String [] args){
    
    double salario;    
    Integer tempo;

    JOptionPane.showMessageDialog(null, "Responda as próximas perguntas para saber quanto "
                                    + "você vai receber no nosso bônus de natal");

    salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário"));
    tempo = Integer.parseInt(JOptionPane.showInputDialog("Informe seu tempo de casa"));
    String sexo = JOptionPane.showInputDialog("Qual o seu sexo? [m] ou [f]");
    
    if(sexo.equals("m") && tempo > 15 ){
        salario = salario * 1.2 ;
    }else if(sexo.equals("f") && tempo > 10){
        salario = salario * 1.25 ;
    }else {
        salario = salario + 200;
    }

    JOptionPane.showMessageDialog(null, "Seu salário final é de " + salario +" reais");
  }    
}
