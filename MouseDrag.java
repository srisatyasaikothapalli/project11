import java.awt.*;
import java.applet.*;

public class MouseDrag extends Applet {
    public void init() {
        setBackground(Color.red);
    }

    public void paint(Graphics g) {
        // No need to override paint method for this simple example
    }

    public void update(Graphics g) {
        // Override update to prevent flickering
        paint(g);
    }

    public void mouseDragged(MouseEvent me) {
        Graphics g = getGraphics();
        g.setColor(Color.white);
        g.fillOval(me.getX(), me.getY(), 5, 5);
    }
}
