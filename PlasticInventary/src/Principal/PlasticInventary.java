
package Principal;


import Fronted.PanelPrincipal;
import Fronted.VentanaPrincipal;

public class PlasticInventary {

    public static void main(String[] args) {
        VentanaPrincipal firstWindow = new VentanaPrincipal();
        //firstWindow.ColocarPanel(new PanelPrincipal(firstWindow),"North");
        firstWindow.AgregarNorth(new PanelPrincipal(firstWindow));
    }
    
}
