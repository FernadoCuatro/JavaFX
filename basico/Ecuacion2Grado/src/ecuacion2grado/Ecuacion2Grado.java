package ecuacion2grado;

import java.util.Scanner;
/**
 *
 * @author Fernando Cuatro
 */
public class Ecuacion2Grado {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  System.out.print("Escribe el valor de a: ");
  int a = sc.nextInt();
  System.out.print("Escribe el valor de b: ");
  int b = sc.nextInt();
  System.out.print("Escribe el valor de c: ");
  int c = sc.nextInt();
  
  double discriminante = (Math.pow(b, 2) -4 * a * c);
  if (discriminante > 0)
  {
  double x1 = -b + (Math.sqrt(discriminante)) / (2 * a);
  
  double x2 = -b - (Math.sqrt(discriminante)) / (2 * a);

  System.out.println("Las soluciones son: "+x1+", "+x2);
  }else if(discriminante == 0){
  double x1 = -b / (2 * a);

  System.out.println("La unica solucion es: "+x1);
  }else{
   System.out.println("No tienen solucion");
  }


 }
 
}
