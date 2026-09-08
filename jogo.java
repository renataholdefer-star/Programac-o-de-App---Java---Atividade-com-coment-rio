
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author renata_holdefer
 */
public class jogo {
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do jogador");
        
        int total = 0;
                
                for(int i = 1; i <= 3; i++){
                    int pontos = Integer.parseInt(
                            JOptionPane.showInputDialog(null, "Digite a pontuação da partida" + i + ":"));
                    
                    total = total + pontos;
                }
                
                String situacao;
                if(total >= 100){
                    situacao = "JOGADOR APROVADO!";
                }else{
                    situacao = "JOGADOR REPROVADO!";
                            
                }
                
                JOptionPane.showMessageDialog(null, "Nome do jogador " + nome + "\nPontuação total: " + total + "\nSituação:" + situacao);
                
                System.out.println("Nome do jogador: " + nome);
                System.out.println("Total da pontuação: " + total);
                System.out.println("Situção: " + situacao);
                
         
        }
    
}
