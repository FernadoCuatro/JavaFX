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
  
  // Se añade los aviones a el aeropuerto
  Avion avion_01 = new Avion("Boing 003", 200, 400);
  Avion avion_02 = new Avion("Avianca 30", 100, 300);
  
  // Añadimos el avion a el aeropuerto
  aeropuerto_priv_01.aniadirAvion(avion_01);
  aeropuerto_priv_01.aniadirAvion(avion_02);
  
  // Y desactivamos un avion
  avion_01.setActivado(true);
  
  System.out.println("----------------------\n");
  System.out.println("aeropuerto_priv_01");
  System.out.println(aeropuerto_priv_01);
  //aeropuerto_priv_01.gananciasTotales(1000000);
  


 }
 
}
