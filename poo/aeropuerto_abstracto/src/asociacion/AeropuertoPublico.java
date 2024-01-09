package asociacion;

/**
 *
 * @author Fernando Cuatro
 */
public class AeropuertoPublico extends Aeropuerto {
 private double financiacion;
 private int trabajadoresDiscapacitados;

 public AeropuertoPublico() {
  super();
 }

 public AeropuertoPublico(double financiacion, int trabajadoresDiscapacitados, String nombre, String pais, String calle, String cuidad, int numero, int anioInaguracion, int capacidad) {
  super(nombre, pais, calle, cuidad, numero, anioInaguracion, capacidad);
  this.financiacion = financiacion;
  this.trabajadoresDiscapacitados = trabajadoresDiscapacitados;
 }

 public AeropuertoPublico(double financiacion, int trabajadoresDiscapacitados, String nombre, Direccion direccion, int anioInaguracion, int capacidad) {
  super(nombre, direccion, anioInaguracion, capacidad);
  this.financiacion = financiacion;
  this.trabajadoresDiscapacitados = trabajadoresDiscapacitados;
 }

 public double getFinanciacion() {
  return financiacion;
 }

 public void setFinanciacion(double financiacion) {
  this.financiacion = financiacion;
 }

 public int getTrabajadoresDiscapacitados() {
  return trabajadoresDiscapacitados;
 }

 public void setTrabajadoresDiscapacitados(int trabajadoresDiscapacitados) {
  this.trabajadoresDiscapacitados = trabajadoresDiscapacitados;
 }

 @Override
 public String toString() {
  return super.toString() + "Aeropuerto es publico con financiacion de " + financiacion + " y con trabajadores discapacitados en total " + trabajadoresDiscapacitados +"\n";
 }
 
 @Override
 public void gananciasTotales(double cantidad){
  double ganancias = cantidad + financiacion + (trabajadoresDiscapacitados * 100);
  System.out.println("La ganancia ha sido de: " + ganancias);
 }
  
}
