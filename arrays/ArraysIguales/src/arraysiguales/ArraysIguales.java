package arraysiguales;

import java.util.Arrays;

/**
 *
 * @author Fernando Cuatro
 */
public class ArraysIguales {

 public static void main(String[] args) {
  int[] a1 = {1,2,3,4,5};
  int[] a2 = {1,2,3,4,5};
  
  
  if (Arrays.equals(a1, a2))
  {
   System.out.println("Los arrays son iguales");
  }
  else
  {
   System.out.println("Los arrays no son iguales");
  }
  
 }
 
}
