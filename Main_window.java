/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CAR
 */
public class Main_window extends javax.swing.JFrame {

    /**
     * Creates new form Main_window
     */
    public Main_window() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblArregloAlquileres = new javax.swing.JLabel();
        lblTamanoArreglo = new javax.swing.JLabel();
        btnInstanciarArreglo = new javax.swing.JButton();
        lblRegistrarAlquiler = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblIndice = new javax.swing.JLabel();
        btnCrearInstancia = new javax.swing.JButton();
        lblVerAlquileres = new javax.swing.JLabel();
        lblIndiceConsultar = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        lblTerminarAlquiler = new javax.swing.JLabel();
        lblCantidadHoras = new javax.swing.JLabel();
        btnEstimarCosto = new javax.swing.JButton();
        lblCosto = new javax.swing.JLabel();
        lblCostoValue = new javax.swing.JLabel();
        lblAlquiler = new javax.swing.JLabel();
        lblIndiceVer = new javax.swing.JLabel();
        lblClienteVer = new javax.swing.JLabel();
        lblMotoVer = new javax.swing.JLabel();
        lblFechaVer = new javax.swing.JLabel();
        lblHorasAlquilerVer = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        btnVistaClientes = new javax.swing.JButton();
        btnVistaMotos = new javax.swing.JButton();
        btnSiguienteVista = new javax.swing.JButton();
        lblDescripcionValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblArregloAlquileres.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblArregloAlquileres.setText("Arreglo Alquileres");
        lblArregloAlquileres.setName("lblArregloAlquileres"); // NOI18N

        lblTamanoArreglo.setText("Tama??o Arreglo:");
        lblTamanoArreglo.setName("lblTamanoArreglo"); // NOI18N

