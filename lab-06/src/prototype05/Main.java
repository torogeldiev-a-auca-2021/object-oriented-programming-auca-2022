package prototype05;

import prototype03.Figure;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class Main extends JFrame {
    JPanel mainPanel;
    JPanel controlPanel;
    JButton rectButton;
    JButton circleButton;
    JButton crossButton;

    ArrayList<Figure> figures = new ArrayList<>();
    Figure selectedFigure = null;
    int selectedFigureX;
    int selectedFigureY;

    Main() {
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.WHITE);
        add(mainPanel, BorderLayout.CENTER);

        controlPanel = new JPanel();
        controlPanel.setBackground(Color.GRAY);
        add(controlPanel, BorderLayout.SOUTH);

        rectButton = new JButton("Rectangle");
        circleButton = new JButton("Circle");
        crossButton = new JButton("Cross");

        controlPanel.setLayout(new GridLayout(1, 3));
        controlPanel.add(rectButton);
        controlPanel.add(circleButton);
        controlPanel.add(crossButton);

        rectButton.addActionListener(e-> {
            figures.add(new Rect(0, 0, 100, 100));
            repaint();
            mainPanel.requestFocus();
        });

        circleButton.addActionListener(e-> {
            figures.add(new Circle(150, 50, 50));
            repaint();
            mainPanel.requestFocus();
        });

        crossButton.addActionListener(e-> {
            figures.add(new Cross(250, 50, 100, 10));
            repaint();
            mainPanel.requestFocus();
        });

        mainPanel.setFocusable(true);
        mainPanel.requestFocus();

        mainPanel.addMouseListener(new CanvasPanelMouseAdapter());
        mainPanel.addKeyListener(new CanvasPanelKeyboardAdapter());
        mainPanel.addMouseMotionListener(new CanvasPanelMouseMotionListener());
    }

    public static void main(String[] args) {
        Main frame = new Main();
        frame.setTitle("Simple Graphics Editor");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    class CanvasPanel extends JPanel{
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);

            for (Figure f : figures){
                f.draw(g);
            }
        }
    }

    private class CanvasPanelMouseAdapter extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getButton() == MouseEvent.BUTTON3) {
                for (Figure f : figures) {
                    if (f.contains(e.getX(), e.getY())) {
                        JOptionPane.showMessageDialog(null, f);
                    }
                }
            }
        }

        @Override
        public void mousePressed(MouseEvent e){
            if (selectedFigure != null) {
                selectedFigure.setSelected(false);
                selectedFigure = null;
            }
            for(Figure f :figures){
                if(f.contains(e.getX(), e.getY())) {
                    selectedFigure = f;
                    selectedFigure.setSelected(true);
                    selectedFigureX = e.getX();
                    selectedFigureY = e.getY();
                    break;
                }
            }
            repaint();
        }
    }

    private class CanvasPanelKeyboardAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e){
            super.keyPressed(e);
            selectedFigure = null;
            repaint();
        }
    }

    private class CanvasPanelMouseMotionListener extends MouseMotionAdapter {
        @Override
        public void mouseDragged(MouseEvent e) {
            if(selectedFigure!=null){
                selectedFigure.move(e.getX()-selectedFigureX,e.getY()-selectedFigureY);
                selectedFigureX=e.getX();
                selectedFigureY=e.getY();
                repaint();
            }
        }
    }
}
