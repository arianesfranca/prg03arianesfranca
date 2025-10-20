/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;

import java.time.LocalDateTime;

/**
 *
 * @author ariia
 */
public class Sessao {
    private Long id;
    private Usuario usuario;
    private String token;
    private LocalDateTime dataCriacao;
    private Boolean ativa;
    
    public Sessao(Long id, Usuario usuario, String token){
        this.id = id;
        this.usuario = usuario;
        this.token = token;
        this.dataCriacao = LocalDateTime.now();
        this.ativa = true;
    }
    //getters
    public Long getId(){
        return id;
    }
    public Usuario getUsuario(){
        return usuario;
    }
    
    public String getToken(){
        return token;
    }
    
    public LocalDateTime getDataCriacao(){
        return dataCriacao;
    }
    
    public Boolean getAtiva(){
        return ativa;
    }
    //setters
    public void  setId(Long id){
        this.id = id;
    }
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
    
    public void setToken(String token){
        this.token = token;
    }
    
    public void setDataCriacao(LocalDateTime dataCriacao){
        this.dataCriacao = dataCriacao;
    }
    
    public void setAtiva(Boolean ativa){
        this.ativa = ativa;
    }
     @Override
    public String toString()  {
        return "LogAuduitoria{" +
                "id=" + id +
                ", usuario=" + (usuario != null ? usuario.getNomeUsuario() : "N/A") + 
                ", token='" + token + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", ativa=" + ativa + 
                '}';
    
        } 
   
}
