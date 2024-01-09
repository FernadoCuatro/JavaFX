package concatenapalabras;

import java.util.Scanner;
/**
 *
 * @author Fernando Cuatro
 */
public class ConcatenaPalabras {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  sc.useDelimiter("\n");
  
  System.out.print("Escribe una cadena: ");
  String cadUsuario = sc.next();
  
  String concatenar = "";
  
  while (!cadUsuario.isEmpty()) // cadUsuario.equals("")
  {
   concatenar += cadUsuario + " ";
   
  System.out.print("Escribe una cadena: ");
  cadUsuario = sc.next();
  }
  
  System.out.println("");
  System.out.println(concatenar);
  
 }
 
}
