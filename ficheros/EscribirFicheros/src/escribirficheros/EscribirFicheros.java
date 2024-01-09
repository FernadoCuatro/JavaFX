package escribirficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 * Pide un texto por consola y escribelo en un fichero de texto
 * @author Fernando Cuatro
 */
public class EscribirFicheros {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  sc.useDelimiter("\n");
  
  System.out.print("Introduce un texto: ");
  String texto = sc.nextLine();
  
  // Que es un buffer?
  // Es un escritor para ficheros
  
  try
  {
  // Crear un fichero
                                         // Es una exepcion en tiempo de compilacion
                                         // El true es para decir que hay que actualizarlo no reemplazarlo
  BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt", true));
  
  // Escribimos una linea
  // \r es un retorno de carro, salto de linea en un fichero
  // \n salto de linea (un enter)
  bw.write(texto + "\r\n");
  
  // Todo lo que se abre se cierra
  bw.close();
  
  // Si no existe el documento, lo va a crear
  // Y si ya existe, lo va a sobre escribir.
  
  } catch (IOException e)
  {
   System.out.println("Error, vuelva a intentarlo. | +info: " + e.getMessage());
  }
  
  // tambien se puede hacer asi, y de esta forma nos evitamos el close
  // esto es try reasource
  //try(BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt", true));)
  //{
  // bw.write(texto + "\r\n");
  //} catch (IOException e)
  //{
  // System.out.println("Error, vuelva a intentarlo. | +info: " + e.getMessage());
  //}
  
 }
}
