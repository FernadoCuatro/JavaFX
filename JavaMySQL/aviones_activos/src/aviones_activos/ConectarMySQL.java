package aviones_activos;

import clases.Avion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Fernando Cuatro
 */
public class ConectarMySQL {

 public static void main(String[] args) {

  try
  {
   // Nos conectamos via codigo a la base de datos
   Connection conexion;

   // Parametros de la conexion
   String host = "localhost";
   String db = "aeropuertos";
   String usuario = "root";
   String pw = "";

   // Cadena de conexion
   String cadenaConexion = "jdbc:mysql://" + host + "/" + db;
   // Configuramos la conexion con el usuario y contraseña
   conexion = DriverManager.getConnection(cadenaConexion, usuario, pw);

   // Esto sirve para que los procesos se hagan automaticamente sin que tengamos que confirmar
   conexion.setAutoCommit(true);

   // Setencias para la conecion
   // Para que la podamos sobre escribir, que sea universal
   

   // Pedimos al usuario una cadena de busqueda 
   Scanner sc = new Scanner(System.in);
   sc.useDelimiter("\n");
   
   System.out.print("Escribe el numero del aeropuerto: ");
   int idAeropuerto = sc.nextInt();
   
   // String SQL = "SELECT * FROM aviones a WHERE a.activado = 1 AND a.id_aeropuerto = " + idAeropuerto;
   String SQL = "SELECT * FROM aviones a WHERE a.activado = ? AND a.id_aeropuerto = ?";
   PreparedStatement sentencia = conexion.prepareStatement(SQL);
   sentencia.setInt(1, 1);
   sentencia.setInt(2, idAeropuerto);
   
   // Creamos una consulta basica para recuperar los datos
   // ResultSet es como un array donde vamos a almacenar los datos de la consulta
   // ResultSet rs = sentencia.executeQuery(SQL);
   // Cuando se hace con los PS se hace sin el SQL()
   ResultSet rs = sentencia.executeQuery();
   
   while (rs.next())
   {
    int idAvion = rs.getInt("id");
    String modelo = rs.getString("modelo");
    int asientos = rs.getInt("numero_asientos");
    int velMaxima = rs.getInt("velocidad_maxima");
    int activado = rs.getInt("activado");
    
    Avion a = new Avion(idAvion, modelo, asientos, velMaxima);
    
    if (activado == 1)
    {
     a.setActivado(true);
    }
    
    System.out.println(a);
   }


   // Cerramos el resultado que traemos
   rs.close();

   // Cerramos la senencia siempre que la terminemos
   sentencia.close();
   conexion.close();

  } catch (SQLException ex)
  {
   System.out.println("Error en el proceso | +info: " + ex.getMessage());
  }

 }

}
