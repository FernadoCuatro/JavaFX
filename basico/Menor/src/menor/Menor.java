package menor;

import java.util.Scanner;
/**
 *
 * @author Fernando Cuatro
 */
public class Menor {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  System.out.print("Inserta el primer numero: ");
  int num1 = sc.nextInt();
  System.out.print("Inserta el segundo numero: ");
  int num2 = sc.nextInt();
  
  if (num1 == num2){
   System.out.println("Los numeros son iguales");
  }else if (num1 <= num2){
   System.out.println("El numero 1 es menor que el numero 2");
  }else{
   System.out.println("El numero 2 es menor que el numero 1");
  }
  
 }
 
}
