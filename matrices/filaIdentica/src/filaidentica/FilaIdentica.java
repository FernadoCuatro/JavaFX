
package filaidentica;

/**
 *
 * @author Fernando Cuatro
 */
public class FilaIdentica {

 public static void main(String[] args) {
  int[][] matriz = 
  {
   {1,2,3},
   {4,4,4},
   {7,8,9}  
  };
  
  System.out.println(filaIdenticaMatriz(matriz,1));
 }
 
 public static boolean filaIdenticaMatriz(int[][] matriz, int fila)
 {
  if (fila >= 0 && fila < matriz.length)
  {
   int primerValor = matriz[fila][0];
   
   // Recorrer columnas
   for (int j = 1; j < matriz[0].length; j++)
   {
    if (primerValor != matriz[fila][j])
    {
     return false;
    }
   }
   
   return true;
  } 
  else
  {
   return false;
  }
 }
 
}
