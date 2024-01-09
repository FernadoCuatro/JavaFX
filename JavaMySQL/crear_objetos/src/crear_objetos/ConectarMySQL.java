package crear_objetos;

import clases.Aeropuerto;
import clases.AeropuertoPrivado;
import clases.AeropuertoPublico;
import clases.Direccion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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

   // Creamos un ArrayList de aeropuerto
   ArrayList<Aeropuerto> aeropuertos = new ArrayList<>();

   // Pedimos al usuario una cadena de busqueda
   // Setencias para la conecion
   // Para que la podamos sobre escribir, que sea universal
   Statement sentencia = conexion.createStatement();

   // Recuperamos datos desde la base de datos
   String SQL = "SELECT a.id, a.nombre, a.anio_inauguracion, a.capacidad, d.pais, d.ciudad, d.calle, d.numero, ap.financiacion, ap.num_trab_discapacitados FROM aeropuertos a, direcciones d, aeropuertos_publicos ap WHERE a.id_direccion = d.id AND ap.id_aeropuerto = a.id ";

   // Creamos una consulta basica para recuperar los datos
   // ResultSet es como un array donde vamos a almacenar los datos de la consulta
   ResultSet rs = sentencia.executeQuery(SQL);
   while (rs.next())
   {
    // guardamos los datos
    int id = rs.getInt("id");
    String nombre = rs.getString("nombre");
    int inaguracion = rs.getInt("anio_inauguracion");
    int capacidad = rs.getInt("capacidad");
    String pais = rs.getString("pais");
    String cuidad = rs.getString("ciudad");
    String calle = rs.getString("calle");
    int numero = rs.getInt("numero");
    double financiacion = rs.getDouble("financiacion");
    int discapacitados = rs.getInt("num_trab_discapacitados");

    Direccion dir = new Direccion(pais, calle, numero, cuidad);

    AeropuertoPublico a = new AeropuertoPublico(financiacion, discapacitados, id, nombre, dir, inaguracion, capacidad);

    aeropuertos.add(a);
   }
   // Cerramos el resultado que traemos
   rs.close();
   
   sentencia = conexion.createStatement();
   // ----------------------------------------
   // ----------------------------------------
   // ----------------------------------------
   // Recuperamos datos desde la base de datos
   SQL = "SELECT a.id, a.nombre, a.anio_inauguracion, a.capacidad, d.pais, d.ciudad, d.calle, d.numero, ap.numero_socios FROM aeropuertos a, direcciones d, aeropuertos_privados ap WHERE a.id_direccion = d.id AND ap.id_aeropuerto = a.id ";

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
    // guardamos los datos
    int id = rs.getInt("id");
    String nombre = rs.getString("nombre");
    int inaguracion = rs.getInt("anio_inauguracion");
    int capacidad = rs.getInt("capacidad");
    String pais = rs.getString("pais");
    String cuidad = rs.getString("ciudad");
    String calle = rs.getString("calle");
    int numero = rs.getInt("numero");
    int socios = rs.getInt("numero_socios");
    
    Direccion dir = new Direccion(pais, calle, numero, cuidad);

    AeropuertoPrivado a = new AeropuertoPrivado(socios, id, nombre, dir, inaguracion, capacidad);

    aeropuertos.add(a);
   }

   // Cerramos el resultado que traemos
   rs.close();

   // Cerramos la senencia siempre que la terminemos
   sentencia.close();

   // Cerramos la senencia siempre que la terminemos
   conexion.close();
   
   // Recorremos los objetos de las clases que tenemos hechos
   for (Aeropuerto a: aeropuertos)
   {
    System.out.println(a.mostrarInformacion());
   }

  } catch (SQLException ex)
  {
   System.out.println("Error en el proceso | +info: " + ex.getMessage());
  }

 }

}
