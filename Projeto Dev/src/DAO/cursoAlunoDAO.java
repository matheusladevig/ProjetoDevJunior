/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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
public class cursoAlunoDAO {

    
    public int inserirCursoAluno(model.CursoAluno cursoAluno){
        int rowsAffected = 0;
        Connection conn = null;
        PreparedStatement st = null;
        try{
            conn = DB.getConnection();
            st = conn.prepareStatement("INSERT INTO curso_aluno " +
				"(codigo_aluno, codigo_curso, classe) " +
				"VALUES " +
				"(?, ?, ?)"
				);
            st.setInt(1, cursoAluno.getAluno().getCodigo());
            st.setInt(2, cursoAluno.getCurso().getCodigo());
            st.setString(3, cursoAluno.getClasse());
            rowsAffected = st.executeUpdate();
        }
       catch (SQLException e) {
		JOptionPane.showMessageDialog(null, e.getMessage());
	} 
	finally {
		DB.closeStatement(st);
                
	}return rowsAffected;
    }
    public int atualizarCursoAluno(model.CursoAluno cursoAluno){
        int rowsAffected = 0;
        Connection conn = null;
        PreparedStatement st = null;
        try{
            conn = DB.getConnection();
            st = conn.prepareStatement(
				"UPDATE curso_aluno " +
				"SET codigo_aluno = ?, codigo_curso = ?, classe = ? " +
				"WHERE codigo = ?");
            st.setInt(1, cursoAluno.getAluno().getCodigo());
            st.setInt(2, cursoAluno.getCurso().getCodigo());
            st.setString(3, cursoAluno.getClasse());
            rowsAffected = st.executeUpdate();
        }
       catch (SQLException e) {
		JOptionPane.showMessageDialog(null, e.getMessage());
	} 
        
	finally {
		DB.closeStatement(st);
                
	}return rowsAffected; 
    }
    public List<CursoAluno> procurarCursoAluno(String desc){
        List<CursoAluno> procurar = new ArrayList<>();
        
        
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        
        try{
            conn = DB.getConnection();
            st = conn.prepareStatement("SELECT * FROM curso_aluno where classe like ?");
            st.setString(1, "%" + desc + "%");
            rs = st.executeQuery();
            
            
                         while(rs.next()){
                             CursoAluno model = new CursoAluno();
                             model.setCodigo(rs.getInt("codigo"));
                             model.setCodigo_aluno(rs.getInt("codigo_aluno"));
                             model.setCodigo_curso(rs.getInt("codigo_curso"));
                             model.setClasse(rs.getString("classe"));
                             procurar.add(model);
                        }
                        
        }
        catch( SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        
        }
        return procurar;
    } 

     public int deletarCursoAluno(Integer codigo){
        int rowsAffected = 0;
        Connection conn = null;
        PreparedStatement st = null;
        try{
            conn = DB.getConnection();
            st = conn.prepareStatement(
				"DELETE FROM curso_aluno WHERE codigo = ?");
            st.setInt(1, codigo);
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
