/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

import java.util.Scanner;

/**
 *
 * @author ariia
 */
public class SistemaPagamentoConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pagamento pagamento = null;
        double valorOriginal = 0.0;

        try {
 
            System.out.println("--- Sistema de Pagamentos Console ---");
            System.out.print("Digite o valor da compra: R$ ");
            valorOriginal = scanner.nextDouble();

            System.out.println("\nEscolha o tipo de pagamento:");
            System.out.println("1 - Dinheiro (10% de desconto)");
            System.out.println("2 - Cartão (5% de taxa)");
            System.out.println("3 - Pix (2% de cashback)");
            System.out.print("Opção (1, 2 ou 3): ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> pagamento = new PagamentoDinheiro();
                case 2 -> pagamento = new PagamentoCartao();
                case 3 -> pagamento = new PagamentoPix();
                default -> {
                    System.out.println("Opção inválida.");
                    return; 
                }
            }

         
            double valorFinal = pagamento.calcularTotal(valorOriginal);
            pagamento.imprimirRecibo(valorOriginal, valorFinal);
            
        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Entrada de valor inválida. Certifique-se de digitar números.");
        } finally {
            scanner.close();
        }
    }

}
