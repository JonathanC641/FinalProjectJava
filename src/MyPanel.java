import java.awt.*;
import java.awt.event.*;
import java.security.Key;

import javax.swing.*;

public class MyPanel extends JPanel implements MouseListener, MouseWheelListener, KeyListener {
//    final int PANEL_WIDTH = 500;
//    final int PANEL_HEIGHT = 500;

    JLabel label;
    JLabel label2;

    ImageIcon billy;
    ImageIcon timmy;

    Image stage;



    MyPanel(){
        ImageIcon background = new ImageIcon("C:\\Users\\omarj\\IdeaProjects\\FinalProjectJava\\src\\cliff.png");
        stage = background.getImage();
        billy = new ImageIcon("C:\\Users\\omarj\\IdeaProjects\\FinalProjectJava\\src\\billy.png");
        timmy = new ImageIcon("C:\\Users\\omarj\\IdeaProjects\\FinalProjectJava\\src\\pixil-frame-0.png");
        label = new JLabel();
        label2 = new JLabel();
        label.setIcon(billy);
        label2.setIcon(timmy);
        this.add(label);
        this.add(label2);
        addKeyListener(this);
        addMouseListener(this);
        addMouseWheelListener(this);
    }

    public void paintComponent(Graphics g){
        g.drawImage(stage,0,0,null);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int num  = e.getButton();
        if(num == 1){
            label2.setLocation(label2.getX()-10,label2.getY());
        }else if(num == 3){
            label2.setLocation(label2.getX()+10,label2.getY());
        }
    }



    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        int num = e.getWheelRotation();
        System.out.println(num);
        if(num > 0){
            label2.setLocation(label2.getX(), label2.getY()+10);
        }else{
            label2.setLocation(label2.getX(), label2.getY()-10);
        }
    }


    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyChar()) {
            case 'a': label.setLocation(label.getX()-10,label.getY());
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
    public void keyReleased(KeyEvent e) {}
    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    @Override
    public void keyTyped(KeyEvent e) {}
}