/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.Factura;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.TableUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ivan
 */
public class ModeloFactura {

    Factura vista;

    DefaultTableModel tablacliente;
    DefaultTableModel tablaproducto;
    DefaultTableModel tabladetalle;

    public ModeloFactura(Factura vista) {
        this.vista = vista;
    }

    private String idfactura;
    private String numero;
    private String idcliente;
    private String fecha;
    private String estado;
    private String condicion;

    Statement st;
    ResultSet rs;

    public String getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(String idfactura) {
        this.idfactura = idfactura;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public void llamarbuscadorcliente() {
        disenotablacliente();
        vista.buscadorcliente.setSize(800, 400);
        vista.buscadorcliente.setVisible(true);
    }

    public void inicio() {

        tablacliente = (DefaultTableModel) vista.tblcliente.getModel();
        tablaproducto = (DefaultTableModel) vista.tblproducto.getModel();
        tabladetalle = (DefaultTableModel) vista.tblfacturaventa.getModel();
        bloquear();
        generarcod();
    }

    public void cargarcliente(String filtro) {
        String sql = "select * from cliente where cli_nombre like '" + filtro + "%'";
        tablacliente.setRowCount(0);
        try {
            st = Utilidades.Conexion.sta(st);
            rs = st.executeQuery(sql);
            while (rs.next()) {
                tablacliente.addRow(new Object[]{
                    rs.getString("idcliente"),
                    rs.getString("cli_nombre"),
                    rs.getString("cli_apellido"),
                    rs.getString("cli_ci"),
                    rs.getString("cli_ruc")
                });
            }
            vista.tblcliente.setModel(tablacliente);
            st.close();
            rs.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void enviarcliente() {

        try {
            int fila = vista.tblcliente.getSelectedRow();
            vista.txtidcliente.setText(vista.tblcliente.getValueAt(fila, 0).toString());
            vista.txtnombrecliente.setText(vista.tblcliente.getValueAt(fila, 1).toString());
            vista.txtapellidocliente.setText(vista.tblcliente.getValueAt(fila, 2).toString());
            vista.txtrucliente.setText(vista.tblcliente.getValueAt(fila, 4).toString());
            vista.buscadorcliente.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "SELECIONE UN CLIENTE");
        }

    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void disenotablacliente() {
        vista.tblcliente.getTableHeader().setBackground(Color.white);     // cambia el fondo del encabezado de la tabla
        vista.tblcliente.setGridColor(Color.white); //Cambiar el color del grid de la tabla
        vista.tblcliente.setSelectionBackground(Color.orange); //Color de la seleccion
        vista.tblcliente.setOpaque(false);
        vista.jScrollPane2.getViewport().setBackground(Color.white);
    }

    public void disenotablafactura() {
        vista.tblfacturaventa.getTableHeader().setBackground(Color.white);     // cambia el fondo del encabezado de la tabla
        vista.tblfacturaventa.setGridColor(Color.white); //Cambiar el color del grid de la tabla
        vista.tblfacturaventa.setSelectionBackground(Color.orange); //Color de la seleccion
        vista.tblfacturaventa.setOpaque(false);
        vista.jScrollPane1.getViewport().setBackground(Color.white);
    }
    // cambia el color de la letra del encabezado de la tabla

//tabla.getTableHeader().setForeground(Color.white);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void buscarproductocodigo(String filtro) {
        String sql = "select * from producto where  idproducto  like '" + filtro + "%'";
        try {
            st = Utilidades.Conexion.sta(st);
            rs = st.executeQuery(sql);
            rs.next();
            if (rs.getRow() == 0) {
                vista.lblnombreproducto.setText("PRODUCTO NO ENCONTRADO");
                vista.txtcodigoproducto.setText("");
                vista.txtcodigoproducto.requestFocus();
            } else {
                vista.lblnombreproducto.setText(rs.getString("pro_nombre"));
                vista.txtcantidadproducto.requestFocus();
            }
            st.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void llamarbuscadorproducto() {
        vista.buscadorproducto.setSize(800, 400);
        vista.buscadorproducto.setVisible(true);
    }

    public void cargarproducto(String filtro) {
        String sql = "select * from producto  where pro_nombre like '" + filtro + "%'";
        tablaproducto.setRowCount(0);
        try {
            st = Utilidades.Conexion.sta(st);
            rs = st.executeQuery(sql);
            while (rs.next()) {
                tablaproducto.addRow(new Object[]{
                    rs.getString("idproducto"),
                    rs.getString("pro_nombre"),
                    rs.getString("pro_precio"),
                    rs.getString("pro_cantidad"),
                    rs.getString("pro_iva")
                });
            }
            vista.tblproducto.setModel(tablaproducto);
            st.close();
            rs.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void trnsferirproducto() {
        try {

            int fila = vista.tblproducto.getSelectedRow();

            vista.txtcodigoproducto.setText(vista.tblproducto.getValueAt(fila, 0).toString());
            vista.lblnombreproducto.setText(vista.tblproducto.getValueAt(fila, 1).toString());
            vista.txtcantidadproducto.requestFocus();
            vista.buscadorproducto.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "SELECIONE UN PRODUCTO");

        }
    }

    public void cargargrilla(String codigo) {
        String sql = "select * from producto  where idproducto like '" + codigo + "%'";
        String nombre = "", iva = "";
        Integer pu = 0, cantdad = 0, sub = 0;
        try {
            st = Utilidades.Conexion.sta(st);
            rs = st.executeQuery(sql);
            rs.next();
            nombre = rs.getString("pro_nombre");
            pu = rs.getInt("pro_precio");
            cantdad = Integer.parseInt(vista.txtcantidadproducto.getText());
            iva = rs.getString("pro_iva");
            sub = pu * cantdad;

            st.close();
            rs.close();

        } catch (SQLException e) {
            System.out.println(e);
        }

        if (iva.equals("10")) {
            tabladetalle.addRow(new Object[]{
                codigo,
                nombre,
                cantdad,
                pu,
                "",
                "",
                sub
            });
        }
        if (iva.equals("5")) {
            tabladetalle.addRow(new Object[]{
                codigo,
                nombre,
                cantdad,
                pu,
                "",
                sub,
                ""
            });
        }
        if (iva.equals("EXENTA")) {
            tabladetalle.addRow(new Object[]{
                codigo,
                nombre,
                cantdad,
                pu,
                sub,
                "",
                ""
            });
        }

        vista.txtcodigoproducto.setText("");
        vista.txtcantidadproducto.setText("");
        vista.lblnombreproducto.setText("");
        vista.txtcodigoproducto.requestFocus();

//        vista.tblfacturaventa.setModel(tabladetalle);
    }

    public void eliminaritem(Integer fila) {

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "selecione una fila");
        } else {
            tabladetalle.removeRow(fila);
        }
    }

    public void totales() {
        int fila = vista.tblfacturaventa.getRowCount();
        int sumaexe = 0, suma5 = 0, suma10 = 0;

        for (int i = 0; i < fila; i++) {
            if (!vista.tblfacturaventa.getValueAt(i, 4).equals("")) {
                sumaexe = sumaexe + Integer.parseInt(vista.tblfacturaventa.getValueAt(i, 4).toString());

            }
            if (!vista.tblfacturaventa.getValueAt(i, 5).equals("")) {
                suma5 = suma5 + Integer.parseInt(vista.tblfacturaventa.getValueAt(i, 5).toString());
            }

            if (!vista.tblfacturaventa.getValueAt(i, 6).equals("")) {
                suma10 = suma10 + Integer.parseInt(vista.tblfacturaventa.getValueAt(i, 6).toString());
            }
        }
        vista.txtsubexenta.setText(Integer.toString(sumaexe));
        vista.txtsub5.setText(Integer.toString(suma5));
        vista.txtsub10.setText(Integer.toString(suma10));
        float liq5, liq10,liqiva;
        liq5=Float.parseFloat(vista.txtsub5.getText())/21;
        liq10=Float.parseFloat(vista.txtsub10.getText())/11;
        
        liqiva=liq5+liq10;
        vista.txtlq5.setText(Float.toString(liq5));
        vista.txtlq10.setText(Float.toString(liq10));
        vista.txttotaliva.setText(Float.toString(liqiva));
        
        int totalfactura=suma5+suma10+sumaexe;
        vista.txttotal.setText(Integer.toString(totalfactura));
    }
    
    public void desbloquear(){
        vista.txtnumerofactura.setEnabled(true);
        vista.btnbuscarcliente.setEnabled(true);
        vista.txtcodigoproducto.setEnabled(true);
        vista.txtcantidadproducto.setEnabled(true);
        vista.btnaumentarcantidad.setEnabled(true);
        vista.btndisminuircantidad.setEnabled(true);
    }
    public void bloquear(){
        vista.txtnumerofactura.setEnabled(false);
        vista.btnbuscarcliente.setEnabled(false);
        vista.txtcodigoproducto.setEnabled(false);
        vista.txtcantidadproducto.setEnabled(false);
        vista.btnaumentarcantidad.setEnabled(false);
        vista.btndisminuircantidad.setEnabled(false);
    }
    public void activabotones(boolean a,boolean b,boolean c,boolean d,boolean e,boolean f){
        vista.txtnumerofactura.setEnabled(a);
        vista.btnbuscarcliente.setEnabled(b);
        vista.txtcodigoproducto.setEnabled(c);
        vista.txtcantidadproducto.setEnabled(d);
        vista.btnaumentarcantidad.setEnabled(e);
        vista.btndisminuircantidad.setEnabled(f);
    }
    
    
    /////////////////genera un codigo para la factura idfactura
    public void generarcod(){
        String sql= "select ifnull(max(idfacturaventa),0) +1 as cod   from facturaVenta ";
        
        try {
            st=Utilidades.Conexion.sta(st);
            rs = st.executeQuery(sql);
            rs.next();
            
            vista.txtIdfactura.setText(rs.getString("cod"));
            
            st.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ModeloFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
