
package p13e04;


public class internalEV extends javax.swing.JInternalFrame {

   
    public internalEV() {
        initComponents();
        setSize(600,700);
    }
    
    public String leeDNI(){return txtDNI.getText();}
    public String leeNombre(){return txtNombre.getText();}
    public String leeApellido(){return txtApellido.getText();}
    public double leeMonto(){return Double.parseDouble(txtMontoVendido.getText());}
    public double leePorcentaje(){return Double.parseDouble(txtPorcentaje.getText());}
    
    
    public void listar(Empleado e){
    imprime(e.info());  
    }
    public  void imprime(String s){
        txtSalida.setText(s);
    }
    
    
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtDNI = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMontoVendido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPorcentaje = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
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

        txtApellido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellidos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        jPanel1.add(txtApellido);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empleado Vendedor", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        jPanel3.setLayout(new java.awt.GridLayout(2, 2));

        jLabel1.setText("Monto Vendido");
        jPanel3.add(jLabel1);
        jPanel3.add(txtMontoVendido);

        jLabel2.setText("Porcentaje");
        jPanel3.add(jLabel2);
        jPanel3.add(txtPorcentaje);

        jPanel1.add(jPanel3);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        txtSalida.setColumns(20);
        txtSalida.setRows(5);
        jScrollPane1.setViewportView(txtSalida);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jButton3.setText("Empleado Vendedor");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Empleado e = new EmpleadoVendedor(leeNombre(),leeApellido(),
            leeDNI(),leeMonto(),leePorcentaje());
        
        listar(e);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        txtApellido.setText("");
        txtDNI.setText("");
        txtMontoVendido.setText("");
        txtNombre.setText("");
        txtPorcentaje.setText("");
        txtSalida.setText("");
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtMontoVendido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPorcentaje;
    private javax.swing.JTextArea txtSalida;
    // End of variables declaration//GEN-END:variables
}
