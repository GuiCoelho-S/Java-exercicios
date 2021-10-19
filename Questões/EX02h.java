/**
 *
 * @author coelho
 */
import javax.swing.JOptionPane;

public class EX02h {
    public static void main(String[] args){
    
    double h,b,a,areaMaior,hMaior,bMaior;

    areaMaior = 0;
    hMaior = 0; 
    bMaior = 0;

    for(int i =1; i < 4; i++){

        h = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do "+i+"° triângulo"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do "+i+"° triângulo"));
        a = (b*h)/2;
        
        if(a > areaMaior){
            areaMaior = a;
            hMaior = h;
            bMaior = b;  
        }
    }

   JOptionPane.showMessageDialog(null, "O triângulo com maior área tem como medidas: \n"
                                                +"altura: "+hMaior+"\n"
                                                +"base: "+bMaior+"\n"
                                                +"área: "+areaMaior+"\n");
    }
}
