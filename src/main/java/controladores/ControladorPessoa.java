/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Pessoa;
import interfaces.PessoaService;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author NandaPC
 */
@Named
@SessionScoped
public class ControladorPessoa implements Serializable{
    
    @EJB
    private PessoaService pessoaService;
    private String nome;
    private String senha ;
    private String email;
    
    private Pessoa pessoa;

    public ControladorPessoa() {
        this.pessoa = new Pessoa();
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public String salvarPessoa(){
        pessoaService.salvar(this.pessoa);
        return "Ok";
    }
}
