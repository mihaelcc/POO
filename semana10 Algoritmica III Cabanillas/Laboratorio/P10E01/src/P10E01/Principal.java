package P10E01;

import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    protected ArregloTVH atvh;

    public Principal() {
        initComponents();
        atvh = new ArregloTVH();
        setSize(535, 300);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtserie = new javax.swing.JTextField();
        cbomarca = new javax.swing.JComboBox();
        txtpulgadas = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        cboorigen = new javax.swing.JComboBox();
        cbotecnologia = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        btnnuevo = new javax.swing.JButton();
        btnlista = new javax.swing.JButton();
        btnconsulta = new javax.swing.JButton();
        btnelimina = new javax.swing.JButton();
        btnreporte = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtsalida = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        txtserie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtserie.setBorder(javax.swing.BorderFactory.createTitledBorder("Serie"));
        jPanel1.add(txtserie);

        cbomarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Marca:", "Sony", "LG", "Samsung", "Panasonic" }));
        jPanel1.add(cbomarca);

        txtpulgadas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpulgadas.setBorder(javax.swing.BorderFactory.createTitledBorder("Pulgadas"));
        jPanel1.add(txtpulgadas);

        txtprecio.setBorder(javax.swing.BorderFactory.createTitledBorder("PrecioUS$"));
        jPanel1.add(txtprecio);

        cboorigen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Origen:", "Nacional", "Americano", "Japones", "Koreano", "Chino", "Otro" }));
        jPanel1.add(cboorigen);

        cbotecnologia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tecnologia:", "Tradicional", "LCD", "Plasma", "Digital" }));
        jPanel1.add(cbotecnologia);

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

        txtsalida.setColumns(20);
        txtsalida.setRows(5);
        jScrollPane1.setViewportView(txtsalida);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        TVH t = atvh.busca(leeserie());
        if (t != null) {
            JOptionPane.showMessageDialog(this, "Serie repetida");
        } else {
            atvh.agrega(leeserie(), leemarca(), leepulgadas(), leeprecio(), leeorigen(), leetecnologia());
            lista();
        }
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        txtsalida.setText("");
        txtserie.setText("");
        cbomarca.setSelectedIndex(0);
        txtpulgadas.setText("");
        txtprecio.setText("");
        cboorigen.setSelectedIndex(0);
        cbotecnologia.setSelectedIndex(0);
        txtserie.requestFocus();
    }//GEN-LAST:event_btnborrarActionPerformed

    private void btnlistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistaActionPerformed
        if (atvh.getN() == 0) {
            mensaje("arreglo vacio!!!");
        } else {
            lista();
        }
    }//GEN-LAST:event_btnlistaActionPerformed

    private void btnconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultaActionPerformed
        TVH t = atvh.busca(leeserie());
        if (t == null) {
            mensaje("Nro.Serie no registrado!!!");
        } else {
            txtsalida.setText("");
            lista(t);
        }
    }//GEN-LAST:event_btnconsultaActionPerformed

    private void btneliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminaActionPerformed
        TVH t = atvh.busca(leeserie());
        if (t == null) {
            mensaje("Nro.Serie no registrado!!!");
        } else {
            atvh.elimina(t);
            txtsalida.setText("");
            lista(t);
        }
    }//GEN-LAST:event_btneliminaActionPerformed

    private void btnreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreporteActionPerformed
         txtsalida.setText("");
        imprime("-----------------------------------------------------");
        imprime("Menor Precio US$: " + atvh.menorPrecio());
        imprime("Mayor Precio US$: " + atvh.mayorPrecio());
        imprime("Precio Promedio US$: " + atvh.precioPromedio());
        imprime("-----------------------------------------------------");
        imprime("Menor Precio S/.: " + (atvh.menorPrecio() * 2.85));
        imprime("Mayor Precio S/.: " + (atvh.mayorPrecio() * 2.85));
        imprime("Precio Promedio S/.: " + (atvh.precioPromedio() * 2.85));
        imprime("-----------------------------------------------------");
    }//GEN-LAST:event_btnreporteActionPerformed
    public String leeserie() {
        return txtserie.getText();
    }

    public int leemarca() {
        return cbomarca.getSelectedIndex();
    }

    public int leepulgadas() {
        return Integer.parseInt(txtpulgadas.getText());
    }

    public double leeprecio() {
        return Double.parseDouble(txtprecio.getText());
    }

    public int leeorigen() {
        return cboorigen.getSelectedIndex();
    }

    public int leetecnologia() {
        return cbotecnologia.getSelectedIndex();
    }

    private void imprime(String s) {
        txtsalida.append(s + "\n");
    }

    public void mensaje(String s) {
        JOptionPane.showMessageDialog(this, s);
    }

    public void lista() {
        txtsalida.setText("Serie\tMarca\tPulgadas\tPrecio US$\tPrecio S/.\tOrigen\tTecnologia\n");
        for (int i = 0; i < atvh.getN(); i++) {
            TVH t = atvh.getTVH(i);
            imprime(t.getSerie() + "\t"
                    + t.nombremarca() + "\t"
                    + t.getPulgadas() + "\t"
                    + t.getPrecio() + "\t"
                    + ((t.getPrecio()) * 2.85) + "\t"
                    + t.nombreorigen() + "\t"
                    + t.nombretecnologia());
        }
    }

    public void lista(TVH t) {
        imprime("Nro.Serie\t:" + t.getSerie());
        imprime("Marca\t:" + t.nombremarca());
        imprime("Pulgadas\t:" + t.getPulgadas());
        imprime("Precio US$\t:" + t.getPrecio());
        imprime("Precio S/.\t:" + ((t.getPrecio()) * 2.85));
        imprime("Origen\t:" + t.nombreorigen());
        imprime("Tecnologia\t:" + t.nombretecnologia());
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Principal().setVisible(true);
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
    private javax.swing.JComboBox cbomarca;
    private javax.swing.JComboBox cboorigen;
    private javax.swing.JComboBox cbotecnologia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtpulgadas;
    private javax.swing.JTextArea txtsalida;
    private javax.swing.JTextField txtserie;
    // End of variables declaration//GEN-END:variables
}
