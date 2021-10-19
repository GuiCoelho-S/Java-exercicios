/**
 *
 * @author coelho
 */
import javax.swing.JOptionPane;

public class EX03o {
    public static void main(String [] args){
    int valor, menor, maior;

    valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
    menor = valor;
    maior = valor;

    do {
    valor = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número para saber qual é maior \n"
 + "Para parar o programa digite 0")); 

    if(valor > maior){
       maior = valor;
    }
    if(valor < menor){
       menor = valor;
    }
  }

    while(valor != 0);

    JOptionPane.showMessageDialog(null, "O maior valor digitado foi de "+ maior 
+ "\n O menor valor digitado é "+ menor);
  }
}
