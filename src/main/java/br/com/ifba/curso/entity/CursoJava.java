/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.entity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ariia
 */
public class CursoJava {
    @Entity
@Table(name = "curso")
public class Curso implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int quantidade;
    private String descricao;
    private String fornecedor;

    
    // Construtores, Getters e Setters
    // ...

        public Long getId() {
            return id;
        }

        public String getNome() {
            return nome;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public String getDescricao() {
            return descricao;
        }

        public String getFornecedor() {
            return fornecedor;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public void setFornecedor(String fornecedor) {
            this.fornecedor = fornecedor;
        }

        public Curso(Long id, String nome, int quantidade, String descricao, String fornecedor) {
            this.id = id;
            this.nome = nome;
            this.quantidade = quantidade;
            this.descricao = descricao;
            this.fornecedor = fornecedor;
        }
        
        
    }
}
