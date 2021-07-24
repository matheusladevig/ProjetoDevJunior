
package model;

public class Aluno {

    private Integer id;
    private String nome;
    private String pesquisa;
    private Integer id_situacaocadastro;
    private String descricao_situacaocadastro;
    private SituacaoCadastro situacaoCadastro;
    private String teste;
    
    public SituacaoCadastro getSituacaoCadastro() {
        return situacaoCadastro;
    }

    /**
     * @param situacaoCadastro the situacaoCadastro to set
     */
    public void setSituacaoCadastro(SituacaoCadastro situacaoCadastro) {
        this.situacaoCadastro = situacaoCadastro;
    }

    
    public Integer getId_situacaocadastro() {
        return id_situacaocadastro;
    }

    /**
     * @param id_situacaocadastro the id_situacaocadastro to set
     */
    public void setId_situacaocadastro(Integer id_situacaocadastro) {
        this.id_situacaocadastro = id_situacaocadastro;
    }

    /**
     * @return the descricao_situacaocadastro
     */
    public String getDescricao_situacaocadastro() {
        return descricao_situacaocadastro;
    }

    /**
     * @param descricao_situacaocadastro the descricao_situacaocadastro to set
     */
    public void setDescricao_situacaocadastro(String descricao_situacaocadastro) {
        this.descricao_situacaocadastro = descricao_situacaocadastro;
    }
    

   
    public String getPesquisa() {
        return pesquisa;
    }

    
      
  
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
  
 
    public Integer getId() {
        return id;
    }


    public void setId(Integer codigo) {
        this.id = codigo;
    }

 
    public String getNome() {
        return nome;
    }

    public void setNome(String name) {
        this.nome = name;
    }
    

    @Override
    public String toString() {
        return this.getNome(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the teste
     */
    public String getTeste() {
        return teste;
    }

    /**
     * @param teste the teste to set
     */
    public void setTeste(String teste) {
        this.teste = teste;
    }
    
    
    
}
