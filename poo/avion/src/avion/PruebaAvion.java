package avion;

/**
 *
 * @author Fernando Cuatro
 */
public class PruebaAvion {

 public static void main(String[] args) {
  // OBjetos
  Avion avion_01 = new Avion();
  Avion avion_02 = new Avion("Boing 347", 200, 400);
  
  // avion_01
  avion_01.setModelo("Avianca 023");
  avion_01.setVelocidadMaxima(250);
  avion_01.setnAsientos(320);
  
  // Objeto 01
  System.out.println("avion_01");
  // con el toString tambien se puede
  // System.out.println(avion_01.toString());
  System.out.println(avion_01);
  
  System.out.println("");
  System.out.println("avion_02");
  System.out.println(avion_02.toString());
  
 }
 
}
