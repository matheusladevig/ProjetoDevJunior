
package controller;
import java.util.List;
import model.CursoAluno;
import services.CursoAlunoService;


public class CursoAlunoController {
        CursoAlunoService cursoAlunoService = new CursoAlunoService();
        
        public int salvarCursoAluno(CursoAluno cursoAluno){
            return cursoAlunoService.salvarCursoAluno(cursoAluno);
        }
        
        public List<CursoAluno> listaCursoAluno(String descricao,CursoAluno cursoAluno ){
            return cursoAlunoService.listaCursoAluno(descricao, cursoAluno);
        }
        
         public List<CursoAluno> pesquisaSituacao(CursoAluno cursoAluno ){
            return cursoAlunoService.pesquisaSituacao(cursoAluno);
        }
         
       public int deleteCursoAluno(CursoAluno cursoAluno){
           return cursoAlunoService.deleteCursoAluno(cursoAluno);
       }
        
}