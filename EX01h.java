/**
 *
 * @author coelho
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class EX01h {
    public static void main(String [] args){
        double distancia, gasto;
        distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho do trajeto  em [km]:"));
        gasto = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos litros seu carro gasta para percorrer 1 km:"));
    
    DecimalFormat deci = new DecimalFormat("0.00");

    JOptionPane.showMessageDialog(null, "Para fazer uma viagem de "+ distancia 
        +"km, serão necessários "+ deci.format(distancia*gasto) +" litros de gasolina");
   }
}