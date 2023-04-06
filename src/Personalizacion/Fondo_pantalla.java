package Personalizacion;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fondo_pantalla {
    public static class FondoPanel extends JPanel{
        private Image imagen;
        @Override
        public void paint(Graphics q){
            imagen = new ImageIcon(getClass().getResource("/Adicionales/fondo.jpg")).getImage();
            q.drawImage(imagen,0,0,getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(q);   
        }
    }
}