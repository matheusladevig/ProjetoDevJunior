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
import model.Curso;


public class CursoDao {
    public int inserirCurso(model.Curso curso){
        int rowsAffected = 0;
        Connection conn = null;
        PreparedStatement st = null;
        
         try{
            conn = DB.getConnection();
            StringBuilder sql = new StringBuilder()
                    .append("INSERT INTO curso")
                    .append(" (descricao, ementa, id_situacaocadastro)")
                    .append(" VALUES (?, ?, ?)");
            st = conn.prepareStatement(sql.toString());
            st.setString(1, curso.getDescricao());
            st.setString(2, curso.getEmenta());
            st.setInt(3, curso.getSituacaoCadastro().getId());
            rowsAffected = st.executeUpdate();
        }
       catch (SQLException e) {
		JOptionPane.showMessageDialog(null, e.getMessage());
	} 
	finally {
		DB.closeStatement(st);               
	}return rowsAffected;   
}
    
    public int updateCurso(model.Curso curso){
        int rowsAffected = 0;
        Connection conn = null;
        PreparedStatement st = null;
           try{
            conn = DB.getConnection();
            StringBuilder sql = new StringBuilder()
                    .append("UPDATE curso")
                    .append(" SET descricao = ?, ementa = ?, id_situacaocadastro = ?")
                    .append(" WHERE id = ?");
            st = conn.prepareStatement(sql.toString());
            st.setString(1, curso.getDescricao());
            st.setString(2, curso.getEmenta());
            st.setInt(3, curso.getSituacaoCadastro().getId());
            st.setInt(4, curso.getCodigo());
            rowsAffected = st.executeUpdate();
        }
       catch (SQLException e) {
		JOptionPane.showMessageDialog(null, e.getMessage());
	} 
	finally {
		DB.closeStatement(st);               
	}return rowsAffected; 
        
}
        
    public List<Curso> pesquisaCurso(){
        List<Curso> pesquisa = new ArrayList<>();
        
        
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        
        try{
            conn = DB.getConnection();
            StringBuilder sql = new StringBuilder()
                    .append("SELECT * FROM curso");
            st = conn.prepareStatement(sql.toString());
            
            rs = st.executeQuery();
            
            
                         while(rs.next()){
                             Curso model = new Curso();
                             model.setCodigo(rs.getInt("id"));
                             model.setDescricao(rs.getString("descricao"));
                             model.setEmenta(rs.getString("ementa"));
                             pesquisa.add(model);
                        }
                        
        }
        catch( SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        
        }
        return pesquisa;
 }  

    
    public List<Curso> procurarCurso(String desc, model.Curso curso){
        List<Curso> procurar = new ArrayList<>();
        
        
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        
        try{
            conn = DB.getConnection();
            StringBuilder sql = new StringBuilder()
                    .append("SELECT c.id, c.descricao, c.ementa, c.id_situacaocadastro FROM curso c")
                    .append(" INNER JOIN situacaocadastro sc on sc.id = c.id_situacaocadastro")
                    .append(" where c.descricao ilike ? and sc.descricao ilike ? and c.id::text ilike ? order by id");
            st = conn.prepareStatement(sql.toString());       
            st.setString(1, "%" + desc + "%");
            st.setString(2, "%" + curso.getPesquisaSituacao() + "%");
            st.setString(3, "%" + curso.getPesquisa() + "%");
            rs = st.executeQuery();
            
            
                         while(rs.next()){
                             Curso model = new Curso();
                             model.setCodigo(rs.getInt("id"));
                             model.setDescricao(rs.getString("descricao"));
                             model.setEmenta(rs.getString("ementa"));
                             model.setId_situacaocadastro(rs.getInt("id_situacaocadastro"));
                             procurar.add(model);
                        }
                        
        }
        catch( SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        
        }
        return procurar;
    } 

     
     public List<Curso> pesquisaSituacao(model.Curso curso){
        List<Curso> pesquisarSituacao = new ArrayList<>();
        
        
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        
        try{
            conn = DB.getConnection();
            StringBuilder sql = null;
            sql = new StringBuilder();
                    sql.append("SELECT c.id, c.descricao, c.ementa, c.id_situacaocadastro FROM curso c");
                    sql.append(" INNER JOIN situacaocadastro sc on sc.id = c.id_situacaocadastro");
                    sql.append(" WHERE c.id = ?");
            st = conn.prepareStatement(sql.toString());
            st.setInt(1, curso.getCodigo());
            rs = st.executeQuery();
            
            
                         while(rs.next()){
                             Curso model = new Curso();
                             model.setCodigo(rs.getInt("id"));
                             model.setEmenta(rs.getString("ementa"));
                             model.setDescricao(rs.getString("descricao"));
                             model.setId_situacaocadastro(rs.getInt("id_situacaocadastro"));
                             
                             
                             pesquisarSituacao.add(model);
                        }                       
        }
        catch( SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        
        }
        return pesquisarSituacao;
    } 
    
}

