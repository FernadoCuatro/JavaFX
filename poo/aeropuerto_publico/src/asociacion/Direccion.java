package asociacion;

/**
 *
 * @author Fernando Cuatro
 */
public class Direccion {
 // Atributos
 private String pais, calle, ciudad;
 private int numero;

 // Constructores
 public Direccion() {}

 public Direccion(String pais, String calle, String ciudad, int numero) {
  this.pais = pais;
  this.calle = calle;
  this.ciudad = ciudad;
  this.numero = numero;
 } 
 
 // Metodos y propiedades

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

 public String getCiudad() {
  return ciudad;
 }

 public void setCiudad(String ciudad) {
  this.ciudad = ciudad;
 }

 public int getNumero() {
  return numero;
 }

 public void setNumero(int numero) {
  this.numero = numero; 
 }

 @Override
 public String toString() {
  return "En el pais " + pais + ", En la direccion: \ncalle: " + calle + ", ciudad: " + ciudad + ", numero: " + numero + ".";
 }
 
 
}
