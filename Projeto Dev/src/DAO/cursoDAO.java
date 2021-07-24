package DAO;
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


public class cursoDAO {
    public int inserirCurso(model.Curso curso){
        int rowsAffected = 0;
        Connection conn = null;
        PreparedStatement st = null;
        try{
            conn = DB.getConnection();
            st = conn.prepareStatement("INSERT INTO curso " +
				"(descricao, ementa) " +
				"VALUES " +
				"(?, ?)"
				);
            st.setString(1, curso.getDescricao());
            st.setString(2, curso.getEmenta());
            rowsAffected = st.executeUpdate();
        }
       catch (SQLException e) {
		JOptionPane.showMessageDialog(null, e.getMessage());
	} 
	finally {
		DB.closeStatement(st);               
	}return rowsAffected;
    }
public int atualizarCurso(model.Curso curso){
        int rowsAffected = 0;
        Connection conn = null;
        PreparedStatement st = null;
        try{
            conn = DB.getConnection();
            st = conn.prepareStatement(
				"UPDATE curso " +
				"SET descricao = ?, ementa = ? " +
				"WHERE codigo = ?");
            st.setString(1, curso.getDescricao());
            st.setString(2, curso.getEmenta());
            st.setInt(3, curso.getCodigo());
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
            st = conn.prepareStatement("SELECT * FROM curso ");
            
            rs = st.executeQuery();
            
            
                         while(rs.next()){
                             Curso model = new Curso();
                             model.setCodigo(rs.getInt("codigo"));
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

    
    public List<Curso> procurarCurso(String desc){
        List<Curso> procurar = new ArrayList<>();
        
        
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        
        try{
            conn = DB.getConnection();
            st = conn.prepareStatement("SELECT * FROM curso where descricao like ?");
            st.setString(1, "%" + desc + "%");
            rs = st.executeQuery();
            
            
                         while(rs.next()){
                             Curso model = new Curso();
                             model.setCodigo(rs.getInt("codigo"));
                             model.setDescricao(rs.getString("descricao"));
                             model.setEmenta(rs.getString("ementa"));
                             procurar.add(model);
                        }
                        
        }
        catch( SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        
        }
        return procurar;
    } 

     public int DeletarCurso(Integer codigo){
        int rowsAffected = 0;
        Connection conn = null;
        PreparedStatement st = null;
        try{
            conn = DB.getConnection();
            st = conn.prepareStatement(
				"DELETE FROM curso WHERE codigo = ?");
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

