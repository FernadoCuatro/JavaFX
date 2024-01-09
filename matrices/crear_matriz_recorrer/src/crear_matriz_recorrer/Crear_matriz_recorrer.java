package crear_matriz_recorrer;

import java.util.Scanner;
/**
 *
 * @author Fernando Cuatro
 */
public class Crear_matriz_recorrer {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  // Divimensional
  // Y es simetrica 
  int[][] matriz = new int[3][3];
  
  // Rellenar
  // Filas 
  for (int i = 0; i < matriz.length; i++)
  {
   // Columnas
   for (int j = 0; j < matriz[0].length; j++)
   {
    System.out.print("Escribe el numero en la posicion: ["+i+"]["+j+"]: ");
    matriz[i][j] = sc.nextInt();
   }
  }
  
  System.out.println("");
  // Mostrar 
  for (int i = 0; i < matriz.length; i++)
  {
   // Columnas
   for (int j = 0; j < matriz[0].length; j++)
   {
    System.out.print(matriz[i][j]+" ");
   }
   System.out.println("");
  }
  
 }
 
}
