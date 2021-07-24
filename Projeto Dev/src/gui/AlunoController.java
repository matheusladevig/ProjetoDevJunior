
package gui;
import java.util.List;
import DAO.alunoDAO;
import model.Aluno;


public class AlunoController {
        alunoDAO alunoDAO = new alunoDAO();
        
        public int salvarAluno(Aluno aluno){
            return alunoDAO.inserirAluno(aluno);
        }
        
        public int atualizarAluno(Aluno aluno){
            return alunoDAO.atualizarAluno(aluno);
        }
        
        public int deletarAluno(Integer codigo){
            return alunoDAO.DeletarAluno(codigo);
        }
        
        public List<Aluno> listaAluno(String descricao){
            return alunoDAO.procurarAluno(descricao);
        }
        
        public List<Aluno> pesquisaAluno(){
            return alunoDAO.pesquisaAluno();
        }
}