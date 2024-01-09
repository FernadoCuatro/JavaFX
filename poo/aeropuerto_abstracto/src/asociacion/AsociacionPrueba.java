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
  // Aeropuerto aeropuerto_01 = new Aeropuerto("Internacional de El Salvador", d, 2000, 2530);
  AeropuertoPrivado aeropuerto_priv_01 = new AeropuertoPrivado(5, "Quijote airport", d, 2000, 2530);
  AeropuertoPublico aeropuerto_plub_01 = new AeropuertoPublico(10000, 10, "Kansas City", d, 2000, 2530);

  System.out.println("----------------------\n");
  System.out.println("aeropuerto_priv_01");
  //System.out.println(aeropuerto_priv_01);
  aeropuerto_priv_01.gananciasTotales(1000000);
  System.out.println("----------------------\n");
  System.out.println("aeropuerto_plub_01");
  //System.out.println(aeropuerto_plub_01);
  aeropuerto_plub_01.gananciasTotales(1000000);

 }
 
}
