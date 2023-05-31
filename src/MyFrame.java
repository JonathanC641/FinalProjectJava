import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyFrame extends JFrame implements MouseListener, KeyListener, MouseWheelListener{


    JLabel label;
    JLabel label2;

    ImageIcon billy;
    ImageIcon timmy;


    MyPanel panel;



    MyFrame(){
        panel = new MyPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,1000);
        this.setLayout(new FlowLayout());
        //Characters
        billy = new ImageIcon("C:\\Users\\student\\IdeaProjects\\FinalProjectJava\\src\\billy.png");
        timmy = new ImageIcon("C:\\Users\\student\\IdeaProjects\\FinalProjectJava\\src\\pixil-frame-0.png");
        label = new JLabel();
        label2 = new JLabel();
        label.setIcon(billy);
        label2.setIcon(timmy);
        this.add(label);
        this.add(label2);
        this.add(panel,BorderLayout.SOUTH);
        addKeyListener(this);
        addMouseListener(this);
        addMouseWheelListener(this);
        this.setVisible(true);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked!");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed!");
        if(e.getButton() == 1){
            System.out.println(e.getButton());
            label2.setLocation(label2.getX()-10,label2.getY());
        }else if(e.getButton() == 3){
            label2.setLocation(label2.getX()+10, label2.getY());
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released!");


    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        int scroll = e.getWheelRotation();
        if(scroll > 0){
            label2.setLocation(label2.getX(), label2.getY()-10);
        }else{
            label2.setLocation(label2.getX(), label2.getY()+10);
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {
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
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

   
}
