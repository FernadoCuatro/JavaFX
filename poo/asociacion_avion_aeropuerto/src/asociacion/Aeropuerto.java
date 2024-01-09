package asociacion;

import java.util.Calendar;

/**
 *
 * @author Fernando Cuatro
 */
public class Aeropuerto {
 
 private final int MAX_AVIONES = 20;
 
 // Atributos
 private String nombre;
 private Direccion direccion;
 private int anioInaguracion, capacidad, numero_aviones;
 private Avion[] aviones;
 

 // Constructores
 public Aeropuerto() {
  aviones = new Avion[MAX_AVIONES];
  this.numero_aviones = 0;
 }

 public Aeropuerto(String nombre, String pais, String calle, String cuidad, int numero, int anioInaguracion, int capacidad) {
  this.nombre = nombre;
  this.direccion = new Direccion(pais, calle, cuidad, numero);
  this.anioInaguracion = anioInaguracion;
  this.capacidad = capacidad;
  aviones = new Avion[MAX_AVIONES];
  this.numero_aviones = 0;
 }

 public Aeropuerto(String nombre, Direccion direccion, int anioInaguracion, int capacidad) {
  this.nombre = nombre;
  this.direccion = direccion;
  this.anioInaguracion = anioInaguracion;
  this.capacidad = capacidad;
  aviones = new Avion[MAX_AVIONES];
  this.numero_aviones = 0;
 }
 
 
 // Metodos y propiedades
 public String getNombre() {
  return nombre;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 public int getAnioInaguracion() {
  return anioInaguracion;
 }

 public void setAnioInaguracion(int anioInaguracion) {
  this.anioInaguracion = anioInaguracion;
 }

 public int getCapacidad() {
  return capacidad;
 }

 public void setCapacidad(int capacidad) {
  this.capacidad = capacidad;
 }

 public Direccion getDireccion() {
  return direccion;
 }

 public void setDireccion(Direccion direccion) {
  this.direccion = direccion;
 }
 
 public int getNumero_aviones() {
  return numero_aviones;
 }
 
 private String mostrarAviones(){
  String avionesCadena = "";
  for (int i = 0; i < numero_aviones; i++)
  {
   avionesCadena += this.aviones[i].toString() + "\n";
  }
  return avionesCadena;
 }
 
 @Override
 public String toString() {
  return "El aeropuerto " + nombre + " "+ this.direccion +"/n fue inagurado en el año " + anioInaguracion + ""
          + " y su capacidad es de " + capacidad + ". \nCuenta con la cantidad de: " + getNumero_aviones() + 
          " aviones, que son los siguientes: \n" + mostrarAviones();
 }
 
 public int aniosAbierto(){
  int anioActual = Calendar.getInstance().get(Calendar.YEAR);
  return anioActual - anioInaguracion;
 }
 
 public void aniadirAvion(Avion a){
  if (numero_aviones < MAX_AVIONES)
  {
   this.aviones[numero_aviones] = a;
   numero_aviones++;
  }
  else
  {
   System.out.println("No puedes agregar mas aviones");
  }
 }
 
}
