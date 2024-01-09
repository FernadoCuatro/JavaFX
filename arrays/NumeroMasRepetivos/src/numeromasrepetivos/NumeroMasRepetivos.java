package numeromasrepetivos;

/**
 *
 * @author Fernando Cuatro
 */
public class NumeroMasRepetivos {

 public static void main(String[] args) {
  int[] a =
  {
   1, 5, 4, 3, 1, 2, 4, 3, 3, 6, 7, 5, 5, 3, 5, 5, 5, 5, 5, 5
  };
  
  int numeroBuscado, numeroActual, mayor = 0, mayorRepeticiones = 0; // Primer bucle, bucle anidado
  for (int i = 0; i < a.length; i++)
  {
   numeroBuscado = a[i];
   int contador = 0;
   for (int j = 0; j < a.length; j++)
   {
    numeroActual = a[j];
    if (numeroBuscado == numeroActual)
    {
     contador++;
    }
   }
   
   if (contador >= mayorRepeticiones)
   {
    mayor = numeroBuscado;
    mayorRepeticiones = contador;
   }
  }
  
  System.out.println("El numero mas repetido es "+mayor+" con "+mayorRepeticiones+ " repeticiones");
  
 }
 
}
