/**
 *
 * @author coelho
 */
import javax.swing.JOptionPane;

public class EX02i {
    public static void main(String [] args){
        boolean v1, v2, v3;
        int a, b, c ; 
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro lado"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo lado"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro lado"));
     
        if(a+b > c){
          v1 = true;
        }
        if(a+c > b){
          v2 = true;
        }
        if(b+c > a){
          v3 = true;
        }        

        if( (v1 = true) && (v2 = true) && (v3 = true)){
            JOptionPane.showMessageDialog(null, "Os lados escolhidos formam um triângulo !");
            
            if( a == b && b == c){
                JOptionPane.showMessageDialog(null, "O triângulo é equilário!");
           }
            else if(a != b && b != c && a != c){
                JOptionPane.showMessageDialog(null, "O triângulo é escaleno");
           }
            else if(a == b || b == c || a == c){
                JOptionPane.showMessageDialog(null, "O triângulo é isóceles");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Os lados escolhidos não formam um triângulo !");            
        }
  }
}
