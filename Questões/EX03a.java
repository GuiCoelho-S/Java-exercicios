/**
 *
 * @author coelho
 */
import javax.swing.JOptionPane;

public class EX03a {
    public static void main(String [] args){
        Integer qnt;
        double num, media, numI;

        qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantos números serão lidos?"));

        numI = 0;
        media = 0;

        for(int i = 0; i < qnt; i++){
            num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
                media = (numI + num) /2;
            numI = num;
       }
        JOptionPane.showMessageDialog(null, "A média final é igual a "+ media);
 }
}
