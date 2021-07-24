
package model;

public class Aluno {

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

 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private Integer codigo;
    private String name;
    private String pesquisa;

    @Override
    public String toString() {
        return this.getName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
