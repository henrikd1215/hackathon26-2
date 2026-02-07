package com.middleenddevelopers;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class MainWindow extends JFrame {
        public MainWindow(String title) {
            super(title);

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel mainPanel = new JPanel();
            mainPanel.setLayout(new BorderLayout());

            JPanel hamburgerPanel = new JPanel();
            hamburgerPanel.setLayout(new BoxLayout(hamburgerPanel, 1));

            
            JPanel Button1Panel = new JPanel();
            Button1Panel.setLayout(new GridLayout(1,1));
            hamburgerPanel.add(Button1Panel);

            JPanel Button2Panel = new JPanel();
            Button2Panel.setLayout(new GridLayout(1,1));
            hamburgerPanel.add(Button2Panel);

            JPanel Button3Panel = new JPanel();
            Button3Panel.setLayout(new GridLayout(1,1));
            hamburgerPanel.add(Button3Panel);

            JPanel Button4Panel = new JPanel();
            Button4Panel.setLayout(new GridLayout(1,2));
            hamburgerPanel.add(Button4Panel);

            JPanel Button5Panel = new JPanel();
            Button5Panel.setLayout(new GridLayout(1,2));
            hamburgerPanel.add(Button5Panel);



            JButton calcButton = new JButton("calc");
            Button1Panel.add(calcButton);

            JButton addButton = new JButton("add");
            Button2Panel.add(addButton);

            JButton editButton = new JButton("edit");
            Button3Panel.add(editButton);

            JButton addSubButton = new JButton("add subj");
            Button4Panel.add(addSubButton);

            JButton addTypeButton = new JButton("add type");
            Button5Panel.add(addTypeButton);
            
        
            
            JPanel AddTypePanel = new JPanel();
            AddTypePanel.setLayout(new BoxLayout(AddTypePanel, 0));


            
            

            mainPanel.add(BorderLayout.WEST, hamburgerPanel);


            this.setContentPane(mainPanel);

            
        }
}
