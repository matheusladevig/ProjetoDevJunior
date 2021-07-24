package dao;
import db.DB;
import db.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Aluno;
import model.SituacaoCadastro;

public class AlunoDao {
    
    public int inserir(model.Aluno aluno){
        int rowsAffected = 0;
        Connection conn = null;
        PreparedStatement st = null;
        
           try{
            conn = DB.getConnection();
            StringBuilder sql = new StringBuilder()
                    .append("INSERT INTO aluno")
                    .append(" (nome, id_situacaocadastro)")
                    .append(" VALUES (?, ?)");
            st = conn.prepareStatement(sql.toString());
            st.setString(1, aluno.getNome());
            st.setInt(2, aluno.getSituacaoCadastro().getId());
            rowsAffected = st.executeUpdate();
        }
       catch (SQLException e) {
		JOptionPane.showMessageDialog(null, e.getMessage());
	}
        
	finally {
		DB.closeStatement(st);
	}return rowsAffected; 
            
    }
    public int update(model.Aluno aluno){
        int rowsAffected = 0;
        Connection conn = null;
        PreparedStatement st = null;
        try{
            conn = DB.getConnection();
            StringBuilder sql = new StringBuilder()
                    .append("UPDATE aluno")
                    .append(" SET nome = ?, id_situacaocadastro = ?")
                    .append(" WHERE id = ?");
            st = conn.prepareStatement(sql.toString());
            st.setString(1, aluno.getNome());
            st.setInt(2, aluno.getSituacaoCadastro().getId());
            st.setInt(3, aluno.getId());
            rowsAffected = st.executeUpdate();
        }
       catch (SQLException e) {
		JOptionPane.showMessageDialog(null, e.getMessage());
	} 
        
	finally {
		DB.closeStatement(st);
                
	}return rowsAffected;  
    }
   

    public List<Aluno> pesquisaSituacao(model.Aluno aluno){
        List<Aluno> pesquisarSituacao = new ArrayList<>();
        
        
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        
        try{
            conn = DB.getConnection();
            StringBuilder sql = null;
            sql = new StringBuilder();
                    sql.append("SELECT a.id, a.nome, a.id_situacaocadastro FROM aluno a ");
                    sql.append("WHERE id = ?");
            st = conn.prepareStatement(sql.toString());
            st.setInt(1, aluno.getId());
            rs = st.executeQuery();
            
            
                         while(rs.next()){
                             Aluno model = new Aluno();
                             model.setId(rs.getInt("id"));
                             model.setNome(rs.getString("nome"));
                             model.setId_situacaocadastro(rs.getInt("id_situacaocadastro"));
                             pesquisarSituacao.add(model);
                        }                       
        }
        catch( SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        
        }
        return pesquisarSituacao;
    } 
   
    public List<Aluno> pesquisaAluno(){
        List<Aluno> pesquisar = new ArrayList<>();
        
        
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        
        try{
            conn = DB.getConnection();
            StringBuilder sql = new StringBuilder()
                    .append("SELECT * FROM aluno ");
            st = conn.prepareStatement(sql.toString());
            rs = st.executeQuery();
            
            
                         while(rs.next()){
                             Aluno model = new Aluno();
                             model.setId(rs.getInt("id"));
                             model.setNome(rs.getString("nome"));
                             model.setId_situacaocadastro(rs.getInt("id_situacaocadastro"));
                             pesquisar.add(model);
                        }
                        
        }
        catch( SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        
        }
        return pesquisar;
    } 

public List<Aluno> procurarAluno(String desc, model.Aluno aluno){
        List<Aluno> procurar = new ArrayList<>();
        
        
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
    
        try{
            
            conn = DB.getConnection();
            StringBuilder sql = new StringBuilder();
                    sql.append("SELECT a.id, a.nome FROM aluno a");
                    sql.append(" INNER JOIN situacaocadastro sc on sc.id = a.id_situacaocadastro");
                    if(!desc.isEmpty()){
                        sql.append(" WHERE a.nome ilike '%" +desc+ "%'");
                    }
                    if(!aluno.getTeste().isEmpty()){
                        sql.append(" and sc.descricao ilike '%" +aluno.getTeste()+ "%'");
                    }
                    
                    if(aluno.getId() != null){
                        sql.append(" and a.id = " +aluno.getId()+ " order by id");
                    } 
            st = conn.prepareStatement(sql.toString());
            rs = st.executeQuery();
            
            
                         while(rs.next()){
                             Aluno model = new Aluno();
                             model.setId(rs.getInt("id"));
                             model.setNome(rs.getString("nome"));
                             procurar.add(model);
                        }
                        
        }
        catch( SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        
        }
        return procurar;
    }    
  
}
