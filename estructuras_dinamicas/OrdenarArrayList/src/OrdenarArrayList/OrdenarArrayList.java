package OrdenarArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Usaando la clase avion que hicimos, crea un ArrayList y crea 3 aciones
 * y metelos en el ArratList.
 * Crea un avion mas he indica si ya existe dentro del ArrayList
 * Un avion es igual a otro cuando el modelo es igual
 * @author Fernando Cuatro
 */
public class OrdenarArrayList {

 public static void main(String[] args) {
  
  ArrayList<Avion> Aviones = new ArrayList<>();
  
  // Hacemos objetos de la clase Avion
  Avion avion_01 = new Avion("Boeing 747", 100, 1200);
  Avion avion_02 = new Avion("Airbus A340", 200, 300);
  Avion avion_03 = new Avion("McDonnell Douglas MD-80", 300, 600);
  
  // Agregamos al ArrayList
  Aviones.add(avion_01);
  Aviones.add(avion_02);
  Aviones.add(avion_03);
  
  // Lo ordenamos con la clase collections que es de java
  Collections.sort(Aviones);
  
  for (Avion a : Aviones)
  {
   System.out.println(a);
  }
 }
 
}
