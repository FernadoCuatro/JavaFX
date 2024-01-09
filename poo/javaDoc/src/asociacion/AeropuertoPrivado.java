package asociacion;

/**
 *
 * @author Fernando Cuatro
 */
public class AeropuertoPrivado extends Aeropuerto {
 private int numSocios;
 
 // Constructores
 public AeropuertoPrivado() {
  super();
 }

 public AeropuertoPrivado(int numSocios, String nombre, String pais, String calle, String cuidad, int numero, int anioInaguracion, int capacidad) {
  super(nombre, pais, calle, cuidad, numero, anioInaguracion, capacidad);
  this.numSocios = numSocios;
 }

 public AeropuertoPrivado(int numSocios, String nombre, Direccion direccion, int anioInaguracion, int capacidad) {
  super(nombre, direccion, anioInaguracion, capacidad);
  this.numSocios = numSocios;
 }
 
 // Metodos y propiedades
 public int getNumSocios() {
  return numSocios;
 }

 public void setNumSocios(int numSocios) {
  this.numSocios = numSocios;
 }

 @Override
 public String toString() {
  return super.toString() + "AeropuertoPrivado con " + numSocios + " numero de socios.\n";
 }
 
 @Override
 public void gananciasTotales(double cantidad){
  double cantidadSocios = cantidad / this.numSocios;
  System.out.println("La cantidad ganada por cada socio es de: $" + cantidadSocios);
 }

 
}
