package generarpassword;

/**
 *
 * @author Fernando Cuatro
 */
public class GenerarPassword {

 public static void main(String[] args) {
  System.out.println(generarPassword(15));
 }

 public static int generaNumerosAleatorios(int minimo, int maximo) {
  return (int)(Math.random() * (maximo - minimo + 1)+(minimo));
 }
 
 public static char generaMayusAleatoria()
 {
 return (char)generaNumerosAleatorios(65,90);
 }
 
 public static char generaMinusAleatoria()
 {
 return (char)generaNumerosAleatorios(97,122);
 }
 
 public static char generaSimbosAleatoria()
 {
 return (char)generaNumerosAleatorios(33,38);
 }
 
 public static String generarPassword(int longitud)
 {
  String password = "";
  
  int eleccion;
  for (int i = 0; i < longitud; i++)
  {
   eleccion = generaNumerosAleatorios(1,4);
   
   switch (eleccion)
   {
    case 1: // numero
     password += generaNumerosAleatorios(0,9);
     break;
    case 2: // Mayuscula
     password += generaMayusAleatoria();
     break;
    case 3: // Minuscula
     password += generaMinusAleatoria();
     break;
    case 4: // Simbolos
     password += generaSimbosAleatoria();
     break;
   }
  }
  
  return password;
 }
 
 
}
