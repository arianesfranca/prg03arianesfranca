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
public class LogAuditoria {
    private Long id;
    private Usuario usuario;
    private String evento;
    private LocalDateTime dataHora;
    private String ip;
    
    public LogAuditoria(Long id, Usuario usuario, String evento, String ip){
        this.id = id;
        this.usuario = usuario;
        this.evento = evento;
        this.dataHora = LocalDateTime.now();
        this.ip = ip;
    }
    
    public Long getId(){
        return id;
    }
    
    public Usuario getUsuario(){
        return usuario;
    }
    
    public String getEvento(){
        return evento;
    }
    
    public LocalDateTime getDataHora(){
        return dataHora;
    }
    
    public String getIp(){
        return ip;
    }
    
    //setters
    public void setId(Long id){
        this.id = id;
    }
    
     public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
     
      public void setEvento(String evento){
        this.evento = evento;
    }
      
      public void setDataHora(LocalDateTime dataHora){
        this.dataHora = dataHora;
    }
      
       public void setIp(String ip){
        this.ip = ip;
    }
       @Override
    public String toString()  {
        return "LogAuduitoria{" +
                "id=" + id +
                ", usuario=" + (usuario != null ? usuario.getNomeUsuario() : "N/A") + 
                ", eventos='" + evento + '\'' +
                ", dataHora=" + dataHora +
                ", ip=" + ip + '\'' +
                '}';
    
        } 
}
