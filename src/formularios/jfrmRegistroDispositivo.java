/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

/**
 *
 * @author Sistema
 */
public class jfrmRegistroDispositivo extends javax.swing.JDialog {

    /**
     * Creates new form jfrmRegistroDispositivo
     */
    public jfrmRegistroDispositivo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txt_distribuidor = new javax.swing.JTextField();
        CiudadOrigen1 = new javax.swing.JLabel();
        cb_pais = new javax.swing.JComboBox<>();
        RUC1 = new javax.swing.JLabel();
        txt_numserie = new javax.swing.JTextField();
        RazonSocial1 = new javax.swing.JLabel();
        txt_marca = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_id_fabricante = new javax.swing.JTextField();
        txt_iddistribuidor = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        RUC2 = new javax.swing.JLabel();
        txt_fabricante = new javax.swing.JTextField();
        CiudadOrigen2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_idmarca = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_tecnologia = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_idtecnologia = new javax.swing.JTextField();
        txt_cliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        btn_continuar1 = new javax.swing.JButton();
        btn_cancelar2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jPanel6.setBackground(new java.awt.Color(153, 153, 255));

        jLabel15.setText("Pais Fabricante");

        txt_distribuidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_distribuidorActionPerformed(evt);
            }
        });

        CiudadOrigen1.setText("Fabricante");

        cb_pais.setBackground(new java.awt.Color(204, 204, 255));
        cb_pais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Argentina", "Bolivia", "Brasil", "Chile", "Colombia", "Ecuador", "Paraguay", "Peru", "Uruguay", "Venezuela", " " }));
        cb_pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_paisActionPerformed(evt);
            }
        });

        RUC1.setText("Cliente");

        txt_numserie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numserieActionPerformed(evt);
            }
        });

        RazonSocial1.setText("Id Tecnologia");

        txt_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_marcaActionPerformed(evt);
            }
        });

        jLabel16.setText("Distribuidor");

        txt_iddistribuidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_iddistribuidorActionPerformed(evt);
            }
        });

        jLabel17.setText("Marca");

        RUC2.setText("Id Marca");

        txt_fabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fabricanteActionPerformed(evt);
            }
        });

        CiudadOrigen2.setText("Id Fabricante");

        jLabel19.setText("Id Distribuidor");

        jLabel20.setText("Numero de Serie");

        txt_tecnologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tecnologiaActionPerformed(evt);
            }
        });

        jLabel22.setText("Tecnologia");

        txt_idtecnologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idtecnologiaActionPerformed(evt);
            }
        });

        txt_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_clienteActionPerformed(evt);
            }
        });

        jLabel1.setText("Direccion");

        jLabel2.setText("Telefono");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel17)
                            .addComponent(CiudadOrigen1)
                            .addComponent(CiudadOrigen2)
                            .addComponent(jLabel15))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_numserie, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_marca)
                            .addComponent(cb_pais, javax.swing.GroupLayout.Alignment.LEADING, 0, 210, Short.MAX_VALUE)
                            .addComponent(txt_fabricante, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_id_fabricante, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(RazonSocial1)
                            .addComponent(jLabel22)
                            .addComponent(jLabel19))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(txt_direccion)
                                    .addComponent(txt_cliente)
                                    .addComponent(txt_idtecnologia, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_iddistribuidor, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_tecnologia, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(txt_distribuidor))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RUC1)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(RUC2)
                        .addGap(107, 107, 107)
                        .addComponent(txt_idmarca)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_numserie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RUC2)
                    .addComponent(txt_idmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CiudadOrigen1)
                    .addComponent(txt_fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CiudadOrigen2)
                    .addComponent(txt_id_fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txt_distribuidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txt_iddistribuidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txt_tecnologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RazonSocial1)
                    .addComponent(txt_idtecnologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RUC1)
                    .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_continuar1.setText("Continuar");
        btn_continuar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_continuar1ActionPerformed(evt);
            }
        });

        btn_cancelar2.setText("Cancelar");
        btn_cancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar2ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel12.setText("REGISTRO DISPOSITIVO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_continuar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancelar2)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_continuar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_continuar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_continuar1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);

    }//GEN-LAST:event_btn_continuar1ActionPerformed

    private void btn_cancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelar2ActionPerformed

    private void txt_idtecnologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idtecnologiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idtecnologiaActionPerformed

    private void txt_tecnologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tecnologiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tecnologiaActionPerformed

    private void txt_fabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fabricanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fabricanteActionPerformed

    private void txt_iddistribuidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_iddistribuidorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_iddistribuidorActionPerformed

    private void txt_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_marcaActionPerformed

    private void txt_numserieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numserieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numserieActionPerformed

    private void cb_paisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_paisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_paisActionPerformed

    private void txt_distribuidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_distribuidorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_distribuidorActionPerformed

    private void txt_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_clienteActionPerformed

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
            java.util.logging.Logger.getLogger(jfrmRegistroDispositivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmRegistroDispositivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmRegistroDispositivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmRegistroDispositivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jfrmRegistroDispositivo dialog = new jfrmRegistroDispositivo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CiudadOrigen1;
    private javax.swing.JLabel CiudadOrigen2;
    private javax.swing.JLabel RUC1;
    private javax.swing.JLabel RUC2;
    private javax.swing.JLabel RazonSocial1;
    private javax.swing.JButton btn_cancelar2;
    private javax.swing.JButton btn_continuar1;
    private javax.swing.JComboBox<String> cb_pais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField txt_cliente;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_distribuidor;
    private javax.swing.JTextField txt_fabricante;
    private javax.swing.JTextField txt_id_fabricante;
    private javax.swing.JTextField txt_iddistribuidor;
    private javax.swing.JTextField txt_idmarca;
    private javax.swing.JTextField txt_idtecnologia;
    private javax.swing.JTextField txt_marca;
    private javax.swing.JTextField txt_numserie;
    private javax.swing.JTextField txt_tecnologia;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
