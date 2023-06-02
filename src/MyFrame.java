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


    JLabel label;
    JLabel label2;

    ImageIcon billy;
    ImageIcon timmy;

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
        mainPanel.add(start,"start");
        mainPanel.add(gameScreen,"game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,1000);
        this.setLayout(new FlowLayout());
        gameSetup();
        startPanel();
        this.add(mainPanel);
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

    public void gameSetup(){
        gameScreen = new MyPanel();
        billy = new ImageIcon("C:\\Users\\student\\IdeaProjects\\FinalProjectJava\\src\\billy.png");
        timmy = new ImageIcon("C:\\Users\\student\\IdeaProjects\\FinalProjectJava\\src\\pixil-frame-0.png");
        label = new JLabel();
        label2 = new JLabel();
    }

    public void characterSetup(){
        label.setIcon(billy);
        label2.setIcon(timmy);
        add(label);
        add(label2);
    }


    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getButton() == 1){
            label2.setLocation(label2.getX()-10,label2.getY());
        }else if(e.getButton() == 3){
            label2.setLocation(label2.getX()+10, label2.getY());
        }
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        int scroll = e.getWheelRotation();
        if(scroll > 0){
            label2.setLocation(label2.getX(), label2.getY()+10);
        }else{
            label2.setLocation(label2.getX(), label2.getY()-10);
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyChar()) {
            case 'a': label.setLocation(label.getX()-10, label.getY());
                break;
            case 'w': label.setLocation(label.getX(), label.getY()-10);
                break;
            case 's': label.setLocation(label.getX(), label.getY()+10);
                break;
            case 'd': label.setLocation(label.getX()+10, label.getY());
                break;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        characterSetup();
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
