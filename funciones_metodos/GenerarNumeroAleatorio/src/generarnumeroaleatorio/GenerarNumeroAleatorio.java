package generarnumeroaleatorio;

/**
 *
 * @author Fernando Cuatro
 */
public class GenerarNumeroAleatorio {
 
 public static void main(String[] args) {
  
  for (int i = 0; i < 10; i++)
  {
   System.out.println(GeneraNumeroAleatorio(1,10));
  }
 }
 
 public static int GeneraNumeroAleatorio(int minimo, int maximo){
  return (int)(Math.random() * (maximo - minimo + 1)+(minimo));
 }
}

