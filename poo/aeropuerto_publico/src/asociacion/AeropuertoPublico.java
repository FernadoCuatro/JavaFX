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
  return "AeropuertoPublico " + "financiacion=" + financiacion + ", trabajadoresDiscapacitados=" + trabajadoresDiscapacitados;
 }
  
}
