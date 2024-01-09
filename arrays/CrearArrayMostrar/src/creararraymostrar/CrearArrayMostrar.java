package creararraymostrar;

import java.util.Scanner;
/**
 *
 * @author Fernando Cuatro
 */
public class CrearArrayMostrar {

 public static void main(String[] args) {
  // TODO code application logic here
  Scanner sc = new Scanner(System.in);
  
  // Los array solo permiten un tipo de dato
  // int numeros[] =
  // int[] numeros =
  // De las dos formas se puede
  // Los array empiezan de 0
  
  int[] numeros = new int[3]; // Array vacio
  
  for (int i = 0; i < numeros.length; i++)
  {
   System.out.print("Inserta un numero en la posicion ["+ i +"]: ");
   numeros[i] = sc.nextInt();
  }
  
  System.out.println("\nListado de array: ");
  for(int numero : numeros)
  {
   System.out.println(numero);
  }
  
 }
 
}
