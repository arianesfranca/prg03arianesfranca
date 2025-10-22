/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author ariia
 */
public class PagamentoPix implements Pagamento {
private final double CASHBACK = 0.02;
    @Override
    public double calculrTotal(double valor) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return valor * (1 - CASHBACK);
    }

    /**
     *
     * @param valorOriginal
     * @param valorFinal
     */
    @Override
    public void imprimirRecibo(double valorOriginal, double valorFinal) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("RECIBO PAGAMENTO EM DINHEIRO");
        System.out.println("Valor original: R$" + String.format("%.2f",  valorOriginal));
        System.out.println("Cashback (2%): R$" + String.format("%.2f", valorOriginal * CASHBACK));
        System.out.println("Valor final a pagar: R$" + String.format("%.2f", valorFinal));
    }

    /**
     *
     * @param valorOriginal
     * @return
     */
    @Override
    public double calcularTotal(double valorOriginal) {
       
    return valorOriginal * (1 - CASHBACK);
       
    }
    
}
