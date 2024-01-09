package bisiesto;

import java.util.Scanner;
/**
 *
 * @author Fernando Cuatro
 */
public class Bisiesto {

 public static void main(String[] args) {
 // &&
 /**
  * V & V = V
  * V & F = F
  * F & V = F
  * F & F = F
  */

 // ||
 /**
  * V | V = V
  * V | F = V
  * F | V = V
  * F | F = F
  */
 
  Scanner sc = new Scanner(System.in);
  int anio = sc.nextInt();
  
  if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0)
  {
   System.out.println("Es bisiesto");
  }else{
   System.out.println("No es bisiesto"); 
  }
  
  }
 
}
