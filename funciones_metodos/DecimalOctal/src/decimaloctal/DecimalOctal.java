package decimaloctal;

/**
 *
 * @author Fernando Cuatro
 */
public class DecimalOctal {

 public static void main(String[] args) {
  System.out.println(decimaOctal(123));
 }
 
 public static int decimaOctal(int decimal) {
  int octal = 0;
  int digito = 0;
  
  final int DIVISOR = 8;
  
  for (int i = decimal, j = 0; i > 0; i /= DIVISOR, j++)
  {
   digito = i % DIVISOR;
   
   octal += digito * Math.pow(10, j);
  }
  
  return octal;
 }
 
}
