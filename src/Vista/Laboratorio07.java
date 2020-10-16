package Vista;

import Control.ListaCircular;
import Control.Proceso;
import Modelo.Empleados;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Laboratorio07 extends javax.swing.JFrame {

    ListaCircular listaCircular = new ListaCircular();
    Proceso p = new Proceso();
    Empleados objEmp;
    
    DefaultTableModel modelo = new DefaultTableModel();

    public Laboratorio07() {
        initComponents();
        this.setLocationRelativeTo(null);
        TablaEmpresaEmpleados.setModel(modelo);
        DatosTabla();
        cargar();
    }

    public void DatosTabla() {
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido Paterno");
        modelo.addColumn("Apellido Materno");
        modelo.addColumn("Estado Civil");
        modelo.addColumn("Sueldo Base");
        modelo.addColumn("DNI");
        modelo.addColumn("Ventas Realizadas");
        modelo.addColumn("Nª Hijos");
        modelo.addColumn("Sueldo Neto");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtsueldoB = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellidom = new javax.swing.JTextField();
        txtapellidop = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txthijos = new javax.swing.JTextField();
        txtventas = new javax.swing.JTextField();
        cboestadocivl = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnActualizar2 = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEmpresaEmpleados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        jLabel2.setText("Apellido materno");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        jLabel3.setText("DNI");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        jLabel4.setText("Estado civil");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, -1));

        jLabel5.setText("Nª hijos");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, -1));

        jLabel6.setText("Ventas realizadas");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, -1, -1));

        jLabel7.setText("Sueldo base");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        jLabel8.setText("Apellido paterno");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));
        jPanel2.add(txtsueldoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 85, 35));
        jPanel2.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 150, 35));
        jPanel2.add(txtapellidom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 150, 35));
        jPanel2.add(txtapellidop, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 150, 35));
        jPanel2.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 85, 35));
        jPanel2.add(txthijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 85, 35));
        jPanel2.add(txtventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 85, 35));

        cboestadocivl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "SOLTERO", "CASADO", "HIJOS" }));
        jPanel2.add(cboestadocivl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 170, 35));

        btnAgregar.setBackground(new java.awt.Color(0, 255, 255));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(51, 51, 51));
        btnAgregar.setText("Agregar");
        btnAgregar.setAutoscrolls(true);
        btnAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregar.setOpaque(true);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 100, 30));

        btnBuscar.setBackground(new java.awt.Color(0, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(51, 51, 51));
        btnBuscar.setText("Buscar");
        btnBuscar.setAutoscrolls(true);
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBuscar.setOpaque(true);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 80, 35));

        btnNuevo.setBackground(new java.awt.Color(0, 255, 255));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(51, 51, 51));
        btnNuevo.setText("Nuevo");
        btnNuevo.setAutoscrolls(true);
        btnNuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnNuevo.setBorderPainted(false);
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNuevo.setOpaque(true);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 60, 30));

        btnListar.setBackground(new java.awt.Color(0, 255, 255));
        btnListar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnListar.setForeground(new java.awt.Color(51, 51, 51));
        btnListar.setText("Listar");
        btnListar.setAutoscrolls(true);
        btnListar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnListar.setBorderPainted(false);
        btnListar.setContentAreaFilled(false);
        btnListar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnListar.setOpaque(true);
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        jPanel2.add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 100, 30));

        btnActualizar2.setBackground(new java.awt.Color(0, 255, 255));
        btnActualizar2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnActualizar2.setForeground(new java.awt.Color(51, 51, 51));
        btnActualizar2.setText("Actualizar");
        btnActualizar2.setAutoscrolls(true);
        btnActualizar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnActualizar2.setBorderPainted(false);
        btnActualizar2.setContentAreaFilled(false);
        btnActualizar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnActualizar2.setOpaque(true);
        btnActualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnActualizar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 100, 30));

        btnEliminar1.setBackground(new java.awt.Color(0, 255, 255));
        btnEliminar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminar1.setForeground(new java.awt.Color(51, 51, 51));
        btnEliminar1.setText("Eliminar");
        btnEliminar1.setAutoscrolls(true);
        btnEliminar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEliminar1.setBorderPainted(false);
        btnEliminar1.setContentAreaFilled(false);
        btnEliminar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEliminar1.setOpaque(true);
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 100, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 510));

        TablaEmpresaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaEmpresaEmpleados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Object[] fila = {txtnombre.getText(), txtapellidop.getText(), txtapellidom.getText(), cboestadocivl.getSelectedItem(),
            txtsueldoB.getText(), txtDni.getText(), txtventas.getText(), txthijos.getText()};
        objEmp = new Empleados(fila);
        listaCircular.insertar(objEmp);
        try {
            p.insertar(objEmp);
            listar();
            limpiar();
            JOptionPane.showMessageDialog(null, "Registrado con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al intentar registrar");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        listar();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        objEmp = listaCircular.buscar(txtDni.getText());
        if (objEmp != null) {
            txtnombre.setText(objEmp.getNombre());
            txtapellidop.setText(objEmp.getApaterno());
            txtapellidom.setText(objEmp.getAmaterno());
            switch (objEmp.getEcivil()) {
                case "SOLTERO":
                    cboestadocivl.setSelectedIndex(0);
                    break;
                case "CASADO":
                    cboestadocivl.setSelectedIndex(1);
                    break;
                case "HIJOS":
                    cboestadocivl.setSelectedIndex(2);
                    break;
            }
            txtsueldoB.setText(String.valueOf(objEmp.getSueldoBase()));
            txtventas.setText(String.valueOf(objEmp.getVRealizadas()));
            txthijos.setText(String.valueOf(objEmp.getNHijos()));

        } else {

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar2ActionPerformed
        Object[] fila = {txtnombre.getText(), txtapellidop.getText(), txtapellidom.getText(), cboestadocivl.getSelectedItem(),
            txtsueldoB.getText(), txtDni.getText(), txtventas.getText(), txthijos.getText()};
        objEmp = new Empleados(fila);

        if (listaCircular.actualizar(objEmp)) {
            JOptionPane.showMessageDialog(null, "Se actualizo correctamente");
            listar();
            limpiar();
            try {
                p.actualizar(listaCircular.listar());
            } catch (Exception e) {
            }
        }else{
            JOptionPane.showMessageDialog(null, "El dni" + txtDni.getText()+ "del cliente a actualizar no existe");
        }
    }//GEN-LAST:event_btnActualizar2ActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        if (listaCircular.eliminar(txtDni.getText())) {
            JOptionPane.showMessageDialog(null, "Se elimino correctamente");
            listar();
            limpiar();
            try {
                p.actualizar(listaCircular.listar());
            } catch (Exception e) {
            }
        }else{
            JOptionPane.showMessageDialog(null, "El DNI ingresado del cliente a eliminar no existe");
        }
    }//GEN-LAST:event_btnEliminar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Laboratorio07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Laboratorio07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Laboratorio07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Laboratorio07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Laboratorio07().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaEmpresaEmpleados;
    private javax.swing.JButton btnActualizar2;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cboestadocivl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtapellidom;
    private javax.swing.JTextField txtapellidop;
    private javax.swing.JTextField txthijos;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtsueldoB;
    private javax.swing.JTextField txtventas;
    // End of variables declaration//GEN-END:variables

    private void listar() {
        modelo.setRowCount(0);
        for (Empleados emp : listaCircular.listar()) {
            modelo.addRow(emp.getInfo());
        }
    }

    private void cargar() {
        modelo.setRowCount(0);
        try {
            p.leer();
            for (Empleados emp : p.lista) {
                modelo.addRow(emp.getInfo());
                listaCircular.insertar(emp);
            }
        } catch (Exception e) {
        }

    }

    private void limpiar() {
        txtnombre.setText("");
        txtapellidom.setText("");
        txtapellidop.setText("");
        txthijos.setText("");
        txtsueldoB.setText("");
        txtDni.setText("");
        txtventas.setText("");
        cboestadocivl.setSelectedIndex(0);
        txtnombre.requestFocus();
    }
}
