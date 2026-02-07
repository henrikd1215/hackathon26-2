import java.awt.*;
import javax.swing.*;
public class MainWindow extends JFrame {
        public MainWindow(String title) {
            super(title);

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel mainPanel = new JPanel();
            mainPanel.setLayout(new BorderLayout());

            JPanel hamburgerPanel = new JPanel();
            hamburgerPanel.setLayout(new BoxLayout(hamburgerPanel, 1));

            JButton button1 = new JButton("AAAGHH IM SCREAMING!!!");
            hamburgerPanel.add(button1);

            mainPanel.add(BorderLayout.WEST, hamburgerPanel);


            this.setContentPane(mainPanel);

            
        }
}
