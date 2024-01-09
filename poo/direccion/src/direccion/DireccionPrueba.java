package direccion;

/**
 *
 * @author Fernando Cuatro
 */
public class DireccionPrueba {

 public static void main(String[] args) {
// Objetos
  Direccion d = new Direccion("España", "Calle 21941 MD", "Madrid", 1);
  Aeropuerto aeropuerto_01 = new Aeropuerto();
  Aeropuerto aeropuerto_02 = new Aeropuerto(
   "NY Central",
   "Estados Unidos de America",
   "Street NY 21831",
   "New York",
   10,
   2015,
   58302
  );
  
  // Llenamos el otro objeto
  aeropuerto_01.setNombre("Adolfo Suarez");
  aeropuerto_01.setDireccion(d);
  aeropuerto_01.setAnioInaguracion(2003);
  aeropuerto_01.setCapacidad(80312);
  
  System.out.println("aeropuerto_01");
  System.out.println(aeropuerto_01);
  System.out.println("Años en uso: " + aeropuerto_01.aniosAbierto());
  
  System.out.println("");
  
  System.out.println("aeropuerto_02");
  System.out.println(aeropuerto_02);
  System.out.println("Años en uso: " + aeropuerto_02.aniosAbierto());
  
 }
 
}
