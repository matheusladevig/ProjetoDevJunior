/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DbException;
import db.DB;
import static db.DB.getDatabaseName;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class CriaTabelas {
    public boolean CriaTabelas() {
        boolean sucesso = false;
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        StringBuilder sql = null;
        sql = new StringBuilder();
        
        sql.append("CREATE TABLE  IF NOT EXISTS situacaocadastro(");
        sql.append("id SERIAL PRIMARY KEY,");
        sql.append("descricao VARCHAR(10) NOT NULL); ");
        
        sql.append("INSERT INTO situacaocadastro(descricao)") ;
        sql.append("SELECT 'ATIVO' WHERE NOT EXISTS ( ");
        sql.append("SELECT 1 FROM situacaocadastro WHERE id = 1);");
        sql.append("INSERT INTO situacaocadastro(descricao)") ;
        sql.append("SELECT 'EXCLUIDO' WHERE NOT EXISTS ( ");
        sql.append("SELECT 1 FROM situacaocadastro WHERE id = 2);");
        
        sql.append("CREATE TABLE  IF NOT EXISTS aluno(");
        sql.append("id SERIAL PRIMARY KEY,");
        sql.append("nome VARCHAR(50) NOT NULL, ");
        sql.append("id_situacaocadastro int NOT NULL , ");
        sql.append("FOREIGN KEY (id_situacaocadastro) REFERENCES situacaocadastro (id));");

        sql.append("CREATE TABLE  IF NOT EXISTS curso(");
        sql.append("id SERIAL PRIMARY KEY,");
        sql.append("descricao VARCHAR(50) NOT NULL , ");
        sql.append("ementa VARCHAR (50) NOT NULL,");
        sql.append("id_situacaocadastro int NOT NULL, ");
        sql.append("FOREIGN KEY (id_situacaocadastro) REFERENCES situacaocadastro (id));");
        
        sql.append("CREATE TABLE  IF NOT EXISTS curso_aluno(");
        sql.append("id SERIAL PRIMARY KEY,");
        sql.append("id_aluno int NOT NULL , ");
        sql.append("id_curso int NOT NULL,");
        sql.append("id_situacaocadastro int NOT NULL, ");
        sql.append("classe VARCHAR (50) NOT NULL,");
        sql.append("FOREIGN KEY (id_aluno) REFERENCES aluno (id),");
        sql.append("FOREIGN KEY (id_curso) REFERENCES curso (id),");
        sql.append("FOREIGN KEY (id_situacaocadastro) REFERENCES situacaocadastro (id));");

     
        
   

      
                
        try {
            conn = DB.getConnection();
            st = conn.prepareStatement(sql.toString());
            st.execute();
            sucesso = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", 0);
        }
        return sucesso;
    }
    
    
    
  
}
