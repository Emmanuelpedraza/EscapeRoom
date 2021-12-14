import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

// problems you answer
public class EscapeRoomGUI {


    JButton NxtLevel = new JButton("CLICK TO GO TO NEXT LEVEL!!!");
    JButton start = new JButton("ClICK TO START IF YOU THINK YOU CAN BEAT THIS");
    JButton QUESTION1 = new JButton("FIRST QUESTION!!!!");
    JButton QUESTION2 = new JButton("IS THIS THE SECOND QUESZTIONS");
    JButton QUESTION3 = new JButton("CLICK THIS FOR YOUR THIRD !! ");
    JPanel panel;


    public EscapeRoomGUI() {
        JFrame frame = new JFrame("ESCAPE THE ROOM ");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);


        start.addActionListener(new startListener());
        QUESTION1.addActionListener(new Q1());
        QUESTION2.addActionListener(new Q2());



        panel = new JPanel();
        panel.add(start);

        panel.add(QUESTION1);
        panel.remove(QUESTION1);
        panel.updateUI();

        panel.add(QUESTION2);
        panel.remove(QUESTION2);
        panel.updateUI();

        panel.add(QUESTION3);
        panel.remove(QUESTION3);
        panel.updateUI();

        panel.add(NxtLevel);
        panel.remove(NxtLevel);
        panel.updateUI();

        frame.add(panel);
        frame.setVisible(true);

    }


    private class startListener implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) {

            int Q0 = Integer.parseInt(JOptionPane.showInputDialog("What is 2 + 2 ?"));

            if (Q0 == 4) {
                JOptionPane.showMessageDialog(null, "YOUR WRONG (CLUE ONLY WRONG ANSWERS) ");
            } else {
                if (Q0 == 3) {
                    JOptionPane.showMessageDialog(null, "YOUR CORRECT NEXT QUESTION !!!!!!!!!");
                    ;
                    panel.add(QUESTION1);
                    panel.updateUI();
                }
            }

        }
    }

    private class Q1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            int Q1 = Integer.parseInt(JOptionPane.showInputDialog("what is 10 - 8"));

            if (Q1 == 2) {
                JOptionPane.showMessageDialog(null, " YOUR WRONG TRY AGaIn !!!!");
            } else {
                if (Q1 == 1) {
                    JOptionPane.showMessageDialog(null, "yOu MadE It Next QueStion!!!!!!!!");
                    panel.add(QUESTION2);
                    panel.updateUI();


                }
            }
        }
    }

    private class Q2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            int number1 = random();
            int number2 = random();
            int Q2 = Integer.parseInt(JOptionPane.showInputDialog("WHAT Is  " + number1 + "+ " + number2));

            double correctAnswer = number2 + number1 - 1;

            if (Q2 == correctAnswer) {
                panel.add(QUESTION3);
                panel.updateUI();
                JOptionPane.showMessageDialog(null, " YOU made it NEZT");

            } else {
                JOptionPane.showMessageDialog(null, "TRY AGAIn");
            }

        }

        private class Q3 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int num1 = random();
        int num2 = random();
        int Q3 = Integer.parseInt(JOptionPane.showInputDialog("What is " + num1 + "+" + num2 ));

        double correctAnswer = num1 + num2 - 1;

        if (Q3 == correctAnswer){
            JOptionPane.showMessageDialog(null ,"You have made it through the first level HAPPY BIRTHDAY !!!!!! -__-");
        }else{
            JOptionPane.showMessageDialog(null, "YOU HAVE FAILED IF YOU MISSED 3 QUESTIONS !!!!!!!!!!");
        }
    }
}

        public int random() {
            Random random = new Random();

            return random.nextInt(10) + 1;

        }
    }
}
