package Modelo;

import Controlador.ControladorFactura;
import Vista.Factura;
import Vista.MenuPrincipal;

/**
 *
 * @author ivan
 */
public class ModeloMenuPrincipal {

    MenuPrincipal vista;

    public ModeloMenuPrincipal(MenuPrincipal vista) {
        this.vista = vista;
    }

    public void abrirfacturacompra() {
        Factura vistaf = new Factura();
        ModeloFactura modelof = new ModeloFactura(vistaf);
        ControladorFactura controladorf = new ControladorFactura(vistaf, modelof);
      
        modelof.disenotablafactura();
        modelof.inicio();
        vistaf.setLocationRelativeTo(null);
        vistaf.setVisible(true);
    }
}
