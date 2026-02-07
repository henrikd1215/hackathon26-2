package com.middleenddevelopers;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class DataWindow extends JFrame {
     public DataWindow(String title) {
            super(title);

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel mainPanel = new JPanel();
            mainPanel.setLayout(new BorderLayout());
            
        }
}
