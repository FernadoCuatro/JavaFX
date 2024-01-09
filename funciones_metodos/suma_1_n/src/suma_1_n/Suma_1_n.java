package suma_1_n;

/**
 *
 * @author Fernando Cuatro
 */
public class Suma_1_n {

 public static void main(String[] args) {
  
  int n = 5;
  
  System.out.println("La suma es: " + suma1N(n));
 }
 
 // Las funciones se pueden crear fuera del main
 // Funcion cuando devuelva algo
 // Metodo cuando no devuelve nada
 public static int suma1N(int n){
  int suma = 0;
  
  for (int i = 1; i <= n; i++)
  {
   suma += i;
  }
  
  return suma;
 }
}
