package numeroperfecto;

import java.util.Scanner;
/**
 *
 * @author Fernando Cuatro
 */
public class NumeroPerfecto {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  int numero;
  do
  {
   System.out.print("Escribe un numero: ");
   numero = sc.nextInt();
   
   if (!(numero >= 0))
   {
    System.out.println("Debes escribir un numero entre 0 y 10");
   }
   
  } while (!(numero >= 0));
  
  int suma = 0;
  
  for (int i = 1; i <= numero / 2; i++)
  {
   if (numero%i==0)
   {
    suma += i;
   }
  }

  if (numero == suma)
  {
   System.out.println("Es un numero perfecto");
  }else
  {
   System.out.println("No es un numero perfecto");
  }  
 }
 
}
