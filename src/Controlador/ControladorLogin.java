package Controlador;

import Modelo.ModeloLogin;
import Vista.VistaLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivan_
 */
public class ControladorLogin implements ActionListener{
    VistaLogin vista;
    ModeloLogin modelo;

    public ControladorLogin(VistaLogin vista, ModeloLogin modelo) {
        this.vista = vista;
        this.modelo = modelo;
        
        vista.btnacceder.addActionListener(this);
        vista.btncerrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object p = e.getSource();
        
        
        
        if(p.equals(vista.btnacceder)){
            modelo.setUsuario(vista.txtususario.getText());
            modelo.setPassword(vista.txtpassword.getText());
            
            modelo.login();
        }
        if(p.equals(vista.barraestado)){
            modelo.setUsuario(vista.txtususario.getText());
            modelo.setPassword(vista.txtpassword.getText());
            
            modelo.cerrar();
        }
            
    }
    
    
}
