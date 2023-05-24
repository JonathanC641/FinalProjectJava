import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MyPanel extends JPanel implements ActionListener{
    Image character;
    int xVelocity = 1;
    int yVelocity = 1;
    int x = 0;
    int y = 0;
    public MyPanel(){
        this.setPreferredSize(new Dimension(500,500));
        character = new ImageIcon("unnamed.png").getImage();
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(character, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
