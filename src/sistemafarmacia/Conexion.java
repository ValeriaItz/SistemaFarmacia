package sistemafarmacia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    private static final String db = "bd_sistemafarmacia";
    private static final String url = "jdbc:mysql://localhost/"+db+"";
    
    public Conexion(){
        conn = null;
        try{
            Class.forName(driver);
            
            conn = DriverManager.getConnection(url, user, pass);
            
            // Conexion?
            if(conn != null)
                System.out.println("Conexión establecida exitosamente");
        }catch (ClassNotFoundException | SQLException ex){
            System.out.println("Conexión Fallida:\n\n"+ex);
        }
    }
    
    public Connection getConnection(){
        return conn;
    }
    
    public static void main(String[] args) {
        
        try {
            Conexion conx = new Conexion();
            Statement stat;
            ResultSet rs;
            stat = conx.conn.createStatement();
            rs = stat.executeQuery("select * from pedidos");
            while(rs.next()){
                System.out.println(rs.getString("nombre_producto"));
            }
            conx.conn.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
