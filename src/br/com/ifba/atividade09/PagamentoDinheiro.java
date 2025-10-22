/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author ariia
 */
public class PagamentoDinheiro implements Pagamento{
    private final double DESCONTO = 0.10;
    @Override
    public double calculrTotal(double valor) {
   
        return (1 - DESCONTO) * valor;
    }

    @Override
    public void imprimirRecibo(double valorOriginal, double valorFinal) {
        System.out.println("RECIBO PAGAMENTO EM DINHEIRO");
        System.out.println("Valor original: R$" + String.format("%.2f",  valorOriginal));
        System.out.println("Desconto aplicado (10%): R$" + String.format("%.2f", valorOriginal * DESCONTO));
        System.out.println("Valor final a pagar: R$" + String.format("%.2f", valorFinal));
    }

    @Override
    public double calcularTotal(double valorOriginal ) {
        return (1 - DESCONTO) * valorOriginal;
    }

   
    
}
