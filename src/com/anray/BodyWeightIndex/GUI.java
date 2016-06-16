package com.anray.BodyWeightIndex;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by anray on 16.06.2016.
 */
public class GUI {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel weightLabel = new JLabel("Введите Вашу массу тела: ");
    JLabel heightLabel = new JLabel("Введите Ваш рост: ");
    JLabel resultLabel = new JLabel();
    JTextField weightField = new JTextField(10);
    JTextField heightField = new JTextField(10);
    JButton calcButton = new JButton("Рассчитать");
    JButton clearButton = new JButton("Сбросить");

    public void buildGui(){

        panel.add(weightLabel);
        panel.add(weightField);

        panel.add(heightLabel);
        panel.add(heightField);

        calcButton.addActionListener(new CalcButton());
        clearButton.addActionListener(new ClearButton());
        panel.add(calcButton);
        panel.add(clearButton);

        panel.add(resultLabel);

        frame.getContentPane().add(panel);
        frame.setSize(200,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    class ClearButton implements ActionListener{
        public void actionPerformed(ActionEvent e){
            weightField.setText("");
            heightField.setText("");
            resultLabel.setText("");

        }

    }

    class CalcButton implements ActionListener{
        public void actionPerformed(ActionEvent e){

        }
    }


    public static void main(String[] args){
        new GUI().buildGui();
    }
}
