
package p09e03;


public class PanelPrincipal extends javax.swing.JPanel {

   
    public PanelPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCondicion = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtFoto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setText("Codigo");
        jPanel1.add(jLabel1);

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigo);

        jLabel2.setText("Decripcion");
        jPanel1.add(jLabel2);

        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDescripcion);

        jLabel3.setText("Precio");
        jPanel1.add(jLabel3);
        jPanel1.add(txtPrecio);

        jLabel4.setText("Stock");
        jPanel1.add(jLabel4);
        jPanel1.add(txtStock);

        jLabel5.setText("Condicion");
        jPanel1.add(jLabel5);

        txtCondicion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Buen Estado", "Por Reparar", "Malogrado" }));
        jPanel1.add(txtCondicion);

        jLabel6.setText("Foto");
        jPanel1.add(jLabel6);
        jPanel1.add(txtFoto);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevo);

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBorrar);

        add(jPanel2, java.awt.BorderLayout.PAGE_END);

        txtSalida.setEditable(false);
        txtSalida.setColumns(20);
        txtSalida.setRows(5);
        jScrollPane1.setViewportView(txtSalida);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        
        ProductoH nuevo = new ProductoH(leeCodigo(),leeDescripcion(),leePrecio(), leeStock(),leeCondicion(),leeFoto());
        
        lista(nuevo);

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
  

        txtSalida.setText("");
        txtCodigo.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
        txtCodigo.requestFocus();

    }//GEN-LAST:event_btnBorrarActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed
    private String leeCodigo(){return txtCodigo.getText();}
    private String leeDescripcion(){return txtDescripcion.getText();}
    private double leePrecio(){return Double.parseDouble(txtPrecio.getText());}
 //CLASE HIJA
    private String leeFoto(){return txtDescripcion.getText();}
    private int leeStock(){return Integer.parseInt(txtPrecio.getText());}
    private int leeCondicion(){return Integer.parseInt(txtPrecio.getText());}

    private void lista(Producto p){
        imprime("Codigo\t:"+p.getCodigo());
        imprime("Descripcion\t:"+p.getDescripcion());
        imprime("Precio\t:"+p.getPrecio());
}

    private void imprime(String s){
        txtSalida.append(s+"\n");
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JComboBox txtCondicion;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFoto;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextArea txtSalida;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables

}
