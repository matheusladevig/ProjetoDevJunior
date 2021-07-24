
package controller;
import java.util.List;
import model.Aluno;
import services.AlunoService;


public class AlunoController {
        AlunoService alunoService = new AlunoService();
        
        public int salvarAluno(Aluno aluno){
            return alunoService.salvarAluno(aluno);
        }
        
        public List<Aluno> listaAluno(String descricao, Aluno aluno){
            return alunoService.listaAluno(descricao, aluno);
        }
      
        public List<Aluno> pesquisaAluno(){
            return alunoService.pesquisaAluno();
        }

        public List<Aluno> pesquisaSituacao(Aluno aluno){
            return alunoService.pesquisaSituacao(aluno);
        }
}