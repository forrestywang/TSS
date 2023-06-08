package G12_Chapter_10;

// @author Forrest Wang
// December 10, 2021
//
// Date_Converter_GUI
// Create a Date_Converter_GUI application that uses a GUI to prompt the user for a date in mm/dd/yyyy, then converts
// it to the format dd-mm-yyyy.

// Import(s):
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Date_Converter_GUI extends JFrame
        implements ActionListener {
    private JTextField input, result;

    public Date_Converter_GUI() {
        super("String test");
        Box box1 = Box.createVerticalBox();
        box1.add(new JLabel("Input:"));
        box1.add(Box.createVerticalStrut(10));
        box1.add(new JLabel("Result:"));

        input = new JTextField(20);
        input.setBackground(Color.WHITE);
        input.addActionListener(this);
        input.selectAll();

        result = new JTextField(20);
        result.setBackground(Color.WHITE);
        result.setEditable(false);

        Box box2 = Box.createVerticalBox();
        box2.add(input);
        box2.add(Box.createVerticalStrut(10));
        box2.add(result);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(box1);
        c.add(box2);
        input.requestFocus();
    }

    public void actionPerformed(ActionEvent e) {
        // Variable(s):
        String date = input.getText();
        String newDate = "";

        // Calculations:
        if (date.charAt(1) == '/') {
            newDate += "0" + date.charAt(0) + "-";

            if (date.charAt(3) == '/') {newDate += "0" + date.charAt(2) + "-" + date.substring(4);}

            else {newDate += date.substring(2, 4) + "-" + date.substring(5);}
        }

        else if (date.charAt(1) != '/') {
            newDate += date.substring(0, 2) + "-";

            if (date.charAt(4) == '/') {newDate += "0" + date.charAt(3) + "-" + date.substring(5);}

            else {newDate += date.substring(3, 5) + "-" + date.substring(6);}
        }

        newDate = newDate.substring(3, 5) + "-" + newDate.substring(0, 2) + "-" + newDate.substring(6);

        result.setText(newDate);
        input.selectAll();
    }

    public static void main(String[] args) {
        Date_Converter_GUI window = new Date_Converter_GUI();
        window.setBounds(100, 100, 300, 100);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}