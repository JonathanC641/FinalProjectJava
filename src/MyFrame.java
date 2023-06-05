import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyFrame extends JFrame implements MouseListener, KeyListener, MouseWheelListener, ActionListener{




    MyPanel gameScreen;

    JPanel start;

    JButton startButton;

    JPanel mainPanel;
    CardLayout cardLayout;



    MyFrame(){;
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        start = new JPanel();
        gameScreen = new MyPanel();
        gameSetup();
        startPanel();
        mainPanel.add(start,"start");
        mainPanel.add(gameScreen,"game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,1000);
        this.setLayout(new FlowLayout());
        this.setContentPane(mainPanel);
        addKeyListener(this);
        addMouseListener(this);
        addMouseWheelListener(this);
        this.setVisible(true);
    }


    public void startPanel(){
        start = new JPanel(new CardLayout());
        startButton = new JButton();
        startButton.setText("Start");
        start.add(startButton);
        startButton.addActionListener(this);
    }

    public void gameSetup() {
        gameScreen = new MyPanel();
    }


    @Override
    public void mousePressed(MouseEvent e) {
        int num = e.getButton();
        gameScreen.mouseCharacter(num,false);
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        int scroll = e.getWheelRotation();
        gameScreen.mouseCharacter(scroll,true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        char key = e.getKeyChar();
        gameScreen.keyCharacter(key);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("test");
        cardLayout.show(mainPanel,"game");
    }












    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}


    @Override
    public void keyReleased(KeyEvent e) {}





}
