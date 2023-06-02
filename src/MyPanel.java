import java.awt.*;

import javax.swing.*;

public class MyPanel extends JPanel{
    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;

    Image background;



    MyPanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        background = new ImageIcon("C:\\Users\\student\\IdeaProjects\\FinalProjectJava\\src\\cliff.png").getImage();
    }

    public void paint(Graphics g){
        Graphics2D platform = (Graphics2D) g;
        platform.drawImage(background,0,0,null);
    }

}