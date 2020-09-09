package Label;


import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javafx.scene.layout.Background;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class RichLabel extends JLabel{
    
    public RichLabel (){
        this.addMouseListener(mouseover);
    }
    
    private Color fontbackground;
    private Color mouseovercolor;
    private MouseAdapter mouseover = new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            super.mouseClicked(e);
            if (mouseovercolor!=null){
                fontbackground = getBackground();
                setOpaque(true);
                setBackground(mouseovercolor);
                repaint();
            }
        }
        @Override
        public void mouseExited(MouseEvent e) {
            setOpaque(true);
            setBackground(fontbackground);
            repaint();
        }
    };
    
    public void setMouseovercolor(Color mouseovercolor){
        this.mouseovercolor=mouseovercolor;
    }
    
}
