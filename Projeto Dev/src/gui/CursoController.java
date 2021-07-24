
package gui;
import java.util.List;
import DAO.cursoDAO;
import model.Curso;


public class CursoController {
        cursoDAO cursoDAO = new cursoDAO();
        
        public int salvarCurso(Curso curso){
            return cursoDAO.inserirCurso(curso);
        }
        
        public int atualizarCurso(Curso curso){
            return cursoDAO.atualizarCurso(curso);
        }
        
        public int deletarCurso(Integer codigo){
            return cursoDAO.DeletarCurso(codigo);
        }
        
        public List<Curso> listaCurso(String descricao){
            return cursoDAO.procurarCurso(descricao);
        }
        public List<Curso> pesquisaCurso(){
            return cursoDAO.pesquisaCurso();
        }
        
}