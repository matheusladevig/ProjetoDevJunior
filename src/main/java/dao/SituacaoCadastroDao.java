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
import model.SituacaoCadastro;


/**
 *
 * @author Matheus
 */
public class SituacaoCadastroDao {
    
    public List<SituacaoCadastro> pesquisaSituacaoCadastro(){
        List<SituacaoCadastro> pesquisar = new ArrayList<>();
        
        
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        
        try{
            conn = DB.getConnection();
            StringBuilder sql = new StringBuilder()
                    .append("SELECT sc.id, sc.descricao FROM situacaocadastro  sc");
            st = conn.prepareStatement(sql.toString());
            rs = st.executeQuery();
            
            
                         while(rs.next()){
                             SituacaoCadastro model = new SituacaoCadastro();
                             model.setId(rs.getInt("id"));
                             model.setDescricao(rs.getString("descricao"));
                             pesquisar.add(model);
                        }
                        
        }
        catch( SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        
        }
        return pesquisar;
    } 
    
}
