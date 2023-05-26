import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyFrame extends JFrame implements KeyListener, MouseMotionListener{


    JLabel label;
    JLabel label2;

    ImageIcon icon;
    ImageIcon icon2;

    MyPanel background;



    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        //Background
        background = new MyPanel();
        this.add(background);
        this.setLayout(null);
        this.addKeyListener(this);
        icon = new ImageIcon("C:\\Users\\student\\IdeaProjects\\FinalProjectJava\\src\\image.png");
        icon2 = new ImageIcon("C:\\Users\\student\\IdeaProjects\\FinalProjectJava\\src\\pixil-frame-0.png");
        label = new JLabel();
        label.setBounds(0, 0, 500, 500);
        label.setIcon(icon);
        label2 = new JLabel();
        label2.setBounds(0,0,500,500);
        label2.setIcon(icon2);
        this.add(label);
        this.add(label2);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //keyTyped = Invoked when a key is typed. Uses KeyChar, char output
        switch(e.getKeyChar()) {
            case 'a': label.setLocation(label.getX()-10, label.getY());
                break;
            case 'w': label.setLocation(label.getX(), label.getY()-10);
                break;
            case 's': label.setLocation(label.getX(), label.getY()+10);
                break;
            case 'd': label.setLocation(label.getX()+10, label.getY());
                break;
            case 'j': label2.setLocation(label2.getX()-10,label2.getY());
                break;
            case'i':label2.setLocation(label2.getX(),label2.getY()-10);
                break;
            case'k':label2.setLocation(label2.getX(),label2.getY()+10);
                break;
            case'l':label2.setLocation(label2.getX()+10,label2.getY());
                break;
        }



    }

    @Override
    public void keyPressed(KeyEvent e) {
        //keyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output
//        switch(e.getKeyCode()) {
//            case 37: label.setLocation(label.getX()-10, label.getY());
//                break;
//            case 38: label.setLocation(label.getX(), label.getY()-10);
//                break;
//            case 39: label.setLocation(label.getX()+10, label.getY());
//                break;
//            case 40: label.setLocation(label.getX(), label.getY()+10);
//                break;
//        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //keyReleased = called whenever a button is released
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
