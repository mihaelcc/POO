

package p09e02;

import javax.swing.ImageIcon;


public class PanelPrincipal extends javax.swing.JPanel {

 
    public PanelPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtFoto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();
        lblImagen = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Entrada"));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        txtNombres.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombres"));
        jPanel1.add(txtNombres);

        txtApellidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellidos"));
        jPanel1.add(txtApellidos);

        txtEdad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edad"));
        jPanel1.add(txtEdad);

        txtPeso.setBorder(javax.swing.BorderFactory.createTitledBorder("Peso"));
        jPanel1.add(txtPeso);

        txtDNI.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));
        jPanel1.add(txtDNI);

        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("E-Mail"));
        jPanel1.add(txtEmail);

        txtFoto.setBorder(javax.swing.BorderFactory.createTitledBorder("Foto"));
        txtFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFotoActionPerformed(evt);
            }
        });
        jPanel1.add(txtFoto);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Procesos"));

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

        jPanel3.setLayout(new java.awt.GridLayout(1, 2));

        txtSalida.setEditable(false);
        txtSalida.setColumns(20);
        txtSalida.setRows(5);
        txtSalida.setBorder(javax.swing.BorderFactory.createTitledBorder("Salida"));
        jScrollPane1.setViewportView(txtSalida);

        jPanel3.add(jScrollPane1);

        lblImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Foto"));
        jPanel3.add(lblImagen);

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
      
        PersonaH nuevo = new PersonaH (leeNombres(), leeApellidos(), leePeso(), leeEdad(), leeDNI(), leeEmail(), leeFoto());
        lista(nuevo);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
    
        txtSalida.setText(" ");
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void txtFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFotoActionPerformed

    private String leeNombres(){ return txtNombres.getText();}
    private String leeApellidos() { return txtApellidos.getText();}
    private double leePeso() { return Double.parseDouble(txtPeso.getText());}
    private int leeEdad() { return Integer.parseInt(txtEdad.getText());}
    private String leeDNI() { return txtDNI.getText();}
    private String leeEmail() { return txtEmail.getText();}
    private String leeFoto() { return txtFoto.getText() ;}


    // METODO IMPRIME : LO QUE IMPRIME EN LA PANTALLA
    private void imprime(String s){
        txtSalida.append(s+"\n");
    }

  private void lista(PersonaH p){
        imprime("Nombres\t:"+p.getNombres());
        imprime("Apellidos\t:"+p.getApellidos());
        imprime("Edad\t:"+p.getEdad());
        imprime("Peso\t:"+p.getPeso());
        imprime("-----datos del hijo");
        imprime("DNI\t:"+p.getDni());
        imprime("Email\t:"+p.getEmail());
        imprime("Foto\t:"+p.getFoto());
        lblImagen.setIcon(new ImageIcon(getClass().getResource("/fotos/"+p.getFoto())));    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFoto;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextArea txtSalida;
    // End of variables declaration//GEN-END:variables

}
