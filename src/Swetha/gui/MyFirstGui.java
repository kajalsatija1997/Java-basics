package Swetha.gui;

import javax.swing.*;

public class MyFirstGui {

    public static void main(String[] args) {
        JFrame frame=new JFrame("My First GUI");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create components
        JLabel label=new JLabel("Enter your name:");
        JTextField textField=new JTextField(20);
        JButton button=new JButton("Click me");

        //Panel to hold components
        JPanel panel=new JPanel();
        panel.add(label);
        panel.add(textField);
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);



    }


}
