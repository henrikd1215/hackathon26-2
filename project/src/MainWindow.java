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

            
            JButton buttonCalc = new JButton("Calculate");
            buttonCalc.setFont(new Font("Arial", Font.PLAIN, 25));
            hamburgerPanel.add(buttonCalc);

            JButton buttonEdit = new JButton("Edit Assignment List");
            buttonEdit.setFont(new Font("Arial", Font.PLAIN, 25));
            hamburgerPanel.add(buttonEdit);

            JButton buttonAdd = new JButton("Add Assignments");
            buttonAdd.setFont(new Font("Arial", Font.PLAIN, 25));
            hamburgerPanel.add(buttonAdd);

            JPanel AddSubjPanel = new JPanel();
            AddSubjPanel.setLayout(new GridLayout(1, 2));

            //add
            JButton buttonAddSubj = new JButton("Add Subject");
            buttonAdd.setFont(new Font("Arial", Font.PLAIN, 20));
            AddSubjPanel.add(buttonAdd);

            JTextField textFieldAddSubj = new JTextField("fart", 3);
            AddSubjPanel.add(textFieldAddSubj);


            hamburgerPanel.add(AddSubjPanel);





            JPanel AddTypePanel = new JPanel();
            AddTypePanel.setLayout(new BoxLayout(AddTypePanel, 0));


            
            

            mainPanel.add(BorderLayout.WEST, hamburgerPanel);


            this.setContentPane(mainPanel);

            
        }
}
