/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Fronted;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author sago04
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        int pixels=200;
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize().width-pixels, java.awt.Toolkit.getDefaultToolkit().getScreenSize().height-pixels);
        this.setVisible(true);
        
    }
    
    /*public void ColocarPanel(JPanel panelagreg, String Panel /*North,South,East,West,Center){
        this.getContentPane().add( Panel,panelagreg );
        this.setVisible(true);
    }*/
    public void EliminarPanel(JPanel panelelim){
        panelelim.setVisible(false);
        this.remove(panelelim);
        
        
    }
    
    public void AgregarNorth(JPanel PanelNorte){
        this.getContentPane().add( "North",PanelNorte );
        this.setVisible(true);
    }
    public void AgregarSouth(JPanel panelsur){
        this.getContentPane().add( "South",panelsur );
        this.setVisible(true);
    }
    public void AgregarEast(JPanel paneleste){
        this.getContentPane().add( "East",paneleste );
        this.setVisible(true);
    }
    public void AgregarWest(JPanel paneloeste){
        this.getContentPane().add( "West",paneloeste );
        this.setVisible(true);
    }
    public void AgregarCenter(JPanel panelcentral){
        this.getContentPane().add( "Center",panelcentral );
        this.setVisible(true);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Plastiqueria Santos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setEnabled(false);
        setLocationByPlatform(true);
        setResizable(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public class FondoImagen extends JPanel{
        
        private Image imagen;
        //private String Urlimagen;
        
        
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/Imagen/Is.jpg")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
