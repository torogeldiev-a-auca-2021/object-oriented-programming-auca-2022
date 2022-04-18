package p03;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame {
    JPanel mainPanel;
    JPanel controlPanel;

    JButton redButton = new JButton("RED");
    JButton greenButton = new JButton("GREEN");
    JButton blueButton = new JButton("BLUE");

    Main() {
        setLayout(new BorderLayout());
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.RED);
        add(mainPanel, BorderLayout.CENTER);
        controlPanel = new JPanel();
        controlPanel.setBackground(Color.GRAY);
        controlPanel.add(redButton);
        controlPanel.add(greenButton);
        controlPanel.add(blueButton);
        add(controlPanel, BorderLayout.SOUTH);

        redButton.addActionListener(new ButtonActionListener(Color.RED));
        greenButton.addActionListener(new ButtonActionListener(Color.GREEN));
        blueButton.addActionListener(new ButtonActionListener(Color.BLUE));

    }


    public static void main(String[] args) {
        Main frame = new Main();
        frame.setTitle("First Swing App");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    class ButtonActionListener implements ActionListener {
        Color color;

        ButtonActionListener(Color color) {
            this.color = color;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            mainPanel.setBackground(color);
        }
    }
}