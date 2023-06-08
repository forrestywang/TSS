package G12_Chapter_2;

// @author Forrest Wang
// September 22, 2021
//
// Red_Cross
// Create a Red_Cross application that displays a red cross.

// Imports:
import java.awt.*;
import javax.swing.*;

public class Red_Cross extends JPanel {
  public void paintComponent(Graphics g) {
    // Call JPanel's paintComponent method to paint the background:
    super.paintComponent(g);

    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    g.setColor(Color.RED);
    g.fillRect(xCenter - 5, yCenter - 25, 10, 50);
    g.fillRect(xCenter - 25, yCenter - 5, 50, 10);
  }

  public static void main(String[] args) {
    JFrame window = new JFrame("Red Cross");
    window.setBounds(300, 300, 200, 200);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Red_Cross panel = new Red_Cross();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);

    window.setVisible(true);
  }
}