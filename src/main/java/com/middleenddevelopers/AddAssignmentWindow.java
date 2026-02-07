package com.middleenddevelopers;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

import java.util.ArrayList;

public class AddAssignmentWindow extends JFrame {
    ArrayList<String> stringlist = new ArrayList<>();
    public static boolean isWindowVisible = false;

        public AddAssignmentWindow(String title) {
            super(title);

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel mainPanel = new JPanel();
            mainPanel.setLayout(new BorderLayout());

            JPanel hamburgerPanel = new JPanel();
            hamburgerPanel.setLayout(new BoxLayout(hamburgerPanel, 1));

            
            JPanel Button1Panel = new JPanel();
            Button1Panel.setLayout(new GridLayout(1,2));
            hamburgerPanel.add(Button1Panel);

            JPanel Button2Panel = new JPanel();
            Button2Panel.setLayout(new GridLayout(1,2));
            hamburgerPanel.add(Button2Panel);

            JPanel Button3Panel = new JPanel();
            Button3Panel.setLayout(new GridLayout(1,2));
            hamburgerPanel.add(Button3Panel);

            JPanel Button4Panel = new JPanel();
            Button4Panel.setLayout(new GridLayout(1,2));
            hamburgerPanel.add(Button4Panel);

            JPanel Button5Panel = new JPanel();
            Button5Panel.setLayout(new GridLayout(1,2));
            hamburgerPanel.add(Button5Panel);

            JLabel infoLabel = new JLabel("IDK MAN");
            Button1Panel.add(infoLabel);

            JLabel subjLabel = new JLabel("Subject");
            Button2Panel.add(subjLabel);
            JComboBox addSubjComboBox = new JComboBox<>();
            Button2Panel.add(addSubjComboBox);

            JLabel typeLabel = new JLabel("Type");
            Button3Panel.add(typeLabel);
            JComboBox addTypeComboBox = new JComboBox<>();
            Button3Panel.add(addTypeComboBox);

            JLabel qNumLabel = new JLabel("Number of Questions");
            Button4Panel.add(qNumLabel);
            JTextField addSubTextField = new JTextField("bag");
            Button4Panel.add(addSubTextField);

            

            JButton addButton = new JButton("add");
            Button5Panel.add(addButton);
            JButton cancelButton = new JButton("cancel");
            Button5Panel.add(cancelButton);

             mainPanel.add(BorderLayout.CENTER, hamburgerPanel);

            this.setContentPane(mainPanel);
        }
}

//for tomorrow me; this window will also be used for time calc, just check the text on the button to determine behavior