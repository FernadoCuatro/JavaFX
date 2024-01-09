package rellenararrayaleatorio;

/**
 *
 * @author Fernando Cuatro
 */
public class RellenarArrayAleatorio {

 public static void main(String[] args) {
  int[] numerosAleatorios =  new int[10];
  
  rellenarArray(numerosAleatorios, 5, 100); // Paso por referencia
  
  System.out.println("Array aleatorio");
  mostrarArray(numerosAleatorios);
 }
 
 public static int generarNumeroAleatorio(int minimo, int maximo)
 {
  return (int)(Math.random() * (maximo - minimo + 1) + (minimo));
 }
 
 // Se establece el parametro int[] array
 public static void rellenarArray(int[] array, int minimo, int maximo)
 {
  for (int i = 0; i < array.length; i++)
  {
   array[i] = generarNumeroAleatorio(minimo, maximo);
  }
 }
 
 public static void mostrarArray(int[] array){
  for (int i : array)
  {
   System.out.println(i);
  }
 }
 
}
