package asociacion;

/**
 *
 * @author Fernando Cuatro
 */
public class Avion implements Activable {
 // Atributos >> Lo que define la clase
 private String modelo;
 private int nAsientos;
 private double velocidadMaxima;
 private boolean activado;
 
 // Las interfaces normalmente terminan en "able"
 // Son instrucciones que se deben seguir
 // Y se hace con JavaInterface
 
 // Constructores >> 
 // Tambien se pueden generar 
 
 // Vacio por omision
 public Avion() {
 this("", 0, 0);
 }
 
 // Personalizado
 public Avion(String modelo, int nAsientos, double velocidadMaxima) {
  this.modelo = modelo;
  this.nAsientos = nAsientos;
  this.velocidadMaxima = velocidadMaxima;
  this.activado = false;
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
  return "Avion {" + " modelo: " + modelo + ", nAsientos: " + nAsientos + ", velocidadMaxima: " + velocidadMaxima + " }";
 }
 
 
 // Interfaces
 @Override
 public boolean isActivado() {
  return activado;
 }

 @Override
 public void setActivado(boolean value) {
  this.activado = value;
 }
 
}
