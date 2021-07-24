
package services;
import java.util.List;
import dao.AlunoDao;
import model.Aluno;

public class AlunoService {
    AlunoDao alunoDao = new AlunoDao();
    
    public int salvarAluno(Aluno aluno){
        if(aluno.getId() == null){
          return  alunoDao.inserir(aluno);
        }else{
           return alunoDao.update(aluno);
        } 
    }
    public List<Aluno> listaAluno(String descricao, Aluno aluno){
        return alunoDao.procurarAluno(descricao, aluno);
    }
    public List<Aluno> pesquisaAluno(){
        return alunoDao.pesquisaAluno();
    }
    public List<Aluno> pesquisaSituacao(Aluno aluno){
        return alunoDao.pesquisaSituacao(aluno);
    }

}
