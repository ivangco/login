/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloMenuPrincipal;
import Vista.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;



/**
 *
 * @author ivan
 */
public class ControladoMenuPrincipal implements ActionListener{
    MenuPrincipal vista;
    ModeloMenuPrincipal modelo;

    public ControladoMenuPrincipal(MenuPrincipal vista, ModeloMenuPrincipal modelo) {
        this.vista = vista;
        this.modelo = modelo;
        
        vista.Menufacturaventa.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object p= e.getSource();
        
        if(p.equals(vista.Menufacturaventa)){
            modelo.abrirfacturacompra();
        }
    }

  
    
}
