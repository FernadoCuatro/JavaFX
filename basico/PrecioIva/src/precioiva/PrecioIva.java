package precioiva;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Fernando Cuatro
 */
public class PrecioIva {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  sc.useLocale(Locale.US); // Para poder usar el punto
  
  // Variable global
  final double IVA = 0.21;
  
  System.out.print("Escribe el precio real: ");
  double precio = sc.nextDouble();
  
  // Agregamos el iva
  // double precioIva = precio + (precio * IVA);
  double precioIva = precio * (1 + IVA);
  
  System.out.println("E; precio final es de: " + precioIva);
 }
 
}
