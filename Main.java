import javax.swing.*;
import java.awt.Font;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("GBrowser");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(1000, 700);

        JLabel label = new JLabel("Loading...", SwingConstants.CENTER);

        label.setFont(new Font("Arial", Font.PLAIN, 50));

        frame.add(label);

        frame.setVisible(true);

        //Jay just so you know scraper.java is a function and you can use it to scrape websites for their html
    }
}
