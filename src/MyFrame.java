import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyFrame extends JFrame {


    JLabel label;
    JLabel label2;

    ImageIcon icon;
    ImageIcon icon2;


    ImageIcon image;

    MyPanel panel;



    MyFrame(){
        panel = new MyPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.setSize(1000,1000);

        this.setLayout(new FlowLayout());
        this.setVisible(true);
    }


}
