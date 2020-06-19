/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.ControladoMenuPrincipal;
import Vista.MenuPrincipal;
import Vista.VistaLogin;
import Vista.barradeprogreso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Ivan_
 */
public class ModeloLogin {

    Statement st;
    ResultSet rs;

    barradeprogreso vistabarra = new barradeprogreso();

    private Timer t;
    private ActionListener ac;
    private int n;

    private String usuario;
    private String password;

    VistaLogin vista;

    public ModeloLogin(VistaLogin vista) {
        this.vista = vista;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login() {

        String sql = "select * from usuarios where usu_nick='" + usuario + "' and usu_clave='" + password + "';";

        try {

            st = Utilidades.Conexion.sta(st);
            rs = st.executeQuery(sql);
            rs.next();
            if (rs.getRow() == 0) {

                JOptionPane.showMessageDialog(null, "datos erroneos");
            } else {

                vistabarra.setVisible(true);
                vista.setVisible(false);

                if (rs.getString("usu_estado").equals("ACTIVO")) {

                    Thread t = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            int i = 0;
                            while (i < 105) {
                                vistabarra.jProgressBar1.setValue(i);
                                try {
                                    Thread.sleep(20);
                                    i++;
                                } catch (InterruptedException ex) {

                                }

                                if (i == 2) {
                                    vistabarra.jLabel1.setText("iniciando...");
                                }
                                if (i == 20) {
                                    vistabarra.jLabel1.setText("cargando recursos...");
                                }
                                if (i == 40) {

                                    vistabarra.jLabel1.setText("validando acceso...");
                                }
                                if (i == 60) {

                                    vistabarra.jLabel1.setText("comprobando conexion a base de datos...");
                                }
                                if (i == 80) {

                                    vistabarra.jLabel1.setText("abriendo formulario...");
                                }
                                if (i == 100) {
                                    MenuPrincipal vistam = new MenuPrincipal();
                                    ModeloMenuPrincipal modelom = new ModeloMenuPrincipal(vistam);
                                    ControladoMenuPrincipal controlador = new ControladoMenuPrincipal(vistam, modelom);

                                    try {
                                        String titulo=rs.getString("usu_nick").toString()+" :  "+ rs.getString("usu_tipo").toString();
                                        vistam.setTitle(titulo);
                                    } catch (SQLException ex) {
                                        Logger.getLogger(ModeloLogin.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    vistabarra.setVisible(false);
                                    vistam.setExtendedState(MenuPrincipal.MAXIMIZED_BOTH);
                                    vistam.setVisible(true);
                                }
                            }

                        }
                    });
                    t.start();

                }
            }

        } catch (Exception e) {
            if (st == null) {
                JOptionPane.showMessageDialog(null, "No hay conexion a la base de datos");
            }
            System.out.println(e);
        }
    }
    
    public void cerrar(){
        System.exit(0);
    }
    public void ocultar(){
    }
        
  
    

}
