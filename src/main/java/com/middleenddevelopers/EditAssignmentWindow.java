package com.middleenddevelopers;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

import java.util.ArrayList;

public class EditAssignmentWindow extends JFrame {
    ArrayList<String> stringlist = new ArrayList<>();
        public EditAssignmentWindow(String title) {
            super(title);

            JPanel mainPanel = new JPanel();
            mainPanel.setLayout(new BorderLayout());

            JPanel list1Panel = new JPanel();
            list1Panel.setLayout(new GridLayout(2,1));

            JPanel list2Panel = new JPanel();
            list2Panel.setLayout(new GridLayout(2,1));

            JPanel list3Panel = new JPanel();
            list3Panel.setLayout(new GridLayout(2,1));


            JLabel subjLabel = new JLabel("subj");
            list1Panel.add(subjLabel);
            JComboBox subjComboBox = new JComboBox<>();
            list1Panel.add(subjComboBox);

            JLabel typeLabel = new JLabel("type");
            list2Panel.add(typeLabel);
            JComboBox typeComboBox = new JComboBox<>();
            list2Panel.add(typeComboBox);

            JLabel assiLabel = new JLabel("assignment");
            list3Panel.add(assiLabel);
            JComboBox assiComboBox = new JComboBox<>();
            list3Panel.add(assiComboBox);


            JPanel delJPanel = new JPanel();
            delJPanel.setLayout(new GridLayout(1,1));
            JButton delButton = new JButton();
            delButton.add(delJPanel);

            JPanel hamburgerPanel = new JPanel();
            hamburgerPanel.setLayout(new GridLayout(1,3));
            hamburgerPanel.add(list1Panel);
            hamburgerPanel.add(list2Panel);
            hamburgerPanel.add(list3Panel);

             mainPanel.add(BorderLayout.NORTH, hamburgerPanel);

            this.setContentPane(mainPanel);
        }
    }