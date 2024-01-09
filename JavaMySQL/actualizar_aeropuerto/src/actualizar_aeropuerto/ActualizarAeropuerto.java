package actualizar_aeropuerto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ActualizarAeropuerto {

 /**
  * Actualiza la capacidad de un aeropuerto
  */
 public static void main(String[] args) {

  try
  {
   Connection conexion;

   // Adaptalos a tu conexion
   String host = "localhost";
   String baseDatos = "aeropuertos";
   String usuario = "root";
   String password = "";

   // Cadena de conexion para conectarnos a la base de datos en MySQL
   String cadenaConexion = "jdbc:mysql://" + host + "/" + baseDatos;

   // Creo la conexion 
   conexion = DriverManager.getConnection(cadenaConexion, usuario, password);

   // Hace commit automaticamente
   conexion.setAutoCommit(true);

   // Creo el scanner
   Scanner sn = new Scanner(System.in);
   sn.useDelimiter("\n");

   // Escribo el id del aeropuerto que quiero actualizar
   System.out.println("Escribe el id del aeropuerto a actualizar");
   int idAeropuerto = sn.nextInt();

   // Escribe la nueva capacidad
   System.out.println("Escribe la nueva capacidad del aeropuerto");
   int nuevaCapacidad = sn.nextInt();

   // Formo el SQL
   String SQL = "UPDATE aeropuertos SET capacidad = " + nuevaCapacidad + " WHERE id = " + idAeropuerto;

   //Creo la sentencia
   Statement sentencia = conexion.createStatement();

   // Ejecuto la instruccion
   sentencia.executeUpdate(SQL);

   // cierro todo
   sentencia.close();
   conexion.close();

  } catch (SQLException ex)
  {
   System.out.println(ex.getMessage());
  }

 }

}
