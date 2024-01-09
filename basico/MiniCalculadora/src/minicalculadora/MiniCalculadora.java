package minicalculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Fernando Cuatro
 */
public class MiniCalculadora {

 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 
 boolean salir = false;
 int opcion, num1, num2, resultado = 0; //Guardaremos la opcion del usuario
 String respuesta;

  while (!salir) {
  
  System.out.print("Numero 1: ");
   num1 = sc.nextInt();
  System.out.print("Numero 2: ");
   num2 = sc.nextInt();
  
  System.out.println("1. Sumar");
  System.out.println("2. Restar");
  System.out.println("3. Multiplicar");
  System.out.println("4. Dividir");
  System.out.println("5. Modulo");

   try {

   System.out.print("Escribe una de las opciones ");
   opcion = sc.nextInt();

    switch (opcion) {
    case 1:
     // Suma
     resultado = num1 + num2;
     break;
    case 2:
     // Resta
     resultado = num1 - num2;
     break;
    case 3:
     // Multiplicar
     resultado = num1 * num2;
     break;
    case 4:
     // Dividir
     if (num2 == 0)
     {
      System.out.println("No se puede dividir entre cero\n");
     }else{
      double div = (double)num1/num2;
      System.out.println("El resultado es: " + div +"\n");
     }

     break;
    case 5:
     // Modulo
     resultado = num1 % num2;
     break;
     
    default:
     System.out.println("Solo números entre 1 y 5");
    }
    
    if (opcion != 4)
    {
     System.out.println("El resultado es: " + resultado +"\n");
    }
    
   } catch (InputMismatchException e) {
    System.out.println("Debes insertar un número");
    sc.next();
   }
   
   System.out.print("¿Quieres continuar? (S/N) ");
   respuesta = sc.next().toLowerCase().trim();
   
   if(respuesta.equals("s")){
    salir = false;
   }else{
    salir = true;
   }
   
  }
 }
 
}
