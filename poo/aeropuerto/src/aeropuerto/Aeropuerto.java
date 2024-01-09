package aeropuerto;

import java.util.Calendar;

/**
 *
 * @author Fernando Cuatro
 */
public class Aeropuerto {
 // Atributos
 private String nombre, pais, calle, cuidad;
 private int numero, anioInaguracion, capacidad;

 // Constructores
 public Aeropuerto() {}

 public Aeropuerto(String nombre, String pais, String calle, String cuidad, int numero, int anioInaguracion, int capacidad) {
  this.nombre = nombre;
  this.pais = pais;
  this.calle = calle;
  this.cuidad = cuidad;
  this.numero = numero;
  this.anioInaguracion = anioInaguracion;
  this.capacidad = capacidad;
 }
 
 // Metodos y propiedades

 public String getNombre() {
  return nombre;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 public String getPais() {
  return pais;
 }

 public void setPais(String pais) {
  this.pais = pais;
 }

 public String getCalle() {
  return calle;
 }

 public void setCalle(String calle) {
  this.calle = calle;
 }

 public String getCuidad() {
  return cuidad;
 }

 public void setCuidad(String cuidad) {
  this.cuidad = cuidad;
 }

 public int getNumero() {
  return numero;
 }

 public void setNumero(int numero) {
  this.numero = numero;
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

 @Override
 public String toString() {
  return "Aeropuerto{" + "nombre=" + nombre + ", pais=" + pais + ", calle=" + calle + ", cuidad=" + cuidad + ", numero=" + numero + ", año de inaguracion=" + anioInaguracion + ", capacidad=" + capacidad + '}';
 }
 
 public int aniosAbierto(){
  int anioActual = Calendar.getInstance().get(Calendar.YEAR);
  return anioActual - anioInaguracion;
 }
 
}
