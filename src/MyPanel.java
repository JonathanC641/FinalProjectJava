import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel implements KeyListener {
    final int PANEL_WIDTH = 1920;
    final int PANEL_HEIGHT = 1080;

    final int BILLY_HEIGHT = 1100;
    Image billy;
    Image Jokic;
    Image background;

    Timer timer;
    int xVelocity = 5;
    int yVelocity = 5;
    int x = 0;
    int y = 0;




    MyPanel(){

        background = new ImageIcon("C:\\Users\\student\\IdeaProjects\\FinalProjectJava\\src\\cliff.png").getImage();
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        billy = new ImageIcon("C:\\Users\\student\\IdeaProjects\\FinalProjectJava\\src\\billy.png").getImage();
        Jokic = new ImageIcon("C:\\Users\\student\\IdeaProjects\\FinalProjectJava\\src\\pixil-frame-0.png").getImage();
//        timer = new Timer(10, this);
//        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(background, 0, 0, this);
        g2D.drawImage(Jokic,x,y,this);
        g2D.drawImage(billy,x,y,this);
    }



    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}