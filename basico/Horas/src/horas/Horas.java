package horas;

import java.util.Scanner;
/**
 *
 * @author Fernando Cuatro
 */
public class Horas {

 /**
  * Pide un numero de segundos e indica cuantas horas, minutos 
  * y segundos equivalen
  * @param args 
  */
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  System.out.print("Escribe el numero de segundos: ");
  int segundos = sc.nextInt();
  
  // Variables globales
  final int SEG_HOR = 3600;

  // De segundos a horas  
  int horas = segundos / SEG_HOR;
  int segundos_restantes = segundos % SEG_HOR;
  int minutos = segundos_restantes / 60;
  segundos = segundos_restantes % 60;
  
  System.out.println("Son: "+ horas +"h | "+minutos+"m | "+segundos+"s");
 }
 
}
