import java.awt.*;

import javax.swing.*;

public class MyPanel extends JPanel{
    final int PANEL_WIDTH = 1920;
    final int PANEL_HEIGHT = 1080;

    Image background;





    MyPanel(){
        background = new ImageIcon("C:\\Users\\student\\IdeaProjects\\FinalProjectJava\\src\\cliff.png").getImage();
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));

    }

}