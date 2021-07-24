package services;
import java.util.List;
import dao.CursoAlunoDao;
import model.CursoAluno;

public class CursoAlunoService {
     CursoAlunoDao cursoAlunoDao = new CursoAlunoDao();
     public List<CursoAluno> listaCursoAluno(String descricao,CursoAluno cursoAluno ){
            return cursoAlunoDao.procurarCursoAluno(descricao, cursoAluno);
        }
        
         public List<CursoAluno> pesquisaSituacao(CursoAluno cursoAluno ){
            return cursoAlunoDao.pesquisaSituacao(cursoAluno);
        }
         
       public int deleteCursoAluno(CursoAluno cursoAluno){
           return cursoAlunoDao.deleteCursoAluno(cursoAluno);
       }
        public int salvarCursoAluno(CursoAluno cursoAluno){
           if(cursoAluno.getCodigo() == null){
               return cursoAlunoDao.inserirCursoAluno(cursoAluno);
           }else{
               return cursoAlunoDao.updateCursoAluno(cursoAluno);
           }
        }
}
