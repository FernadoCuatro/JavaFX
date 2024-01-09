package digitosarray;

import java.util.Scanner;
/**
 *
 * @author Fernando Cuatro
 */
public class DigitosArray {

 public static void main(String[] args) {
  int numero = validaNumero(0, Integer.MAX_VALUE);
  
  int[] numeros = digitosNumeroArray(numero);
  mostrarArray(numeros);
 }

 public static int validaNumero(int minimo, int maximo){
  
  Scanner sc = new Scanner(System.in);
   
  if (minimo > maximo)
  {
   int aux = minimo;
   minimo = maximo;
   maximo = aux;
  }
  
  int numero;
  
  do
  {
   System.out.print("Escribe un numero: ");
   numero = sc.nextInt();
   
   if (!(numero >= minimo && numero <= maximo))
   {
    System.out.println("Debes escribir un numero entre "+minimo+" y "+maximo);
   }
   
  } while (!(numero >= minimo && numero <= maximo));
  
  return numero;
 }
 
 public static int[] digitosNumeroArray(int numero)
 {
  int numCifras = 0;
  
  for (int i = numero; i > 0; i/=10)
  {
   numCifras++;
  }
  
  int[] digitos = new int[numCifras];
  
  // De derecha a izquierda
  //for (int i = numero, j = 0; i > 0; i/=10, j++)
  //{
  // digitos[j] = i % 10;
  //}
  
  // De izquierda a derecha
  for (int i = numero, j = numCifras-1; i > 0; i/=10, j--)
  {
   digitos[j] = i % 10;
  }
  
  return digitos;
 }

 public static void mostrarArray(int[] array){
  for (int i : array)
  {
   System.out.println(i);
  }
 }
 
}
