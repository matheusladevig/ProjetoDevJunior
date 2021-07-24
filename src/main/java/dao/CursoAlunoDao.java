/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Aluno;
import model.Curso;
import model.CursoAluno;

/**
 *
 * @author Matheus
 */
public class CursoAlunoDao {

    
    public int inserirCursoAluno(model.CursoAluno cursoAluno){
        int rowsAffected = 0;

        Connection conn = null;
        PreparedStatement st = null;
       
          try{
            conn = DB.getConnection();
            StringBuilder sql = new StringBuilder()
                    .append("INSERT INTO curso_aluno")
                    .append(" (id_aluno, id_curso, classe, id_situacaocadastro)")
                    .append(" VALUES (?, ?, ?, ?)");
            st = conn.prepareStatement(sql.toString());
            st.setInt(1, cursoAluno.getAluno().getId());
            st.setInt(2, cursoAluno.getCurso().getCodigo());
            st.setString(3, cursoAluno.getClasse());
            st.setInt(4, cursoAluno.getSituacaoCadastro().getId());
            rowsAffected = st.executeUpdate();
           
        }
       catch (SQLException e) {
		JOptionPane.showMessageDialog(null, e.getMessage());
	} 
	finally {
		DB.closeStatement(st);
                
	}return rowsAffected; 
    }
     public int updateCursoAluno(model.CursoAluno cursoAluno){
        int rowsAffected = 0;

        Connection conn = null;
        PreparedStatement st = null;
            try{
            conn = DB.getConnection();
            StringBuilder sql = new StringBuilder()
                    .append("UPDATE curso_aluno")
                    .append(" SET id_aluno = ?, id_curso = ?, classe = ?, id_situacaocadastro = ?")
                    .append(" WHERE id = ?");
            st = conn.prepareStatement(sql.toString());
            st.setInt(1, cursoAluno.getAluno().getId());
            st.setInt(2, cursoAluno.getCurso().getCodigo());
            st.setString(3, cursoAluno.getClasse());
            st.setInt(4, cursoAluno.getSituacaoCadastro().getId());
            st.setInt(5, cursoAluno.getCodigo());
            rowsAffected = st.executeUpdate();
        }
       catch (SQLException e) {
		JOptionPane.showMessageDialog(null, e.getMessage());
	} 
        
	finally {
		DB.closeStatement(st);
                
	}return rowsAffected; 
        }
        
    
    public List<CursoAluno> procurarCursoAluno(String desc, model.CursoAluno cursoAluno){
        List<CursoAluno> procurar = new ArrayList<>();
        
        
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        
        try{
            conn = DB.getConnection();
            
            StringBuilder sql = new StringBuilder();
                    sql.append("SELECT ca.id, ca.id_aluno, ca.id_curso, ca.classe, a.nome, c.descricao");
                    sql.append(" FROM curso_aluno ca");
                    sql.append(" INNER JOIN aluno a ON a.id = ca.id_aluno");
                    sql.append(" INNER JOIN curso c ON c.id = ca.id_curso");
                    sql.append(" INNER JOIN situacaocadastro sc on sc.id = ca.id_situacaocadastro");
                    if(!desc.isEmpty()){
                        sql.append(" WHERE ca.classe ilike '%" +desc+ "%'");
                    }
                    if(!cursoAluno.getPesquisaSituacao().isEmpty()){
                        sql.append(" AND sc.descricao ilike '%" +cursoAluno.getPesquisaSituacao()+ "%'");
                    }
                    if(!cursoAluno.getPesquisaAluno().isEmpty()){
                       sql.append(" AND a.nome ilike '%" +cursoAluno.getPesquisaAluno()+ "%'"); 
                    }
                    if(!cursoAluno.getPesquisaCurso().isEmpty()){
                        sql.append(" AND c.descricao ilike '%" +cursoAluno.getPesquisaCurso()+ "%'");
                    }
                    if(cursoAluno.getCodigo() != null){
                        sql.append(" AND ca.id = " +cursoAluno.getCodigo()+ " order by id");
                    }
                              
            st = conn.prepareStatement(sql.toString());

            rs = st.executeQuery();
            
            
                         while(rs.next()){
                             CursoAluno model = new CursoAluno();
                             model.setCodigo(rs.getInt("id"));
                             model.setCodigo_aluno(rs.getInt("id_aluno"));
                             model.setCodigo_curso(rs.getInt("id_curso"));
                             model.setClasse(rs.getString("classe"));
                             model.setNome_aluno(rs.getString("nome"));
                             model.setNome_curso(rs.getString("descricao"));
                             procurar.add(model);
                        }
                        
        }
        catch( SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        
        }
        return procurar;
    } 

      public List<CursoAluno> pesquisaSituacao(model.CursoAluno cursoAluno){
        List<CursoAluno> pesquisarSituacao = new ArrayList<>();
        
        
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            conn = DB.getConnection();
            StringBuilder sql = null;
            sql = new StringBuilder();
                    sql.append("SELECT * FROM curso_aluno ca");
                    sql.append(" WHERE ca.id = ?");
            st = conn.prepareStatement(sql.toString());
            st.setInt(1, cursoAluno.getCodigo());
            rs = st.executeQuery();
            
            
                         while(rs.next()){
                             CursoAluno model = new CursoAluno();
                             model.setCodigo(rs.getInt("id"));
                             model.setCodigo_aluno(rs.getInt("id_aluno"));
                             model.setCodigo_curso(rs.getInt("id_curso"));
                             model.setId_situacaocadastro(rs.getInt("id_situacaocadastro"));
                             model.setClasse(rs.getString("classe"));
                             
                             
                             pesquisarSituacao.add(model);
                        }                       
        }
        catch( SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        
        }
        return pesquisarSituacao;
    } 
    public int deleteCursoAluno(model.CursoAluno cursoAluno){
        int rowsAffected = 0;
        Connection conn = null;
        PreparedStatement st = null;
          try{
            conn = DB.getConnection();
            StringBuilder sql = new StringBuilder()
                    .append("DELETE FROM curso_aluno")
                    .append(" WHERE id = ?");
            st = conn.prepareStatement(sql.toString());
            st.setInt(1, cursoAluno.getCodigo());
            rowsAffected = st.executeUpdate();
            
        }
       catch (SQLException e) {
		JOptionPane.showMessageDialog(null, e.getMessage());
	} 
	finally {
		DB.closeStatement(st);
                
	}return rowsAffected;  
    
}
}
