package leerfichero;

// importamos el bufferedReader
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Fernando Cuatro
 */
public class LeerFichero {

 public static void main(String[] args) {
  
  leerFichero("fichero.txt");

 }


 public static void leerFichero(String fichero){
  // La otra opciones es que pueda ir en throws que van arriba
  // para asi ahorrarnos el try y catch
  // y podemos hacer el try y catch arriba 
  
  try(
      FileReader fr = new FileReader(fichero); 
      BufferedReader br = new BufferedReader(fr)
   ){
   
   String linea = "";
   while ((linea = br.readLine()) != null){
    System.out.println(linea);
   }

  }
  catch (FileNotFoundException e) {
   System.out.println(e.getMessage());
  }
  catch (IOException ex){
    System.out.println(ex.getMessage());
  }
  
 }
 
}
