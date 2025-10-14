/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

/**
 *
 * @author ariia
 */
public class ProgramaPrincipal {
    public static void main(String[] args){
    
    ContaBanco c1 = new ContaBanco();
    c1.setNumConta(1001);
    c1.setDono("Francisca");
    c1.abrirConta("cc");
    
    ContaBanco c2 = new ContaBanco();
    c1.setNumConta(1002);
    c1.setDono("Julia");
    c1.abrirConta("cp");
    
    c1.depositar(300);
    c2.sacar(50);
    
    c1.pagarMensal();
    c2.pagarMensal();
    
    c1.estadoAtual();
    c2.estadoAtual();
    
    }
}
