package leerhasta;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Crea un fichero de texto tu mismo, pide un numero de lineas y
 * lee hasta ese numero de lineas.
 * Si el numero que te dan es un numero negarivo o se llaman mas lineas
 * de las que hay, llama a una excepcion.
 * 
 * @author Fernando Cuatro
 */
public class LeerHasta {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  System.out.print("Escribe el numero de lineas: ");
  int numlineasLeer = sc.nextInt();
    
  try(BufferedReader br = new BufferedReader(new FileReader("texto.txt")))
  {
   int numLineasFichero = cuentaLineas("texto.txt");
   
   if (numlineasLeer < 0 || numlineasLeer > numLineasFichero)
   {
    // Con throw lanzamos una excepcion automaticamnte
    // El otro es throws pero ese es para metodos
    throw new IOException("No se puede acceder con las lineas digitadas.");
    
    // Si esto se ejecuta el programa se detiene de forma inmediata
   }
   
   // Si llego aqui, todo esta bien
   String linea = "";
   
   for (int i = 0; i < numlineasLeer && (linea = br.readLine()) != null; i++)
   {
    System.out.println(linea);
   }
   
  } catch (IOException e)
  {
   System.out.println(e.getMessage());
  }
  
 }
 
 public static int cuentaLineas(String fichero){
  int contador = 0;

  try(BufferedReader br = new BufferedReader(new FileReader("texto.txt"))){

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
