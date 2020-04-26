package P12E01;

import javax.swing.JOptionPane;

public class PanelPrincipal extends javax.swing.JFrame {

    protected ArchivoTVH atvh;

    public PanelPrincipal() {
        initComponents();
        atvh = new ArchivoTVH("televisores.txt");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtSerie = new javax.swing.JTextField();
        cboMarca = new javax.swing.JComboBox();
        txtTamaño = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        cboOrigen = new javax.swing.JComboBox();
        cboTecnologia = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnLista = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();
        btnElimina = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        btnborra = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrada"));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        txtSerie.setBorder(javax.swing.BorderFactory.createTitledBorder("Serie"));
        jPanel1.add(txtSerie);

        cboMarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Marca", "Sony", "LG", "Samsung", "Panasonic", "otros" }));
        jPanel1.add(cboMarca);

        txtTamaño.setBorder(javax.swing.BorderFactory.createTitledBorder("Tamaño"));
        jPanel1.add(txtTamaño);

        txtPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio US$"));
        jPanel1.add(txtPrecio);

        cboOrigen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Origen", "Nacional", "Americano", "Japonés", "Koreano", "Chino", "Otro" }));
        jPanel1.add(cboOrigen);

        cboTecnologia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tecnologia", "Tradicional", "LCD", "Plasma", "Digital" }));
        jPanel1.add(cboTecnologia);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Proceso"));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevo);

        btnLista.setText("Lista");
        btnLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActionPerformed(evt);
            }
        });
        jPanel2.add(btnLista);

        btnConsulta.setText("Consulta");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });
        jPanel2.add(btnConsulta);

        btnElimina.setText("Elimina");
        btnElimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaActionPerformed(evt);
            }
        });
        jPanel2.add(btnElimina);

        btnReporte.setText("Reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        jPanel2.add(btnReporte);

        btnborra.setText("Borra");
        btnborra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborraActionPerformed(evt);
            }
        });
        jPanel2.add(btnborra);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Salida"));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        txtSalida.setColumns(20);
        txtSalida.setRows(5);
        jScrollPane1.setViewportView(txtSalida);

        jPanel3.add(jScrollPane1);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed


        TVH t = atvh.busca(leeSerie());
        if (t != null) {
            mensaje("Serie Repetida");
        } else {
            atvh.agrega(leeSerie(), leeMarca(), leeTamaño(), leePrecio(),
                    leeOrigen(), leeTecnologia());
            lista();
            atvh.graba();
        }



    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnborraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborraActionPerformed

        txtSerie.setText("");
        cboMarca.setSelectedIndex(0);
        txtTamaño.setText("");
        cboOrigen.setSelectedIndex(0);
        cboTecnologia.setSelectedIndex(0);
        txtSalida.setText("");
        txtPrecio.setText("");

    }//GEN-LAST:event_btnborraActionPerformed

    private void btnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActionPerformed
        if (atvh.getN() == 0) {
            mensaje("Arreglo vacio!!! ");
        } else {
            lista();
        }

    }//GEN-LAST:event_btnListaActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        // TODO add your handling code here:
        TVH t = atvh.busca(leeSerie());
        if (t == null) {
            mensaje("Nro. de serie no registrado!!");
        } else {
            lista(t);
        }

    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnEliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaActionPerformed
        // TODO add your handling code here:
        TVH t = atvh.busca(leeSerie());
        if (t == null) {
            mensaje("Nro. de serie no registrado!");
        } else {
            atvh.elimina(t);
            lista();
            atvh.graba();
        }
    }//GEN-LAST:event_btnEliminaActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        // TODO add your handling code here:

        imprime("menor precio: " + atvh.menorPrecio());
        imprime("precio promedio: " + atvh.precioPromedio());
        imprime("mayor precio: " + atvh.mayorPrecio());

    }//GEN-LAST:event_btnReporteActionPerformed

    public void mensaje(String s) {
        JOptionPane.showMessageDialog(this, s);

    }

    public String leeSerie() {
        return txtSerie.getText();

    }

    public int leeMarca() {
        return cboMarca.getSelectedIndex();
    }

    public int leeTamaño() {
        return Integer.parseInt(txtTamaño.getText());
    }

    public int leePrecio() {
        return Integer.parseInt(txtPrecio.getText());
    }

    public int leeOrigen() {
        return cboOrigen.getSelectedIndex();
    }

    public int leeTecnologia() {
        return cboTecnologia.getSelectedIndex();
    }

    public void lista(TVH t) {
        imprime("----------------------------------");
        imprime("Nro. Serie\t:" + t.getSerie());
        imprime("Marca\t:" + t.Nombremarca());
        imprime("Tamaño\t:" + t.getTamaño());
        imprime("Precio us$\t:" + t.getPrecio());
        imprime("Origen\t:" + t.nombreOrigen());
        imprime("Tecnologia\t:" + t.nombreTecnologia());
        imprime("----------------------------------");
    }

    public void lista() {
        txtSalida.setText("seria\tmarca\ttamaño\tprecio\torigen\ttecnologia\n");
        for (int i = 0; i < atvh.getN(); i++) {
            TVH t = atvh.getTVH(i);
            imprime(t.getSerie() + "\t" + t.Nombremarca() + "\t" + t.getTamaño() + "\t" + t.getPrecio() + "\t" + t.nombreOrigen() + "\t" + t.nombreTecnologia());

        }
        imprime("hay " + atvh.getN() + " objetos.");
    }

    private void imprime(String s) {
        txtSalida.append(s + "\n");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PanelPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnElimina;
    private javax.swing.JButton btnLista;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnborra;
    private javax.swing.JComboBox cboMarca;
    private javax.swing.JComboBox cboOrigen;
    private javax.swing.JComboBox cboTecnologia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextArea txtSalida;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtTamaño;
    // End of variables declaration//GEN-END:variables
}
