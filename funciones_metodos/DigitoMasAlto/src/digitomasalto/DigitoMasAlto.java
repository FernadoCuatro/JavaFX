package digitomasalto;

/**
 *
 * @author Fernando Cuatro
 */
public class DigitoMasAlto {

 public static void main(String[] args) {
  System.out.println(digitoMasAlto(12));
 }
 
 public static int digitoMasAlto(int numero)
 {
  final int DIVISOR = 10;
  
  int mayor = 0;
  
  for (int i = numero; i > 0; i/=DIVISOR)
  {
   if ((i%DIVISOR) > mayor)
   {
    mayor = i%DIVISOR;
   }
  }
  
  return mayor;
 }
 
}
