package validarrealregex;

/**
 *
 * @author Fernando Cuatro
 */
public class ValidarRealRegex {

 /**
  * @param args the command line arguments
  */
 public static void main(String[] args) {
  if (validaNumeroReal_Exp("10.5"))
  {
   System.out.println("Si");
  } else
  {
   System.out.println("No");
  }
 }
 
 public static boolean validaNumeroReal_Exp(String texto){
  return texto.matches("^-?[0-9]+([\\.,][0-9])?$");
 }
 
}
