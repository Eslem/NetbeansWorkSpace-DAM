/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vistapantalla;

/**
 *
 * @author Paco Aldarias <paco.aldarias@ceedcv.es>
 */
public class VistaCliente extends javax.swing.JFrame {

  /**
   * Creates new form VistaCliente
   */
  public VistaCliente() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize
   * the form. WARNING: Do NOT modify this code. The content of this
   * method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    Id = new javax.swing.JTextField();
    Nombre = new javax.swing.JTextField();
    Email = new javax.swing.JTextField();
    jPanel2 = new javax.swing.JPanel();
    VistaClientePrimero = new javax.swing.JButton();
    VistaClienteAntes = new javax.swing.JButton();
    VistaClienteDespues = new javax.swing.JButton();
    VistaClienteUltimo = new javax.swing.JButton();
    jPanel3 = new javax.swing.JPanel();
    VistaClienteModificar = new javax.swing.JButton();
    VistaClienteAnadir = new javax.swing.JButton();
    VistaClienteBorrar = new javax.swing.JButton();
    VistaClienteSalir = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(157, 229, 67));

    jLabel1.setText("Cliente");

    jLabel2.setText("Id:");

    jLabel3.setText("Nombre:");

    jLabel4.setText("Email");

    Id.setEditable(false);

    Nombre.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        NombreActionPerformed(evt);
      }
    });

    jPanel2.setBackground(new java.awt.Color(217, 244, 77));

    VistaClientePrimero.setText("|<");

    VistaClienteAntes.setText("<");

    VistaClienteDespues.setText(">");

    VistaClienteUltimo.setText(">|");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(VistaClientePrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(VistaClienteAntes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
        .addComponent(VistaClienteDespues, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(VistaClienteUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(23, 23, 23))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(VistaClientePrimero)
          .addComponent(VistaClienteAntes)
          .addComponent(VistaClienteDespues)
          .addComponent(VistaClienteUltimo))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(47, 47, 47)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel3)
              .addComponent(jLabel2)
              .addComponent(jLabel4))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(Email, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                  .addComponent(Nombre)
                  .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)))))
        .addContainerGap(39, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addGap(40, 40, 40)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(20, Short.MAX_VALUE))
    );

    jPanel3.setBackground(new java.awt.Color(188, 240, 85));

    VistaClienteModificar.setText("Modificar");
    VistaClienteModificar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        VistaClienteModificarActionPerformed(evt);
      }
    });

    VistaClienteAnadir.setText("Añadir");
    VistaClienteAnadir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        VistaClienteAnadirActionPerformed(evt);
      }
    });

    VistaClienteBorrar.setText("Borrar");

    VistaClienteSalir.setText("Salir");
    VistaClienteSalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        VistaClienteSalirActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(VistaClienteAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(VistaClienteBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(VistaClienteModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(VistaClienteSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addGap(22, 22, 22)
        .addComponent(VistaClienteAnadir)
        .addGap(18, 18, 18)
        .addComponent(VistaClienteBorrar)
        .addGap(18, 18, 18)
        .addComponent(VistaClienteModificar)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(VistaClienteSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(0, 3, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_NombreActionPerformed

  private void VistaClienteSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VistaClienteSalirActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_VistaClienteSalirActionPerformed

  private void VistaClienteAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VistaClienteAnadirActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_VistaClienteAnadirActionPerformed

  private void VistaClienteModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VistaClienteModificarActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_VistaClienteModificarActionPerformed

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
      java.util.logging.Logger.getLogger(VistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(VistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(VistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(VistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new VistaCliente().setVisible(true);
      }
    });
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextField Email;
  private javax.swing.JTextField Id;
  private javax.swing.JTextField Nombre;
  private javax.swing.JButton VistaClienteAnadir;
  private javax.swing.JButton VistaClienteAntes;
  private javax.swing.JButton VistaClienteBorrar;
  private javax.swing.JButton VistaClienteDespues;
  private javax.swing.JButton VistaClienteModificar;
  private javax.swing.JButton VistaClientePrimero;
  private javax.swing.JButton VistaClienteSalir;
  private javax.swing.JButton VistaClienteUltimo;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  // End of variables declaration//GEN-END:variables

  public javax.swing.JButton getVistaClienteAnadir() {
    return VistaClienteAnadir;
  }

  public javax.swing.JButton getVistaClienteSalir() {
    return VistaClienteSalir;
  }

  public javax.swing.JTextField getId() {
    return Id;
  }

  public javax.swing.JTextField getNombre() {
    return Nombre;
  }

  public javax.swing.JTextField getEmail() {
    return Email;
  }

  public javax.swing.JButton getVistaClientePrimero() {
    return VistaClientePrimero;
  }

  public javax.swing.JButton getVistaClienteUltimo() {
    return VistaClienteUltimo;
  }

  public javax.swing.JButton getVistaClienteAntes() {
    return VistaClienteAntes;
  }

  public javax.swing.JButton getVistaClienteDespues() {
    return VistaClienteDespues;
  }

  public javax.swing.JButton getVistaClienteBorrar() {
    return VistaClienteBorrar;
  }

  public javax.swing.JButton getVistaClienteModificar() {
    return VistaClienteModificar;
  }
}