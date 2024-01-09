package asociacion;

/**
 *
 * @author Fernando Cuatro
 */
public class AsociacionPrueba {

 public static void main(String[] args) {
  // Objeto a la clase direccion
  Direccion d = new Direccion("España", "mentiras", "Cuidad real", 1);
  
  // Objeto a la clase Aeropuerto usando los datos de la clase direccion
  Aeropuerto aeropuerto_01 = new Aeropuerto("Quijote airport", d, 2000, 2530);
   
  // Objeto de la clase avion
  Avion avion_01 = new Avion("Boing 347", 200, 400);
  Avion avion_02 = new Avion("Avianca 313 air", 100, 200);
  
  // Añadimos aviones a la clase aeropuerto
  aeropuerto_01.aniadirAvion(avion_01);
  aeropuerto_01.aniadirAvion(avion_02);
  
  // Imprimimos los datos
  System.out.println("aeropuerto_01");
  System.out.println(aeropuerto_01);
  System.out.println("Tiempo abierto: " + aeropuerto_01.aniosAbierto() + " años");
  // System.out.println("Numero de aviones en el aeropuerto: " + aeropuerto_01.getNumero_aviones());
  
 }
 
}
