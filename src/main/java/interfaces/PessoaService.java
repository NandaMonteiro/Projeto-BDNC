/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Pessoa;

/**
 *
 * @author NandaPC
 */
public interface PessoaService {
    public boolean salvar(Pessoa pessoa);
    public boolean remover(Pessoa pessoa);
    
}
