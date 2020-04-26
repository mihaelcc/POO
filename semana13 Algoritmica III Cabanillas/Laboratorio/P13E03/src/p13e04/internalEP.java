
package p13e04;

public class internalEP extends javax.swing.JInternalFrame {

    public internalEP() {
        initComponents();
        setSize(600,700);
    }
    public String leeDNI(){return txtDNI.getText();}
    public String leeNombre(){return txtNombre.getText();}
    public String leeApellido(){return txtApellidos.getText();}
    
    public double leeSueldoBasico(){return Double.parseDouble(txtSueldoBasico.getText());}
    public String leeAfiliacion(){return cboAfiliacion.getSelectedItem().toString();}
    
    public void listar(Empleado e){
    imprime(e.info());  
    }
    public  void imprime(String s){
        txtSalida.setText(s+"\n");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtDNI = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtSueldoBasico = new javax.swing.JTextField();
        cboAfiliacion = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jPanel1.setLayout(new java.awt.GridLayout(2, 3));

        txtDNI.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DNI", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        jPanel1.add(txtDNI);

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre);

        txtApellidos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellidos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        jPanel1.add(txtApellidos);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empleado Permanente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        jPanel4.setLayout(new java.awt.GridLayout());

        jLabel3.setText("Sueldo Basico");
        jPanel4.add(jLabel3);
        jPanel4.add(txtSueldoBasico);

        cboAfiliacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Afiliacion", "AFP", "SNP", " " }));
        jPanel4.add(cboAfiliacion);

        jPanel1.add(jPanel4);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        txtSalida.setColumns(20);
        txtSalida.setRows(5);
        jScrollPane1.setViewportView(txtSalida);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jButton2.setText("Empleado Permanente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton5.setText("Borrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Empleado e = new EmpleadoPermanente(leeNombre(),leeApellido(),
            leeDNI(),leeSueldoBasico(),leeAfiliacion());
        
        listar(e);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       txtApellidos.setText("");
       txtDNI.setText("");
       txtNombre.setText("");
       txtSalida.setText("");
       txtSueldoBasico.setText("");
       cboAfiliacion.setSelectedIndex(0);
       
    }//GEN-LAST:event_jButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboAfiliacion;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtSalida;
    private javax.swing.JTextField txtSueldoBasico;
    // End of variables declaration//GEN-END:variables
}
