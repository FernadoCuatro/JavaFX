package ordenanombrespersona;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Escribe en un fichero nombres de personas de tu mismo, leelo, guardalos
 * en un ArrayList, ordena los nombres y escribelos en uno nuevo fichero.
 * @author Fernando Cuatro
 */
public class OrdenaNombresPersona {

 public static void main(String[] args) {
  // Creamos un ArrayList
  ArrayList<String> nombres = new ArrayList<>();
  
  // br es para leer un archivo
  // bw es para escribir en un archivo 
  
  //Esto es igual con los File, esta el file Reader y el File Write
  try(BufferedReader br = new BufferedReader(new FileReader("nombres.txt"));
      BufferedWriter bw = new BufferedWriter(new FileWriter("nombres_ordenados.txt")) )
  {
   
   String linea = "";
   while ((linea = br.readLine()) != null)
   {
    nombres.add(linea);
   }
   
   Collections.sort(nombres);
   
   for (String nombre : nombres)
   {
    bw.write(nombre + "\r\n");
   }
   
  } catch (Exception e)
  {
   System.out.println("+info: " + e.getMessage());
  }
  
 }
 
}
