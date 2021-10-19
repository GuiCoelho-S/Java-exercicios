/**
 *
 * @author coelho
 */
import javax.swing.JOptionPane;

public class EX03y {
    public static void main(String [] args){
        int stop, valueA, valueB, dif;
        valueA = 10000;
        valueB =  5000;
        stop = 1;

        while(stop != 0){
          stop = Integer.parseInt(JOptionPane.showInputDialog("Para continuar, digite 1 \n"
                                                      + "Para parar, digite 0"));
          valueA = valueA + 100;
          valueB = valueB + 300; 
          dif = valueA - valueB;
   
          JOptionPane.showMessageDialog(null,"A diferença entre as rendas do primeiro cliente para o segundo é igual a "
                                                + dif);
          if(dif <= 0){
          JOptionPane.showMessageDialog(null, "O segundo cliente a partir de agora ganha mais,");
        }
      }
    }
}
