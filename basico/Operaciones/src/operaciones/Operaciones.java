package operaciones;

import java.util.Scanner;

/**
 *
 * @author Fernando Cuatro
 */
public class Operaciones {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  System.out.print("Escribe el numero 1: ");
  int num1 = sc.nextInt();
 
  System.out.print("Escribe el numero 2: ");
  int num2 = sc.nextInt();
  
  System.out.println("\nSuma = " + (num1 + num2));
  System.out.println("Resta = " + (num1 - num2));
  System.out.println("Multiplicacion = " + (num1 * num2));
  if (num2 == 0)
  {
   System.out.println("No puedes dividir entre cero");
  }else{
   System.out.println("Division = " + (double)(num1 / num2));
  }
  
 }
 
}
