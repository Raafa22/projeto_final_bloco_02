package projeto_final_bloco_01;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        // Lista de equipamentos disponíveis
        Equipamento[] equipamentos = {
                new Equipamento("Console1", "Playstation 4", 2500.0),
                new Equipamento("Console2", "Playstation 5", 3800.0),
                new Equipamento("Console3", "Xbox Series S", 2700.0),
                new Equipamento("Computador4", "Computador Pessoal", 2500.0),
                new Equipamento("Computador2", "Computador Gamer", 4450.0),
                new Equipamento("Computador3", "Computador Profissional", 3400.0)
        };

        // Variável para armazenar o total da compra
        double total = 0.0;

        // Exibe o menu
        exibirOpcoes();

        // Loop para repetir o menu até o usuário escolher sair
        int opcaoEquipamento;
        do {
            // Lê a opção escolhida pelo usuário
            opcaoEquipamento = leia.nextInt();

            // Valida a opção escolhida
            validarOpcao(opcaoEquipamento);

            // Adiciona o preço do equipamento escolhido ao total da compra
            if (opcaoEquipamento != 4) {
                total += escolherEquipamento(equipamentos, opcaoEquipamento);
            }
        } while (opcaoEquipamento != 4);

        // Exibe o total da compra
        System.out.println("O total da compra é: R$" + total);

        leia.close();
    }

    // Exibe as opções do menu
    private static void exibirOpcoes() {
        System.out.println("** Menu de compras hockeyBR **");
        System.out.println("1. Consoles");
        System.out.println("2. Computadores");
        System.out.println("3. Vestuário");
        System.out.println("4. Sair");
    }

    // Valida a opção escolhida pelo usuário
    private static void validarOpcao(int opcaoEquipamento) {
        if (opcaoEquipamento < 1 || opcaoEquipamento > 4) {
            System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
        }
    }

  
    private static double escolherEquipamento(Equipamento[] equipamentos, int opcaoEquipamento) {
        // Obtém o equipamento escolhido
        Equipamento equipamentoEscolhido = equipamentos[opcaoEquipamento - 1];

        
        System.out.println("Você escolheu: " + equipamentoEscolhido.getNome() + " - " + equipamentoEscolhido.getMarca() + " - R$" + equipamentoEscolhido.getPreco());

              return equipamentoEscolhido.getPreco();
    }
}

