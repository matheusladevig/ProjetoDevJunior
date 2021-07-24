package model;

public class CursoAluno {

    /**
     * @return the classe
     */
    public String getClasse() {
        return classe;
    }

    /**
     * @param classe the classe to set
     */
    public void setClasse(String classe) {
        this.classe = classe;
    }

    /**
     * @return the Aluno
     */
    public Aluno getAluno() {
        return Aluno;
    }

    /**
     * @param Aluno the Aluno to set
     */
    public void setAluno(Aluno Aluno) {
        this.Aluno = Aluno;
    }

    /**
     * @return the Curso
     */
    public Curso getCurso() {
        return Curso;
    }

    /**
     * @param Curso the Curso to set
     */
    public void setCurso(Curso Curso) {
        this.Curso = Curso;
    }

    /**
     * @return the codigo_aluno
     */
    public Integer getCodigo_aluno() {
        return codigo_aluno;
    }

    /**
     * @param codigo_aluno the codigo_aluno to set
     */
    public void setCodigo_aluno(Integer codigo_aluno) {
        this.codigo_aluno = codigo_aluno;
    }

    /**
     * @return the codigo_curso
     */
    public Integer getCodigo_curso() {
        return codigo_curso;
    }

    /**
     * @param codigo_curso the codigo_curso to set
     */
    public void setCodigo_curso(Integer codigo_curso) {
        this.codigo_curso = codigo_curso;
    }

    /**
     * @return the codigo_aluno
     */
   

  

   
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }


    private Integer codigo;
     private Aluno Aluno;
     private Curso Curso;
    private Integer codigo_aluno;
    private Integer codigo_curso;
    private String classe;
    
}
