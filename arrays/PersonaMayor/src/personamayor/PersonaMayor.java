package personamayor;

/**
 *
 * @author Fernando Cuatro
 */
public class PersonaMayor {

 public static void main(String[] args) {
  String[] nombres = {"Fernando", "Jaime", "Alberto", "Pepito"};
  int[] edades = {28, 31, 20, 20};
  
  int edadMayor = edades[0];
  int posicionMayor = 0;
  
  for (int i = 1; i < edades.length; i++)
  {
   if (edades[i] > edadMayor)
   {
    edadMayor = edades[i];
    posicionMayor = i;
   }
  }
  
  System.out.println("La persona con mas edad es "+nombres[posicionMayor]+" con "+edadMayor+" años de edad.");
 
 }
 
}
