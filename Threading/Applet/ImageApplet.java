package Threading.Applet;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class ImageApplet extends Applet {
    private Image image;

    public void init() {
        // Load the image
        image = getImage(getDocumentBase(), "Bg.jpg");
    }

    public void paint(Graphics g) {
        // Draw the image at (0, 0)
        g.drawImage(image, 0, 0, this);
    }
}


