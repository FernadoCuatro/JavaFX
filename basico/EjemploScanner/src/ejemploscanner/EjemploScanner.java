package ejemploscanner;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Fernando
 */
public class EjemploScanner {

 public static void main(String[] args) {
  Scanner sn = new Scanner(System.in);
  
  // Para evitar que de error cuando pidamos uns string de varias lineas
  sn.useDelimiter("\n");
  
  // Para los decimales y que se use el "." como decimal
  sn.useLocale(Locale.US);
  
 }
 
}
