package miniahorcado;

import java.util.Scanner;
/**
 *
 * @author Fernando Cuatro
 */
public class MiniAhorcado {

 public static void main(String[] args) {
  final int NUN_FALLOS_MAX = 5;
  
  String[] palabras = {
   "chiste",
   "elefante",
   "carro",
   "llaves",
   "naranja",
   "computadora",
   "telefono",
   "filosofia",
   "comer"
  };
  
  Scanner sc = new Scanner(System.in);
  
  String palabraAdivinar = palabras[generarNumeroAleatorio(0,palabras.length-1)];
  
  char[] caracteres = palabraAdivinar.toCharArray();
  boolean[] acertados = new boolean[caracteres.length];
  
  int numeroFallos = 0;
  
  char caracter;
  while (!palabraAcertada(acertados) && numeroFallos<NUN_FALLOS_MAX)
  {
   mostrarCaracteres(caracteres, acertados);
   System.out.print("Escribe una letra: ");
   caracter = sc.next().toLowerCase().charAt(0);
   
   if (revelarCaracteres(caracter,caracteres, acertados) > 0)
   {
    System.out.println("Haz acertado\n");
   }
   else
   {
    numeroFallos++;
    if (numeroFallos!=NUN_FALLOS_MAX)
    {
    System.out.println("Haz fallado\n");
    System.out.println("Oportunidades: "+(NUN_FALLOS_MAX-numeroFallos));
    }

   }
   
  }
  
  if (palabraAcertada(acertados))
  {
   System.out.println("\nHaz encontrado la palabra ¡¡FELICIDADES!!");
   System.out.println("La palabra fue: "+ palabraAdivinar);
  }
  else
  {
   System.out.println("\nSigue intentando, perdiste :c");
   System.out.println("La palabra fue: "+ palabraAdivinar);
  }
  
 }
 
 public static int generarNumeroAleatorio(int minimo, int maximo)
 {
  return (int)(Math.random() * (maximo - minimo + 1) + (minimo));
 }
 
 public static void mostrarCaracteres(char[] caracteres, boolean[] acertados)
 {
  for (int i = 0; i < caracteres.length; i++)
  {
   if (acertados[i])
   {
    System.out.print(caracteres[i]+" ");
   }
   else
   {
    System.out.print("_ ");
   }
  }
  System.out.println("");
 }
 
 public static boolean palabraAcertada(boolean[] acertados)
 {
  for (int i = 0; i < acertados.length; i++)
  {
   if (!acertados[i])
   {
    return false;
   }
  }
  return true;
 }
 
 public static int revelarCaracteres(char caracter,char[] caracteres, boolean[] acertados)
 {
  int acertadas = 0;
  for (int i = 0; i < caracteres.length; i++)
  {
   if (caracteres[i]==caracter)
   {
    acertados[i] = true;
    acertadas++;
   }
  }
  return acertadas;
 }
}

