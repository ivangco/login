package Utilidades;

import Controlador.ControladoMenuPrincipal;
import Controlador.ControladorFactura;
import Controlador.ControladorLogin;
import Modelo.ModeloFactura;
import Modelo.ModeloLogin;
import Modelo.ModeloMenuPrincipal;
import Vista.Factura;
import Vista.MenuPrincipal;
import Vista.VistaLogin;

/**
 *
 * @author Ivan_
 */
public class Arranque {

    
    public static void main(String[] args) {
        VistaLogin vista=new VistaLogin();
        ModeloLogin modelo=new ModeloLogin(vista);
        ControladorLogin controlador=new ControladorLogin(vista, modelo);
        vista.setLocationRelativeTo(null);
        
        vista.setVisible(true);

//        Factura vistaf =new Factura();
//        ModeloFactura modelof = new ModeloFactura(vista);
//        ControladorFactura controladorf=new ControladorFactura(vista, modelo);
//        modelof.disenotablafactura();
//        modelof.inicio();
//        vista.setVisible(true);
    }
    
}
