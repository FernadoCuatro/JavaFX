/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validarenteroregex;

/**
 * Valida si una cadena es un numero entero
 * @author Fernando Cuatro
 */
public class ValidarEnteroRegex {

 public static void main(String[] args) {
  
  if (ValidaNumeroEntero_Exp("10a"))
  {
   System.out.println("Si es");
  }
  else
  {
   System.out.println("No es");
  }
 }
 
 public static boolean ValidaNumeroEntero_Exp(String texto){
  return texto.matches("^-?[0-9]+$");
 }
 
}
