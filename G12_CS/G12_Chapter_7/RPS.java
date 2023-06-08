package G12_Chapter_7;

// @author Forrest Wang
// October 21, 2021
//
// RPS
// Create a RPS application that lets you play Rock Paper Scissors against a computer.

// Import(s):
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RPS extends JFrame
    implements ActionListener {
  private final char[] moves = {'R', 'P', 'S'};
  private final JRadioButton rock;
  private final JRadioButton paper;
  private final JRadioButton scissors;
  private final JTextField display;

  public RPS() {
    super("Rock, paper, Scissors");

    rock = new JRadioButton("   Rock   ", true);
    paper = new JRadioButton("   Paper  ");
    scissors = new JRadioButton(" Scissors ");

    ButtonGroup rpsButtons = new ButtonGroup();
    rpsButtons.add(rock);
    rpsButtons.add(paper);
    rpsButtons.add(scissors);

    JButton go = new JButton("         Go         ");
    go.addActionListener(this);

    display = new JTextField(25);
    display.setEditable(false);
    display.setBackground(Color.yellow);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(rock);
    c.add(paper);
    c.add(scissors);
    c.add(go);
    c.add(display);
  }

  /**
   * Pre-condition: Nothing.
   * Post-condition: Should return -1 if the player wins, 0 if it's a draw, and 1 if the computer wins.
   */
  private int nextPlay(char computerMove, char playerMove) {
    int result = 0;

    switch (playerMove) {
      case 'R':
        result = switch (computerMove) {
          case 'R' -> 0;
          case 'P' -> 1;
          case 'S' -> -1;
          default -> result;
        };

        break;
      case 'P':
        result = switch (computerMove) {
          case 'R' -> -1;
          case 'P' -> 0;
          case 'S' -> 1;
          default -> result;
        };

        break;
      case 'S':
        result = switch (computerMove) {
          case 'R' -> 1;
          case 'P' -> -1;
          case 'S' -> 0;
          default -> result;
        };

        break;
    }

    return result;
  }

  public void actionPerformed(ActionEvent e) {
    char playerMove, computerMove;

    if (rock.isSelected()) {playerMove = 'R';}

    else if (paper.isSelected()) {playerMove = 'P';}

    else {playerMove = 'S';}

    int k = (int)(Math.random() * 3);
    computerMove = moves[k];
    int result = nextPlay(computerMove, playerMove);

    String msg = "  You said " + makeWord(playerMove) + ", I said " +
                 makeWord(computerMove);

    if (result < 0) {msg += " -- you win.";}

    else if (result == 0) {msg += " -- tie.";}

    else {msg += " -- I win.";}

    display.setText(msg);
  }

  private String makeWord(char move) {
    String word = switch (move) {
      case 'R' -> "ROCK";
      case 'P' -> "PAPER";
      case 'S' -> "SCISSORS";
      default -> "";
    };

    return word;
  }

  public static void main(String[] args) {
    RPS window = new RPS();
    window.setBounds(300, 300, 300, 140);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}