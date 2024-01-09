package tablamultiplicar;

import java.util.Scanner;
/**
 *
 * @author Fernando Cuatro
 */
public class TablaMultiplicar {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  System.out.print("Inserta un numero: ");
  int num = sc.nextInt();
  
  for (int i = 1; i <= 10; i++)
  {
   System.out.println(num + " x " + i + " = " + (num*i));
  }
  
 }
 
}
