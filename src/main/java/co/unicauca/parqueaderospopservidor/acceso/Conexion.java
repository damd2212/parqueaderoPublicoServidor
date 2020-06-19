package co.unicauca.parqueaderospopservidor.acceso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author danny
 */
public class Conexion {
    
    private Connection conexion;
    
    private final String usuario="root";
    private final String contraseña="system";
    private final String url="jdbc:mysql://localhost:3306/parqueaderopopayan";
    private ResultSet rs;
    private Statement st = null;
    
    public Conexion(){
        
    }

    /**
     *Accede a la conexion con Mysql o la base de datos
     * 
    */
    public void conectar() throws ClassNotFoundException,SQLException{
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/parqueaderopopayan?user=root&password=usuario");

    }

     public boolean crearConsulta(String sql) {
        try{
            st = conexion.createStatement();
            rs = st.executeQuery(sql);
            return true;
        }catch(SQLException e){
            System.out.println(e);
            return false;
        }
        
    }
    
    public boolean actualizar(String sql){
        try{
            st = conexion.createStatement();
            st.executeUpdate(sql);
            return true;
        }catch(SQLException e){
            System.out.println(e);
            return false;
        }
        
    }
    /**
     * Cierra la conexion de la base de datos
     * 
     */
    public void desconectar() throws SQLException{
        if (rs != null) {
            rs.close();
        }
        conexion.close();
    }
    
    /**
     * Retorna el obejto de la conexion con la base de datos
     */
    
    public ResultSet getResultado(){
        return rs;
    }
}
