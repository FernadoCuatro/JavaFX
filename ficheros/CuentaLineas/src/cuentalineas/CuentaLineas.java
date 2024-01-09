package cuentalineas;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Crea un fichero de texto tu mismo y cuenta el numero de lineas que tiene.
 * 
 * @author Fernando Cuatro
 */
public class CuentaLineas {

 public static void main(String[] args) {
  
  try(BufferedReader br = new BufferedReader(new FileReader("texto.txt"))){
   
  int contador = 0;
  String linea = "";
  
   while ((linea = br.readLine()) != null)
   {
    contador++;
   }
  
   System.out.print("La cantidad de lineas en el archivo es de: " + contador);
   
  } catch (FileNotFoundException e){
   System.out.println(e.getMessage());
  } catch (IOException ex){
   System.out.println(ex.getMessage());
  }
  
 }
 
}
