package sistemafarmacia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class Conexion {
    public Connection connection;
    Properties properties = new Properties();
    
    String DRIVER;
    String URL;
    String USER;
    String PASSWORD;
    
    public Conexion() {
        try {
            //properties.load(new FileInputStream(new File("configuracion.properties")));
            cargarConfig();
            
            Class.forName(DRIVER);            
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            
            System.out.println("Conexión establecida");
            
        }catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }  
    
    public void cargarConfig() {
        try {
            String ruta = System.getProperty("user.dir");
            String separador = "\\";
            String[] rutaDividida = ruta.split(Pattern.quote(separador));
            String rutaFinal = "C:";
            
            for( int i=1 ; i<rutaDividida.length-1 ; i++ ) {
                ruta = separador + rutaDividida[i];
                rutaFinal += ruta;
            }
            
            InputStream entrada = new FileInputStream(rutaFinal +  "\\SistemaFarmacia\\configuracion.properties");
            properties.load(entrada);
            
            //properties.load(new FileInputStream(new File("configuracion.properties")));
            
            DRIVER = properties.getProperty("DRIVER");
            URL = properties.getProperty("URL");
            USER = properties.getProperty("USER");
            PASSWORD = properties.getProperty("PASSWORD");
        }catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }
       
    
    
    public int ejecutarSentencia(String sentencia){
        try {
            PreparedStatement prep = connection.prepareStatement(sentencia);
            prep.execute();
            return 1;
        }catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }
    
    public ResultSet consultarRegistros(String sentencia) {
        try {
            PreparedStatement prep = connection.prepareStatement(sentencia);
            ResultSet respuesta = prep.executeQuery();
            return respuesta;
        }catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }
    
}
