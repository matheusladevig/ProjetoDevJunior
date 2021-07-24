
package gui;
import java.util.List;
import DAO.cursoAlunoDAO;
import model.CursoAluno;


public class CursoAlunoController {
        cursoAlunoDAO cursoAlunoDAO = new cursoAlunoDAO();
        
        public int salvarCursoAluno(CursoAluno cursoAluno){
            return cursoAlunoDAO.inserirCursoAluno(cursoAluno);
        }

        public int atualizarCursoAluno(CursoAluno curso){
            return cursoAlunoDAO.atualizarCursoAluno(curso);
        }

        public int deletarCursoAluno(Integer codigo){
            return cursoAlunoDAO.deletarCursoAluno(codigo);
        }
        
        public List<CursoAluno> listaCursoAluno(String descricao){
            return cursoAlunoDAO.procurarCursoAluno(descricao);
        }
        /*
        public List<Curso> pesquisaCurso(){
            return cursoAlunoDAO.pesquisaCurso();
        }
        */
}