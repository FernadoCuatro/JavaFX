package paresentre;

/**
 *
 * @author Fernando Cuatro
 */
public class ParesEntre {

 public static void main(String[] args) {
  paresEntre(10,1);
 }
 
 public static void paresEntre(int inicio, int fin){
  
  if (inicio > fin)
  {
   int aux = inicio;
   inicio = fin;
   fin = aux;
  }
  
  for (int i = inicio; i <= fin; i++)
  {
   if (i%2==0)
   {
    System.out.println(i);
   }
  }
  
 }
 
}
