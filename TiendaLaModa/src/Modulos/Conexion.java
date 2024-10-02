
package Modulos;

//Librerias importadas que permiten conectar con la base de datos
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;


//Clase conexion que prmite instanciar un objeto que permita ser de puente con la base de datos
//Esta clase la vamos a utilizar siempre que vayamos a hacer una conexión
public class Conexion {
    private static String Driver="com.mysql.jdbc.Driver"; //Driver no se modifica, excepto si el programa al correrlo lo indique
    private static String User="root"; //Usuario root por defecto, tiene que ser el de la conexion que indique MYSQL WORKBENCH
    private static String Password="1234"; //Contraseña, en este caso sin contraseña
    private static String URL="jdbc:mysql://localhost:3306/tiendalamoda"; //link de conexion, localhost si es local(127.0.0.1) o la direccion IP del servidor de base de datos, : puerto (3306 por defecto), / nombre de base de datos tiendalamoda
    
    
    //No se modifica:
    static {
        try{
            Class.forName(Driver); 
        }
        catch(ClassNotFoundException ex){
            System.out.println(" ERROR  EN EL DRIVER" +ex);
        }
    }
    //Lo que permite realmente hacer la conexion, metodo para un objeto de tipo conexion
    //No se modifica
    public Connection getConnection(){
        Connection C = null;
        try{
            C=DriverManager.getConnection(URL,User, Password); //Conexion con los datos necesarios
            System.out.println(" Conexion exitosa");
        }
        catch(SQLException ex){
            System.out.println(" Error de conexion " + ex);
            
        }
        return C; //Retorna la conexion realizada
    }
}

