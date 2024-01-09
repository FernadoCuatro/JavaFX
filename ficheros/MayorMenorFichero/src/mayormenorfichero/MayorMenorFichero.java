package mayormenorfichero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Dado un fichero de texto con una lista de numeros, indica cual es el mayor y el menor.
 * 
 * @author Fernando Cuatro
 */
public class MayorMenorFichero {

 public static void main(String[] args) {
 
  try(BufferedReader br = new BufferedReader(new FileReader("fichero.txt"));)
  {
   int numLineas = cuentaLineas("fichero.txt");
   
   int numeros[] = new int[numLineas];
   
   String lineas = "";
   
   for (int i = 0; i < numLineas && (lineas = br.readLine()) != null; i++)
   {
    numeros[i] = Integer.parseInt(lineas);
   }
   
   Arrays.sort(numeros);
   
   System.out.println("El menor es: " + numeros[0]);
   System.out.println("El mayor es: " + numeros[numeros.length-1]);
   
  } catch (IOException e) {
   System.out.println(e.getMessage());
  }catch (NumberFormatException ex){
   System.out.println("Datos en el archivo incompatibles. | +info: " + ex.getMessage());
  }
  
 }

 public static int cuentaLineas(String fichero){
  int contador = 0;

  try(BufferedReader br = new BufferedReader(new FileReader(fichero))){

  String linea = "";

  while ((linea = br.readLine()) != null) { contador++; }
  
  } catch (FileNotFoundException e){
   System.out.println(e.getMessage());
  } catch (IOException ex){
   System.out.println(ex.getMessage());
  }

  return contador;
 }
}
