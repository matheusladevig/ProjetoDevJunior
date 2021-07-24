package model;

public class Curso {

    /**
     * @return the pesquisaSituacao
     */
   

    private Integer codigo;
    private String descricao;
    private String pesquisa;
    private String ementa;
    private String pesquisaSituacao;
    private SituacaoCadastro situacaoCadastro;
    private Integer id_situacaocadastro;
    private String descricao_situacaocadastro;
    
     public String getPesquisaSituacao() {
        return pesquisaSituacao;
    }

    /**
     * @param pesquisaSituacao the pesquisaSituacao to set
     */
    public void setPesquisaSituacao(String pesquisaSituacao) {
        this.pesquisaSituacao = pesquisaSituacao;
    }
    
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the ementa
     */
    public String getEmenta() {
        return ementa;
    }

    /**
     * @param ementa the ementa to set
     */
    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

 
    public String toString() {
        return this.getDescricao(); //To change body of generated methods, choose Tools | Templates.
    }
    



    /**
     * @return the situacaoCadastro
     */
    public SituacaoCadastro getSituacaoCadastro() {
        return situacaoCadastro;
    }

    /**
     * @param situacaoCadastro the situacaoCadastro to set
     */
    public void setSituacaoCadastro(SituacaoCadastro situacaoCadastro) {
        this.situacaoCadastro = situacaoCadastro;
    }

    /**
     * @return the id_situacaocadastro
     */
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
}
