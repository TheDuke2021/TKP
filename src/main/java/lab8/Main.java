package lab8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

    public static void loadGUI() {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setSize(500, 425);
        JPanel north = new JPanel();
        JPanel center = new JPanel();
        JPanel east = new JPanel();
        JPanel west = new JPanel();
        JPanel south = new JPanel();
        frame.add(north, BorderLayout.NORTH);
        frame.add(center, BorderLayout.CENTER);
        frame.add(east, BorderLayout.EAST);
        frame.add(west, BorderLayout.WEST);
        frame.add(south, BorderLayout.SOUTH);


        //NORTH
        north.setLayout(new BorderLayout());
        JPanel northLeft = new JPanel();
        JPanel northRight = new JPanel();
        north.add(northLeft, BorderLayout.WEST);
        north.add(northRight, BorderLayout.EAST);
        northLeft.add(new JLabel("Метка 1"));
        northLeft.add(new JLabel("Метка 2"));
        northLeft.add(new JLabel("Метка 3"));
        northRight.add(new JLabel("Метка 4"));
        northRight.add(new JLabel("Метка 5"));
        northRight.add(new JLabel("Метка 6"));

        //WEST
        west.setLayout(new BoxLayout(west, BoxLayout.Y_AXIS));
        for (int i = 1; i <= 9; i++) {
            west.add(new JButton("Кнопка " + i));
            west.add(Box.createRigidArea(new Dimension(0,10)));
        }

        //EAST
        east.setLayout(new BoxLayout(east, BoxLayout.Y_AXIS));
        for (int i = 1; i <= 9; i++) {
            JRadioButton radioButton = new JRadioButton("Выбор " + i);
            radioButton.addActionListener((event) -> {
                int r = (int) (Math.random()*255);
                int g = (int) (Math.random()*255);
                int b = (int) (Math.random()*255);
                float[] hsb = new float[3];
                Color.RGBtoHSB(r, g, b, hsb);
                float h = hsb[0];
                float s = hsb[1];
                float b1 = hsb[2];
                radioButton.setForeground(Color.getHSBColor(h, s, b1));
            });
            east.add(radioButton);
            east.add(Box.createRigidArea(new Dimension(0,10)));
        }

        //CENTER
        center.setLayout(new GridLayout(2, 1));
        JTextArea textArea = new JTextArea();
        center.add(textArea);
        JPanel centerSouth = new JPanel();
        centerSouth.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton button1 = new JButton("Кнопка");
        button1.addActionListener((event) -> {
            textArea.setText("Привет :)");
        });
        centerSouth.add(button1);
        centerSouth.add(Box.createHorizontalStrut(100));
        JButton button2 = new JButton("Кнопка");
        button2.addActionListener((event) -> {
            textArea.setText("Пока :(");
        });
        centerSouth.add(button2);
        center.add(centerSouth);

        //SOUTH
        south.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JPasswordField passwordField = new JPasswordField();
        JLabel label = new JLabel("Мышка наведена на кнопку");
        label.setVisible(false);
        south.add(label);
        passwordField.setText("1234567890123456");
        south.add(passwordField);
        JButton hoverButton = new JButton("Кнопка");
        hoverButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                label.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                label.setVisible(false);
            }
        });
        south.add(hoverButton);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> loadGUI());
    }
}
