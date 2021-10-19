/*
 *  [while] Um professor precisa saber qual a média das notas de uma sala e
    pediu sua ajuda para construir um programa que permita inserir as notas finais
    de cada aluno e, ao final, exibir a média da sala. Lembre-se que as notas
    variam de 0 a 10 e o professor digitará -1 quando quiser encerrar as entradas. *
 */

/**
 *
 * @author coelho
 */

import javax.swing.JOptionPane;

public class EX03aa {
   public static void main(String [] args){
    int nota, count = 1;
    double media;

    media = 0;

    nota = 0;
    
    while(nota != -1){
        
        nota = Integer.parseInt(JOptionPane.showInputDialog("Digite outras notas \nSe quiser parar digite -1"));
        if (nota >= 0 && nota <= 10){

            media = media + nota; 
            count++;
        }
     
    }
   
   media = media/count;
 
   JOptionPane.showMessageDialog(null, "A média final dos alunos é igual a "+ media);
  } 
}
