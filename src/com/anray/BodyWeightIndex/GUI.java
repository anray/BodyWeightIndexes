package com.anray.BodyWeightIndex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

/**
 * Created by anray on 16.06.2016.
 */
public class GUI {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel weightLabel = new JLabel("Введите Вашу массу тела (кг): ");
    JLabel heightLabel = new JLabel("Введите Ваш рост (см): ");
    JLabel resultLabel = new JLabel();
    JTextField weightField = new JTextField(10);
    JTextField heightField = new JTextField(10);
    JButton calcButton = new JButton("Рассчитать");
    JButton clearButton = new JButton("Сбросить");

    public void buildGui(){

        panel.add(weightLabel);
        weightField.setMaximumSize(new Dimension(200,20));
        weightField.setInputVerifier(new FloatVerifier());
        panel.add(weightField);

        panel.add(heightLabel);
        heightField.setMaximumSize(new Dimension(200,20));
        heightField.setInputVerifier(new FloatVerifier());
        panel.add(heightField);

        calcButton.addActionListener(new CalcButton());
        clearButton.addActionListener(new ClearButton());
        panel.add(calcButton);
        panel.add(clearButton);

        panel.add(resultLabel);

        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));


        frame.getContentPane().add(panel);

        frame.setSize(400,400);
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
        public void actionPerformed(ActionEvent e) {
            float weight = 0;
            float height = 0;
            try {
                 weight = Float.parseFloat(weightField.getText());
                 height = Float.parseFloat(heightField.getText());
                float calcResult = com.anray.BodyWeightIndex.WeightIndexCalculator.calculateWeightIndex(weight,height);
                String textResult = null;
                textResult = com.anray.BodyWeightIndex.WeightIndexCalculator.getWeightIndexTitle(calcResult);

                resultLabel.setText(textResult);
            } catch (NumberFormatException ex)
            {
                resultLabel.setText("Вы ввели не числа в поля! Пожалуйста, исправьте.");

            }

        }
    }

    class FloatVerifier extends InputVerifier {
        @Override
        public boolean verify(JComponent input) {
            String text = ((JTextField) input).getText();
            try {
                BigDecimal value = new BigDecimal(text);
                resultLabel.setText("");
                return true;
            } catch (NumberFormatException ex) {
                resultLabel.setText("Вы ввели не числа в поля! Пожалуйста, исправьте.");
                return false;

            }
        }
    }


    public static void main(String[] args){
        new GUI().buildGui();
    }
}
