package mayormenorarray;

import java.util.Arrays;

/**
 *
 * @author Fernando Cuatro
 */
public class MayorMenorArray {

 public static void main(String[] args) {
  int[] array = {4, 70, 8, 90, 88, 5};
  
  mayorMenor(array);
  mayorMenor2(array);
 }
 
 public static void mayorMenor(int[] array)
 {
  int mayor = array[0];
  int menor = array[0];
  
  for (int i = 1; i < array.length; i++)
  {
   if (array[i] > mayor)
   {
    mayor = array[i];
   }
   
   if (array[i] < menor)
   {
    menor = array[i];
   }
  }
  
  System.out.println("Primera version");
  System.out.println("Mayor: " + mayor);
  System.out.println("Menor: " + menor);
 }
 
 public static void mayorMenor2(int[] array) 
 {
  Arrays.sort(array);
  
  int mayor = array[array.length-1];
  int menor = array[0];
  
  System.out.println("\nSegunda version");
  System.out.println("Mayor: " + mayor);
  System.out.println("Menor: " + menor);
 }
}
