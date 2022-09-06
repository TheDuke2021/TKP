package lab1;

import javax.swing.*;

public class MyGUI {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Привет. Как зовут?");
        String age = JOptionPane.showInputDialog("Сколько годиков?");
        JOptionPane.showMessageDialog(null,"Привет, " + name + ", которому " + age + " годиков :)");
    }
}
