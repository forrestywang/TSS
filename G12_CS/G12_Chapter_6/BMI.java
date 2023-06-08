package G12_Chapter_6;

// @author Forrest Wang
// October 18, 2021
//
// BMI
// Create a BMI application that takes a weight in pounds, and height in inches, and returns the body max index.

// Import(s):
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class BMI extends JFrame
        implements ActionListener {
    JTextField inputLbs, inputInches, displayBmi;

    // Constructor:
    public BMI() {
        super("BMI Calculator");
        JLabel labelLbs = new JLabel("Weight (lbs):", SwingConstants.RIGHT);
        inputLbs = new JTextField(5);
        JLabel labelInches = new JLabel("Height (inches):", SwingConstants.RIGHT);
        inputInches = new JTextField(5);
        JLabel labelBmi = new JLabel("BMI = ", SwingConstants.RIGHT);
        displayBmi = new JTextField(5);
        displayBmi.setEditable(false);
        JButton go = new JButton("Compute");
        go.addActionListener(this);

        Container c = getContentPane();
        c.setBackground(Color.white);
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(3, 2, 5, 5));
        p.add(labelLbs);
        p.add(inputLbs);
        p.add(labelInches);
        p.add(inputInches);
        p.add(labelBmi);
        p.add(displayBmi);
        c.add(p, BorderLayout.CENTER);
        c.add(go, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        int lbs = Integer.parseInt(inputLbs.getText());
        int inches = Integer.parseInt(inputInches.getText());
        double bmi = calculateBmi(lbs, inches);
        DecimalFormat df = new DecimalFormat("00.0");
        displayBmi.setText(df.format(bmi));
    }


    /**
     * Pre-condition: Requires the values of variables lbs, and inches.
     * Post-condition: Should output the BMI as a double.
     */
    private double calculateBmi(int lbs, int inches) {
        // Initialize Constant(s):
        final double POUNDS_TO_KILOGRAMS = 0.454;
        final double INCHES_TO_METERS = 0.0254;

        double kg = (double) lbs * POUNDS_TO_KILOGRAMS;
        double meters = (double) inches * INCHES_TO_METERS;

        return kg / Math.pow(meters, 2);
    }

    public static void main(String[] args) {
        BMI w = new BMI();
        w.setBounds(300, 300, 300, 160);
        w.setDefaultCloseOperation(EXIT_ON_CLOSE);
        w.setVisible(true);
    }
}