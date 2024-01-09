package saludador;

import java.util.Scanner;

/**
 *
 * @author Fernando Cuatro
 */
public class Saludador {

 public static void main(String[] args) {
  // Creamos el objeto
  Scanner sc = new Scanner(System.in);
  sc.useDelimiter("\n");
  
  System.out.print("Escribe un nombre: ");
  String nombre = sc.next();
  
  System.out.println("¡Hola " + nombre + "!");
 }
 
}
