import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyFrame extends JFrame implements ActionListener{




    MyPanel gameScreen;

    JPanel start;

    JButton startButton;

    JPanel mainPanel;
    CardLayout cardLayout;





    MyFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        gameSetup();
        startPanel();

        mainPanel.add(start,"start");
        mainPanel.add(gameScreen,"game");
        setSize(1000,1000);
//        setLayout(new FlowLayout());
        setContentPane(mainPanel);



        this.setVisible(true);
    }
    

    public void startPanel(){
        start = new JPanel();
        startButton = new JButton();
        JLabel title = new JLabel();
        ImageIcon image = new ImageIcon("C:\\Users\\student\\IdeaProjects\\FinalProjectJava\\src\\b3943d0f58551f418d8d465fd7c36fbd.png");
        title.setIcon(image);
        start.setBackground(Color.black);
        start.setOpaque(true);
        startButton.setText("RoughHouse");
//        setBackground(Color.RED);
//        options.setText("Options");
//        super.paintComponent(graphics g)
//        JLayeredPane layeredPane = new JLayeredPane();
//        setContentPane(layeredPane);
////        Image image = new ImageIcon("C:\\Users\\student\\IdeaProjects\\FinalProjectJava\\src\\billy.png").getImage();
////        g.drawImage(image, 0, 0, getWidth(), getHeight(), this
//        layeredPane.add(start,Integer.valueOf(1));
        start.add(startButton);
//        start.add(options);
        startButton.addActionListener(this);
        start.add(startButton);
        start.add(title);
    }

    public void gameSetup() {
        gameScreen = new MyPanel();
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        cardLayout.next(mainPanel);
        gameScreen.requestFocusInWindow();
    }

}
