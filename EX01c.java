/**
 *
 * @author coelho
 */
import javax.swing.JOptionPane;

public class EX01c {
    public static void main(String [] args){
        double salario;
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário atual"));
        JOptionPane.showMessageDialog(null, "Devido a seu ótimo desempenho, você recebeu um aumento "
 + "no salário de 25%, seu novo salário é de: " + salario* 1.25 + " reais");
    }
}
