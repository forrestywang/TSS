package G12_Chapter_6;

// @author Forrest Wang
// October 18, 2021
//
// Rainbow
// Create a Rainbow application that displays a rainbow of red, green, and magenta on a cyan background.

// Import(s):
import java.awt.*;
import javax.swing.*;

public class Rainbow extends JPanel {
    private final Color skyColor = Color.CYAN;

    public Rainbow() {setBackground(skyColor);}

    // Draw the rainbow:
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();

        // Initialize xCenter, and yCenter:
        int xCenter = width / 2;
        int yCenter = height * 3/ 4;

        // Initialize Radii:
        int largeRadius = width / 4;
        int smallRadius = height / 4;
        int mediumRadius = (int) Math.sqrt(largeRadius * smallRadius);
        int cyanRadius = largeRadius - 3 * mediumRadius + 3 * smallRadius;

        // Draw the large semicircle:
        g.setColor(Color.RED);
        g.fillArc(xCenter - largeRadius, yCenter - largeRadius, largeRadius * 2, largeRadius * 2, 0, 180);

        // Draw the medium semicircle:
        g.setColor(Color.GREEN);
        g.fillArc(xCenter - mediumRadius, yCenter - mediumRadius, mediumRadius * 2, mediumRadius * 2, 0, 180);

        // Draw the small semicircle:
        g.setColor(Color.MAGENTA);
        g.fillArc(xCenter - smallRadius, yCenter - smallRadius, smallRadius * 2, smallRadius * 2, 0, 180);

        // Draw the sky-color semicircle:
        g.setColor(Color.CYAN);
        g.fillArc(xCenter - cyanRadius, yCenter - cyanRadius, cyanRadius * 2, cyanRadius * 2, 0, 180);
    }

    public static void main(String[] args) {
        JFrame w = new JFrame("Rainbow");
        w.setBounds(300, 300, 300, 200);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = w.getContentPane();
        c.add(new Rainbow());
        w.setVisible(true);
    }
}