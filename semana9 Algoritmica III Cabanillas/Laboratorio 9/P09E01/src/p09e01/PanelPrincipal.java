

package p09e01;


public class PanelPrincipal extends javax.swing.JPanel {


    public PanelPrincipal() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtSerie = new javax.swing.JTextField();
        cboMarca = new javax.swing.JComboBox();
        txtTamaño = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        cboOrigen = new javax.swing.JComboBox();
        cboTecnologia = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Entrada"));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        txtSerie.setBorder(javax.swing.BorderFactory.createTitledBorder("Serie"));
        txtSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerieActionPerformed(evt);
            }
        });
        jPanel1.add(txtSerie);

        cboMarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sony", "LG", "Samsung", "Panasonic", "Otro" }));
        cboMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("Marca"));
        cboMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMarcaActionPerformed(evt);
            }
        });
        jPanel1.add(cboMarca);

        txtTamaño.setBorder(javax.swing.BorderFactory.createTitledBorder("Tamaño en Pulgadas"));
        jPanel1.add(txtTamaño);

        txtPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio US$"));
        jPanel1.add(txtPrecio);

        cboOrigen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nacional", "Americano", "Japones", "Coreano", "Chino", "Otro" }));
        cboOrigen.setBorder(javax.swing.BorderFactory.createTitledBorder("Origen"));
        jPanel1.add(cboOrigen);

        cboTecnologia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tradicional", "LCD", "PLASMA", "DIGITAL" }));
        cboTecnologia.setBorder(javax.swing.BorderFactory.createTitledBorder("Tecnologia"));
        jPanel1.add(cboTecnologia);

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

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Salida"));

        txtSalida.setColumns(20);
        txtSalida.setRows(5);
        jScrollPane1.setViewportView(txtSalida);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void cboMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMarcaActionPerformed
      
    }//GEN-LAST:event_cboMarcaActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
    
     TVH nuevo = new TVH(leeSerie(),leeMarca(),leeTamaño(),leePrecio(), leeOrigen(), leeTecnologia());
        lista(nuevo);

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
    
        txtSalida.setText(" ");
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void txtSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerieActionPerformed

    private String leeSerie(){ return txtSerie.getText();}
    private int leeMarca() {return cboMarca.getSelectedIndex();}
    private int leeTamaño() { return Integer.parseInt(txtTamaño.getText());}
    private double leePrecio() { return Double.parseDouble(txtPrecio.getText());}
    private int leeOrigen() { return cboOrigen.getSelectedIndex();}
    private int leeTecnologia() { return cboTecnologia.getSelectedIndex();}

    // METODO IMPRIME : LO QUE IMPRIME EN LA PANTALLA
    private void imprime(String s){
        txtSalida.append(s+"\n");
    }

    private void lista(TVH t){
       imprime("Datos de la clase Padre-------------");
       imprime("Nro. Serie\t:"+t.getSerie());
       imprime("Marca\t:"+t.nombreMarca());
       imprime("Tamaño\t:"+t.getTamaño());
       imprime("Precio us$\t:"+t.getPrecio());
       imprime("Precio S/.\t:"+t.precioSoles(2.85));
       imprime("Datos de la clase Hija--------------");
      	imprime("Origen\t:"+t.nombreOrigen());
	imprime("Tecnologia\t:"+t.nombreTecnologia());
       imprime("----------------------------------");
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox cboMarca;
    private javax.swing.JComboBox cboOrigen;
    private javax.swing.JComboBox cboTecnologia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextArea txtSalida;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtTamaño;
    // End of variables declaration//GEN-END:variables

}
