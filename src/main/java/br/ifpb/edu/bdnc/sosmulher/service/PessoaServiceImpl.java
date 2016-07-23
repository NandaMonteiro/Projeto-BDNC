/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpb.edu.bdnc.sosmulher.service;

import br.ifpb.edu.bdnc.sosmulher.cadastro.CadastroPessoa;
import br.ifpb.edu.bdnc.sosmulher.entidades.Pessoa;
import br.ifpb.edu.bdnc.sosmulher.interfaces.PessoaService;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author NandaPC
 */
@Stateless
public class PessoaServiceImpl implements Serializable, PessoaService{

    @EJB
    private CadastroPessoa cadastroPessoa;

    public PessoaServiceImpl() {
    }
    
    
    @Override
    public boolean salvar(Pessoa pessoa) {
        return cadastroPessoa.salvarPessoa(pessoa);
        }

    @Override
    public boolean remover(Pessoa pessoa) {
        return cadastroPessoa.removerPessoa(pessoa);
        }
    
}
