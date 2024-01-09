/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package direccion;

import java.util.Calendar;

/**
 *
 * @author Fernando Cuatro
 */
public class Aeropuerto {
 // Atributos
 private String nombre;
 private Direccion direccion;
 private int anioInaguracion, capacidad;

 // Constructores
 public Aeropuerto() {}

 public Aeropuerto(String nombre, String pais, String calle, String cuidad, int numero, int anioInaguracion, int capacidad) {
  this.nombre = nombre;
  this.direccion = new Direccion(pais, calle, cuidad, numero);
  this.anioInaguracion = anioInaguracion;
  this.capacidad = capacidad;
 }

 public Aeropuerto(String nombre, Direccion direccion, int anioInaguracion, int capacidad) {
  this.nombre = nombre;
  this.direccion = direccion;
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
 
 @Override
 public String toString() {
  return "El aeropuerto " + nombre + " "+ this.direccion +"/n fue inagurado en el año " + anioInaguracion + " y su capacidad es de " + capacidad + ".";
 }
 
 public int aniosAbierto(){
  int anioActual = Calendar.getInstance().get(Calendar.YEAR);
  return anioActual - anioInaguracion;
 }
 
}
