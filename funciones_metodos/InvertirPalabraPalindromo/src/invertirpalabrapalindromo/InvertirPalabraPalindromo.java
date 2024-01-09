package invertirpalabrapalindromo;

/**
 *
 * @author Fernando Cuatro
 */
public class InvertirPalabraPalindromo {

 public static void main(String[] args) {
  if (esPalindromo("Ana"))
  {
   System.out.println("Es palindromo");
  }
  else
  {
   System.out.println("No es palindromo");
  }
 }
 
 public static String InvertirString(String frase){
  String invertida = "";
  
  char caracter;
  for(int i = frase.length()-1; i >= 0; i--)
  {
   caracter = frase.charAt(i);
   invertida+=caracter;
  }
  
  return invertida;
 }
 
 public static boolean esPalindromo(String frase){
  
  frase = frase.toLowerCase().trim();
  
  String invertida = (InvertirString(frase));
  
  if (frase.equals(invertida)){
   return true;
  }else{
   return false;
  }
 }
 
}
