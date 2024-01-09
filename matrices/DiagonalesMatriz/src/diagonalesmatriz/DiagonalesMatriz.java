package diagonalesmatriz;

/**
 *
 * @author Fernando Cuatro
 */
public class DiagonalesMatriz {

 public static void main(String[] args) {
  int[][] matriz = 
  {
   {1,2,3},
   {4,5,6},
   {7,8,9}  
  };
  
  // Diagonal princioal
  // 1,5,9
  // La inversa
  // 3,5,7
  
  // Recorre las filas matriz.length
  System.out.print("Diagonal principal: ");
  for (int i = 0; i < matriz.length; i++)
  {
   System.out.print(matriz[i][i]);
  }
  
  System.out.print("\nDiagonal inversa: ");
  for (int i = 0, j = matriz[0].length-1; i < matriz.length; i++, j--)
  {
   System.out.print(matriz[i][j]);
  }
  
 }
 
}
