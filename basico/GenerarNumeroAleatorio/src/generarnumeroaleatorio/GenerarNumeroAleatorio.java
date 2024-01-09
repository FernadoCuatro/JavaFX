package generarnumeroaleatorio;

/**
 *
 * @author Fernando Cuatro
 */
public class GenerarNumeroAleatorio {

 public static void main(String[] args) {
  // Clase Math
  
  int maximo = 10;
  int minimo = 1;
  
  int aleatorio;
  for (int i = 0; i < 10; i++)
  {
  aleatorio = (int)(Math.random() * (maximo - minimo + 1)+(minimo));
  
  System.out.println("Numero aleatorio: " + aleatorio);
  }
  
 }
 
}
