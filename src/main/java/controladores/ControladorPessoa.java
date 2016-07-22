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
    
    public String salvarPessoa(){
        pessoaService.salvar(this.pessoa);
        return "Ok";
    }
}
