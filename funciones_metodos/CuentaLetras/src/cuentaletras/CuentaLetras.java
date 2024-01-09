package cuentaletras;

/**
 *
 * @author Fernando Cuatro
 */
public class CuentaLetras {

 public static void main(String[] args) {
  System.out.println(cuentaLetras("holA",true));
 }

 public static int cuentaLetras(String frase, boolean mayus)
 {
  int min, max, contador = 0;
  
  if (mayus)
  {
   min = 65;
   max = 90;
  }
  else
  {
   min = 97;
   max = 122;
  }
  
  char caracter;
  for (int i = 0; i < frase.length(); i++)
  {
   caracter = frase.charAt(i);
   
   if (caracter >= min && caracter <= max)
   {
    contador ++;
   }
   
  }
  
  return contador;
 }
 
}
