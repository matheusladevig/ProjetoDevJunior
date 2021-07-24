package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.JOptionPane;
import gui.CriarPropertiesGUI;


public class DB {
    PreparedStatement st = null;
    ResultSet rs = null;
    private static Connection conn = null;
    
    public static Properties loadProperties() {
		try (FileInputStream fs = new FileInputStream("C:/ProjetoNovo/db.properties")) {
			Properties props = new Properties();
			props.load(fs);
			return props;
		}
		catch (IOException e) {
			throw new DbException(e.getMessage());
		}
	}
    public static Connection getConnection() {
		if (conn == null) {
			try {
				Properties props = loadProperties();
                                String servidor = props.getProperty("database.ip");
                                String portaConexao = props.getProperty("database.porta");
                                String nome = props.getProperty("database.nome");
                                String usuario = props.getProperty("user");
                                String senha = props.getProperty("password");
				String url = "jdbc:postgresql://" + servidor + ":" + portaConexao + "/" + nome + "";
				conn = DriverManager.getConnection(url, props);
			}
			catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
		return conn;
	}
    public static void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
    public static void closeStatement(Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
        

    public static void closeResultSet(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
    
     public static String getDatabaseName() {
        Properties props = loadProperties();
        String database = props.getProperty("database.nome");
        return database;
    }
     

  public boolean validaBanco() {
        boolean retorno = false;
        ResultSet rs = null;
        PreparedStatement st = null;
        try {
            Properties props = loadProperties();
            String servidor = props.getProperty("database.ip");
            String portaConexao = props.getProperty("database.porta");
            String nome = props.getProperty("database.nome");
            String usuario = props.getProperty("user");
            String senha = props.getProperty("password");
            String url = "jdbc:postgresql://" + servidor + ":" + portaConexao + "/";
            conn = DriverManager.getConnection(url, props);
            st = conn.prepareStatement("SELECT * FROM pg_database WHERE datname = '" + nome + "'");
            rs = st.executeQuery();
            if(rs.next()){
                 url = "jdbc:postgresql://" + servidor + ":" + portaConexao + "/" + nome + "";
                 conn = DriverManager.getConnection(url, props);
                 retorno = true;
            }
            else {   
                int input = JOptionPane.showConfirmDialog(null, "O Banco:  "
                        + DB.getDatabaseName() + " Não existe, deseja Criar?",
                        "Atenção!",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (input == 0) {
                    String sql = "CREATE DATABASE " + nome + ";";
                    st = conn.prepareStatement(sql);
                    st.executeUpdate();
                    url = "jdbc:postgresql://" + servidor + ":" + portaConexao + "/" + nome + "";
                    conn = DriverManager.getConnection(url, props);
                    retorno = true;
                }
          
            }      
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "A tentativa de Conexão falhou!! \n" + ex);
        }
        return retorno;
    }  


}