package formularios;

import clases.Aeropuerto;
import clases.AeropuertoPrivado;
import clases.AeropuertoPublico;
import clases.Direccion;
import java.io.IOException;
import javax.swing.JOptionPane;
import utilidades.MetodosSueltos;

public class AniadirEditarAeropuerto extends javax.swing.JDialog {

 // Creamos un atributo para editar un aeropuerto
 private Aeropuerto aeropuertoEditar;

 public AniadirEditarAeropuerto(java.awt.Frame parent, boolean modal) {
  super(parent, modal);
  initComponents();

  this.buttonGroup1.add(this.rdbPrivado);
  this.buttonGroup1.add(this.rdbPublico);

  this.setLocationRelativeTo(null);
 }

 public AniadirEditarAeropuerto(java.awt.Frame parent, boolean modal, Aeropuerto aeropuertoEditar) {
  super(parent, modal);
  initComponents();

  this.buttonGroup1.add(this.rdbPrivado);
  this.buttonGroup1.add(this.rdbPublico);

  this.setLocationRelativeTo(null);

  this.aeropuertoEditar = aeropuertoEditar;

  cargarDatos();
 }

 private void cargarDatos() {
  this.txtNombre.setText(this.aeropuertoEditar.getNombre());
  this.txtPais.setText(this.aeropuertoEditar.getDireccion().getPais());
  this.txtCalle.setText(this.aeropuertoEditar.getDireccion().getCalle());
  this.txtCiudad.setText(this.aeropuertoEditar.getDireccion().getCiudad());
  this.txtNumero.setText(this.aeropuertoEditar.getDireccion().getNumero() + "");
  this.txtAnioInauguracion.setText(this.aeropuertoEditar.getAnioInauguracion() + "");
  this.txtCapacidad.setText(this.aeropuertoEditar.getCapacidad() + "");

  if (this.aeropuertoEditar instanceof AeropuertoPrivado)
  {
   // Creamos el objeto
   AeropuertoPrivado aux = (AeropuertoPrivado) this.aeropuertoEditar;

   this.txtNumSocios.setText(aux.getNumSocios() + "");
   rdbPrivado.setSelected(true);

   this.txtFinanciacion.setEnabled(false);
   this.txtDiscapacitados.setEnabled(false);
   this.txtNumSocios.setEnabled(true);
  } else
  {
   // Creamos el objeto
   AeropuertoPublico aux = (AeropuertoPublico) this.aeropuertoEditar;

   this.txtFinanciacion.setText(aux.getFinanciacion() + "");
   this.txtDiscapacitados.setText(aux.getNumTrabajadoresDiscapacitados() + "");

   this.txtFinanciacion.setEnabled(true);
   this.txtDiscapacitados.setEnabled(true);
   this.txtNumSocios.setEnabled(false);
  }

  this.rdbPrivado.setEnabled(false);
  this.rdbPublico.setEnabled(false);
 }

 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
 private void initComponents() {

  buttonGroup1 = new javax.swing.ButtonGroup();
  txtCalle = new javax.swing.JTextField();
  jLabel9 = new javax.swing.JLabel();
  jLabel5 = new javax.swing.JLabel();
  jLabel10 = new javax.swing.JLabel();
  txtNumero = new javax.swing.JTextField();
  txtNumSocios = new javax.swing.JTextField();
  txtAnioInauguracion = new javax.swing.JTextField();
  jLabel6 = new javax.swing.JLabel();
  btnGuardar = new javax.swing.JButton();
  jLabel2 = new javax.swing.JLabel();
  txtCiudad = new javax.swing.JTextField();
  btnCancelar = new javax.swing.JButton();
  txtCapacidad = new javax.swing.JTextField();
  jLabel7 = new javax.swing.JLabel();
  jLabel3 = new javax.swing.JLabel();
  rdbPublico = new javax.swing.JRadioButton();
  rdbPrivado = new javax.swing.JRadioButton();
  txtNombre = new javax.swing.JTextField();
  jLabel1 = new javax.swing.JLabel();
  txtFinanciacion = new javax.swing.JTextField();
  txtPais = new javax.swing.JTextField();
  jLabel8 = new javax.swing.JLabel();
  jLabel4 = new javax.swing.JLabel();
  txtDiscapacitados = new javax.swing.JTextField();
  jLabel11 = new javax.swing.JLabel();

  setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
  setTitle("Nuevo aeropuerto");

  jLabel9.setText("Discapacitados:");

  jLabel5.setText("Calle:");

  jLabel10.setText("Numero de socios:");

  txtNumSocios.setEnabled(false);

  jLabel6.setText("Numero:");

  btnGuardar.setText("Guardar");
  btnGuardar.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    btnGuardarActionPerformed(evt);
   }
  });

  jLabel2.setText("Año inauguración:");

  txtCiudad.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    txtCiudadActionPerformed(evt);
   }
  });

  btnCancelar.setText("Cancelar");
  btnCancelar.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    btnCancelarActionPerformed(evt);
   }
  });

  jLabel7.setText("Ciudad:");

  jLabel3.setText("Capacidad:");

  rdbPublico.setSelected(true);
  rdbPublico.setText("Público");
  rdbPublico.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    rdbPublicoActionPerformed(evt);
   }
  });

  rdbPrivado.setText("Privado");
  rdbPrivado.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    rdbPrivadoActionPerformed(evt);
   }
  });

  jLabel1.setText("Nombre:");

  jLabel8.setText("Financiación:");

  jLabel4.setText("País:");

  jLabel11.setFont(new java.awt.Font("Gotham", 1, 36)); // NOI18N
  jLabel11.setForeground(new java.awt.Color(0, 0, 0));
  jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
  jLabel11.setText("Añadir nuevo aeropuerto");

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
  getContentPane().setLayout(layout);
  layout.setHorizontalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(layout.createSequentialGroup()
    .addGap(13, 13, 13)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(layout.createSequentialGroup()
      .addGap(27, 27, 27)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addGroup(layout.createSequentialGroup()
        .addGap(60, 60, 60)
        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
       .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addGap(50, 50, 50)
      .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGap(0, 0, 0)
      .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
     .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)))
   .addGroup(layout.createSequentialGroup()
    .addGap(50, 50, 50)
    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addGap(10, 10, 10)
    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addGap(40, 40, 40)
    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addGap(0, 0, 0)
    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
   .addGroup(layout.createSequentialGroup()
    .addGap(20, 20, 20)
    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addGap(10, 10, 10)
    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addGap(50, 50, 50)
    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addGap(0, 0, 0)
    .addComponent(txtAnioInauguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addGap(70, 70, 70)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(layout.createSequentialGroup()
      .addGap(80, 80, 80)
      .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
     .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
   .addGroup(layout.createSequentialGroup()
    .addGap(20, 20, 20)
    .addComponent(rdbPublico))
   .addGroup(layout.createSequentialGroup()
    .addGap(70, 70, 70)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addGroup(layout.createSequentialGroup()
      .addGap(80, 80, 80)
      .addComponent(txtFinanciacion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
    .addGap(70, 70, 70)
    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addGap(0, 0, 0)
    .addComponent(txtDiscapacitados, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
   .addGroup(layout.createSequentialGroup()
    .addGap(20, 20, 20)
    .addComponent(rdbPrivado))
   .addGroup(layout.createSequentialGroup()
    .addGap(60, 60, 60)
    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addGap(10, 10, 10)
    .addComponent(txtNumSocios, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addGap(150, 150, 150)
    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addGap(27, 27, 27)
    .addComponent(btnCancelar))
  );
  layout.setVerticalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(layout.createSequentialGroup()
    .addGap(22, 22, 22)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(layout.createSequentialGroup()
      .addGap(58, 58, 58)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
       .addGroup(layout.createSequentialGroup()
        .addGap(10, 10, 10)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
     .addGroup(layout.createSequentialGroup()
      .addGap(68, 68, 68)
      .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
     .addGroup(layout.createSequentialGroup()
      .addGap(58, 58, 58)
      .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
     .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addGap(20, 20, 20)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addGap(26, 26, 26)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(txtAnioInauguracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addGroup(layout.createSequentialGroup()
      .addGap(10, 10, 10)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
       .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
       .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
    .addGap(40, 40, 40)
    .addComponent(rdbPublico)
    .addGap(2, 2, 2)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addComponent(txtFinanciacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(txtDiscapacitados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addGroup(layout.createSequentialGroup()
      .addGap(10, 10, 10)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
       .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
    .addGap(40, 40, 40)
    .addComponent(rdbPrivado)
    .addGap(12, 12, 12)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(layout.createSequentialGroup()
      .addGap(10, 10, 10)
      .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
     .addComponent(txtNumSocios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(btnGuardar)
     .addComponent(btnCancelar))
    .addContainerGap(25, Short.MAX_VALUE))
  );

  pack();
 }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

     String errores = "";

     String nombre = this.txtNombre.getText();
     String pais = this.txtPais.getText();
     String calle = this.txtCalle.getText();
     String numero = this.txtNumero.getText();
     String ciudad = this.txtCiudad.getText();
     String anioInauguracion = this.txtAnioInauguracion.getText();
     String capacidad = this.txtCapacidad.getText();

     String financiacion = "", discapacitados = "", numSocios = "";

     if (nombre.isEmpty())
     {
      errores += " - El nombre no puede estar vacio \n";
     }

     if (pais.isEmpty())
     {
      errores += " - El pais no puede estar vacio \n";
     }

     if (calle.isEmpty())
     {
      errores += " - La calle no puede estar vacia \n";
     }

     if (numero.isEmpty())
     {
      errores += " - El numero no puede estar vacia \n";
     } else
     {
      if (!MetodosSueltos.validaNumeroEntero_Exp(numero))
      {
       errores += " - El numero no tiene el formato correcto \n";
      }
     }

     if (ciudad.isEmpty())
     {
      errores += " - La ciudad no puede estar vacia \n";
     }

     if (anioInauguracion.isEmpty())
     {
      errores += " - El año de inauguracion puede estar vacia \n";
     } else
     {
      if (!MetodosSueltos.validaNumeroEntero_Exp(anioInauguracion))
      {
       errores += " - El año de inauguracion no tiene el formato correcto \n";
      }
     }

     if (capacidad.isEmpty())
     {
      errores += " - La capacidad no puede estar vacia \n";
     } else
     {
      if (!MetodosSueltos.validaNumeroEntero_Exp(capacidad))
      {
       errores += " - La capacidad no tiene el formato correcto \n";
      }
     }

     if (this.rdbPublico.isSelected())
     {

      financiacion = this.txtFinanciacion.getText();
      discapacitados = this.txtDiscapacitados.getText();

      if (financiacion.isEmpty())
      {
       errores += " - La financiacion no puede estar vacia \n";
      } else
      {
       if (!MetodosSueltos.validaNumeroReal_Exp(financiacion))
       {
        errores += " - La financiacion no tiene el formato correcto \n";
       }
      }

      if (discapacitados.isEmpty())
      {
       errores += " - El numero de discapacitados no puede estar vacio \n";
      } else
      {
       if (!MetodosSueltos.validaNumeroEntero_Exp(discapacitados))
       {
        errores += " - El numero de discapacitados no tiene el formato correcto \n";
       }
      }
     } else
     {

      numSocios = this.txtNumSocios.getText();

      if (numSocios.isEmpty())
      {
       errores += " - El numero de socios no puede estar vacio \n";
      } else
      {
       if (!MetodosSueltos.validaNumeroEntero_Exp(numSocios))
       {
        errores += " - El numero de socios no tiene el formato correcto \n";
       }
      }
     }

     if (errores.isEmpty())
     {
      int numeroAeropuerto = Integer.parseInt(numero);
      int anioInauguracioAeropuerto = Integer.parseInt(anioInauguracion);
      int capacidadAeropuerto = Integer.parseInt(capacidad);

      Direccion dir = new Direccion(pais, calle, numeroAeropuerto, ciudad);

      if (this.aeropuertoEditar != null)
      {
       // Editando
       this.aeropuertoEditar.setNombre(nombre);
       this.aeropuertoEditar.setDireccion(dir);
       this.aeropuertoEditar.setCapacidad(capacidadAeropuerto);
       this.aeropuertoEditar.setAnioInauguracion(anioInauguracioAeropuerto);

       if (this.rdbPublico.isSelected())
       {
        double financiacionAeropuerto = Double.parseDouble(financiacion);
        int discapacitadosAeropuerto = Integer.parseInt(discapacitados);

        AeropuertoPublico ap = (AeropuertoPublico) this.aeropuertoEditar;

        ap.setFinanciacion(financiacionAeropuerto);
        ap.setNumTrabajadoresDiscapacitados(discapacitadosAeropuerto);

        this.aeropuertoEditar = ap;

       } else
       {
        int numSociosAeropuerto = Integer.parseInt(numSocios);

        AeropuertoPrivado ap = (AeropuertoPrivado) this.aeropuertoEditar;
        ap.setNumSocios(numSociosAeropuerto);

        this.aeropuertoEditar = ap;
       }
       
       try
       {
        MetodosSueltos.actualizarFichero();

        JOptionPane.showMessageDialog(this, "Aeropuerto actualizado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        this.dispose();
       } catch (IOException ex)
       {
        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
       }

      } else
      {
       // Creando
       Aeropuerto aux;

       if (this.rdbPublico.isSelected())
       {
        double financiacionAeropuerto = Double.parseDouble(financiacion);
        int discapacitadosAeropuerto = Integer.parseInt(discapacitados);

        aux = new AeropuertoPublico(financiacionAeropuerto, discapacitadosAeropuerto, nombre, dir, anioInauguracioAeropuerto, capacidadAeropuerto);
       } else
       {
        int numSociosAeropuerto = Integer.parseInt(numSocios);
        aux = new AeropuertoPrivado(numSociosAeropuerto, nombre, dir, anioInauguracioAeropuerto, capacidadAeropuerto);
       }

       try
       {
        MetodosSueltos.escribirAeropuerto(aux, true);

        JOptionPane.showMessageDialog(this, "Aeropuerto creado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        this.dispose();
       } catch (IOException ex)
       {
        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
       }
      }

     } else
     {
      JOptionPane.showMessageDialog(this, errores, "Error", JOptionPane.ERROR_MESSAGE);
     }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiudadActionPerformed
     // TODO add your handling code here:
    }//GEN-LAST:event_txtCiudadActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
     this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void rdbPublicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbPublicoActionPerformed
     this.txtFinanciacion.setEnabled(true);
     this.txtDiscapacitados.setEnabled(true);
     this.txtNumSocios.setEnabled(false);
    }//GEN-LAST:event_rdbPublicoActionPerformed

    private void rdbPrivadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbPrivadoActionPerformed
     this.txtFinanciacion.setEnabled(false);
     this.txtDiscapacitados.setEnabled(false);
     this.txtNumSocios.setEnabled(true);
    }//GEN-LAST:event_rdbPrivadoActionPerformed

 // Variables declaration - do not modify//GEN-BEGIN:variables
 private javax.swing.JButton btnCancelar;
 private javax.swing.JButton btnGuardar;
 private javax.swing.ButtonGroup buttonGroup1;
 private javax.swing.JLabel jLabel1;
 private javax.swing.JLabel jLabel10;
 private javax.swing.JLabel jLabel11;
 private javax.swing.JLabel jLabel2;
 private javax.swing.JLabel jLabel3;
 private javax.swing.JLabel jLabel4;
 private javax.swing.JLabel jLabel5;
 private javax.swing.JLabel jLabel6;
 private javax.swing.JLabel jLabel7;
 private javax.swing.JLabel jLabel8;
 private javax.swing.JLabel jLabel9;
 private javax.swing.JRadioButton rdbPrivado;
 private javax.swing.JRadioButton rdbPublico;
 private javax.swing.JTextField txtAnioInauguracion;
 private javax.swing.JTextField txtCalle;
 private javax.swing.JTextField txtCapacidad;
 private javax.swing.JTextField txtCiudad;
 private javax.swing.JTextField txtDiscapacitados;
 private javax.swing.JTextField txtFinanciacion;
 private javax.swing.JTextField txtNombre;
 private javax.swing.JTextField txtNumSocios;
 private javax.swing.JTextField txtNumero;
 private javax.swing.JTextField txtPais;
 // End of variables declaration//GEN-END:variables
}
