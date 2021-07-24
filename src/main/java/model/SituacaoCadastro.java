/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Matheus
 */
public class SituacaoCadastro {
    
    private Integer id;
    private String descricao;
    private String pesquisa;

   
    public String getPesquisa() {
        return pesquisa;
    }

    
      
  
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
  
 
    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

 
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
   public String toString() {
        return this.getDescricao(); //To change body of generated methods, choose Tools | Templates.
    }

}
