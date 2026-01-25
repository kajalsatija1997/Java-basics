package Swetha.gui;

import javax.swing.*;
import java.awt.*;

public class MyFirstGui {

    public static void main(String[] args) {
        JFrame frame=new JFrame("My First GUI");
        frame.setLayout(new GridLayout(2,4));
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setForeground(Color.BLUE);

        //Create components
        JLabel label=new JLabel("Enter your name:");
        JTextField textField=new JTextField(20);
        JButton button=new JButton("Click me");
        JCheckBox checkBox=new JCheckBox();

        //Panel to hold components
        JPanel panel=new JPanel();
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(checkBox);

        panel.remove(3);
        panel.getMaximumSize();

        frame.add(panel);
        frame.setVisible(true);



    }


}