        btnInstanciarArreglo.setText("Bot??n Instanciar Arreglo");
        btnInstanciarArreglo.setName("btnInstanciarArreglo"); // NOI18N
        btnInstanciarArreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstanciarArregloActionPerformed(evt);
            }
        });

        lblRegistrarAlquiler.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRegistrarAlquiler.setText("Registrar Alquiler");
        lblRegistrarAlquiler.setName("lblArregloAlquileres"); // NOI18N

        lblId.setText("Id:");
        lblId.setName("lblArregloAlquileres"); // NOI18N

        lblFecha.setText("Fecha:");
        lblFecha.setName("lblArregloAlquileres"); // NOI18N

        lblHora.setText("Hora:");
        lblHora.setName("lblArregloAlquileres"); // NOI18N

        lblIndice.setText("Indice:");
        lblIndice.setName("lblArregloAlquileres"); // NOI18N

        btnCrearInstancia.setText("Crear Instancia");
        btnCrearInstancia.setName("btnInstanciarArreglo"); // NOI18N
        btnCrearInstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearInstanciaActionPerformed(evt);
            }
        });

        lblVerAlquileres.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblVerAlquileres.setText("Ver Alquileres");
        lblVerAlquileres.setName("lblArregloAlquileres"); // NOI18N

        lblIndiceConsultar.setText("Indice:");
        lblIndiceConsultar.setName("lblArregloAlquileres"); // NOI18N

        btnConsultar.setText("Bot??n Consultar");
        btnConsultar.setName("btnInstanciarArreglo"); // NOI18N
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        lblTerminarAlquiler.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTerminarAlquiler.setText("Terminar Alquiler");
        lblTerminarAlquiler.setName("lblArregloAlquileres"); // NOI18N

        lblCantidadHoras.setText("Cantidad Horas:");
        lblCantidadHoras.setName("lblArregloAlquileres"); // NOI18N

        btnEstimarCosto.setText("Bot??n Estimar Costo");
        btnEstimarCosto.setName("btnInstanciarArreglo"); // NOI18N
        btnEstimarCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstimarCostoActionPerformed(evt);
            }
        });

        lblCosto.setText("Costo:");
        lblCosto.setName("lblArregloAlquileres"); // NOI18N

        lblCostoValue.setText("...");
        lblCostoValue.setName("lblArregloAlquileres"); // NOI18N

        lblAlquiler.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAlquiler.setText("Alquiler");
        lblAlquiler.setName("lblArregloAlquileres"); // NOI18N

        lblIndiceVer.setText("Id:");
        lblIndiceVer.setName("lblArregloAlquileres"); // NOI18N

        lblClienteVer.setText("Cliente:");
        lblClienteVer.setName("lblArregloAlquileres"); // NOI18N

        lblMotoVer.setText("Moto:");
        lblMotoVer.setName("lblArregloAlquileres"); // NOI18N

        lblFechaVer.setText("Fecha:");
        lblFechaVer.setName("lblArregloAlquileres"); // NOI18N

        lblHorasAlquilerVer.setText("Horas Alquiler:");
        lblHorasAlquilerVer.setName("lblArregloAlquileres"); // NOI18N

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDescripcion.setText("Descripci??n");
        lblDescripcion.setName("lblArregloAlquileres"); // NOI18N

        btnVistaClientes.setText("Ir a Vista Clientes");
        btnVistaClientes.setName("btnInstanciarArreglo"); // NOI18N
        btnVistaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVistaClientesActionPerformed(evt);
            }
        });

        btnVistaMotos.setText("Ir a Vista Motos");
        btnVistaMotos.setName("btnInstanciarArreglo"); // NOI18N
        btnVistaMotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVistaMotosActionPerformed(evt);
            }
        });

        btnSiguienteVista.setText("Ir Siguiente Vista");
        btnSiguienteVista.setName("btnInstanciarArreglo"); // NOI18N
        btnSiguienteVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteVistaActionPerformed(evt);
            }
        });

        lblDescripcionValue.setText("...");
        lblDescripcionValue.setName("lblArregloAlquileres"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRegistrarAlquiler)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblCantidadHoras)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnInstanciarArreglo)
                                                .addGap(113, 113, 113)
                                                .addComponent(lblIndiceConsultar))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnCrearInstancia)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblCosto)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTerminarAlquiler)
                                            .addComponent(btnConsultar)
                                            .addComponent(btnEstimarCosto)
                                            .addComponent(lblCostoValue, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblId))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblFecha))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblHora)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(lblAlquiler))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblIndiceVer)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnVistaMotos, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblClienteVer)
                                            .addComponent(lblMotoVer)
                                            .addComponent(lblFechaVer)
                                            .addComponent(lblHorasAlquilerVer)
                                            .addComponent(lblDescripcion)
                                            .addComponent(lblDescripcionValue, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 163, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblIndice))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTamanoArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(lblArregloAlquileres)))
                        .addGap(153, 153, 153)
                        .addComponent(lblVerAlquileres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVistaClientes))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSiguienteVista, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArregloAlquileres)
                    .addComponent(lblVerAlquileres)
                    .addComponent(btnVistaClientes))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTamanoArreglo)
                            .addComponent(lblAlquiler))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInstanciarArreglo)
                            .addComponent(btnConsultar)
                            .addComponent(lblIndiceVer)
                            .addComponent(btnVistaMotos)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblIndiceConsultar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClienteVer)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegistrarAlquiler)
                    .addComponent(lblMotoVer))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(lblTerminarAlquiler)
                    .addComponent(lblFechaVer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(lblCantidadHoras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHorasAlquilerVer)
                .addGap(5, 5, 5)
                .addComponent(lblHora)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIndice)
                    .addComponent(lblDescripcion))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEstimarCosto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCosto)
                            .addComponent(lblCostoValue)
                            .addComponent(btnCrearInstancia))
                        .addGap(10, 10, 10)
                        .addComponent(btnSiguienteVista)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblDescripcionValue, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInstanciarArregloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstanciarArregloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInstanciarArregloActionPerformed

    private void btnCrearInstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearInstanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearInstanciaActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEstimarCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstimarCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstimarCostoActionPerformed

    private void btnVistaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVistaClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVistaClientesActionPerformed

    private void btnVistaMotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVistaMotosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVistaMotosActionPerformed

    private void btnSiguienteVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteVistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSiguienteVistaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnCrearInstancia;
    private javax.swing.JButton btnEstimarCosto;
    private javax.swing.JButton btnInstanciarArreglo;
    private javax.swing.JButton btnSiguienteVista;
    private javax.swing.JButton btnVistaClientes;
    private javax.swing.JButton btnVistaMotos;
    private javax.swing.JLabel lblAlquiler;
    private javax.swing.JLabel lblArregloAlquileres;
    private javax.swing.JLabel lblCantidadHoras;
    private javax.swing.JLabel lblClienteVer;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblCostoValue;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDescripcionValue;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFechaVer;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblHorasAlquilerVer;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIndice;
    private javax.swing.JLabel lblIndiceConsultar;
    private javax.swing.JLabel lblIndiceVer;
    private javax.swing.JLabel lblMotoVer;
    private javax.swing.JLabel lblRegistrarAlquiler;
    private javax.swing.JLabel lblTamanoArreglo;
    private javax.swing.JLabel lblTerminarAlquiler;
    private javax.swing.JLabel lblVerAlquileres;
    // End of variables declaration//GEN-END:variables
}
