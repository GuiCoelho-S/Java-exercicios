/**
 *
 * @author coelho
 */

import javax.swing.JOptionPane;

public class EX01a {
    public static void main(String [] args){
        double n1,n2,n3;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número"));

        JOptionPane.showMessageDialog(null,"A multiplicação dos três números é igual a " +(n1*n2*n3));
    }    
}
