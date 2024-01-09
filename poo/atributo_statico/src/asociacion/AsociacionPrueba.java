package asociacion;

/**
 *
 * @author Fernando Cuatro
 */
public class AsociacionPrueba {

 public static void main(String[] args) {
  // Objeto a la clase direccion
  Direccion d = new Direccion("Pais de cada uno", "La calle", "Cuidad", 1);
 
  // Objeto a la clase Aeropuerto usando los datos de la clase direccion
  Aeropuerto aeropuerto_01 = new Aeropuerto("Quijote airport", d, 2000, 2530);
  Aeropuerto aeropuerto_02 = new Aeropuerto("Kansas City", d, 2000, 2530);
  Aeropuerto aeropuerto_03 = new Aeropuerto("New York", d, 2000, 2530);
  Aeropuerto aeropuerto_04 = new Aeropuerto("Madrid", d, 2000, 2530);
  Aeropuerto aeropuerto_05 = new Aeropuerto("Sanpetesburgo", d, 2000, 2530);
  Aeropuerto aeropuerto_06 = new Aeropuerto("Cuidad de Mexico", d, 2000, 2530);
  Aeropuerto aeropuerto_07 = new Aeropuerto("Buenos Aires", d, 2000, 2530);
  Aeropuerto aeropuerto_08 = new Aeropuerto("Vancuver", d, 2000, 2530);

  System.out.println(aeropuerto_01);
  System.out.println(aeropuerto_02);
  System.out.println(aeropuerto_03);
  System.out.println(aeropuerto_04);
  System.out.println(aeropuerto_05);
  System.out.println(aeropuerto_06);
  System.out.println(aeropuerto_07);
  System.out.println(aeropuerto_08);
  
 }
 
}
