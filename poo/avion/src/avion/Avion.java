package avion;

/**
 *
 * @author Fernando Cuatro
 */
public class Avion {
 // Atributos >> Lo que define la clase
 private String modelo;
 private int nAsientos;
 private double velocidadMaxima;
 
 // Constructores >> 
 // Tambien se pueden generar 
 
 // Vacio por omision
 public Avion() {}
 
 // Personalizado
 public Avion(String modelo, int nAsientos, double velocidadMaxima) {
  this.modelo = modelo;
  this.nAsientos = nAsientos;
  this.velocidadMaxima = velocidadMaxima;
 }
 
 // Metodos o propiedades >> 
 
 // getter y setter
 // Manuales
 public String getModelo(){
  return modelo;
 }
 
 public void setModelo(String modelo){
  this.modelo = modelo;
 }
 
 // Generados 
 // insert-code >> getter and setter >> todo 
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
 public String toString() {
  return "Avion{" + "modelo=" + modelo + ", nAsientos=" + nAsientos + ", velocidadMaxima=" + velocidadMaxima + "}";
 }
 
}