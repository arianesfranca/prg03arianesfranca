/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 *
 * @author ariia
 */
public class Usuario {
    private Long id;
    private PerfilUsuario perfilUsuario;
    private String nomeUsuario;
    private String senha;
    private LocalDateTime ultimoLogin;
    private Boolean ativo;
    
    public Usuario(Long id, PerfilUsuario perfilUsuario, String nomeUsuario, String senha, Boolean ativo){
        this.id = id;
        this.perfilUsuario = perfilUsuario;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.ultimoLogin = null;
        this.ativo = ativo;
        
    }
    
    public boolean logar(String senhaDigitada, String ipOrigem, long proximoLogId) {
        String evento;
        boolean sucesso = false;
        
        if(this.ativo && this.senha.equals(senhaDigitada)){
                this.ultimoLogin = LocalDateTime.now();
                evento = "LOGIN_SUCESSO";
                sucesso = true;
        } else if (!this.ativo) {
            evento = "LOGIN_FALHA: Usuario inativo";
        } else {
            evento = "LOGIN_FALHA: Senha incorreta";
        }
        
        LogAuditoria log = new LogAuditoria(proximoLogId, this, evento, ipOrigem);
        System.out.println("-> Log gerado: " + log);
        
        return sucesso;
    }
    
    public Sessao criarSessao(long proximaSessaoId){
        String token = UUID.randomUUID().toString();
        
        Sessao novaSessao = new Sessao(proximaSessaoId, this, token);
        return novaSessao;
    }
    
    public long getId(){
        return id;
    }
    
    public void setId(Long id){
        this.id = id;
    }
    
    public PerfilUsuario getPerfilUsuario(){
        return perfilUsuario;
    }
    
    public void setPerfilUsuario(PerfilUsuario perfilUsuario){
        this.perfilUsuario = perfilUsuario;
    }
    
    public String getNomeUsuario(){
        return nomeUsuario;
    }
    
    public void setNomeUsuario(String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public LocalDateTime getUltimoLogin(){
        return ultimoLogin;
    }
    
    public void setUltimoLogin(LocalDateTime ultimoLogin){
        this.ultimoLogin = ultimoLogin;
    }
    
    public Boolean getAtivo(){
        return ativo;
    }
    
    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
    @Override
    public String toString()  {
        return "Usuario{" +
               "id=" + id +
                ", nomeUsuario='" + nomeUsuario + '\'' +
                ", perfilUsuario=" + (perfilUsuario != null ? perfilUsuario.getDescricao() : "N/A") +
                ", ultimoLogin=" + ultimoLogin +
                ", ativo=" + ativo +
                '}';
    
        } 
    
    }
