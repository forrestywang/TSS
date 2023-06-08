package G12_Chapter_6;

// @author Forrest Wang
// October 7, 2021
//
// Poll
// Create a Poll application that initializes the JFrame.


// Import Statement(s):
import java.awt.*;
import javax.swing.*;

public class Poll extends JFrame {

  // Constructor:
  public Poll() {
    super("Vote for Tami, Brian, or Liz");

    Container c = getContentPane();
    c.setBackground(Color.WHITE);
    Poll_Display_Panel chart = new Poll_Display_Panel("Tami", "Brian", "Liz");
    Poll_Control_Panel controls = new Poll_Control_Panel(chart);
    c.add(chart, BorderLayout.CENTER);
    c.add(controls, BorderLayout.SOUTH);
  }

  public static void main(String[] args) {
    Poll w = new Poll();
    w.setBounds(300, 300, 400, 400);
    w.setDefaultCloseOperation(EXIT_ON_CLOSE);
    w.setVisible(true);
  }
}

