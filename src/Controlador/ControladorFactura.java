/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloFactura;
import Vista.Factura;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

/**
 *
 * @author ivan
 */
public class ControladorFactura implements ActionListener, KeyListener {

    Factura vista;
    ModeloFactura modelo;

    public ControladorFactura(Factura vista, ModeloFactura modelo) {
        this.vista = vista;
        this.modelo = modelo;

        vista.btnbuscarcliente.addActionListener(this);
        vista.txtbuscarclliente.addKeyListener(this);
        vista.txtbuscarproducto.addKeyListener(this);
        vista.btnaceptarbscliente.addActionListener(this);
        vista.txtcodigoproducto.addActionListener(this);
        vista.btnaceptarproducto.addActionListener(this);
        vista.btnaumentarcantidad.addActionListener(this);
        vista.btndisminuircantidad.addActionListener(this);
        vista.btnnuevo.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object p = e.getSource();
        
        if (p.equals(vista.btnnuevo)) {
            modelo.desbloquear();
            vista.txtnumerofactura.requestFocus();
            
        }
        
        if (p.equals(vista.btnbuscarcliente)) {
            modelo.llamarbuscadorcliente();
            modelo.cargarcliente("");
        }

        if (p.equals(vista.btnaceptarbscliente)) {
            modelo.enviarcliente();
        }

        if (p.equals(vista.txtcodigoproducto)) {
            if (vista.txtcodigoproducto.getText().equals("")) {
                modelo.llamarbuscadorproducto();
                modelo.cargarproducto("");
            } else {
                modelo.buscarproductocodigo(vista.txtcodigoproducto.getText());
            }
        }

        if (p.equals(vista.btnaceptarproducto)) {
            modelo.trnsferirproducto();
        }
        if (p.equals(vista.btnaumentarcantidad)) {
            try {
                modelo.cargargrilla(vista.txtcodigoproducto.getText());
                modelo.totales();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(vista, "CAMPO VACIO");
            }
            
            
            

        }
        if (p.equals(vista.btndisminuircantidad)) {
              try {
            modelo.eliminaritem(vista.tblfacturaventa.getSelectedRow());
            modelo.totales();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(vista, "CAMPO VACIO");
            }
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        Object p = e.getSource();

        if (p.equals(vista.txtbuscarclliente)) {
            modelo.cargarcliente(vista.txtbuscarclliente.getText());
        }
        if (p.equals(vista.txtbuscarproducto)) {
            modelo.cargarproducto(vista.txtbuscarproducto.getText());
        }
    }

}
