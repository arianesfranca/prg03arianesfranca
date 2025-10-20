/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;

import java.util.List;

/**
 *
 * @author ariia
 */

public class PerfilUsuario {
    private Long id;
    private String descricao;
    private List<String> permissoes;
    
    public PerfilUsuario(Long id, String descricao, List<String> permissoes) {
        this.id = id;
        this.descricao = descricao;
        this.permissoes = permissoes;
    }
    
    //getters
    public Long getId() {
        return id;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public List<String> getPermissoes() {
        return permissoes;
    }
    
    //setters
    public void setId(Long id) {
        this.id = id;
    }
    
    public void setDescricao(String descriicao){
        this.descricao = descricao;
    }
    
    public void setPermissoes(List<String> permissoes){
        this.permissoes = permissoes;
    }
    
    @Override
    public String toString()  {
        return "PerfilUsuario{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' + 
                ", permissoes=" + permissoes +
                '}';
    
        } 
    }
    

