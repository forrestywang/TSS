package G12_Chapter_6;

// @author Forrest Wang
// October 7, 2021
//
// Poll_Display_Panel
// Make a Poll_Display_Panel application that holds the vote counts and displays the numbers and the pie chart for the
// current vote counts.

// Import Statement(s):
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Poll_Display_Panel extends JPanel {

  // Field(s):
  private int count1, count2, count3;
  private String name1, name2, name3;

  // Constructor:
  public Poll_Display_Panel(String nm1, String nm2, String nm3) {
    setBackground(Color.WHITE);
    name1 = nm1;
    name2 = nm2;
    name3 = nm3;
    count1 = 0;
    count2 = 0;
    count3 = 0;
  }

  /**
   * Pre-condition: Requires the value of count1.
   * Post-condition: Should increment the variable count1.
   */
  public void vote1() {
	  count1++;
  }

  /**
   * Pre-condition: Requires the value of count2.
   * Post-condition: Should increment the variable count2.
   */
  public void vote2() {
    count2++;
  }

  /**
   * Pre-condition: Requires the value of count3.
   * Post-condition: Should increment the variable count3.
   */
  public void vote3() {
	  count3++;
  }

  /**
   * Pre-condition: Requires the values of count1, count 2, and count3.
   * Post-condition: Should return the string representation of the variables count1, count2, and count3.
   */
  public String toString() {
    return count1 + "" + count2 + "" + count3;
  }

  // Redefines JPanel's paintComponent to draw this pie chart:
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    int w = getWidth();
    int h = getHeight();
    int x = w/2;
    int y = h/2;
    int r = Math.min(w, h) / 4;
    drawPieChart(g, x, y, r);
    drawLegend(g, x, y, r);
  }

  /**
   * Pre-condition: Requires the values of the variables g, x, y, and r.
   * Post-condition: Should draw the pie chart.
   */
  private void drawPieChart(Graphics g, int x, int y, int r) {
    int total = count1 + count2 + count3;
    int fromDegree = 0;

    // If there is at least one vote:
    if (total > 0) {
      int degrees;
      
      // Drawing Tami's (red) portion of the pie chart:
      g.setColor(Color.RED);
      degrees = countToDegrees(count1, total);
      drawSector(g, x, y, r, fromDegree, degrees);
      fromDegree += degrees;

      // Drawing Brian's (green) portion of the pie chart:
      g.setColor(Color.GREEN);
      degrees = countToDegrees(count2, total);
      drawSector(g, x, y, r, fromDegree, degrees);
      fromDegree += degrees;
      
      // Drawing Liz's (blue) portion of the pie chart:
      g.setColor(Color.BLUE);
      degrees = Math.max(360 - fromDegree, 0);
      drawSector(g, x, y, r, fromDegree, degrees);
    }
    
    // If there are no votes, colour the entire circle gray:
    else {
      g.setColor(Color.LIGHT_GRAY);
      drawSector(g, x, y, r, fromDegree, 360);
    }
  }

  /**
   * Pre-condition: Requires the values of variables g, x, y, and r.
   * Post-condition: Should draw the vote counts and the corresponding color squares.
   */
  private void drawLegend(Graphics g, int x, int y, int r) {
    // Display the counts:
    y += (r + 20);
    g.setColor(Color.BLACK);

    g.drawString(count1 + "", x - r, y);

    g.drawString(count2 + "", x, y);

    g.drawString(count3 + "", x + r, y);


    // Display the coloured squares:
    y += 5;
    x -= 2;
    g.setColor(Color.RED);
    g.fillRect(x - r, y, 10, 10);
    g.setColor(Color.GREEN);
    g.fillRect(x, y, 10, 10);
    g.setColor(Color.BLUE);
    g.fillRect(x + r, y, 10, 10);
  }

  /**
   * Pre-condition: Requires the values of variables count, and total.
   * Post-condition: Should return the number of degrees in a pie slice that corresponds to count/total, rounded to the
   * nearest integer.
   */
  private int countToDegrees(int count, int total) {
    return (int) ((double) count / total * 360);
  }

  /**
   * Pre-condition: Requires the values of of the variables g, x, y, r, fromDegree, and degrees.
   * Post-condition: Should draw a sector, centered at x, y, of radius r, of angle measure degrees, starting at fromDegree.
   */
  private void drawSector(Graphics g, int x, int y, int r, int fromDegree, int degrees) {
    if (degrees > 359) {g.fillOval(x - r, y - r, 2 * r, 2 * r);}

    else {g.fillArc(x - r, y - r, 2 * r, 2 * r, fromDegree, degrees);}
  }
}
