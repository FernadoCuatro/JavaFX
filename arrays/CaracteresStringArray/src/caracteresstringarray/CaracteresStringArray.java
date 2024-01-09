package caracteresstringarray;

import java.util.Scanner;
/**
 *
 * @author Fernando Cuatro
 */
public class CaracteresStringArray {

 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 sc.useDelimiter("\n");

 System.out.print("Escriba una frase: ");
 String frase = sc.next();
 
 // 1 forma
 /**
 char[] caracteres = new char[frase.length()];
 
 char caracter;
  for (int i = 0; i < caracteres.length; i++)
  {
   caracter = frase.charAt(i);
   caracteres[i] = caracter;
  }
  
  mostrarArray(caracteres);
  */
 
  // 2 forma
  
  char[] caracteres = frase.toCharArray();
  mostrarArray(caracteres);
 }

 public static void mostrarArray(char[] array){
  for (int i = 0; i < array.length; i++)
  {
   System.out.println(array[i]);
  }
 }
}
