package P12E02;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PanelPrincipal extends javax.swing.JFrame {

    protected ArchivoPersonasH aph;

    public PanelPrincipal() {
        initComponents();
        aph = new ArchivoPersonasH("personas.txt");
        setSize(637, 311);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtdni = new javax.swing.JTextField();
        txtnombres = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtpeso = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtfoto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnnuevo = new javax.swing.JButton();
        btnlista = new javax.swing.JButton();
        btnconsulta = new javax.swing.JButton();
        btnelimina = new javax.swing.JButton();
        btnreporte = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblImagen = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtsalida = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        txtdni.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));
        jPanel1.add(txtdni);

        txtnombres.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombres"));
        jPanel1.add(txtnombres);

        txtapellidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellidos"));
        jPanel1.add(txtapellidos);

        txtedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edad"));
        jPanel1.add(txtedad);

        txtpeso.setBorder(javax.swing.BorderFactory.createTitledBorder("Peso"));
        jPanel1.add(txtpeso);

        txtemail.setBorder(javax.swing.BorderFactory.createTitledBorder("Email"));
        jPanel1.add(txtemail);

        txtfoto.setBorder(javax.swing.BorderFactory.createTitledBorder("Foto"));
        jPanel1.add(txtfoto);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnnuevo);

        btnlista.setText("Lista");
        btnlista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistaActionPerformed(evt);
            }
        });
        jPanel2.add(btnlista);

        btnconsulta.setText("Consulta");
        btnconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultaActionPerformed(evt);
            }
        });
        jPanel2.add(btnconsulta);

        btnelimina.setText("Elimina");
        btnelimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminaActionPerformed(evt);
            }
        });
        jPanel2.add(btnelimina);

        btnreporte.setText("Reporte");
        btnreporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreporteActionPerformed(evt);
            }
        });
        jPanel2.add(btnreporte);

        btnborrar.setText("Borrar");
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnborrar);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jScrollPane1.setViewportView(lblImagen);

        txtsalida.setColumns(20);
        txtsalida.setRows(5);
        jScrollPane2.setViewportView(txtsalida);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        txtsalida.setText("");
        txtdni.setText("");
        txtnombres.setText("");
        txtapellidos.setText("");
        txtedad.setText("");
        txtpeso.setText("");
        txtemail.setText("");
        txtfoto.setText("");
        txtdni.requestFocus();
        lblImagen.setIcon(null);
    }//GEN-LAST:event_btnborrarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        PersonaH t = aph.busca(leedni());
        if (t != null) {
            mensaje("DNI repetida");
        } else {
            aph.agrega(leedni(), leenombres(), leeapellidos(), leeedad(), leepeso(), leeemail(), leefoto());
            lista();
            aph.graba();
        }
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnlistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistaActionPerformed
        if (aph.getN() == 0) {
            mensaje("arreglo vacio!!!");
        } else {
            lista();
        }
    }//GEN-LAST:event_btnlistaActionPerformed

    private void btnconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultaActionPerformed
        txtsalida.setText("");
        PersonaH t = aph.busca(leedni());
        if (t == null) {
            mensaje("DNI no registrado!!!");
        } else {
            lista(t);
        }
    }//GEN-LAST:event_btnconsultaActionPerformed

    private void btneliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminaActionPerformed
        txtsalida.setText("");
        PersonaH t = aph.busca(leedni());
        if (t == null) {
            mensaje("DNI no registrado!!!");
        } else {
            aph.elimina(t);
            lista();
            aph.graba();
        }
    }//GEN-LAST:event_btneliminaActionPerformed

    private void btnreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreporteActionPerformed
        txtsalida.setText("");
        lista();
        imprime("-----------------------------------------------------");
        imprime("Menor Peso: " + aph.menorPeso());
        imprime("Mayor Peso: " + aph.mayorPeso());
        imprime("Peso Promedio: " + aph.pesoPromedio());
        imprime("-----------------------------------------------------");
    }//GEN-LAST:event_btnreporteActionPerformed
    public String leedni() {
        return txtdni.getText();
    }

    public String leenombres() {
        return txtnombres.getText();
    }

    public String leeapellidos() {
        return txtapellidos.getText();
    }

    public int leeedad() {
        return Integer.parseInt(txtedad.getText());
    }

    public double leepeso() {
        return Double.parseDouble(txtpeso.getText());
    }

    public String leeemail() {
        return txtemail.getText();
    }

    public String leefoto() {
        return txtfoto.getText();
    }

    public void imprime(String s) {
        txtsalida.append(s + "\n");
    }

    public void mensaje(String s) {
        JOptionPane.showMessageDialog(this, s);
    }

    public void lista() {
        txtsalida.setText("DNI\tNombres\tApellidos\tEdad\tPeso\tEmail\t\tFoto\n");
        for (int i = 0; i < aph.getN(); i++) {
            PersonaH t = aph.getPersonaH(i);
            imprime(t.getDni() + "\t"
                    + t.getNombres() + "\t"
                    + t.getApellidos() + "\t"
                    + t.getEdad() + "\t"
                    + t.getPeso() + "\t"
                    + t.getEmail() + "\t\t"
                    + t.getFoto());
        }
        imprime("hay " + aph.getN() + " personas.");
    }

    private void lista(PersonaH p) {
        imprime("----------------------------------");
        imprime("DNI\t:" + p.getDni());
        imprime("Nombres\t:" + p.getNombres());
        imprime("Apellidos\t:" + p.getApellidos());
        imprime("Edad\t:" + p.getEdad());
        imprime("Peso\t:" + p.getPeso());
        imprime("Email\t:" + p.getEmail());
        imprime("Foto\t:" + p.getFoto());
        lblImagen.setIcon(new ImageIcon(getClass().getResource("/fotos/" + p.getFoto())));
        imprime("----------------------------------");
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
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btnconsulta;
    private javax.swing.JButton btnelimina;
    private javax.swing.JButton btnlista;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnreporte;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfoto;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtpeso;
    private javax.swing.JTextArea txtsalida;
    // End of variables declaration//GEN-END:variables
}
