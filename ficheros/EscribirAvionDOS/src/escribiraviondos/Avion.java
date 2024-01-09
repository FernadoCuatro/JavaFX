/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escribiraviondos;

import java.util.Objects;

/**
 *
 * @author Fernando Cuatro
 */
public class Avion {
 // Atributos
 private String modelo;
 private int nAsientos;
 private double velocidadMaxima;
 private boolean activado;

 // Constructores
 public Avion() {
  this("", 0, 0);
 }

 public Avion(String modelo, int nAsientos, double velocidadMaxima) {
  this.modelo = modelo;
  this.nAsientos = nAsientos;
  this.velocidadMaxima = velocidadMaxima;
  this.activado = false;
 }

 // Metodos o propiedades
 public String getModelo() {
  return modelo;
 }

 public void setModelo(String modelo) {
  this.modelo = modelo;
 }

 public int getnAsientos() {
  return nAsientos;
 }

 public void setnAsientos(int nAsientos) {
  this.nAsientos = nAsientos;
 }

 public double getVelocidadMaxima() {
  return velocidadMaxima;
 }

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

 @Override
 public String toString() {
  return "Avion{" + "modelo=" + modelo + ", nAsientos=" + nAsientos + ", velocidadMaxima=" + velocidadMaxima + '}';
 }
}
