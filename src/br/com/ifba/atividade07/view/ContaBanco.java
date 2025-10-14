/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

/**
 *
 * @author ariia
 */
public class ContaBanco {
    private int numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public ContaBanco(){
        this.saldo = 0.0;
        //A conta começa fechada
        this.status = false; 
    }
    
    //Criação de getter e setter 
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int n) {
         this.numConta = n ;
    
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String t) {
        this.tipo = t;
    }
    
    public String getDono() {
        return dono;
    }
    
    public void setDono(String d) {
        this.dono = d;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(Double s) {
        this.saldo = s;
    }
    
    public boolean isStatus() {
        return status;
    }
    
    public void setStatus(boolean s){
        this.status = s;
    }
    
    //métodos de negócios 
    
    public void abrirConta(String t) {
    setTipo(t);
    setStatus(true); //aqui altera o status para aberto
    
    if (t.equals("cc")) {
        setSaldo(50.0);
    } else if (t.equals("cp")) {
        setSaldo(150.0);
    } else {
        System.out.println("ERRO: tipo de conta inválido. Conta nao foi aberta.");
        setStatus(false);
        return;
        }
    System.out.println("Conta aberta com sucesso" + this.getDono() + "com saldo inicial de " + this.getSaldo());
    }
    
    public void fecharConta() {
        if(this.isStatus() == true){
            if(this.getSaldo() > 0) {
                System.out.println("ERRO: conta com saldo positivo (R$" + this.getSaldo() + "). Nao pode fechar!");
            } else if (this.getSaldo() < 0){
                System.out.println("Erro: Conta em débito (R$" + this.getSaldo() + "). Não pode fechar!");
            } else {
                System.out.println("Conta já está fechada!");
            }
        }
    }
    public void depositar(double v) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Déposito de R$" + v + " realizado na conta de" + this.getDono());
        } else {
            System.out.println("Não foi possivel depositar, a conta está fechada.");
        }
    }
    
    public void sacar(double v){
        if(this.isStatus()) {
            if(this.getSaldo() >= v){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Saque de R$" + v + "realizado na conta de" + this.getDono());
            } else {
                System.out.println("Erro, saldo insuficiente (R$" + this.getSaldo() + ") para sacar R$" + v + "!");
            } 
        } else {
            System.out.println("Não é possivel sacar de uma conta fechada");
        }
    }
    public void pagarMensal(){
        double  v = 0;
        
        if(this.getTipo().equals("cc")) {
            v = 12.0;
        } else if (this.getTipo().equals("cp")) {
            v = 20.0;
        }
        
        if(this.isStatus()) {
             if(this.getSaldo() >= v){
             this.setSaldo(this.getSaldo() - v);
             System.out.println("Mensalidade de R$" + v + "debitado da conta de" + this.getDono() + ".");
             } else {
                 System.out.println("Erro, saldo insuficiente para pagar a mensalidade de R$" + v + ". Saldo atual: R$" + this.getSaldo());
             }
        } else {
        System.out.println("Não é possivel cobrar mensalidade de conta fechada");
        }
    }
    
    public void estadoAtual(){
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
        
    }
}
