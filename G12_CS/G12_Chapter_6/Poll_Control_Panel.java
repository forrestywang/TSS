package G12_Chapter_6;

// @author Forrest Wang
// October 7, 2021
//
// Poll_Control_Panel
// Create a Poll_Control_Panel that initializes the JPanel, and JButtons.


// Import Statement(s):
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Poll_Control_Panel extends JPanel
                          implements ActionListener {

  // Field(s):
  private JButton button1, button2, button3;
  private Poll_Display_Panel chartPanel;

  public Poll_Control_Panel(Poll_Display_Panel chart) {
    chartPanel = chart;

    // Adding a button to vote for Tami:
    button1 = new JButton("Tami");
    button1.setPreferredSize(new Dimension(80, 30));
    button1.setToolTipText("Vote for Tami");
    button1.addActionListener(this);

    // Adding a button to vote for Brian:
    button2 = new JButton("Brian");
    button2.setPreferredSize(new Dimension(80, 30));
    button2.setToolTipText("Vote for Brian");
    button2.addActionListener(this);

    // Adding a button to vote for Liz:
    button3 = new JButton("Liz");
    button3.setPreferredSize(new Dimension(80, 30));
    button3.setToolTipText("Vote for Liz");
    button3.addActionListener(this);

    add(button1);
    add(button2);
    add(button3);
  }

  // Processes button events:
  public void actionPerformed(ActionEvent e) {
    JButton button = (JButton)e.getSource();

    if (button == button1) {chartPanel.vote1();}

    else if (button == button2) {chartPanel.vote2();}

    else if (button == button3) {chartPanel.vote3();}

    chartPanel.repaint();
  }
}