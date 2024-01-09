package elementorepetido_arraylist;

import java.util.ArrayList;

/**
 * Usaando la clase avion que hicimos, crea un ArrayList y crea 3 aciones
 * y metelos en el ArratList.
 * Crea un avion mas he indica si ya existe dentro del ArrayList
 * Un avion es igual a otro cuando el modelo es igual
 * @author Fernando Cuatro
 */
public class ElementoRepetido_ArrayList {

 public static void main(String[] args) {
  
  ArrayList<Avion> Aviones = new ArrayList<>();
  
  // Hacemos objetos de la clase Avion
  Avion avion_01 = new Avion("Boeing 747", 100, 200);
  Avion avion_02 = new Avion("Airbus A340", 200, 300);
  Avion avion_03 = new Avion("McDonnell Douglas MD-80", 300, 600);
  
  // Agregamos al ArrayList
  Aviones.add(avion_01);
  Aviones.add(avion_02);
  Aviones.add(avion_03);
  
  Avion avion_04 = new Avion("Boeing 747", 100, 200);
  
  // Con el contains buscamos si existe un objeto
  if (Aviones.contains(avion_04))
  {
   System.out.println("Existe");
  }
  else
  {
   System.out.println("No existe");
  }
  
 }
 
}
