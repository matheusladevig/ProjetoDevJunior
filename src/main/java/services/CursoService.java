
package services;
import java.util.List;
import dao.CursoDao;
import model.Curso;

public class CursoService {
    CursoDao cursoDao = new CursoDao();
    public List<Curso> listaCurso(String descricao, Curso curso){
            return cursoDao.procurarCurso(descricao, curso);
        }
    public List<Curso> pesquisaCurso(){
            return cursoDao.pesquisaCurso();
        }
    public List<Curso> pesquisaSituacao(Curso curso){
            return cursoDao.pesquisaSituacao(curso);
        }
     public int salvarCurso(Curso curso){
         if(curso.getCodigo() == null){
             return cursoDao.inserirCurso(curso);
         }else{
             return cursoDao.updateCurso(curso);
         }
                 
     }
}
