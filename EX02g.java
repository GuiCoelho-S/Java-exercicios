/**
 *
 * @author coelho
 */
import javax.swing.JOptionPane;

public class EX02g {
    public static void main (String [] args) {

    Integer operacao;
    float result, n1, n2;
    operacao = Integer.parseInt(JOptionPane.showInputDialog("Digite qual operação deseja fazer: \n"
                                                                + "1. Adição \n"
                                                                + "2. Subtração \n"
                                                                + "3. Multiplicação \n"
                                                                + "4. Divisão")
                                                                );  
    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
    
    result = 0;

   switch(operacao){
   case 1:
        result = n1+ n2;
        JOptionPane.showMessageDialog(null,"A soma é igual a " + result);
        break;

    case 2:
        result = n1 - n2;
        JOptionPane.showMessageDialog(null,"A subtração é igual a "+ result);
        break;

    case 3:
        result = n1 * n2;
        JOptionPane.showMessageDialog(null,"A multiplicação é igual a " + result);
        break;
    
    case 4:
        result = n1 / n2;
        JOptionPane.showMessageDialog(null, "A divisão é igual de "+ n1 +" por " + n2 
                                                    + " é igual a "+ result);
        break;
}
    }       
}
