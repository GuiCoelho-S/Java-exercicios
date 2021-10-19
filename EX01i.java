/**
 *
 * @author coelho
 */
import javax.swing.JOptionPane;
import java.util.Calendar;

public class EX01i {
    public static void main(String [] args){
        int idade, anoAtual, idadeSec;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));

        Calendar cal = Calendar.getInstance();
        anoAtual = cal.get(Calendar.YEAR);
        
        idadeSec = (2100 - anoAtual)+ idade;
        JOptionPane.showMessageDialog(null, "Em 2100, você terá " + idadeSec + " anos");
    }
}