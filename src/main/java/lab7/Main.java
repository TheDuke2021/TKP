package lab7;
import javax.swing.*;
import java.awt.*;
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
            east.add(new JRadioButton("Выбор " + i));
            east.add(Box.createRigidArea(new Dimension(0,10)));
        }
        //CENTER
        center.setLayout(new GridLayout(2, 1));
        center.add(new JTextArea());
        JPanel centerSouth = new JPanel();
        centerSouth.setLayout(new FlowLayout(FlowLayout.CENTER));
        centerSouth.add(new JButton("Кнопка"));
        centerSouth.add(Box.createHorizontalStrut(100));
        centerSouth.add(new JButton("Кнопка"));
        center.add(centerSouth);
        //SOUTH
        south.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JPasswordField passwordField = new JPasswordField();
        passwordField.setText("1234567890123456");
        south.add(passwordField);
        south.add(new JButton("Кнопка"));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> loadGUI());
    }
}
