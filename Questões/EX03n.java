/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author coelho
 */
import javax.swing.JOptionPane;

public class EX03n {
    public static void main(String [] args){
    int h, n, value = 1;
    
    n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de n"));

    for(int i = 2; i < n + 1; i++){
        h = 10+ i;
        value = value + h;
        JOptionPane.showMessageDialog(null, h);
    }
        JOptionPane.showMessageDialog(null, "O valor final de H é "+ value);

 }
}