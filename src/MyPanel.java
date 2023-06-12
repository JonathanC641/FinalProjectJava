import java.awt.*;
import java.awt.event.*;
import java.security.Key;
import javax.swing.*;
import javax.swing.plaf.basic.BasicTableHeaderUI;

public class MyPanel extends JPanel implements MouseListener, MouseWheelListener, KeyListener {

    JLabel label;
    JLabel label2;

    ImageIcon billy;
    ImageIcon timmy;

    JProgressBar BHealth;
    JProgressBar THealth;
    ImageIcon hurtBilly;
    ImageIcon hurtTimmy;
    Image stage;



    private boolean boundsCheck;
    private boolean once;

    MyPanel(){
        once = true;
        ImageIcon background = new ImageIcon("C:\\Users\\student\\IdeaProjects\\FinalProjectJava\\src\\MountainStage - Copy (1).png");
        stage = background.getImage();
        creatingCharacters();
        healthSetup();
        add(BHealth);
        add(THealth);
        add(label);
        add(label2);
        addKeyListener(this);
        addMouseListener(this);
        addMouseWheelListener(this);
    }
    


    public void paintComponent(Graphics g){
        g.drawImage(stage,0,0,null);
        if(once){
//            label.setLocation(1000,965);
//            label2.setLocation(140,930);
            label.setLocation(749,650);
            label2.setLocation(50,620);

            THealth.setLocation(1, 5);
            BHealth.setLocation(560,5);
            once = false;
        }
      
    }


    public void creatingCharacters(){
        billy = new ImageIcon("C:\\Users\\student\\IdeaProjects\\FinalProjectJava\\src\\Billy (1).png");
        timmy = new ImageIcon("C:\\Users\\student\\IdeaProjects\\FinalProjectJava\\src\\Timmy.png");
        hurtTimmy = new ImageIcon("C:\\Users\\student\\IdeaProjects\\FinalProjectJava\\src\\hurtTimmy.png");
        hurtBilly = new ImageIcon("C:\\Users\\student\\IdeaProjects\\FinalProjectJava\\src\\hurtBilly.png");
        label = new JLabel();
        label.setIcon(billy);
        label2 = new JLabel();
        label2.setIcon(timmy);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int num  = e.getButton();
        if(BHealth.getValue() == 0 || THealth.getValue() == 0){
            GameOver();
        }else {
            if (num == 1) {
                boundsCheck = label2.getX() - 10 >= 50;
                if(boundsCheck){
                    label2.setLocation(label2.getX() - 10, label2.getY());
                }
            } else if (num == 2) {
                int x1 = label.getX();
                int x2 = label2.getX();
                if (Math.abs(x1 - x2) <= 150) {
                    TAttack();
                    label.setIcon(hurtBilly);
                    label.setVisible(true);
                } else if (Math.abs(x1 - x2) > 150) {
                    label.setIcon(billy);
                    label.setVisible(true);
                }
            } else if (num == 3) {
                boundsCheck = label2.getX() + 10 < 750;
                if(boundsCheck) {
                    label2.setLocation(label2.getX() + 10, label2.getY());
                }
            }
        }
    }






    @Override
    public void keyPressed(KeyEvent e) {
        if(BHealth.getValue() == 0 || THealth.getValue() == 0){
            GameOver();
        }else {
            switch (e.getKeyChar()) {
                case 'a':
                    boundsCheck = label.getX() - 10 >= 90;
//                    boundsCheck = label.getX() - 10 >= 100;
                    if (boundsCheck) {
                        label.setLocation(label.getX() - 10, label.getY());
                        System.out.println(label.getX());
                    }
                    break;
                case 'w':
                    boundsCheck = label.getY() - 10 >= 956;
                    if (boundsCheck) {
                        label.setLocation(label.getX(), label.getY() - 10);
                    }
                    break;
                case 's':
                    boundsCheck = label.getY() + 10 <= 965;
                    if (boundsCheck) {
                        label.setLocation(label.getX(), label.getY() + 10);
                    }
                    break;
                case 'd':
                    boundsCheck = label.getX() + 10 < 750;
                    if (boundsCheck) {
                        label.setLocation(label.getX() + 10, label.getY());
                    }
                    break;
                case 'e':
                    int x1 = label.getX();
                    int x2 = label2.getX();
                    if (Math.abs(x2 - x1) <= 150) {
                        BAttack();
                        label2.setIcon(hurtTimmy);
                        label2.setVisible(true);
                    } else if (Math.abs(x2 - x1) > 150) {
                        label2.setIcon(timmy);
                        label2.setVisible(true);
                    }

                    break;
            }
        }
    }

    public void BAttack(){
        int dmg = (int) ((Math.random() * 10) + 1);
        THealth.setValue(THealth.getValue() - dmg);
    }

    public void TAttack(){
        int dmg = (int) ((Math.random() * 10) + 1);
        BHealth.setValue(BHealth.getValue() - dmg);
    }



    public void healthSetup(){
        BHealth = new JProgressBar();
        THealth = new JProgressBar();
        BHealth.setStringPainted(true);
        THealth.setStringPainted(true);
        BHealth.setValue(100);
        THealth.setValue(100);
        BHealth.setPreferredSize(new Dimension(500,50));
        THealth.setPreferredSize(new Dimension(500,50));
    }

    public void GameOver(){
        JLabel gameOver = new JLabel();
        ImageIcon over = new ImageIcon("C:\\Users\\student\\IdeaProjects\\FinalProjectJava\\src\\GameOver.png");
        gameOver.setIcon(over);
        label.setIcon(billy);
        label2.setIcon(timmy);
        add(gameOver);
        once = true;
        gameOver.setPreferredSize(new Dimension(750,500));
        gameOver.setLocation(100,725);
        JLabel winner = new JLabel();
        if(BHealth.getValue() > THealth.getValue()){
            ImageIcon billyWin = new ImageIcon("C:\\Users\\student\\IdeaProjects\\FinalProjectJava\\src\\BillyWin.png");
            winner.setIcon(billyWin);
        }else if(BHealth.getValue() < THealth.getValue()){
            ImageIcon timmyWin = new ImageIcon("C:\\Users\\student\\IdeaProjects\\FinalProjectJava\\src\\TimmyWin.png");
            winner.setIcon(timmyWin);
        }
        add(winner);
        BHealth.setValue(100);
        THealth.setValue(100);
        revalidate();
        repaint();
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
    public void keyTyped(KeyEvent e) {}
    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {}
}