/**
 *
 * @author coelho
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class EX01d {
    public static void main(String [] args){
        double salarioBase, aumento,imposto;
        salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário atual"));
        aumento = salarioBase * 0.05;
        imposto = salarioBase * 0.07;
  
    DecimalFormat deci = new DecimalFormat("0.00");

        JOptionPane.showMessageDialog(null, "Seu salário base é de " + salarioBase +" reais \n"
+" \n" + " você ganhou uma gratificação de " + deci.format(aumento) + " reais \n"
+ "porém você mora no Brasil, e deve pagar " + deci.format(imposto) + " reais de imposto \n"+" \n" 
+ "Seu salário final é de "+ deci.format((salarioBase + aumento - imposto)) + " reais");
    }
}
