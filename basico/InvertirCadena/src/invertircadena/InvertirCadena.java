package invertircadena;

import java.util.Scanner;
/**
 *
 * @author Fernando Cuatro
 */
public class InvertirCadena {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  sc.useDelimiter("\n");
  
  System.out.print("Escribe: ");
  String frase = sc.next();
  
  String invertida = "";
  
  char caracter;
  for (int i = frase.length()-1; i >= 0; i--)
  {
   caracter = frase.charAt(i);
   invertida+=caracter;
  }

  System.out.println(invertida);
 }
 
}
