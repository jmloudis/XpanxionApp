package com.example.jframe;

import javax.swing.*;

public class createGUI extends JFrame{

    public static JFrame createJFrame(){

        JFrame f = new JFrame("Hello World");
        //set size and location of frame
        f.setSize(390, 400);
        f.setLocation(100, 150);
        //make sure it quits when x is clicked
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set look and feel
        f.setDefaultLookAndFeelDecorated(true);

        JLabel labelM = new JLabel("Enter message here");
        labelM.setBounds(50, 50, 200, 30);
        JTextField motto1 = new JTextField();
        //set size of the text box
        motto1.setBounds(50, 100, 200, 30);
//       // set button
        JButton jb = new JButton("Convert");
        jb.setBounds(50, 150, 200, 30);

//      Add output
        JLabel output = new JLabel();
        output.setBounds(50, 200, 200, 30);


        jb.addActionListener( event -> {
            output.setText(TitlecaseConverter.convertToTitlecase(motto1.getText()));
        });

        //add elements to the frame
        f.add(labelM);
        f.add(motto1);
        f.add(jb);
        f.add(output);
        f.setLayout(null);
        f.setVisible(true);


        return f;
    }
}
