package borrar_aeropuerto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BorrarAeropuerto {

 /**
  * Borra un aeropuerto dado un id
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

   // Pido el id del aeropuerto a borrar
   System.out.println("Escribe el id de un aeropuerto");
   int idAeropuerto = sn.nextInt();

   // Formo el SQL para borrar
   // Recuerda, borro una direccion para que se borre el aeropuerto asociado a esta
   String SQL = "DELETE FROM direcciones WHERE id = (select id_direccion FROM aeropuertos WHERE id = " + idAeropuerto + ")";

   // creo la sentencia
   Statement sentencia = conexion.createStatement();

   // Ejecuto la instruccion y guardo las filas afectadas
   int filas = sentencia.executeUpdate(SQL);

   // Si es mayor que cero, es que se ha borrado, sino no se borra
   if (filas > 0)
   {
    System.out.println("Aeropuerto borrado");
   } else
   {
    System.out.println("Aeropuerto no borrado");
   }

   // Cierro todo
   sentencia.close();
   conexion.close();

  } catch (SQLException ex)
  {
   System.out.println(ex.getMessage());
  }

 }

}
