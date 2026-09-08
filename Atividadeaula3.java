/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadeaula3;

import javax.swing.JOptionPane;

/**
 *
 * @author renata_holdefer
 */
public class Atividadeaula3 {

    public static void main(String[] args) {
         String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
         
         String placa = JOptionPane.showInputDialog(null, "Digite a placa de seu veículo");
         
          int velocidade = Integer.parseInt( 
             JOptionPane.showInputDialog(null, "Digite a velocidade registrada pelo radar"));
          
          if (velocidade >= 60){ 
         JOptionPane.showMessageDialog(null, "Você foi multado! Velocidade maior que 60! " 
                 + "\nNome: " 
                 + nome 
                 + "\nPlaca: " 
                 + placa 
                 + "\nVelocidade: " 
                 + velocidade 
                 + "km/h"
                 + "\nPague sua multa !"); 
     } else { 
         JOptionPane.showMessageDialog(null, "Velocidade correta! Você não foi multado! "
                 + "\nAté mais " 
                 + "\nNome: " 
                 + nome 
                 + "\nPlaca: " 
                 + placa 
                 + "\nVelocidade: " 
                 + velocidade + "km/h");
    }
      
    }
}
