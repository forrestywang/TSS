package G12_Chapter_2;

// @author Forrest Wang
// September 22, 2021
//
// Target
// Create a Target application that displays a target.

// Imports:
import java.awt.*;
import javax.swing.*;

public class Target extends JPanel {
  public void paintComponent(Graphics g) {
    // Call JPanel's paintComponent method to paint the background.
    super.paintComponent(g);

    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    g.setColor(Color.RED);
    g.fillOval(xCenter - 75, yCenter - 75, 150, 150);
    g.setColor(Color.WHITE);
    g.fillOval(xCenter - 50, yCenter - 50, 100, 100);
    g.setColor(Color.RED);
    g.fillOval(xCenter - 25, yCenter - 25, 50, 50);
  }

  public static void main(String[] args) {
    JFrame window = new JFrame("Red Cross");
    window.setBounds(300, 300, 200, 200);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Target panel = new Target();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);

    window.setVisible(true);
  }
}