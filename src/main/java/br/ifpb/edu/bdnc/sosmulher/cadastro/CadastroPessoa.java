/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpb.edu.bdnc.sosmulher.cadastro;

import br.ifpb.edu.bdnc.sosmulher.entidades.Pessoa;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author NandaPC
 */
@Stateless
public class CadastroPessoa {
    
    @PersistenceContext(unitName = "sos_mulher")
    private EntityManager entityManager;
 
    public CadastroPessoa(){
        
    }
    
    public boolean salvarPessoa(Pessoa pessoa){
        entityManager.persist(pessoa);
        return true;
    }
    
    public boolean removerPessoa(Pessoa pessoa){
        entityManager.remove(pessoa);
        return true;
    }
}
