package leeraviondis;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * Lee la informcion del fichero anterior y crea el avion correspondiente
 *
 * @author Fernando Cuatro
 */
public class LeerAvionDIS {

 public static void main(String[] args) {
 
  
  try(DataInputStream dis = new DataInputStream(new FileInputStream("avion.ddr"));)
  {
   // Esto se lee con el mismo orden en que se guardan en el documento.
   String modelo = dis.readUTF();
   int nAsientos = dis.readInt();
   double velocidad =  dis.readDouble();
   
   Avion avion = new Avion(modelo, nAsientos, velocidad);
   System.out.println(avion);
   
  } catch (Exception e)
  {
   System.out.println("+info: " + e.getMessage());
  }
  
 }
 
}
