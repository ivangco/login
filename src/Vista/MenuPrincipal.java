/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Ivan_
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Menu1 = new javax.swing.JMenu();
        Menuclientes = new javax.swing.JMenuItem();
        Menuusuarios = new javax.swing.JMenuItem();
        Menufncionarios = new javax.swing.JMenuItem();
        Menu2 = new javax.swing.JMenu();
        Menuproductos = new javax.swing.JMenuItem();
        Menuproveedores = new javax.swing.JMenuItem();
        Menu3 = new javax.swing.JMenu();
        Menuciudades = new javax.swing.JMenuItem();
        Menu4 = new javax.swing.JMenu();
        Menubancos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Menupedidocompra = new javax.swing.JMenuItem();
        Menuordencompra = new javax.swing.JMenuItem();
        Menufacturacompra = new javax.swing.JMenuItem();
        MenusolicitudDebolucion = new javax.swing.JMenuItem();
        Menunotapedidocompra = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Menupresupuesto = new javax.swing.JMenuItem();
        menupedido = new javax.swing.JMenuItem();
        Menufacturaventa = new javax.swing.JMenuItem();
        menunotacredito = new javax.swing.JMenuItem();
        jmfactura = new javax.swing.JMenu();
        Menu5 = new javax.swing.JMenu();
        Menuclientes1 = new javax.swing.JMenuItem();
        Menuusuarios1 = new javax.swing.JMenuItem();
        Menufncionarios1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(191, 191, 191));
        jPanel1.setForeground(new java.awt.Color(254, 254, 254));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMaximumSize(new java.awt.Dimension(200, 32767));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/WhatsApp Image 2020-06-06 at 06.35.51 (3).jpeg"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.setInheritsPopupMenu(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel6);

        jMenuBar1.setBackground(new java.awt.Color(254, 254, 254));
        jMenuBar1.setForeground(new java.awt.Color(1, 1, 1));

        jMenu1.setBackground(new java.awt.Color(254, 254, 254));
        jMenu1.setForeground(new java.awt.Color(1, 1, 1));
        jMenu1.setText("Archivo");

        Menu1.setBackground(new java.awt.Color(254, 254, 254));
        Menu1.setForeground(new java.awt.Color(1, 1, 1));
        Menu1.setText("Personas");

        Menuclientes.setBackground(new java.awt.Color(254, 254, 254));
        Menuclientes.setForeground(new java.awt.Color(1, 1, 1));
        Menuclientes.setText("Clientes");
        Menuclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuclientesActionPerformed(evt);
            }
        });
        Menu1.add(Menuclientes);

        Menuusuarios.setBackground(new java.awt.Color(254, 254, 254));
        Menuusuarios.setForeground(new java.awt.Color(1, 1, 1));
        Menuusuarios.setText("Usuarios");
        Menu1.add(Menuusuarios);

        Menufncionarios.setBackground(new java.awt.Color(254, 254, 254));
        Menufncionarios.setForeground(new java.awt.Color(1, 1, 1));
        Menufncionarios.setText("funcionarios");
        Menu1.add(Menufncionarios);

        jMenu1.add(Menu1);

        Menu2.setBackground(new java.awt.Color(254, 254, 254));
        Menu2.setForeground(new java.awt.Color(1, 1, 1));
        Menu2.setText("Provedores");

        Menuproductos.setBackground(new java.awt.Color(254, 254, 254));
        Menuproductos.setForeground(new java.awt.Color(1, 1, 1));
        Menuproductos.setText("Productos");
        Menu2.add(Menuproductos);

        Menuproveedores.setBackground(new java.awt.Color(254, 254, 254));
        Menuproveedores.setForeground(new java.awt.Color(1, 1, 1));
        Menuproveedores.setText("Proveedores");
        Menu2.add(Menuproveedores);

        jMenu1.add(Menu2);

        Menu3.setBackground(new java.awt.Color(254, 254, 254));
        Menu3.setForeground(new java.awt.Color(1, 1, 1));
        Menu3.setText("Zonas");

        Menuciudades.setBackground(new java.awt.Color(254, 254, 254));
        Menuciudades.setForeground(new java.awt.Color(1, 1, 1));
        Menuciudades.setText("Ciudades");
        Menu3.add(Menuciudades);

        jMenu1.add(Menu3);

        Menu4.setBackground(new java.awt.Color(254, 254, 254));
        Menu4.setForeground(new java.awt.Color(1, 1, 1));
        Menu4.setText("Utilidades");

        Menubancos.setBackground(new java.awt.Color(254, 254, 254));
        Menubancos.setForeground(new java.awt.Color(1, 1, 1));
        Menubancos.setText("Bancos");
        Menu4.add(Menubancos);

        jMenu1.add(Menu4);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(254, 254, 254));
        jMenu2.setForeground(new java.awt.Color(1, 1, 1));
        jMenu2.setText("Compras");

        Menupedidocompra.setBackground(new java.awt.Color(254, 254, 254));
        Menupedidocompra.setForeground(new java.awt.Color(1, 1, 1));
        Menupedidocompra.setText("Pedido");
        jMenu2.add(Menupedidocompra);

        Menuordencompra.setBackground(new java.awt.Color(254, 254, 254));
        Menuordencompra.setForeground(new java.awt.Color(1, 1, 1));
        Menuordencompra.setText("Orden");
        jMenu2.add(Menuordencompra);

        Menufacturacompra.setBackground(new java.awt.Color(254, 254, 254));
        Menufacturacompra.setForeground(new java.awt.Color(1, 1, 1));
        Menufacturacompra.setText("Factura");
        jMenu2.add(Menufacturacompra);

        MenusolicitudDebolucion.setBackground(new java.awt.Color(254, 254, 254));
        MenusolicitudDebolucion.setForeground(new java.awt.Color(1, 1, 1));
        MenusolicitudDebolucion.setText("Solicitud/Devolucion");
        jMenu2.add(MenusolicitudDebolucion);

        Menunotapedidocompra.setBackground(new java.awt.Color(254, 254, 254));
        Menunotapedidocompra.setForeground(new java.awt.Color(1, 1, 1));
        Menunotapedidocompra.setText("Nota Pedido");
        jMenu2.add(Menunotapedidocompra);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(254, 254, 254));
        jMenu3.setForeground(new java.awt.Color(1, 1, 1));
        jMenu3.setText("Ventas");

        Menupresupuesto.setBackground(new java.awt.Color(254, 254, 254));
        Menupresupuesto.setForeground(new java.awt.Color(1, 1, 1));
        Menupresupuesto.setText("Presupuesto");
        jMenu3.add(Menupresupuesto);

        menupedido.setBackground(new java.awt.Color(254, 254, 254));
        menupedido.setForeground(new java.awt.Color(1, 1, 1));
        menupedido.setText("Pedido");
        jMenu3.add(menupedido);

        Menufacturaventa.setBackground(new java.awt.Color(254, 254, 254));
        Menufacturaventa.setForeground(new java.awt.Color(1, 1, 1));
        Menufacturaventa.setText("Factura");
        jMenu3.add(Menufacturaventa);

        menunotacredito.setBackground(new java.awt.Color(254, 254, 254));
        menunotacredito.setForeground(new java.awt.Color(1, 1, 1));
        menunotacredito.setText("Nota Credito");
        jMenu3.add(menunotacredito);

        jMenuBar1.add(jMenu3);

        jmfactura.setBackground(new java.awt.Color(254, 254, 254));
        jmfactura.setForeground(new java.awt.Color(1, 1, 1));
        jmfactura.setText("Tesoreria");

        Menu5.setBackground(new java.awt.Color(254, 254, 254));
        Menu5.setForeground(new java.awt.Color(1, 1, 1));
        Menu5.setText("Caja");

        Menuclientes1.setBackground(new java.awt.Color(254, 254, 254));
        Menuclientes1.setForeground(new java.awt.Color(1, 1, 1));
        Menuclientes1.setText("Apertura");
        Menuclientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menuclientes1ActionPerformed(evt);
            }
        });
        Menu5.add(Menuclientes1);

        Menuusuarios1.setBackground(new java.awt.Color(254, 254, 254));
        Menuusuarios1.setForeground(new java.awt.Color(1, 1, 1));
        Menuusuarios1.setText("Cierre");
        Menu5.add(Menuusuarios1);

        Menufncionarios1.setBackground(new java.awt.Color(254, 254, 254));
        Menufncionarios1.setForeground(new java.awt.Color(1, 1, 1));
        Menufncionarios1.setText("Funciones");
        Menu5.add(Menufncionarios1);

        jmfactura.add(Menu5);

        jMenuBar1.add(jmfactura);

        jMenu5.setBackground(new java.awt.Color(254, 254, 254));
        jMenu5.setForeground(new java.awt.Color(1, 1, 1));
        jMenu5.setText("Inventario");

        jMenuItem19.setBackground(new java.awt.Color(254, 254, 254));
        jMenuItem19.setForeground(new java.awt.Color(1, 1, 1));
        jMenuItem19.setText("Ajuste");
        jMenu5.add(jMenuItem19);

        jMenuItem20.setBackground(new java.awt.Color(254, 254, 254));
        jMenuItem20.setForeground(new java.awt.Color(1, 1, 1));
        jMenuItem20.setText("Transferencias");
        jMenu5.add(jMenuItem20);

        jMenuItem21.setBackground(new java.awt.Color(254, 254, 254));
        jMenuItem21.setForeground(new java.awt.Color(1, 1, 1));
        jMenuItem21.setText("Conciliaciones");
        jMenu5.add(jMenuItem21);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuclientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuclientesActionPerformed

    private void Menuclientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menuclientes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menuclientes1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenu Menu1;
    public javax.swing.JMenu Menu2;
    public javax.swing.JMenu Menu3;
    public javax.swing.JMenu Menu4;
    public javax.swing.JMenu Menu5;
    public javax.swing.JMenuItem Menubancos;
    public javax.swing.JMenuItem Menuciudades;
    public javax.swing.JMenuItem Menuclientes;
    public javax.swing.JMenuItem Menuclientes1;
    public javax.swing.JMenuItem Menufacturacompra;
    public javax.swing.JMenuItem Menufacturaventa;
    public javax.swing.JMenuItem Menufncionarios;
    public javax.swing.JMenuItem Menufncionarios1;
    public javax.swing.JMenuItem Menunotapedidocompra;
    public javax.swing.JMenuItem Menuordencompra;
    public javax.swing.JMenuItem Menupedidocompra;
    public javax.swing.JMenuItem Menupresupuesto;
    public javax.swing.JMenuItem Menuproductos;
    public javax.swing.JMenuItem Menuproveedores;
    public javax.swing.JMenuItem MenusolicitudDebolucion;
    public javax.swing.JMenuItem Menuusuarios;
    public javax.swing.JMenuItem Menuusuarios1;
    private javax.swing.JButton jButton3;
    public javax.swing.JMenu jMenu1;
    public javax.swing.JMenu jMenu2;
    public javax.swing.JMenu jMenu3;
    public javax.swing.JMenu jMenu5;
    public javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem jMenuItem19;
    public javax.swing.JMenuItem jMenuItem20;
    public javax.swing.JMenuItem jMenuItem21;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel6;
    public javax.swing.JMenu jmfactura;
    public javax.swing.JMenuItem menunotacredito;
    public javax.swing.JMenuItem menupedido;
    // End of variables declaration//GEN-END:variables

   
}
