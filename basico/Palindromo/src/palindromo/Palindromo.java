package palindromo;

import java.util.Scanner;

/**
 *
 * @author Fernando Cuatro
 */
public class Palindromo {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  sc.useDelimiter("\n");
  
  System.out.print("Escribe: ");
  String frase = sc.next().trim();
  
  String invertida = "";
  
  char caracter;
  for (int i = frase.length()-1; i >= 0; i--)
  {
   caracter = frase.charAt(i);
   invertida+=caracter;
  }
  
  System.out.println("\nDefecto: " + frase);
  System.out.println("Invertida: " + invertida);
  
  System.out.println("--------------");
  
  if (frase.equals(invertida)){
   System.out.println("Es Palindromo");
  }else{
   System.out.println("No es Palindromo");
  }
  
 }
 
}
