package utilidades;

import clases.Aeropuerto;
import clases.AeropuertoPrivado;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JComboBox;

public class MetodosSueltos {

 /**
  * Rellena los aeropuertos del fichero de datos en la lista
  */
 public static void leerAeropuertos() {

  try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(VariablesGlobales.FICHERO_AEROPUERTOS)))
  {

   while (true)
   {
    Aeropuerto a = (Aeropuerto) ois.readObject();
    VariablesGlobales.aeropuertos.add(a);
   }

  } catch (FileNotFoundException ex)
  {
   System.out.println(ex.getMessage());
  } catch (EOFException e)
  {
  } catch (IOException | ClassNotFoundException ex)
  {
   System.out.println(ex.getMessage());
  }

  actualizarId();
 }

 /**
  * Escribe un aeropuerto en la lista y en el fichero
  *
  * @param a
  * @throws FileNotFoundException
  * @throws IOException
  */
 public static void escribirAeropuerto(Aeropuerto a, boolean aniadirLista) throws FileNotFoundException, IOException {

  File f = new File(VariablesGlobales.FICHERO_AEROPUERTOS);

  if (f.exists())
  {
   MiObjectOutputStream oos = new MiObjectOutputStream(new FileOutputStream(VariablesGlobales.FICHERO_AEROPUERTOS, true));
   oos.writeObject(a);
   oos.close();
  } else
  {
   ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(VariablesGlobales.FICHERO_AEROPUERTOS));
   oos.writeObject(a);
   oos.close();
  }

  if (aniadirLista)
  {
   VariablesGlobales.aeropuertos.add(a);
  }

 }

 public static void actualizarId() {
  if (VariablesGlobales.aeropuertos.size() > 0)
  {
   int idMayor = 1;
   for (Aeropuerto aux : VariablesGlobales.aeropuertos)
   {
    if (aux.getId() > idMayor)
    {
     idMayor = aux.getId();
    }
   }

   Aeropuerto.setId_automerado(idMayor + 1);
  }
 }

 public static void actualizarFichero() throws IOException {
  // Borramos el fichero
  // Y agregamos lo que tiene la lista
  File f = new File(VariablesGlobales.FICHERO_AEROPUERTOS);

  f.delete();

  for (Aeropuerto aux : VariablesGlobales.aeropuertos)
  {
   escribirAeropuerto(aux, false);
  }
 }
 
 public static void cargarAeropuertos(JComboBox cmb) {
  String estado = "";

  for (Aeropuerto aux : VariablesGlobales.aeropuertos)
  {
   estado = aux.getNombre();

   if (aux instanceof AeropuertoPrivado)
   {
    estado += " (Privado)";
   } else
   {
    estado += " (Publico)";
   }

   // Recogemos el indicie
   cmb.addItem(estado);

  }
 }

 /**
  * Valida si una cadena es un numero entero
  *
  * @param texto String que contiene el valor a validar
  * @return True = es un numero entero
  */
 public static boolean validaNumeroEntero_Exp(String texto) {
  return texto.matches("^-?[0-9]+$");
 }

 /**
  * Valida si una cadena es un numero real (positivo o negativo)
  *
  * @param texto String que contiene el valor a validar
  * @return True = es un numero real
  */
 public static boolean validaNumeroReal_Exp(String texto) {
  return texto.matches("^-?[0-9]+([\\.,][0-9]+)?$");
 }

}
