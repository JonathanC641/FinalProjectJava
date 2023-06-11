import java.awt.*;
import java.awt.event.*;
import java.security.Key;
import javax.swing.*;

public class MyPanel extends JPanel implements MouseListener, MouseWheelListener, KeyListener {

    JLabel label;
    JLabel label2;

    ImageIcon billy;
    ImageIcon timmy;
    ImageIcon hurtBilly;
    ImageIcon hurtTimmy;
    Image stage;

    private boolean boundsCheck;


    MyPanel(){
        creatingCharacters();
        ImageIcon background = new ImageIcon("C:\\Users\\omarj\\IdeaProjects\\FinalProjectJava\\src\\MountainStage.png");
        stage = background.getImage();
        add(label);
        add(label2);
        label.setLocation(450,965);
        label2.setLocation(600,930);
        addKeyListener(this);
        addMouseListener(this);
        addMouseWheelListener(this);
    }

    public void paintComponent(Graphics g){
        g.drawImage(stage,0,0,null);
    }


    public void creatingCharacters(){
        billy = new ImageIcon("C:\\Users\\omarj\\IdeaProjects\\FinalProjectJava\\src\\Billy (1).png");
        timmy = new ImageIcon("C:\\Users\\omarj\\IdeaProjects\\FinalProjectJava\\src\\Timmy.png");
        hurtTimmy = new ImageIcon("C:\\Users\\omarj\\IdeaProjects\\FinalProjectJava\\src\\hurtTimmy.png");
        hurtBilly = new ImageIcon("C:\\Users\\omarj\\IdeaProjects\\FinalProjectJava\\src\\hurtBilly.png");
        label = new JLabel();
        label.setIcon(billy);
        label2 = new JLabel();
        label2.setIcon(timmy);
    }

    @Override
    public void mousePressed(MouseEvent e) {
//        int num  = e.getButton();
//        if(num == 1){
//            label2.setLocation(label2.getX()-10,label2.getY());
//        }else if(num == 3){
//            label2.setLocation(label2.getX()+10,label2.getY());
//        }
    }




    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        //  Min Height Bound = 930
//        int num = e.getWheelRotation();
//        System.out.println(num);
//        if(num > 0){
//            label2.setLocation(label2.getX(), label2.getY()+10);
//        }else{
//            label2.setLocation(label2.getX(), label2.getY()-10);
//        }
    }


    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyChar()) {
            case 'a':
                boundsCheck= label.getX() - 10 >= 100;
                if(boundsCheck) {
                    label.setLocation(label.getX() - 10, label.getY());
                }
                System.out.println(label.getLocation());
                break;
            case 'w':
                boundsCheck = label.getY() - 10 >= 935;
                if(boundsCheck){
                    label.setLocation(label.getX(), label.getY()-10);
                    System.out.println(label.getLocation());
                }
                break;
            case 's':
                boundsCheck = label.getY() + 10 <= 965;
                if(boundsCheck){
                    label.setLocation(label.getX(), label.getY()+10);
                    System.out.println(label.getLocation());
                }
                break;
            case 'd':
                boundsCheck = label.getX() + 10 < 1050;
                if(boundsCheck) {
                    label.setLocation(label.getX() + 10, label.getY());
                }
                System.out.println(label.getLocation());
                break;
            case 'e': attack();
                break;
        }
    }

    public void attack(){
        if(label.getX() >= label2.getX() && label.getX() <= label2.getX()+5){
            label.setIcon(hurtBilly);
        }
        label.setIcon(billy);
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
    public void keyTyped(KeyEvent e) {

    }
}