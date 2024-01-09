package pares;

/**
 *
 * @author Fernando Cuatro
 */
public class Pares {

 public static void main(String[] args) {

  System.out.println("While");
  System.out.println("-----");
  
  int i = 1; // Se usa por index
  while (i <= 10){
   if (i % 2 == 0){
    System.out.println(i);
   }
   i++; // i = i + 1;
  }
  
  System.out.println("\nfor");
  System.out.println("-----");
  for (int j = 1; j <= 10; j++){
   if (j % 2 == 0)
   {
    System.out.println(j);
   }
   
  }
  
 }
 
}
