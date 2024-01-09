package validarnumero;

import java.util.Scanner;
/**
 *
 * @author Fernando Cuatro
 */
public class ValidarNumero {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  int numero;
  
  do
  {
   System.out.print("Escribe un numero: ");
   numero = sc.nextInt();
   
   System.out.println("Debes escribir un numero entre 0 y 10");
   
  } while (!(numero >= 0 && numero <= 10));
  
  System.out.println("\nEl numero " + numero + "  esta entre 0 y 10");
 }
 
}
