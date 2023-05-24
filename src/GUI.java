import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;


public class GUI extends JFrame implements KeyListener {
    MyPanel panel = new MyPanel();

    public GUI(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.addKeyListener(this);
        this.setVisible(true);
        this.add(panel);
    }




    @Override
    public void keyTyped(KeyEvent e) {
        //Invoked when a key is typed. Uses KeyChar, char output
    }

    @Override
    public void keyPressed(KeyEvent e) {


    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
