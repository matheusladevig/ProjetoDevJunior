/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.SituacaoCadastroDao;
import java.util.List;
import model.SituacaoCadastro;

/**
 *
 * @author Matheus
 */
public class SituacaoCadastroController {
    SituacaoCadastroDao SituacaoCadastroDao = new SituacaoCadastroDao();
    
    public List<SituacaoCadastro> pesquisaSituacaoCadastro(){
        return SituacaoCadastroDao.pesquisaSituacaoCadastro();
    }
    
}
