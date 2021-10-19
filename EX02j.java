/**
 *
 * @author coelho
 */
import javax.swing.JOptionPane;

public class EX02j {
    public static void main(String [] args){
    int a, b, c;
    double r1,r2, delta, bquadrado;
    
    a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a:"));
    b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b:"));
    c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de c:"));
    
    //bquadrado = Math.pow(b,2);
     
    delta = (Math.pow(b,2)) - (4 * a * c);

    r1 = (-b + (Math.sqrt(delta)))/ 2*a;
    r2 = (-b - (Math.sqrt(delta)))/ 2*a;

    String r1String = String.format("%.3f", r1);
    String r2String = String.format("%.3f", r2);

    
    if (r1 >= 0 && r2 >= 0){
        JOptionPane.showMessageDialog(null, "As raízes "+ r1String + " e " + r2String + " são reais");
    }else{
        JOptionPane.showMessageDialog(null, "As raízes são: \n"+ r1String + " e " + r2String + "\n não são reais"); 
    }
  }
}

// x1 = (-b + raizDelta) / 2a        delta = b^2 - 4.a.c
// x2 = (-b - raizDelta) / 2a