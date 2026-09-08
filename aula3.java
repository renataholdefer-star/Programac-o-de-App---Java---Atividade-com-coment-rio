
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author renata_holdefer
 */
public class aula3 {
    public static void main(String[] args) {//começo
     JOptionPane.showMessageDialog(null, "Bienvenido"); //coisa escrita para começo
     
     String nome = JOptionPane.showInputDialog(null, "Digite seu nome");//variável para nome e escrita para mostrar na tela
     
     int idade = Integer.parseInt( //variável para idade
             JOptionPane.showInputDialog(null, "Digite sua idade"));// pede a idade
     if (idade >= 18){ // "se" 
         JOptionPane.showMessageDialog(null, "Aluno maior de idade!" // se tal tal coisa mostra na tela
                 + "\nAté mais " + nome); // mais de uma escrita na mesma mensagem, ali dizendo "até mais tal nome"
     } else { // "senao" 
         JOptionPane.showMessageDialog(null, "Aluno maior de idade!" // se tal tal coisa mostra na tela
                 + "\nAté mais " + nome); // mais de uma escirta na mesma mensagem, ali dizendo "até mais tal nome"
     }
     
      String rua = JOptionPane.showInputDialog(null, "Digite o nome da sua rua");//variável + mensagem na tela pedindo
      
     int anodenascimento = Integer.parseInt(
             JOptionPane.showInputDialog(null, "Digite seu ano de nascimento"));
     
     double salario  = Integer.parseInt(
             JOptionPane.showInputDialog(null, "Digite seu salário"));
     
     //Abre uma caixa de diálogo com as opções SIM e NÃO
     int resposta = JOptionPane.showConfirmDialog(
             null, // indica que a acaixa não está ligada a uma janela específica
             "Você deseja continuar?", // Pergunta apresentada para o usuario
             "Confirmação", // Título da caixa de diálogo
             JOptionPane.YES_NO_CANCEL_OPTION // Define
             );
     
     if(resposta == JOptionPane.YES_OPTION) {
         JOptionPane.showMessageDialog(null, "Você escolheu SIM!");
     }
    }
}
