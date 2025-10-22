/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author ariia
 */
public class PagamentoCartao implements Pagamento{

    private final double TAXA = 0.05;
    @Override
    public double calculrTotal(double valor) {
        return valor * (1 + TAXA);
    }

    @Override
    public void imprimirRecibo(double valorOriginal, double valorFinal) {
     System.out.println("RECIBO PAGAMENTO COM CARTÃO");
     System.out.println("Valor original: R$" + String.format("%.2f", valorOriginal));
     System.out.println("Desconto aplicado (10%): R$" + String.format("%.2f", valorOriginal * TAXA));
     System.out.println("Valor final a pagar: R$" + String.format("%.2f", valorFinal));  

    }

    @Override
    public double calcularTotal(double valorOriginal) {
        
        return valorOriginal * (1 + TAXA);
        
    }

  
    
}
