
package controller;
import java.util.List;

import model.Curso;
import services.CursoService;

public class CursoController {
        CursoService cursoService = new CursoService();
        
        public int salvarCurso(Curso curso){
            return cursoService.salvarCurso(curso);
        } 
        public List<Curso> listaCurso(String descricao, Curso curso){
            return cursoService.listaCurso(descricao, curso);
        }
        public List<Curso> pesquisaCurso(){
            return cursoService.pesquisaCurso();
        }
         public List<Curso> pesquisaSituacao(Curso curso){
            return cursoService.pesquisaSituacao(curso);
        }
        
}