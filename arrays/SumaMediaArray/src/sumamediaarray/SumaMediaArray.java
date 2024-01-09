package sumamediaarray;

/**
 *
 * @author Fernando Cuatro
 */
public class SumaMediaArray {

 public static void main(String[] args) {
  int[] numeros = {3, 5, 7, 6, 10};
  
  int suma = 0;
  double media;

  for (int i = 0; i < numeros.length; i++)
  {
   suma += numeros[i];
  }
  
  System.out.println("La suma es: " + suma);
  
  media = (double)suma / numeros.length;
  
  System.out.println("La media es: " + media);
 }
 
}
