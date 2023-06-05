import java.awt.*;

import javax.swing.*;

public class MyPanel extends JPanel{
    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;

    JLabel label;
    JLabel label2;

    ImageIcon billy;
    ImageIcon timmy;

    Image background;



    MyPanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        background = new ImageIcon("C:\\Users\\student\\IdeaProjects\\FinalProjectJava\\src\\cliff.png").getImage();
        billy = new ImageIcon("C:\\Users\\student\\IdeaProjects\\FinalProjectJava\\src\\billy.png");
        timmy = new ImageIcon("C:\\Users\\student\\IdeaProjects\\FinalProjectJava\\src\\pixil-frame-0.png");
        label = new JLabel();
        label2 = new JLabel();
        label.setIcon(billy);
        label2.setIcon(timmy);
        this.add(label);
        this.add(label2);
    }

    public void paint(Graphics g){
        super.paint(g);
        Graphics2D platform = (Graphics2D) g;
        platform.drawImage(background,0,0,null);
    }

    public void mouseCharacter(int num, boolean scroll){
        if(scroll){
            if(num > 0){
                label2.setLocation(label2.getX(), label2.getY()+10);
            }else{
                label2.setLocation(label2.getX(), label2.getY()-10);
            }
        }else if (num == 1){
            label2.setLocation(label2.getX()-10,label2.getY());
        }else if(num == 3){
            label2.setLocation(label2.getX()+10,label2.getY());
        }
    }

    public void keyCharacter(char key){
        switch(key) {
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


    public JLabel getCharacter(){
        return label;
    }

    public JLabel getCharacter2(){
        return label2;
    }



}