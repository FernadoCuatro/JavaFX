package letrasdni;

import java.util.Scanner;

/**
 *
 * @author Fernando Cuatro
 */
public class LetrasDNI {

 public static void main(String[] args) {
  char letrasNIF[] = {
  'T', 'R', 'W', 'A', 'G', 'M', 'Y',
  'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
  'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
  };
  
  Scanner sc = new Scanner(System.in);
  
  System.out.print("Escribe el numero de DNI: ");
  int dni = sc.nextInt();
  
  final int DIVISOR = 23;
  int indiceLetra = dni % DIVISOR;
  
 
  System.out.println(dni+""+letrasNIF[indiceLetra]);
  
 }
}

