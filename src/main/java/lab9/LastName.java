package lab9;

import javax.swing.*;
import java.awt.*;

public class LastName extends JPanel {

    public void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        Graphics2D g = (Graphics2D) gr;
        BasicStroke pen;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        //Б
        pen = new BasicStroke(20, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        g.setColor(Color.BLUE);
        g.setStroke(pen);
        g.drawLine(40, 40, 40, 250);
        g.drawOval(40, 150, 80, 100);
        g.drawLine(40, 40, 100, 40);

        //А
        pen = new BasicStroke(10, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND);
        g.setColor(Color.YELLOW);
        g.setStroke(pen);
        g.drawLine(150, 250, 180, 40);
        g.drawLine(180, 40, 210, 250);
        g.drawLine(140, 150, 220, 150);

        //Р
        pen = new BasicStroke(20, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND);
        g.setColor(Color.BLACK);
        g.setStroke(pen);
        g.drawLine(270, 40, 270, 250);
        g.drawRect(270,40, 70, 70);

        //А
        pen = new BasicStroke(10, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND);
        g.setColor(Color.YELLOW);
        g.setStroke(pen);
        g.drawLine(350, 250, 380, 40);
        g.drawLine(380, 40, 410, 250);
        g.drawLine(340, 150, 420, 150);

        //Е
        pen = new BasicStroke(25, BasicStroke.JOIN_ROUND, BasicStroke.JOIN_ROUND);
        g.setColor(Color.GREEN);
        g.setStroke(pen);
        g.drawLine(450, 40, 450,250);
        g.drawLine(450, 40, 550, 40);
        g.drawLine(450, 250, 550, 250);
        g.drawLine(450, 130, 550, 130);

        //В
        pen = new BasicStroke(15, BasicStroke.JOIN_MITER, BasicStroke.JOIN_MITER);
        g.setColor(Color.RED);
        g.setStroke(pen);
        g.drawLine(600, 40, 600, 250);
        g.drawRect(600, 40, 90, 90);
        g.drawRect(600, 160, 90, 90);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Бараев Дамир");
        LastName panel = new LastName();
        frame.add(panel);
        panel.repaint();
        frame.setSize(800, 400);
        frame.setVisible(true);
    }
}