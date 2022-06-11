package sistemafarmacia;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ComunicacionBD {
    
    
    public static String[][] datosBD(String tabla)throws SQLException{
        Conexion conn = new Conexion();
        Connection reg = conn.getConnection();
        Statement stm = reg.createStatement();
        
        String[] datosBD = nombreColumnas(tabla);
        
        ResultSet counter = stm.executeQuery("SELECT COUNT(*) AS contar FROM `"+ tabla +"`");
        counter.next();
        int count = counter.getInt("contar");
        counter.close();

        String list[][] = new String[count][datosBD.length];
        
        ResultSet re = stm.executeQuery("SELECT * FROM `"+ tabla +"`");
        for(int i = 0; i < count; i++){
            re.next();
            for(int columna = 0; columna < datosBD.length; columna++){
                list[i][columna] = re.getString(datosBD[columna]);
            }
        }
        re.close();
        
        return list;
    }   

    
    public static void subirBD(String tabla, String[] datos)throws SQLException{
        Conexion conn = new Conexion();
        Connection reg = conn.getConnection();
        Statement stm = reg.createStatement();
        
        String[] datosBD = nombreColumnas(tabla);
        String columnas = "";
        for(int i=1; i<datosBD.length-1; i++){
            columnas += "`"+ datosBD[i] +"`,";
        }
        columnas += "`"+ datosBD[datosBD.length-1] +"`";
        
        String datosSubir = "";
        for(int i=0; i<datos.length-1; i++){
            datosSubir += "'"+ datos[i] +"',";
        }
        datosSubir += "'"+ datos[datos.length-1] +"'";
        
        stm.executeUpdate("INSERT INTO `"+ tabla
                 +"` ("+ columnas +") VALUES ("+ datosSubir +");");
    }
    
    public static void eliminarBD(String tabla, String id)throws SQLException{
        Conexion conn = new Conexion();
        Connection reg = conn.getConnection();
        Statement stm = reg.createStatement();
        stm.executeUpdate("DELETE FROM `"+tabla+"` WHERE `id` = '"+id+"' LIMIT 1");
        
    }
    public static void actualizarBD(String tabla, String[] datos, String id)throws SQLException{
        Conexion conn = new Conexion();
        Connection reg = conn.getConnection();
        Statement stm = reg.createStatement();
        
        String res = "";
        
        String[] datosBD = nombreColumnas(tabla);
        for(int i=1; i<datosBD.length-1; i++){
            res += "`"+ datosBD[i] + "` = '" + datos[i-1] +"', ";
        }
        res += "`"+ datosBD[datosBD.length-1] + "` = '" + datos[datos.length-1] +"' ";
        
        stm.executeUpdate("UPDATE "+ tabla +" SET " + res + " WHERE `id` = '" + id + "';");
    }
    

    
    public static String[] nombreColumnas(String nombre){
        switch(nombre){
            case "pedidos":
                return new String [] {
                    "id","nombre_producto", "tipo", "cantidad", "proveedor",
                    "sucursal"
                } ; 
            default:
                return new String[1];
        }
    }
    
    
  
    


}
