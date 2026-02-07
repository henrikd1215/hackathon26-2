package com.middleenddevelopers;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import java.util.ArrayList;

public class MainWindow extends JFrame {
    ArrayList<String> stringlist = new ArrayList<>();
        public MainWindow(String title) {
            super(title);

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            AddAssignmentWindow AddWindow = new AddAssignmentWindow("Homework Time Calculator");

            AddWindow.setSize(800, 500);
            AddWindow.setLocation(500,200);
            AddWindow.setVisible(false);


            EditAssignmentWindow EditWindow = new EditAssignmentWindow("Homework Time Calculator");

            EditWindow.setSize(800, 500);
            EditWindow.setLocation(500,200);
            EditWindow.setVisible(false);

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
            class CalcListener implements ActionListener
            {
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                    if (!AddWindow.isVisible()) //Make sure the window isn't already open
                    {
                        AddWindow.setVisible(true); //Make the window visible otherwise
                        AddWindow.changeAddText("Calculate");
                        AddWindow.infoLabel.setText("Calculate the time an assignment will take.");
                    }
                }
            }
            calcButton.addActionListener(new CalcListener());
            

            JButton addButton = new JButton("add");
            Button2Panel.add(addButton);
            class AddListener implements ActionListener
            {
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                    if (!AddWindow.isVisible())
                    {
                        AddWindow.setVisible(true);
                        AddWindow.changeAddText("Add Assignment");
                        AddWindow.infoLabel.setText("Add assignments here. All fields must be filled");
                    }
                }
            }
            addButton.addActionListener(new AddListener());

            JButton editButton = new JButton("edit");
            Button3Panel.add(editButton);

            JButton addSubButton = new JButton("add subj");
            Button4Panel.add(addSubButton);
            JTextField addSubTextField = new JTextField("bag");
            Button4Panel.add(addSubTextField);
            class AddSubjListener implements ActionListener
            {
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                    if (addSubTextField.getText().isEmpty())
                    {
                        addSubTextField.setText("Invalid or empty subject.");
                    }
                    else
                    {
                        Subject subjHolder = new Subject(addSubTextField.getText());
                        addSubTextField.setText("Success! Subject "+addSubTextField.getText()+" was added");
                        //SubjectsHandler.add(subjHolder);
                    }
                }
            }
            addSubButton.addActionListener(new AddSubjListener());

            JButton addTypeButton = new JButton("add type");
            Button5Panel.add(addTypeButton);
            JTextField addTypeTextField = new JTextField("bag");
            Button5Panel.add(addTypeTextField);
            JComboBox addTypeComboBox = new JComboBox<>();
            Button5Panel.add(addTypeComboBox);
            class AddTypeListener implements ActionListener
            {
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                    if (addSubTextField.getText().isEmpty())
                    {
                        addTypeTextField.setText("Invalid or empty assignment type.");
                    }
                    else if (addTypeComboBox.getSelectedItem() == null)
                    {
                        addTypeTextField.setText("Invalid or empty subject.");
                    }
                    else
                    {
                        Subject subjHolder = new Subject(addTypeTextField.getText());
                        addTypeTextField.setText("Assignment type "+addSubTextField.getText()+" added to subject "+addTypeComboBox.getSelectedItem());
                        //SubjectsHandler.add(subjHolder);
                    }
                }
            }
            addTypeButton.addActionListener(new AddTypeListener());

            for (Subject s: SubjectsHandler.subjects)
            {
               addTypeComboBox.addItem(s.name);
            }


            
        
            
            JPanel AddTypePanel = new JPanel();
            AddTypePanel.setLayout(new BoxLayout(AddTypePanel, 0));


            
            

            mainPanel.add(BorderLayout.CENTER, hamburgerPanel);

            this.setContentPane(mainPanel);

            
        }
}
