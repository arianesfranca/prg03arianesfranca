/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author ariia
 */
public interface Pagamento {
    
    double calculrTotal(double valor);
    
    void imprimirRecibo( double valorFinal, double valorOriginal);

    public double calcularTotal(double valorOriginal);

   


    
}
