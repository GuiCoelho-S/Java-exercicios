/**
 *
 * @author coelho
 */
import javax.swing.JOptionPane;

public class EX03b {
    public static void main(String [] args){
        int count = 1, nota = 1;
        double media = 0;

        while(nota != 0){

        nota = Integer.parseInt(JOptionPane.showInputDialog("Digite um número natural"));
        media = media + nota;
        count++;
    }
   media = media / count;

   JOptionPane.showConfirmDialog(null, "A média final é "+ media);
  }
}
