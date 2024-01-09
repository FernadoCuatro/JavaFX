/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrdenarArrayList;

import java.util.Objects;

/**
 *
 * @author Fernando Cuatro
 */
public class Avion implements Comparable<Avion> {

 // Atributos
 private String modelo;
 private int nAsientos;
 private double velocidadMaxima;
 private boolean activado;

 /**
  * Constructor vacio
  */
 public Avion() {
  this("", 0, 0);
 }

 /**
  * Constructor completo
  *
  * @param modelo model del avion
  * @param nAsientos numero de asientos del avion
  * @param velocidadMaxima velocidad maxima del avion
  */
 public Avion(String modelo, int nAsientos, double velocidadMaxima) {
  this.modelo = modelo;
  this.nAsientos = nAsientos;
  this.velocidadMaxima = velocidadMaxima;
  this.activado = false;
 }

 /**
  * Devuelve el modelo del avion
  *
  * @return model del avion
  */
 public String getModelo() {
  return modelo;
 }

 /**
  * Modifica el modelo del avion
  *
  * @param modelo nuevo modelo
  */
 public void setModelo(String modelo) {
  this.modelo = modelo;
 }

 /**
  * Devuelve el numero de asientos
  *
  * @return numero de asientos
  */
 public int getnAsientos() {
  return nAsientos;
 }

 /**
  * Modifica el numero de asientos
  *
  * @param nAsientos nuevo numero de asientos
  */
 public void setnAsientos(int nAsientos) {
  this.nAsientos = nAsientos;
 }

 /**
  * Devuelve la velocidad maxima
  *
  * @return velocidad maxima
  */
 public double getVelocidadMaxima() {
  return velocidadMaxima;
 }

 /**
  * Modifica la velocidad maxima
  *
  * @param velocidadMaxima nueva velocidad maxima
  */
 public void setVelocidadMaxima(double velocidadMaxima) {
  this.velocidadMaxima = velocidadMaxima;
 }

 @Override
 public boolean equals(Object obj) {
  if (this == obj)
  {
   return true;
  }
  if (obj == null)
  {
   return false;
  }
  if (getClass() != obj.getClass())
  {
   return false;
  }
  final Avion other = (Avion) obj;
  if (!Objects.equals(this.modelo, other.modelo))
  {
   return false;
  }
  return true;
 }

 /**
  * Devuelve la informacion del objeto
  *
  * @return info
  */
 @Override
 public String toString() {
  return "Avion{" + "modelo=" + modelo + ", nAsientos=" + nAsientos + ", velocidadMaxima=" + velocidadMaxima + '}';
 }

 @Override
 public int compareTo(Avion o) {

  if (this.velocidadMaxima > o.velocidadMaxima)
  {
   return 1;
  } 
  else if(this.velocidadMaxima < o.velocidadMaxima)
  {
   return 1;
  }
  else
  {
   return 0;
  }

 }

}
