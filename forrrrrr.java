
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author renata_holdefer
 */
public class forrrrrr {
    public static void main(String[] args) { //psvm tab(duas flechas) - comando de execução sempre no inicio
        
    
    int pessoasNaFesta;

        double totalComida = 0;
        double totalBebida = 0;
        double totalFesta;

        // Entrada de dados
        // O comando JOptionPane.showInputDialog abre uma janela 
        //e pede uma informação ao usuário.
        pessoasNaFesta = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Digite a quantidade de pessoas na festa:"
                )
        );

        // Estrutura FOR
        //for (início; condição; incremento)
        for (int i = 1; i <= pessoasNaFesta; i++) {

            double gastoComida;
            double gastoBebida;

            // Gasto com comida
            gastoComida = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Pessoa " + i
                            + "\nDigite quanto gastou com comida:"
                    )
            );

            // Gasto com bebida
            gastoBebida = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Pessoa " + i
                            + "\nDigite quanto gastou com bebida:"
                    )
            );

            // Acumuladores
            /*um acumulador é uma variável usada para guardar 
            *e somar valores durante a execução do programa, 
            *principalmente quando estamos utilizando 
            +uma estrutura de repetição como o for.
             */
            totalComida = totalComida + gastoComida;
            totalBebida = totalBebida + gastoBebida;
        }

        // Soma dos gastos
        totalFesta = totalComida + totalBebida;

        // Exibe uma caixa de mensagem com o resultado final
        JOptionPane.showMessageDialog(
                null,
                // Exibe o título "RESULTADO"
                "========== RESULTADO =========="
                // Pula duas linhas e mostra a quantidade de pessoas na festa       
                + "\n\nPessoas na festa: " + pessoasNaFesta
                + "\n\nTotal com comida: R$ "
                // Formata o valor da comida com duas casas decimais
                + String.format("%.2f", totalComida)
                + "\nTotal com bebida: R$ "
                + String.format("%.2f", totalBebida)
                + "\n\nTOTAL DA FESTA: R$ "
                + String.format("%.2f", totalFesta)
        );


}

}
