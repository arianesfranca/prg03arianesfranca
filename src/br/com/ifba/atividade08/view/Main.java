/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;

import java.util.List;
import java.util.Arrays;

/**
 *
 * @author ariia
 */
public class Main {
    private static long nextLongId = 1;
    private static long nextSessaoId = 1;
    
    public static void main(String[] args){
        System.out.println(" implementacao de diagrama");
        
        //criar perfis de usuario com permissao
        List<String> permsAdmin = Arrays.asList("CRIAR_USUARIO", "DELETAR_USUARIO", "VER_LOGS");
        PerfilUsuario perfilAdmin = new PerfilUsuario(1L, "Administrador", permsAdmin);
        
        List<String> permsPadrao = Arrays.asList("ACESSAR_DASHBOARD", "EDITAR_PERFIL");
        PerfilUsuario perfilComum = new PerfilUsuario(2L, "Comum", permsPadrao);
        
        System.out.println("\n[Perfis Criados]");
        System.out.println(perfilAdmin);
        System.out.println(perfilComum);
        
        //criando usuarios e asossiando a perfis
       
        Usuario userAdmin = new Usuario(101L, perfilAdmin, "admin.br", "12345", true);
        Usuario userInativo = new Usuario(102L, perfilComum, "joao.silva", "67890", false);
        Usuario userComum = new Usuario(103L, perfilComum, "maria.souza", "maria123", true);
        

        System.out.println("\n[Usuarios Criados]");
        System.out.println(userAdmin);
        System.out.println(userInativo);
        System.out.println(userComum);
        
        //testar o metodo de logar
        System.out.println("\n[teste de login (LogAuditoria)]");
        
        //login bem sucedido
        System.out.println("\n tentativa 1: sucesso (admin.br");
        if(!userAdmin.logar("12345", "192.168.1.10", nextLongId++)){
            System.out.println("Login do" + userAdmin.getNomeUsuario() + "SUCESSO;");
        }
        
        System.out.println("\n tentativa 2: falha - senha incorreta (admin.br");
        if(!userAdmin.logar("senha errada", "192.168.1.11", nextLongId++)){
            System.out.println("Login do" + userAdmin.getNomeUsuario() + "FALHOU;");
        }
        
        System.out.println("\n tentativa 3: falha - usuario inativo (joao.silva)");
        if(!userAdmin.logar("67890", "192.168.1.12", nextLongId++)){
            System.out.println("Login do" + userInativo.getNomeUsuario() + "SUCESSO;");
        }
        
        //teste para criacao de sessao 
        System.out.println("\n[teste criacao de sessao]");
        
        Sessao sessaoAdmin = userAdmin.criarSessao(nextSessaoId++);
        System.out.println("Sessao criada para" + userAdmin.getNomeUsuario() + ":");
        System.out.println(sessaoAdmin);
        
         Sessao sessaoComum = userComum.criarSessao(nextSessaoId++);
        System.out.println("Sessao criada para" + userComum.getNomeUsuario() + ":");
        System.out.println(sessaoComum);
        
        
    }
}
