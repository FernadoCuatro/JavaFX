package muestrafilamatriz;

/**
 *
 * @author Fernando Cuatro
 */
public class MuestraFilaMatriz {

 public static void main(String[] args) {
  int[][] matriz = 
  {
   {1,2,3},
   {4,5,6},
   {7,8,9}  
  };
  
  MuestraFila(matriz, 1);
 }
 
 public static void MuestraFila(int[][] matriz, int fila){
  
  if (fila >= 0 && fila < matriz.length)
  {
   for (int j = 0; j < matriz[0].length; j++)
   {
    System.out.print(matriz[fila][j]);
   }
  }
  else
  {
   System.out.println("La fila no es correcta");
  }

  
 }
}
