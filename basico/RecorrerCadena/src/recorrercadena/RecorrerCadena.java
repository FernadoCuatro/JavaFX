package recorrercadena;

import java.util.Scanner;
/**
 *
 * @author Fernando Cuatro
 */
public class RecorrerCadena {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  sc.useDelimiter("\n");
  
  System.out.print("Inserte una frase: ");
  String frase = sc.next();
  
  char caracter;
  for (int i = 0; i < frase.length(); i++)
  {
   caracter = frase.charAt(i);
   System.out.println("["+i+"] " + caracter);
  }
  
 }
 
}
