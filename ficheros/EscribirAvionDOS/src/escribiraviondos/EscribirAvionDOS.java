package escribiraviondos;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * Escribe la informacion de un avion con DataOutputStream
 * @author Fernando Cuatro
 */
public class EscribirAvionDOS {

 public static void main(String[] args) {
  Avion avion_01 = new Avion("Boing 123", 100, 1200);
  
  try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("avion.ddr")))
  {
   dos.writeUTF(avion_01.getModelo());
   dos.writeInt(avion_01.getnAsientos());
   dos.writeDouble(avion_01.getVelocidadMaxima());
   
   
  } catch (Exception e){
   System.out.println("+info: " + e.getMessage());
  }
  
  
 }
 
}
