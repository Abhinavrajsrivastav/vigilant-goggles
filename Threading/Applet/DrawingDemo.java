package Threading.Applet;
import javax.swing.*;
import java.awt.*;

public class DrawingDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        DrawingPanel panel = new DrawingPanel();
        frame.add(panel);

        frame.setVisible(true);
    }
}

class DrawingPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw a line
        g.drawLine(50, 50, 200, 50);

        // Draw a circle
        g.drawOval(50, 100, 100, 100);

        // Draw a rectangle
        g.drawRect(50, 250, 150, 50);

        // Fill a rectangle
        g.setColor(Color.BLUE);
        g.fillRect(250, 100, 100, 150);
    }
}
