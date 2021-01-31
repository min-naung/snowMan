/**
 *
 * 201036 MIN NAUNG
 *
 */

import javax.swing.*;
import java.awt.*;
class my_Panel extends JPanel{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.CYAN);
        g.fillRect(0, 0, 600, 450);

        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 330, 600, 150);

        g.setColor(Color.ORANGE);
        g.fillOval(-80, -80, 160, 160);

        g.setColor(Color.white);
        g.fillOval(260, 50, 80, 80);
        g.fillOval(230, 120, 140, 100);
        g.fillOval(200, 210, 200, 120);

        g.setColor(Color.BLACK);
        g.fillOval(280, 70, 10, 10);
        g.fillOval(310, 70, 10, 10);

        g.drawArc(280, 90, 40, 20, 190, 160);

        g.drawLine(250,170,200,130);
        g.drawLine(350,170,410,170);

        g.drawLine(260,60,340,60);
        g.fillRect(270, 10, 60, 50);
    }
}
public class SnowMan extends JFrame{
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,450);
        Container c = f.getContentPane();
        my_Panel p = new my_Panel();
        c.add(p);

        f.setVisible(true);
    }
}
