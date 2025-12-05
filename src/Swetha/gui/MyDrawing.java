package Swetha.gui;

import java.awt.*;

public class MyDrawing extends Frame {
    public MyDrawing() {
        setSize(500,500);
        setTitle("AWT Graphics example");
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
       //draw line
        g.drawLine(50,50,200,50);

        //draw rect
        g.drawRect(50,100,150,80);

        //fill rect
        g.fillRect(250,100,100,80);

        //filled oval
        g.fillOval(10,50,10,10);

        //draw string
        g.drawString("Helloo",50,350);
    }

    public static void main(String[] args) {
        new MyDrawing();
    }
}
