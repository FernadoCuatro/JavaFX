package muestracolumnamatriz;

/**
 *
 * @author Fernando Cuatro
 */
public class MuestraColumnaMatriz {

 public static void main(String[] args) {
  int[][] matriz = 
  {
   {1,2,3},
   {4,5,6},
   {7,8,9}  
  };
  
  muestraColumnaMatriz(matriz, 1);
 }
 
 public static void muestraColumnaMatriz(int[][] matriz, int columna)
 {
  if (columna >= 0 && columna<matriz[0].length)
  {
   for (int i = 0; i < matriz.length; i++)
   {
    System.out.println(matriz[i][columna]);
   }
  }
  else
  {
   System.out.println("La columna no es vlaida");
  }
 }
 
}
