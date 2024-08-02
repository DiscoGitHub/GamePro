import javax.swing.*;
import java.awt.Font;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("GBrowserBeta");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(1000, 700);

        JLabel label = new JLabel("Loading...", SwingConstants.CENTER);

        label.setFont(new Font("Arial", Font.PLAIN, 50));

        frame.add(label);

        frame.setVisible(true);
    }
}
