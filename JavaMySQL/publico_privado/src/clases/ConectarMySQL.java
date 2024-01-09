package clases;

import java.sql.Connection;
import java.sql.DriverManager;
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
   Statement sentencia = conexion.createStatement();

   // Pedimos al usuario una cadena de busqueda 
   Scanner sc = new Scanner(System.in);
   sc.useDelimiter("\n");

   // Recuperamos datos desde la base de datos
   String SQL = "SELECT a.nombre, a.anio_inauguracion, a.capacidad, d.pais, d.ciudad, d.calle, d.numero, ap.financiacion, ap.num_trab_discapacitados FROM aeropuertos a, direcciones d, aeropuertos_publicos ap WHERE a.id_direccion = d.id AND ap.id_aeropuerto = a.id ";

   // Creamos una consulta basica para recuperar los datos
   // ResultSet es como un array donde vamos a almacenar los datos de la consulta
   ResultSet rs = sentencia.executeQuery(SQL);

   // recoremos los resultados
   // Es para que recorra el numero cantidad de valores
   // El next es automatico que nos da true o false
   // Se va fila a fila
   System.out.println("Aeropuertos publicos");
   while (rs.next())
   {
    // getString se puede colocar la posicion de la columna o el nombre de la columna
    System.out.println("----------------------------------");
    System.out.println("Nombre del aeropuerto: " + rs.getString("nombre"));
    System.out.println("Inaguracion: " + rs.getInt("anio_inauguracion"));
    System.out.println("Capacidad: " + rs.getInt("capacidad"));
    System.out.println("Pais: " + rs.getString("pais"));
    System.out.println("Direccion especifica: " + rs.getString("ciudad") + ", " + rs.getString("calle") + ", " + rs.getInt("numero"));
    
    System.out.println("Financiacion: " + rs.getDouble("financiacion"));
    System.out.println("Discapacitados: " + rs.getString("num_trab_discapacitados"));
    System.out.println("----------------------------------");
    System.out.println("");
   }

   // Cerramos el resultado que traemos
   rs.close();

   // Cerramos la senencia siempre que la terminemos
   sentencia.close();
   
   sentencia = conexion.createStatement();
   // ----------------------------------------
   // ----------------------------------------
   // ----------------------------------------
   // Recuperamos datos desde la base de datos
   SQL = "SELECT a.nombre, a.anio_inauguracion, a.capacidad, d.pais, d.ciudad, d.calle, d.numero, ap.numero_socios FROM aeropuertos a, direcciones d, aeropuertos_privados ap WHERE a.id_direccion = d.id AND ap.id_aeropuerto = a.id ";

   // Creamos una consulta basica para recuperar los datos
   // ResultSet es como un array donde vamos a almacenar los datos de la consulta
    rs = sentencia.executeQuery(SQL);

   // recoremos los resultados
   // Es para que recorra el numero cantidad de valores
   // El next es automatico que nos da true o false
   // Se va fila a fila
   System.out.println("Aeropuertos privados");
   while (rs.next())
   {
    // getString se puede colocar la posicion de la columna o el nombre de la columna
    System.out.println("----------------------------------");
    System.out.println("Nombre del aeropuerto: " + rs.getString("nombre"));
    System.out.println("Inaguracion: " + rs.getInt("anio_inauguracion"));
    System.out.println("Capacidad: " + rs.getInt("capacidad"));
    System.out.println("Pais: " + rs.getString("pais"));
    System.out.println("Direccion especifica: " + rs.getString("ciudad") + ", " + rs.getString("calle") + ", " + rs.getInt("numero"));
    
    System.out.println("Numero de socios: " + rs.getInt("numero_socios"));
    System.out.println("----------------------------------");
    System.out.println("");
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
