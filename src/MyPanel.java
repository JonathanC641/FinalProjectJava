import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MyPanel extends JPanel implements ActionListener{
    Image background;
    int x = 0;
    int y = 0;
    public MyPanel(){
        this.setPreferredSize(new Dimension(500,500));
        background = new ImageIcon("background.png").getImage();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(background, x, y, null);
    }


    public void actionPerformed(ActionEvent e) {

    }
}