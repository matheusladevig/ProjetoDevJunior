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
import model.Aluno;

public class alunoDAO {
    
    public int inserirAluno(model.Aluno aluno){
        int rowsAffected = 0;
        Connection conn = null;
        PreparedStatement st = null;
        try{
            conn = DB.getConnection();
            st = conn.prepareStatement("INSERT INTO aluno " +
				"(name) " +
				"VALUES " +
				"(?)"
				);
            st.setString(1, aluno.getName());
            rowsAffected = st.executeUpdate();
        }
       catch (SQLException e) {
		JOptionPane.showMessageDialog(null, e.getMessage());
	} 
	finally {
		DB.closeStatement(st);
	}return rowsAffected;
    }
    
    public int atualizarAluno(model.Aluno aluno){
        int rowsAffected = 0;
        Connection conn = null;
        PreparedStatement st = null;
        try{
            conn = DB.getConnection();
            st = conn.prepareStatement(
				"UPDATE aluno " +
				"SET name = ? " +
				"WHERE codigo = ?");
            st.setString(1, aluno.getName());
            st.setInt(2, aluno.getCodigo());
            rowsAffected = st.executeUpdate();
        }
       catch (SQLException e) {
		JOptionPane.showMessageDialog(null, e.getMessage());
	} 
        
	finally {
		DB.closeStatement(st);
                
	}return rowsAffected; 
    }

    public List<Aluno> pesquisaAluno(){
        List<Aluno> pesquisar = new ArrayList<>();
        
        
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        
        try{
            conn = DB.getConnection();
            st = conn.prepareStatement("SELECT * FROM aluno ");
            rs = st.executeQuery();
            
            
                         while(rs.next()){
                             Aluno model = new Aluno();
                             model.setCodigo(rs.getInt("codigo"));
                             model.setName(rs.getString("name"));
                             pesquisar.add(model);
                        }
                        
        }
        catch( SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        
        }
        return pesquisar;
    } 

    
    public List<Aluno> procurarAluno(String desc){
        List<Aluno> procurar = new ArrayList<>();
        
        
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        
        try{
            conn = DB.getConnection();
            st = conn.prepareStatement("SELECT * FROM aluno where name like ?");
            st.setString(1, "%" + desc + "%");
            rs = st.executeQuery();
            
            
                         while(rs.next()){
                             Aluno model = new Aluno();
                             model.setCodigo(rs.getInt("codigo"));
                             model.setName(rs.getString("name"));
                             procurar.add(model);
                        }
                        
        }
        catch( SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        
        }
        return procurar;
    } 

     public int DeletarAluno(Integer codigo){
        int rowsAffected = 0;
        Connection conn = null;
        PreparedStatement st = null;
        try{
            conn = DB.getConnection();
            st = conn.prepareStatement(
				"DELETE FROM aluno WHERE codigo = ?");
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
