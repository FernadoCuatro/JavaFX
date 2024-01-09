package adivinanumero;

import java.util.Scanner;
/**
 *
 * @author Fernando Cuatro
 */
public class AdivinaNumero {
 /**
  * Vamos a jugar un poco
  * Vamos a generar un numero aleatorio entre 1 y 100
  * Debes pedir al usuario numeros que esten entre estos dos numeros
  * (debes controlarlos). Si el usuario falla, debes indicarle si 
  * el numero que introdujo es mayor o menor que el que debe acertar.
  * El programa termina cuando el usuario acierta. no hay limite de intentos 
  * @param args 
  */
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  int maximo = 100;
  int minimo = 1;

  int numeroAcertar = (int)(Math.random() * (maximo - minimo + 1)+(minimo));
  int numeroUsuario;
  boolean fin = false;
  
  while (!fin){
   
  do
  {
   System.out.print("Dame un numero entre 1 y 100: ");
   numeroUsuario = sc.nextInt();
   
   if (!(numeroUsuario >= minimo && numeroUsuario <= maximo))
   {
    System.out.println("Debes escribir un numero entre "+minimo+" y "+maximo);
   }
   
  } while (!(numeroUsuario >= minimo && numeroUsuario <= maximo));
   
   if (numeroUsuario < numeroAcertar) {
    System.out.println("El numero a adivinar es mayor que " + numeroUsuario +"\n");
   }else if(numeroUsuario > numeroAcertar){
    System.out.println("El numero a adivinar es menor que " + numeroUsuario +"\n");
   }else{
    System.out.println("\n--- ¡FEEELICIDAAAAAAADESS! ---");
    System.out.println("Haz acertado el numero a adivinar");
    System.out.println("El numero a adivinar era: " + numeroAcertar);
    fin = true;
   }
   
  }
  
 }
 
}
