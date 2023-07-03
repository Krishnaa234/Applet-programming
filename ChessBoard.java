package student;
import java.applet.*;
import java.awt.*;
public class ChessBoard extends Applet {
    public void paint(Graphics g) {
        g.drawRect(500,100,800,800);      
        g.fillRect(500, 100, 100, 100);       
        g.fillRect(700, 100, 100, 100);
        g.fillRect(900, 100, 100, 100);
        g.fillRect(1100, 100, 100, 100);
        g.fillRect(600, 200, 100, 100);
        g.fillRect(800, 200, 100, 100);
        g.fillRect(1000, 200, 100, 100);
        g.fillRect(1200, 200, 100, 100);
        g.fillRect(500, 300, 100, 100);
        g.fillRect(700, 300, 100, 100);
        g.fillRect(900, 300, 100, 100);
        g.fillRect(1100, 300, 100, 100);
        g.fillRect(600, 400, 100, 100);
        g.fillRect(800, 400, 100, 100);
        g.fillRect(1000, 400, 100, 100);
        g.fillRect(1200, 400, 100, 100);
        g.fillRect(500, 500, 100, 100);
        g.fillRect(700, 500, 100, 100);
        g.fillRect(900, 500, 100, 100);
        g.fillRect(1100, 500, 100, 100);
        g.fillRect(600, 600, 100, 100);
        g.fillRect(800, 600, 100, 100);
        g.fillRect(1000, 600, 100, 100);
        g.fillRect(1200, 600, 100, 100);
        g.fillRect(500, 700, 100, 100);
        g.fillRect(700, 700, 100, 100);
        g.fillRect(900, 700, 100, 100);
        g.fillRect(1100, 700, 100, 100);
        g.fillRect(600, 800, 100, 100);
        g.fillRect(800, 800, 100, 100);
        g.fillRect(1000, 800, 100, 100);
        g.fillRect(1200, 800, 100, 100);
        Color c = new Color(240,0,0);
        Font f = new Font("Arial",Font.BOLD,180);
        g.setColor(c);
        g.setFont(f);
        g.drawString("Krishna",565,560);
    }
}