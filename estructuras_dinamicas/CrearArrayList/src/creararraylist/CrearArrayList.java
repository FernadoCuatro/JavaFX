package creararraylist;

import java.util.ArrayList;

/**
 * Crea un ArrayList y rellenalo con una cantidad alatoria de
 * numeros aleatorios de entre 1 y 10, Por ejemplo, en cada iteraccion
 * lo puedes rellenar con 20 numeros y otra lo puedes rellenar con 14 numeros
 * 
 * @author Fernando Cuatro
 */
public class CrearArrayList {

 public static void main(String[] args) {
  // Las estrucutas dinamicas, son importantes
  // Son como Array Dinamicos, se le pueden añadir x cantidad de elemenos 
  // Sin necesidad de detallar cuantos tendrea en su contenido al momento de 
  // codificacion
  
  // Se importa tambien
  // ArrayList
  
  // <> el tipo de dato, y solo pueden ser objetos
  ArrayList<Integer> lista = new ArrayList<>();
  
  int cantidadNumeros = generaNumeroAleatorio(1,20);
  
  for (int i = 0; i < cantidadNumeros; i++)
  {
   // Para añadir es con el .add
   lista.add(generaNumeroAleatorio(1,10));
  }
  
  System.out.println("Mostramos la lista");
  // Se puede con un for
  // y se usa la propiedad size en lugar de length
  //for (int i = 0; i < lista.size(); i++) { // lista.get(i); }
  //Pero es mejor con un foreach
  
  for (Integer i : lista)
  {
   System.out.println(i);
  }
  
 }
 
 public static int generaNumeroAleatorio(int minimo, int maximo){
  return (int)(Math.random() * (maximo - minimo + 1) + (minimo));
 }
 
}
