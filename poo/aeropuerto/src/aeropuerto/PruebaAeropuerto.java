package aeropuerto;

/**
 *
 * @author Fernando Cuatro
 */
public class PruebaAeropuerto {

 public static void main(String[] args) {
  // Objetos
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
  aeropuerto_01.setPais("España");
  aeropuerto_01.setCalle("Calle 21941 MD");
  aeropuerto_01.setCuidad("Madrid");
  aeropuerto_01.setNumero(1);
  aeropuerto_01.setAnioInaguracion(2018);
  aeropuerto_01.setCapacidad(80312);
  
  System.out.println("aeropuerto_01");
  System.out.println(aeropuerto_01);
  System.out.println("Años en uso:" + aeropuerto_01.aniosAbierto());
  
  System.out.println("");
  
  System.out.println("aeropuerto_02");
  System.out.println(aeropuerto_02);
  System.out.println("Años en uso:" + aeropuerto_02.aniosAbierto());
  
 }
 
}
